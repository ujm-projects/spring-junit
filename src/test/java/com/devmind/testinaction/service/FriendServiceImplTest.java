package com.devmind.testinaction.service;

import com.devmind.testinaction.repository.FriendRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class FriendServiceImplTest {
    @Autowired
    private FriendRepository friendRepostiory;

    @BeforeEach // 1.
    public void init(){

    }
    @Test
    void computeFriendAge() {
    }
}