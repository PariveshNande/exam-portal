package com.exam.examserver;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

import static com.exam.examserver.util.Constants.EXMS1;
import static com.exam.examserver.util.Constants.EXMS3;

@Slf4j
@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExamServerApplication.class, args);
        log.info(String.format(EXMS1));
    }

    @Override
    public void run(String... args) throws Exception {
        /*log.info(String.format(EXMS3));
        User user = new User();
        user.setFirstName("test");
        user.setLastName("user");
        user.setEmail("testuser@abc.com");
        user.setPassword("welcome123");
        user.setUserName("test1");
        user.setPhone("123456789");
        user.setProfile("default.png");

        Role role1 = new Role();
        role1.setRoleId(44L);
        role1.setRoleName("admin");

        UserRole userRole = new UserRole();
        userRole.setRole(role1);
        userRole.setUser(user);

        Set<UserRole> userRoleSet = new HashSet<>();
        userRoleSet.add(userRole);

        User user1 = this.userService.createUser(user, userRoleSet);
        log.info(String.format(String.valueOf(user1)));*/
    }
}
