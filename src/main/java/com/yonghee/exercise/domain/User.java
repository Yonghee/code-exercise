package com.yonghee.exercise.domain;

import java.util.Date;

/**
 * Created by yhlee on 15. 1. 15..
 */
public class User implements Comparable{

    private Long userId;
    private String userName;
    private String emailAddress;
    private Date joinDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public int compareTo(Object o) {

        User otherUser = (User) o;
        if (this.userId > otherUser.getUserId()) {
            return 1;
        } else if (this.userId < otherUser.getUserId()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!userId.equals(user.userId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }
}
