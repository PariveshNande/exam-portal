package com.exam.examserver.model;

import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

@SpringBootTest
public class RoleTest {

    @Mock
    Role role;
    @Mock
    User user;

    @BeforeMethod
    public void setUp() {
        role = new Role();
        role.setRoleId(123L);
        role.setRoleName("ABC");
    }

    @Test
    public void testGetRoleId() {
    }

    @Test
    public void testSetRoleId() {
        role.getRoleId();
        when(role.getRoleId()).thenReturn(any());
    }

    @Test
    public void testGetRoleName() {
    }

    @Test
    public void testSetRoleName() {
    }

    @Test
    public void testGetUserRoles() {
    }

    @Test
    public void testSetUserRoles() {
    }

    @AfterMethod
    public void tearDown() {
    }
}