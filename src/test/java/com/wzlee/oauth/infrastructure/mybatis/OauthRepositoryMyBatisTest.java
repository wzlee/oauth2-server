package com.wzlee.oauth.infrastructure.mybatis;

import com.wzlee.oauth.domain.oauth.OauthClientDetails;
import com.wzlee.oauth.domain.oauth.OauthRepository;
import com.wzlee.oauth.infrastructure.AbstractRepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;

/**
 * @author Shengzhao Li
 */
public class OauthRepositoryMyBatisTest extends AbstractRepositoryTest {


    @Autowired
    private OauthRepository oauthRepositoryMyBatis;


    @Test
    public void findOauthClientDetails() {
        OauthClientDetails oauthClientDetails = oauthRepositoryMyBatis.findOauthClientDetails("unity-client");
        assertNull(oauthClientDetails);

    }

}