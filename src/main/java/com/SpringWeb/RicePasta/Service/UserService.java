package com.SpringWeb.RicePasta.Service;
/*
 * 스프링은 직접 클래스를 생성하는 것을 지양(안함)하고,
 * 인터페이스를 통해 접근하는 것을 권장하는 프레임워크.
 */
import com.SpringWeb.RicePasta.VO.UserVO;

public interface UserService {
    //회원가입
    public int insert(UserVO userVO);

}