package com.huang.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  //  @Autowired UserMapper userMapper;
  //
  //  @GetMapping("/userList")
  //  public List<User> getUserList() {
  //    List<User> users = userMapper.getUserList();
  //    for (User user : users) {
  //      System.out.println(user);
  //    }
  //    return users;
  //  }
  //
  //  @GetMapping("/user/{id}")
  //  public User getUserById(@PathVariable("id") Integer id) {
  //    User user = userMapper.queryUserById(id);
  //    System.out.println(user);
  //    return user;
  //  }
  //
  //  @PostMapping("/user")
  //  public String addUser(User user) {
  //    int code = userMapper.addUser(user);
  //    if (code > 0) {
  //      return "add ok";
  //    }
  //    return "not ok";
  //  }
  //
  //  @GetMapping("/deleteuser/{id}")
  //  public String deleteUserById(@PathVariable("id") Integer id) {
  //    int code = userMapper.deleteUser(id);
  //    if (code > 0) {
  //      return "delete ok";
  //    }
  //    return "not ok";
  //  }
}
