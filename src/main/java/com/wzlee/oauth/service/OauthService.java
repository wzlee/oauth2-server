package com.wzlee.oauth.service;

import com.wzlee.oauth.domain.oauth.OauthClientDetails;

/**
 * @author Shengzhao Li
 */

public interface OauthService {

    OauthClientDetails loadOauthClientDetails(String clientId);
}