package com.praisebassey.docket.Interfaces;

import com.praisebassey.docket.Models.SupportBuddy;
import com.praisebassey.docket.Models.User;

import java.util.List;

public interface UserServiceInterface {
    User createUser(User user);
    User viewUser(String id);
    List<User> viewUsers();
    User updateUser(User user);
    void deleteUser(String id);
}
