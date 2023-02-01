package com.SpringWeb.RicePasta.VO;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class UserVO implements UserDetails{
    private String userId;
    private String userPw;
    private String userName;
    private String userPhoneNum;
    private String userAuth;
    private String appendDate;
    private String updateDate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(this.userAuth));
    }

    @Override
    public String getPassword() {
        return this.userPw;
    }

    @Override
    public String getUsername() {
        return this.userId;
    }

    // Vo의 userName !
    public String getUserName(){
        return this.userName;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPw() {
        return userPw;
    }
    public void setUserPw(String userPw) {
        this.userPw = userPw;
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
    public String getUserAuth() {
        return userAuth;
    }
    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }
    public String getAppendDate() {
        return appendDate;
    }
    public void setAppendDate(String appendDate) {
        this.appendDate = appendDate;
    }
    public String getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
