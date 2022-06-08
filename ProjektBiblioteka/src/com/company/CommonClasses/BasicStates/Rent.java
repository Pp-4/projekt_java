package com.company.CommonClasses.BasicStates;

import java.util.ArrayList;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.Models.BoardGame;
import com.company.Models.Rental;
import com.company.Models.User;

public class Rent {
    public Rent()throws Exception{
        System.out.println("Chwilowo nie da sie wyporzyczac");
        ReadFromFile test = new ReadFromFile();//przykładowy odczyt tabeli i zapisanie wyników do arraylist
        ArrayList<BoardGame> ListaGier =  test.read("bgg_dataset.csv",BoardGame.class);
        ArrayList<User> Listaużytkowników =  test.read("users.csv",User.class);
        ArrayList<Rental> ListaWypozyczen =  test.read("rentTab.csv",Rental.class);
        //todo
    }
}
