package com.SpringWeb.RicePasta.Mapper;

import com.SpringWeb.RicePasta.VO.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //로그인
    UserVO getUserAccount(String userId);

    //회원가입
    void saveUser(UserVO userVO);
}