package com.SpringWeb.RicePasta.Service;

import com.SpringWeb.RicePasta.DAO.UserDAO;
import com.SpringWeb.RicePasta.VO.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//spring 프레임워크가 자바 빈(=객체)으로 등록해서 관리할 수 있도록 어노테이션 달기
@Service
public class UserServiceImpl implements UserService {
    //DI(의존성 주입)
    //데이터베이스에 접근을 위해  MemberDao 인스턴스를 주입받음
    @Autowired
    UserDAO userDAO;

    //회원가입
    @Override
    public int insert(UserVO userVO) {
        return userDAO.insert(userDAO);
    }

}