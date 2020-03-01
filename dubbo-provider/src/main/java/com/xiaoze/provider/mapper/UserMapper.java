package com.xiaoze.provider.mapper;

import com.xiaoze.api.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface description
 *
 * @author donghuarui.
 */
@Repository
public interface UserMapper {

    //  @Select("select * from user")
    User findUserByUsername(String username);
}
