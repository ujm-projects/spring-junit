package com.devmind.testinaction.service;

import com.devmind.testinaction.model.Friend;

import java.time.LocalDate;

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
