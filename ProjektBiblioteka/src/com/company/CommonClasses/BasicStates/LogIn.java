package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.Models.User;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.company.CommonClasses.Variables;

import java.util.*;

import static com.company.ValidationAndHashing.PasswordHashing.doHashing;

public class LogIn {


    public LogIn() throws Exception {
        ReadFromFile test = new ReadFromFile();
        ArrayList<User> UserList =  test.read("users.csv",User.class);

        System.out.println("Podaj id uzytkownika");
        String name = "-1";

        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            name = reader.readLine();
        }
        catch (NumberFormatException ignored){
        }

        int number = -1;
        try {
            number = Integer.parseInt(name);
        }
        catch (NumberFormatException ignored){
        }

            for (User a : UserList){
                if(a.id == number){
                    if(a.accesLevel){
                        System.out.println("Podaj haslo");
                        String haslo = "";
                        try{
                            BufferedReader reader = new BufferedReader(
                                    new InputStreamReader(System.in));
                            haslo = reader.readLine();
                        }
                        catch (NumberFormatException ignored){
                        }

                        if(doHashing(haslo).equals(a.password)){
                            Variables.logInID = a.id;
                            Variables.logInSucces = true;
                            Variables.globalAdmin = true;
                            break;
                        }
                        else { System.out.println("Dzwonie po policje!!!");
                            Variables.logInSucces=false;
                            Variables.logInID = -1;
                            break;
                        }


                    }
                    else {
                        Variables.logInID = a.id;
                        Variables.logInSucces = true;
                    }
                    break;
                }
                Variables.logInSucces=false;
                Variables.logInID = -1;
            }
    }


    //TODO: Rejestracja i logowanie
}
