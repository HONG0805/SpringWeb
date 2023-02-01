package com.SpringWeb.RicePasta.Mapper;

import com.SpringWeb.RicePasta.VO.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //로그인
    UserVO getUserAccount(String userId);

    //회원가입
    void saveUser(UserVO userVO);
}