package com.SpringWeb.RicePasta.VO;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

//자바빈 클래스
//lombok사용해서 아래처럼 편하게 만들 수 있지만 POJO(초기의 순수한 자바)에 위배됨
//@Setter
//@Getter
//@ToString

public class UserVO {
    private String userId;
    private String userPassword;
    private String userName;
    private String userPhoneNum;
    //pattern : date 넣을 때 요 형식으로 써주세요~
    //@DateTimeFormat(pattern="yyyy/MM/dd")꼭 써줘야 date형식으로 들어간다
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date regdate;

    //기본 생성자
    public UserVO() {
        super();

    }

    //파라미터 던져주면 멤버변수에 자동으로 세팅된다
    public UserVO(String userId, String userPassword, String userName, String userPhoneNum, Date regdate) {
        super();
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userPhoneNum = userPhoneNum;
        this.regdate = regdate;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPhoneNum() {
        return userPhoneNum;
    }
    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    //비밀번호 변경 기능 구현 시 사용
    public boolean matchPassword(String pwd) {
        return userPassword.contentEquals(pwd);
    }


    @Override
    public String toString() {
        return "UserVO [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userPhoneNum=" + userPhoneNum
                + ", regdate=" + regdate + "]";
    }

}
