package org.example.service;
import com.fasterxml.jackson.core.type.TypeReference;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.example.entities.user;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;


public class UserBookingService {
    private user USER;
    public static final String user_path = "../localDB/user.json";
    private ObjectMapper objectMapper = new ObjectMapper();
    private List<user> userList;

    public UserBookingService(user user1) throws IOException {
        this.USER=user1;
        File user = new File(user_path);
        userList=objectMapper.readValue(user,new TypeReference<List<user>>(){});
    }
    public Boolean loginUser(){
        Optional<user> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(user user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }
}
