package com.ssm.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by kangaroo on 2019/11/18 21:16.
 * QQ: 326170945
 * Description：
 */
@Data
@TableName("t_admin")
public class Admin {
    private long id;
    private String name;
    private String username;
    private String password;
}
