package com.wu.service;

import com.wu.mapper.RoleMapper;
import com.wu.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 吴磊
 * @program: smbms-mvc
 * @create: 2021-01-25 11:47
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

   
    @Override
    public List<Role> getRoleList() {

        return roleMapper.getRoleList();
    }
}
