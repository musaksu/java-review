package com.cybertek.collections;

import com.cybertek.enums.Gender;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void createList(){

        List<Integer> list = new ArrayList<>();
        list.add(5);list.add(10);list.add(20);
        for(Integer l : list){
            System.out.println(l);
        }
    }

    public static void createUserList(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike","Smith",new Role(1,"Manager"), Gender.MALE));
        userList.add(new User("Amy","Taylor",new Role(2,"Admin"), Gender.FEMALE));

        for(User u : userList) {
            System.out.println(u.getRole().getDescription());
        }
    }

    public static List<Role> createRoleList(){

        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1,"Manager"));
        roleList.add(new Role(2,"Employee"));
        roleList.add(new Role(3,"Admin"));

        return roleList;
    }
    public static List<Role> createRoleListasdfqwegfaqwerg3q4tgq3w4etqwa4(){

        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1,"Manager"));
        roleList.add(new Role(2,"Employee"));
        roleList.add(new Role(3,"Admin"));
        roleList.add(new Role(4,"Employee"));
        roleList.add(new Role(5,"Employee"));

        return roleList;
    }
    public static List<Role> cr(){

        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1,"Manager"));
        roleList.add(new Role(2,"Employee"));
        roleList.add(new Role(3,"Admin"));

        return roleList;
    }
}
