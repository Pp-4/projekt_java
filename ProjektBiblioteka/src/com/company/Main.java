package com.company;
import java.util.ArrayList;

import com.company.CommonClasses.CrudActions.ReadFromFile;//wymagane do odczytu danych
import com.company.CommonClasses.CrudActions.WriteToFile;//wymagane do zapisu danych

import com.company.CommonClasses.BoardGameRental;
import com.company.Models.BoardGame;
import com.company.Models.User;
public class Main {
    private static StackTraceElement[] stackTrace;

    public static void main(String[] args) throws Exception {

        //BoardGameRental boardGameRental = new BoardGameRental();

        ReadFromFile test = new ReadFromFile();//przykładowy odczyt tabeli i zapisanie wyników do arraylist
        ArrayList<BoardGame> ListaGier =  test.read("bgg_dataset.csv",BoardGame.class);

        System.out.println(ListaGier.size());

        WriteToFile zapis = new WriteToFile();//przykładowy zapis do tabeli
        zapis.write("test.csv",ListaGier);


        ReadFromFile test2 = new ReadFromFile();//przykładowy odczyt tabeli i zapisanie wyników do arraylist
        ArrayList<User> ListaGier2 =  test.read("users.csv",User.class);
        System.out.println(ListaGier2.size());

        WriteToFile zapis2 = new WriteToFile();//przykładowy zapis do tabeli
        zapis.write("test2.csv",ListaGier2);
    }
}