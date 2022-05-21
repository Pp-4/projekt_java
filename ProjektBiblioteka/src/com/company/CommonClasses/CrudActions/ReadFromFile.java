package com.company.CommonClasses.CrudActions;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;
import javax.naming.directory.InvalidAttributeIdentifierException;
import java.util.Locale;
import java.text.NumberFormat;
//TODO:ZAPIS , SERIALIZACJA?
public class ReadFromFile {//obsługa tabeli
  public class graPlanszowa {
    // wszytie typy muszą mieć wrappery(typy pierwotne nie mają metody/pola class , dlaczego ? nie wiem)
    Integer Id;
    String Name;
    Integer YearPublished;
    Integer MinPlayers;
    Integer MaxPlayers;
    Integer PlayTime;
    Integer MinAge;
    Integer UsersRated;
    Double RatingAverage;
    Integer BGGRank;
    Double ComplexityAverage;
    Integer OwnedUsers;
    String[] Mechanics;
    String[] Domains;
    public graPlanszowa() {}
  }


  public ArrayList<graPlanszowa> read(String nazwaBazy) throws Exception { //ta metoda odczytuje całą tabelę z pliku i zwraca tablicę obiektów utworzonych z tej tabeli
    //na potrzeby testu zakładam ,że program zostanie uruchomiony na windowsie oraz ,że tabela lokalna znajduje się na pulpicie
    File pulpit = new File(System.getProperty("user.home"), "/Desktop");
    if (!new File(pulpit, nazwaBazy).canRead()) throw new FileNotFoundException("nie udało się odczytać pliku z bazą");

    Scanner bazaDanych = new Scanner(new File(pulpit, nazwaBazy),"UTF-8");//wymagana informacja o kodowaniu, bez niej scanner nie działa poprawnie
    ArrayList<graPlanszowa> listaGier = new ArrayList<graPlanszowa>();
    bazaDanych.useDelimiter("\n|\\;");//tekst będzie rozbity przez średnik lub znak nowej lini
    bazaDanych.nextLine(); //pierwszy wiersz zaiwera nazwy kolumn
    int a = 0;
    while (bazaDanych.hasNextLine()) { //zapis kolejnych wierszy w tabeli do listy obiektów
  
      graPlanszowa tempGame = new graPlanszowa();
      Field[] pola = tempGame.getClass().getDeclaredFields();
      String temp ="";//deklaracja zmiennej poza pętlą for ponieważ dla pola this$0 nie używam .next() (patrz niżej) 
      for (Field f : pola) {//pętla przypisuje do tempgame kolejne znalezione w tabeli wartości
        Class t = f.getType();//sprawdza typ aby wiedzieć jak sformatować otrzymanego stringa
        //edge case ,w przypadku klasy wewnętrznej do listy pól zostaje dodany parametr this$0 ,który trzeba olać
          if(t.getName() != this.getClass().getName())temp = bazaDanych.next();//dla pola this$0 nie odczytujemy wartości  
          //System.out.println(t.getName()+" "+f.getName()+" "+temp);//testy
          if (t == Integer.class) f.set(tempGame, Integer.parseInt(temp));
          else if (t.getName() == this.getClass().getName());//edge case ,w przypadku inner class do listy pól zostaje dodany parametr this$0 ,który trzeba olać
          else if (t == Double.class) f.set(tempGame, NumberFormat.getNumberInstance(Locale.FRANCE).parse(temp).doubleValue());
          else if (t == String[].class) f.set(tempGame, temp.split(","));
          else if (t == String.class) f.set(tempGame, temp);
          else throw new InvalidAttributeIdentifierException("Nieprawidłowy typ zmiennej!,\n Nie wiem jaki dać wyjątek #TODO");
      }
      listaGier.add(tempGame);
      if(a%100==0)System.out.println(a);//testy
      a++;
    }
    bazaDanych.close();
    return listaGier;
  }
}
