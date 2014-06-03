package com.wzlee.oauth.domain.user;

import com.wzlee.oauth.domain.shared.Repository;

/**
 * @author Shengzhao Li
 */

public interface UserRepository extends Repository {

    User findByGuid(String guid);

    void saveUser(User user);

    void updateUser(User user);

    User findByUsername(String username);

}