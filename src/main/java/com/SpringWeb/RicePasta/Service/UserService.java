package com.SpringWeb.RicePasta.Service;
/*
 * 스프링은 직접 클래스를 생성하는 것을 지양(안함)하고,
 * 인터페이스를 통해 접근하는 것을 권장하는 프레임워크.
 */
import com.SpringWeb.RicePasta.Mapper.UserMapper;
import com.SpringWeb.RicePasta.VO.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:sss");
    Date time = new Date();
    String localTime = format.format(time);
    private final UserMapper userMapper;

    @Transactional
    public void joinUser(UserVO userVo){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userVo.setUserPw(passwordEncoder.encode(userVo.getPassword()));
        userVo.setUserAuth("USER");
        userVo.setAppendDate(localTime);
        userVo.setUpdateDate(localTime);
        userMapper.saveUser(userVo);
   }

    @Override
    public UserVO loadUserByUsername(String userId) throws UsernameNotFoundException {
        //여기서 받은 유저 패스워드와 비교하여 로그인 인증
        UserVO userVo = userMapper.getUserAccount(userId);
        if (userVo == null){
            throw new UsernameNotFoundException("User not authorized.");
        }
        return userVo;
    }

}