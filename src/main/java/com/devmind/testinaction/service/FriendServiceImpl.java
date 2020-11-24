package com.devmind.testinaction.service;

import com.devmind.testinaction.model.Friend;
import com.devmind.testinaction.repository.FriendRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * @author devmind
 */
public class FriendServiceImpl implements FriendService {


    @Override
    public int computeFriendAge(Friend friend) {
        if (friend == null) {
            throw new IllegalArgumentException("Friend is required");
        }
        return LocalDate.now().getYear() - friend.getBirthYear();
    }

}
