package com.backend.electronic.store.services;

import com.backend.electronic.store.dtos.PageableResponse;
import com.backend.electronic.store.dtos.UserDto;
import com.backend.electronic.store.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //create
    UserDto createUser(UserDto userDto);


    //update
    UserDto updateUser(UserDto userDto, String userId);

    //delete

    void deleteUser(String userId);


    //get all users
    PageableResponse<UserDto> getAllUser(int pageNumber, int pageSize, String sortBy, String sortDir);

   

    //get  single user by email
    UserDto getUserByEmail(String email);


    //other user specific features

    Optional<User> findUserByEmailOptional(String email);

}
