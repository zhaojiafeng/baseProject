package com.zjf.demo.admin;

import com.zjf.demo.admin.impl.AdminServiceImpl;
import com.zjf.demo.utils.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

//    @Value("${mineDefine.name}")
//    private String name;
//
//    @RequestMapping("/hello")
//    public String hello() {
//        return name + " : " + "hello world!";
//    }

    @Resource
    AdminServiceImpl adminService;

    @ResponseBody
    @RequestMapping("/addAdmin")
    public AjaxResult addAdmin(Admin admin, List<Integer> roleIds) {
        return adminService.addAdmin(admin, roleIds);
    }

    @ResponseBody
    @RequestMapping("/deleteAdmin")
    public AjaxResult deleteAdmin(Admin admin) {
        return adminService.deleteAdmin(admin);
    }

    @ResponseBody
    @RequestMapping("/editAdmin")
    public AjaxResult editAdmin(Admin admin, List<Integer> roleIds) {
        return adminService.editAdmin(admin, roleIds);
    }

    @ResponseBody
    @RequestMapping("/findAdmins")
    public AjaxResult findAdmins(Admin admin) {
        return adminService.findAdmins(admin);
    }


}
