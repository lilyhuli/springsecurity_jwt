package cn.lilyhuli.bean;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @Autoor:td
 * @Date:2019/1/4
 * @Description：
 */
@Data
public class Role {

    private Integer id;

    private String describe;

    private String rolename;


    //权限的列表
    private Set<Permission> permissions;
}
