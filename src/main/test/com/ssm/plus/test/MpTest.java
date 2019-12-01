package com.ssm.plus.test;

import com.ssm.plus.entity.Admin;
import com.ssm.plus.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kangaroo on 2019/11/18 19:52.
 * QQ: 326170945
 * Description：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring.xml"})
public class MpTest {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void select(){
        System.out.println("查询测试：");
        List<Admin> adminList = adminMapper.selectList(null);
        System.out.println(adminList.size());
        adminList.forEach(System.out::println);
    }
}
