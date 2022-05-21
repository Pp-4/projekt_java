package com.company;

import java.util.ArrayList;

import com.company.CommonClasses.BoardGameRental;
import com.company.CommonClasses.CrudActions.ReadFromFile;

public class Main {

    public static void main(String[] args) {

        //BoardGameRental boardGameRental = new BoardGameRental();
        ReadFromFile test = new ReadFromFile();
        try {//test importu z pliku
            ArrayList test2 =  test.read("bgg_dataset.csv");
            test2.size();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
