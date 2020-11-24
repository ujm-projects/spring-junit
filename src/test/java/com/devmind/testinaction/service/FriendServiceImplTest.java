package com.devmind.testinaction.service;

import com.devmind.testinaction.model.Friend;
import com.devmind.testinaction.repository.FriendRepository;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FriendServiceImplTest {
    @Autowired
    private FriendRepository friendRepostiory;

    @BeforeEach // 1.
    public void init(){
        friendRepostiory=new FriendRepository() {
            @Override
            public List<Friend> findAll() {
                List<Friend> friendList=new ArrayList<>();
                Friend friend1=new Friend("Elodie", 1999);
                Friend friend2=new Friend("Charles", 2001);
                friendList.add(friend1);
                friendList.add(friend2);
                return friendList;
            }
        };
    }
    @Test
    void computeFriendAge() {
        List<Friend>friends= friendRepostiory.findAll();
        Assertions.assertThat(friends)
                .hasSize(2)
                .extracting(Friend::getName, Friend::getBirthYear)
                .containsExactlyInAnyOrder(
                        Tuple.tuple("Elodie", 1999),
                        Tuple.tuple("Charles", 2001));
    }


}