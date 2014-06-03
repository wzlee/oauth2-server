package com.wzlee.oauth.domain.oauth;

import com.wzlee.oauth.domain.shared.Repository;

/**
 * @author Shengzhao Li
 */
public interface OauthRepository extends Repository {

    OauthClientDetails findOauthClientDetails(String clientId);
}