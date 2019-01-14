package cn.lilyhuli.mapper;

import cn.lilyhuli.bean.User;

public interface UserMapper {
    User selectByUserName(String username);
}
