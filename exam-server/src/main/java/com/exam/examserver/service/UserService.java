package com.exam.examserver.service;

import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

import java.util.Set;

public interface UserService {

    /**
     * Create User
     * @param user
     * @param userRoles
     * @return
     */
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String userName);

    public void deleteUserById(Long userId);
}
