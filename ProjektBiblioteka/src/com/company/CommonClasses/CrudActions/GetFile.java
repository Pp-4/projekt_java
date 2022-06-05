package com.company.CommonClasses.CrudActions;
import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
public class GetFile {
    static Scanner uchwyt(String plik,String lokalizacja){
      //wrap dla metod używających poprzedniej wersji uchywtu
      List<String> wrap = new ArrayList<>();
      wrap.add(lokalizacja);
      Scanner bazaDanych = uchwyt(plik, wrap);
      return bazaDanych;
      }
      static Scanner uchwyt(String plik,List<String> lokalizacja){
        //znajduje szukany plik i zwraca uchwyt typu scanner do niego
        String ścieżka ="";
          for (String string : lokalizacja) {
              File tempfile = Plik(plik, string);
              if(tempfile.isFile()){
                ścieżka = System.getProperty("user.dir")+string;
                break;
              }
          }
          try {
            Scanner uchwyt = new Scanner(new File(ścieżka,plik),"UTF-8");
            return uchwyt;
          } catch (Exception fileException) {
            System.out.println("Uchwyt nie zdołał odnaleźć pliku!");
          }
        return  null;
      }
      static BufferedWriter uchwytB(String plik,List<String> lokalizacja){
        //znajduje szukany plik i zwraca uchwyt typu bufferedWriter do niego
        String ścieżka ="";
          for (String string : lokalizacja) {
              File tempfile = Plik(plik, string);
              if(tempfile.isFile()){
                ścieżka = System.getProperty("user.dir")+string+"\\"+plik;
                break;
              }
          }
          try {
            BufferedWriter uchwyt = new BufferedWriter(new FileWriter(ścieżka,StandardCharsets.UTF_8));
            return uchwyt;
          } catch (Exception fileException) {
            System.out.println("Uchwyt nie zdołał odnaleźć pliku!");
          }
        return  null;
      }
      public static File Plik(String plik,String lokalizacja){
        File uchwyt;
        try {
          uchwyt = new File(System.getProperty("user.dir")+lokalizacja, plik);
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