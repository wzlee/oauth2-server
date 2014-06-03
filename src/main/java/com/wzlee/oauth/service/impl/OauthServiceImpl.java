package com.wzlee.oauth.service.impl;

import com.wzlee.oauth.domain.oauth.OauthClientDetails;
import com.wzlee.oauth.domain.oauth.OauthRepository;
import com.wzlee.oauth.service.OauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Shengzhao Li
 */
@Service("oauthService")
public class OauthServiceImpl implements OauthService {

    @Autowired
    private OauthRepository oauthRepository;

    @Override
    public OauthClientDetails loadOauthClientDetails(String clientId) {
        return oauthRepository.findOauthClientDetails(clientId);
    }
}