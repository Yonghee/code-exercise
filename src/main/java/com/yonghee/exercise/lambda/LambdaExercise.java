package com.yonghee.exercise.lambda;

import com.yonghee.exercise.domain.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yhlee on 15. 1. 15..
 */
public class LambdaExercise {

   public static void main(String[] args) {

      User user1 = new User();
      user1.setUserId((long) 1);
      user1.setUserName("lee");
      user1.setEmailAddress("jokan@naver.com");


      User user2 = new User();
      user2.setUserId((long)2);
      user2.setUserName("yonghee");
      user2.setEmailAddress("yhlee@gmail.com");


      List<User> userList = new ArrayList<User>();
      userList.add(user1);
      userList.add(user2);

      userList.sort(new Comparator<User>() {
         @Override
         public int compare(User user1, User user2) {
            return user1.compareTo(user2);
         }
      });

      System.out.println(userList);

      userList.sort((User o1, User o2) -> o1.compareTo(o2));

      System.out.println(userList);

      Comparator<User> userComparator = (User u1, User u2) -> u1.compareTo(u2);
      userList.sort(userComparator);
      System.out.println(userList);
   }
}
