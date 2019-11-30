package com.ssm.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ssm.plus.entity.Admin;

/**
 * Created by kangaroo on 2019/11/18 21:15.
 * QQ: 326170945
 * Description：
 */
public interface AdminMapper extends BaseMapper<Admin> {

    Integer selectMaxId();
}
