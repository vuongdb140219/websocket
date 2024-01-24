package com.vuongdo.websocket.repository;

import com.vuongdo.websocket.dto.user.Status;
import com.vuongdo.websocket.dto.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {
    List<User> findAllByStatus(Status status);
}
