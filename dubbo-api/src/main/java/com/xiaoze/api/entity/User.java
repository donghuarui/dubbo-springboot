package com.xiaoze.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * User实体
 */
@Data
public class User implements Serializable {
    private String id;
    private String username;
    private String password;
    private Date create_time;
    private Date update_time;
    private Character valid;
    private String creator_id;
    private String updater_id;
    private String perms;
    private List<Orders> ordersList;
}
