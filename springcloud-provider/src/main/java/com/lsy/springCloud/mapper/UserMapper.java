package com.lsy.springCloud.mapper;

import com.lsy.springCloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User selectUser(@Param("id") Integer id);


}
