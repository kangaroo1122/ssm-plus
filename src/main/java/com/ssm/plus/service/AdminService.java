package com.ssm.plus.service;

import com.ssm.plus.entity.Admin;

import java.util.List;

/**
 * Created by kangaroo on 2019/11/18 22:07.
 * QQ: 326170945
 * Description：
 */
public interface AdminService {
    List<Admin> selectAdminList();
    Integer selectMaxId();
}
