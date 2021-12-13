package com.web.springboot.service;

import com.web.springboot.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRole(long id);

}
