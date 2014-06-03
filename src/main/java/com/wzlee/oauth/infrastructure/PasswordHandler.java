package com.wzlee.oauth.infrastructure;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 * @author Shengzhao Li
 */
public abstract class PasswordHandler {


    /**
     * Encrypt  password ,if original password is empty,
     *
     * @param originalPassword Original password
     * @return Encrypted password
     */
    public static String encryptPassword(String originalPassword) {
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        return md5PasswordEncoder.encodePassword(originalPassword, null);
    }


}