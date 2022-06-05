package com.company.CommonClasses.CrudActions;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.lang.reflect.Field;
import com.company.OtherFiles.FileLoactions;
import com.company.CustomErrors.WrongTypeException;
public class ReadFromFile {//odczyt z tabeli lokalnej

  public <T> ArrayList<T> read(String nazwaBazy,Class<T> model) throws Exception {
    //ta metoda odczytuje całą tabelę z pliku i zwraca tablicę obiektów utworzonych z tej tabeli
    Scanner bazaDanych = GetFile.uchwyt(nazwaBazy, FileLoactions.Tablice());
    if(bazaDanych == null) return null;
    ArrayList<T> listaGier = new ArrayList<T>();
    bazaDanych.useDelimiter("\n|\\;");
    //tekst będzie rozbity przez średnik lub znak nowej lini
    bazaDanych.nextLine();
    //pierwszy wiersz zawiera nazwy kolumn
    while (bazaDanych.hasNext()) {
      //zapis kolejnych wierszy w tabeli do listy obiektów
      T tempGame = model.getConstructor().newInstance();//MAGIA
      Field[] pola = tempGame.getClass().getDeclaredFields();
      String temp ="";
      //deklaracja zmiennej poza pętlą for ponieważ dla pola this$0 nie używam .next() (patrz niżej) 
      for (Field f : pola) {//pętla przypisuje do tempgame kolejne znalezione w tabeli wartości
        Class<?> t = f.getType();
        //sprawdza typ aby wiedzieć jak sformatować otrzymanego stringa
          if(t.getName() != this.getClass().getName() && f.getName()!= "isAvailable")temp = bazaDanych.next();
          //dla pola this$0 nie odczytujemy wartości , pole isAvailable pomijamy
          //System.out.println(t.getName()+" "+f.getName()+" "+temp);//testy
          if (t == Integer.class) f.set(tempGame, TryParseStringToInteger(temp));
          else if (t == Double.class) f.set(tempGame, TryParseStringToDouble(temp));
          else if (t == String[].class) f.set(tempGame, temp.trim().split(","));
          else if (t == String.class) f.set(tempGame, temp);
          else if (t == Boolean.class) f.set(tempGame, TryParseStringToBool(temp));
          else if (t.getName() == this.getClass().getName());
          //edge case ,w przypadku inner class do listy pól zostaje dodany parametr this$0 ,który trzeba olać
          else throw new WrongTypeException();
      }
      listaGier.add(tempGame);
    }
    bazaDanych.close();
    return listaGier;
  }
 Integer TryParseStringToInteger(String x){
   //obsługa konwersji stringa na int
  Integer y; 
  try {
     y = Integer.parseInt(x);
   } catch (Exception e) {
     y = 0;
   }
   return y;
 }
 Double TryParseStringToDouble(String x){
   //obsługa konwersji stringa na float
  Double y; 
  try {
     y = NumberFormat.getNumberInstance(Locale.FRANCE).parse(x).doubleValue();
   } catch (Exception e) {
     y = 0d;
   }
   return y;
 }
  Boolean TryParseStringToBool(String x){
    x = x.replaceAll("(\\r|\\n)", "");
    if(x.equals("1") || x.equals("true") || x.equals("TRUE") || x.equals("")) return true;
    else return false;
  }
}