package org.openwebflow.mgr.common;

import org.openwebflow.identity.UserDetailsEntity;

import java.util.HashMap;
import java.util.Map;

public class SimpleUserDetailsEntity extends UserDetailsEntitySupport {
    private Map<String, Object> userDetailMap = new HashMap<>();

    public SimpleUserDetailsEntity() {
    }

    public SimpleUserDetailsEntity(UserDetailsEntity src) {
        super.copyProperties(src);
    }

    public SimpleUserDetailsEntity(String userId, String nickName, String email, String mobilePhoneNumber) {
        userDetailMap.put(STRING_PROPERTY_USER_ID, userId);
        userDetailMap.put(STRING_PROPERTY_EMAIL, email);
        userDetailMap.put(STRING_PROPERTY_MOBILE_PHONE_NUMBER, mobilePhoneNumber);
        userDetailMap.put(STRING_PROPERTY_NICK_NAME, nickName);
    }

    public String getEmail() {
        return getProperty(STRING_PROPERTY_EMAIL);
    }

    public String getMobilePhoneNumber() {
        return getProperty(STRING_PROPERTY_MOBILE_PHONE_NUMBER);
    }

    public String getNickName() {
        return getProperty(STRING_PROPERTY_NICK_NAME);
    }

    public <T> T getProperty(String name) {
        return (T) userDetailMap.get(name);
    }

    @Override
    public String[] getPropertyNames() {
        return userDetailMap.keySet().toArray(new String[0]);
    }

    public String getUserId() {
        return getProperty(STRING_PROPERTY_USER_ID);
    }

    public void setEmail(String email) {
        setProperty(STRING_PROPERTY_EMAIL, email);
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        setProperty(STRING_PROPERTY_MOBILE_PHONE_NUMBER, mobilePhoneNumber);
    }

    public void setNickName(String nickName) {
        setProperty(STRING_PROPERTY_NICK_NAME, nickName);
    }

    public <T> void setProperty(String name, T value) {
        userDetailMap.put(name, value);
    }

    public void setUserId(String userId) {
        setProperty(STRING_PROPERTY_USER_ID, userId);
    }

    @Override
    public String toString() {
        return userDetailMap.toString();
    }
}