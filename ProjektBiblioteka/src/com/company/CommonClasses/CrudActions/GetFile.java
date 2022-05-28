package com.company.CommonClasses.CrudActions;
import java.io.*;
import java.util.Scanner;
public class GetFile {
    static Scanner uchwyt(String plik,String lokalizacja) throws FileNotFoundException{
        Scanner bazaDanych;
        File temp = Plik(plik, lokalizacja);
        if(temp == null)throw new FileNotFoundException("nie udało się odczytać pliku z tabelą");
        try {
          bazaDanych = new Scanner(temp,"UTF-8"); //wymagana informacja o kodowaniu, bez niej scanner nie działa poprawnie
        } catch (Exception e) {
          throw new FileNotFoundException();
        }
        return bazaDanych;
      }
      public static File Plik(String plik,String lokalizacja){
        File uchwyt;
        try {
          uchwyt = new File(lokalizacja, plik);
        }
        catch (Exception e) 
        {
          try
          {
            uchwyt = new File(new File(System.getProperty("user.home"), "/Desktop"), plik);
          }
          catch (Exception f) 
          {
            uchwyt = null;
          }
        }
        return uchwyt;
      }
}