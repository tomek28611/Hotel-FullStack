package com.lucky_andaman.backend.service.interfac;

import com.lucky_andaman.backend.dto.LoginRequest;
import com.lucky_andaman.backend.dto.Response;
import com.lucky_andaman.backend.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
