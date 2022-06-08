package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.CommonClasses.CrudActions.WriteToFile;
import com.company.Models.User;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class AdminRegister {
    public AdminRegister() throws Exception {
        ReadFromFile test = new ReadFromFile();
        ArrayList<User> UserList =  test.read("users.csv",User.class);

        System.out.println("Rozpoczynam rejestracje nowego uzytkownika");
        boolean issue = false;

        System.out.println("Podaj swoje imie");
        String firstName = null;
        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            firstName = reader.readLine();
        }
        catch (NumberFormatException ex){
            issue = true;
        }

        System.out.println("Podaj swoje nazwisko");
        String lastName = null;
        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            lastName = reader.readLine();
        }
        catch (NumberFormatException ex){
            issue = true;
        }

        System.out.println("Podaj swoj wiek");
        int age = 0;
        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            age = Integer.parseInt(reader.readLine());
        }
        catch (NumberFormatException ex){
            issue = true;
        }

        System.out.println("Podaj haslo");
        String password = "admin";
        try{
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            password = reader.readLine();
        }
        catch (NumberFormatException ex){
            issue = true;
        }

        if(!issue && firstName.length()>0 && lastName.length()>0 && age>=14 && password.length()>0){
            UserList.add(new User(UserList.size()+1, firstName, lastName, password, age, true));

            WriteToFile zapis = new WriteToFile();
            zapis.write("users.csv", UserList);


            System.out.println("Pomyslnie utworzono administratora --> " + new User(UserList.size(), firstName, lastName, "", age, false));
        }
        else {
            System.out.println("Cos poszlo nie tak");
        }

    }
}
