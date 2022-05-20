package com.company.CommonClasses.CrudActions;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFromFile {
    public class graPlanszowa {//java nie posiada typu uint
        int Id;
        String Name;
        int YearPublished;
        int MinPlayers;
        int MaxPlayers;
        int PlayTime;
        int MinAge;
        int UsersRated;
        int RatingAverage;
        int ComplexityAverage;
        int OwnedUsers;
        int Mechanics;
        int Domains;
        ArrayList<String> Tags;
        public graPlanszowa(int a,String b,int c,int d,int e,int f,int g,int h,int i,int j,int k,int l,int m,ArrayList<String> n){
            Id = a;Name = b;YearPublished = c;MinPlayers = d;MaxPlayers = e;PlayTime = f;MinAge = g;UsersRated = h;RatingAverage = i;ComplexityAverage = j;OwnedUsers = k;Mechanics = l;Domains = m;Tags = n;
        }
    }
  //TO DO
  //odczyt plików csv
  //zapis do pliku csv
  //serializacja/deserializacja obiektów/csv
  public ArrayList <graPlanszowa> read(String nazwaBazy) throws Exception { //ta metoda odczytuje całą bazę z pliku i zwraca tablicę obiektów utworzonych z tej bazy
    //zakładam ,że program zostanie uruchomiony na windowsie oraz ,że baza lokalna znajduje się na pulpicie
    File pulpit = new File(System.getProperty("user.home"), "/Desktop");
    if(!new File(pulpit, nazwaBazy).canRead())throw new FileNotFoundException("nie udało się odczytać pliku z bazą");  
    Scanner bazaDanych = new Scanner(new File(pulpit, nazwaBazy));
    bazaDanych.useDelimiter(","); //plik csv zakłada przecinki do odzielania wartości
    ArrayList <graPlanszowa> listaGier = new ArrayList<graPlanszowa>();
    bazaDanych.next();//pomijam linijkę 0, w której są nazwy kolumn
    while (bazaDanych.hasNext()) {
        String[] temp = bazaDanych.next().split(",");
        int length = temp.length;
        ArrayList <String> tagi = new ArrayList<String>();//w każdej lini występuje minimum 14 parametrów, licząc od 1,14 i kolejne parametry muszą zostać umieszczone w tablicy tagów
        if(length>=14)for(int i = 13;i<length;i++)tagi.add(temp[i]);
        //god help me , co ja zrobiłem, na pewno da się lepiej
        graPlanszowa tempGame = new graPlanszowa(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), Integer.parseInt(temp[8]), Integer.parseInt(temp[9]), Integer.parseInt(temp[10]), Integer.parseInt(temp[11]), Integer.parseInt(temp[12]), tagi);
        listaGier.add(tempGame);
    }
    bazaDanych.close();
    return listaGier;
  }
}
