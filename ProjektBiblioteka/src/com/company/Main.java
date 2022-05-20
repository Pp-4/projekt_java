package com.company;

import com.company.CommonClasses.BoardGameRental;
import com.company.CommonClasses.CrudActions.ReadFromFile;

public class Main {

    public static void main(String[] args) {

        //BoardGameRental boardGameRental = new BoardGameRental();
        ReadFromFile test = new ReadFromFile();
        try {//test importu z pliku
            test.read("bgg_dataset.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
