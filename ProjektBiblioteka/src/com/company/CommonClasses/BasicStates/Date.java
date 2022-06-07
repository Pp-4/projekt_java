package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.Models.User;
import com.company.CommonClasses.Variables;

import java.util.ArrayList;
import java.util.Objects;

public class Date {

    public Date() throws Exception {
        ReadFromFile test = new ReadFromFile();
        ArrayList<User> UserList =  test.read("users.csv",User.class);

        for (User a : UserList){
            if(Objects.equals(Variables.logInID, a.id)){
                System.out.println(a);
                break;
            }
        }
    }
}
