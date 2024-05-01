package com.gxh.mapper;

import com.gxh.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id, username from user where username = #{username} and password = #{password}")
    User findUserByUsernameAndPassword(User user);
}
