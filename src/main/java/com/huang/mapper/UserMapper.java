package com.huang.mapper;

import com.huang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
  List<User> getUserList();

  User queryUserById(int id);

  int addUser(User user);

  int updateUser(User user);

  int deleteUser(int id);
}
