package com.company.CommonClasses.CrudActions;
import java.io.*;
import java.util.Scanner;
public class GetFile {
    static Scanner uchwyt(String plik,String lokalizacja) throws FileNotFoundException{
        Scanner bazaDanych;
        //wymagana informacja o kodowaniu, bez niej scanner nie działa poprawnie
        try {//próba znaliezienia pliku w podanej lokalizacji
          bazaDanych = new Scanner(new File(lokalizacja, plik),"UTF-8");
        } catch (Exception e) {
          try {//próba znaleziienia pliku na pulpicie
            bazaDanych = new Scanner(new File(new File(System.getProperty("user.home"), "/Desktop"), plik),"UTF-8");
          } catch (Exception f) {
            throw new FileNotFoundException("nie udało się odczytać pliku z tabelą");
          }
        }
        return bazaDanych;
      }
}