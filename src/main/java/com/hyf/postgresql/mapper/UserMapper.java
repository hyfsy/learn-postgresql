package com.hyf.postgresql.mapper;

import com.hyf.postgresql.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author baB_hyf
 * @date 2022/09/13
 */
@Mapper
public interface UserMapper {

    @Select("select * from test_user")
    List<User> queryAll();

}
