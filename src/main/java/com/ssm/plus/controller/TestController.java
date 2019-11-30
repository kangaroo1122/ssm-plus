package com.ssm.plus.controller;

import com.ssm.plus.entity.Admin;
import com.ssm.plus.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kangaroo on 2019/11/18 21:28.
 * QQ: 326170945
 * Description：
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private final AdminService adminService;

    public TestController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/testSelect")
    public List<Admin> testSelect(){
        List<Admin> adminList = adminService.selectAdminList();
        adminList.forEach(System.out::println);
        return adminList;
    }

    @GetMapping("/testSelectMax")
    public Integer testSelectMaxId(){
        Integer integer = adminService.selectMaxId();
        System.out.println(integer);
        return integer;
    }
}
