package com.company;
import java.util.ArrayList;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.CommonClasses.CrudActions.WriteToFile;
import com.company.CommonClasses.BoardGameRental;
import com.company.Models.BoardGame;
import com.company.Models.User;
public class Main {

    private static StackTraceElement[] stackTrace;

    public static void main(String[] args) throws Exception {

        BoardGameRental boardGameRental = new BoardGameRental();
        ReadFromFile test = new ReadFromFile();//test odczytu tabeli
        String lokalizacja = System.getProperty("user.dir")+"\\ProjektBiblioteka\\src\\com\\company\\OtherFiles";
        ArrayList<BoardGame> test2 =  test.read("bgg_dataset.csv",lokalizacja,BoardGame.class);
        //test.read odczytuje plik w podanej lokalizacji i próbuje go dopasować do podanego modelu
        System.out.println(test2.size());

        WriteToFile zapis = new WriteToFile();//test zapisu tabeli
        zapis.write("test.csv",lokalizacja,test2);
    }
}
