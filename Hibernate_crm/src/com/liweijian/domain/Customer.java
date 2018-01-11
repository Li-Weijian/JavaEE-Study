package com.liweijian.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 22:18 2018/1/5 0005
 */
public class Customer {

          /*  `cust_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
            `cust_name` varchar(32) NOT NULL COMMENT '客户名称(公司名称)',
            `cust_user_id` bigint(32) DEFAULT NULL COMMENT '负责人id',
            `cust_create_id` bigint(32) DEFAULT NULL COMMENT '创建人id',
            `cust_source` varchar(32) DEFAULT NULL COMMENT '客户信息来源',
            `cust_industry` varchar(32) DEFAULT NULL COMMENT '客户所属行业',
            `cust_level` varchar(32) DEFAULT NULL COMMENT '客户级别',
            `cust_linkman` varchar(64) DEFAULT NULL COMMENT '联系人',
            `cust_phone` varchar(64) DEFAULT NULL COMMENT '固定电话',
            `cust_mobile` varchar(16) DEFAULT NULL COMMENT '移动电话',
            */

    private Long cust_id;
    private String cust_name;
    private Long cust_user_id;
    private Long cust_create_id;
    private String cust_source;
    private String cust_industry;
    private String cust_level;
    private String cust_linkman;
    private String cust_phone;
    private String cust_mobile;
    private Set<Linkman> linkmens = new HashSet<Linkman>();

    public Set<Linkman> getLinkmens() {
        return linkmens;
    }

    public void setLinkmens(Set<Linkman> linkmens) {
        this.linkmens = linkmens;
    }

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public Long getCust_user_id() {
        return cust_user_id;
    }

    public void setCust_user_id(Long cust_user_id) {
        this.cust_user_id = cust_user_id;
    }

    public Long getCust_create_id() {
        return cust_create_id;
    }

    public void setCust_create_id(Long cust_create_id) {
        this.cust_create_id = cust_create_id;
    }

    public String getCust_source() {
        return cust_source;
    }

    public void setCust_source(String cust_source) {
        this.cust_source = cust_source;
    }

    public String getCust_industry() {
        return cust_industry;
    }

    public void setCust_industry(String cust_industry) {
        this.cust_industry = cust_industry;
    }

    public String getCust_level() {
        return cust_level;
    }

    public void setCust_level(String cust_level) {
        this.cust_level = cust_level;
    }

    public String getCust_linkman() {
        return cust_linkman;
    }

    public void setCust_linkman(String cust_linkman) {
        this.cust_linkman = cust_linkman;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_mobile() {
        return cust_mobile;
    }

    public void setCust_mobile(String cust_mobile) {
        this.cust_mobile = cust_mobile;
    }

    @Override
    public String toString() {
        return getCust_id() +":"+ getCust_name();
    }
}