package com.zjf.demo.admin;

import lombok.Data;

/**
 * @author zhaojiafeng
 */
@Data
public class Admin {
    
    private Integer adminId;
    private String loginName;
    private String password;
    private String adminName;
    private String sex;
    private String telephone;
    private String desc;

}