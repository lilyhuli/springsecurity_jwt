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
public class User {

    private String id;

    private String avatar;

    private String username;

    private String password;

    private String phone;


    private Integer state;



    private Set<Role> roles;
}
