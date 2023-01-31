package com.SpringWeb.RicePasta.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//spring 프레임워크가 자바 빈(=객체)으로 등록해서 관리할 수 있도록 어노테이션 달기
@Repository
public class UserDAO {

    //sqlSessionTemplate 타입 객체를 BookDao 객체에 주입(사용가능하게) 함
    @Autowired
    SqlSessionTemplate sqlSessionTemplate; //root-context 객체에 있는 id와 같아야 함

    //회원가입
    public int insert(UserDAO userVO) {
        //namaspace.id
        //result가 0이면 입력 실패, 1이면 입력 성공
        int result = this.sqlSessionTemplate.insert("member.insert", userVO);

        return result;
    }
}