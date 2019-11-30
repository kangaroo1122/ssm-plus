package com.ssm.plus.service.impl;

import com.ssm.plus.entity.Admin;
import com.ssm.plus.mapper.AdminMapper;
import com.ssm.plus.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kangaroo on 2019/11/18 22:08.
 * QQ: 326170945
 * Description：
 */
@Service
public class AdminServiceImpl implements AdminService {
    private final AdminMapper adminMapper;

    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public List<Admin> selectAdminList() {
        return adminMapper.selectList(null);
    }

    @Override
    public Integer selectMaxId() {
        return adminMapper.selectMaxId();
    }
}
