package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.Models.User;

import java.util.ArrayList;

public class UserShow {

    public UserShow() throws Exception {
        ReadFromFile test = new ReadFromFile();
        ArrayList<User> UserList =  test.read("users.csv",User.class);

        for (User a : UserList){
            System.out.println(a.toString());
        }
    }
}
