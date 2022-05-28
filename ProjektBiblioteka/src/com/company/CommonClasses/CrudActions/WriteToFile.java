package com.company.CommonClasses.CrudActions;
import java.io.*;
import java.lang.reflect.*;
import java.util.ArrayList;
public class WriteToFile {
    public <T> Boolean write(String nazwaBazy, String lokalizacja ,ArrayList<T> tabela) {
        File plik = GetFile.Plik(nazwaBazy, lokalizacja);
        if(plik == null)return false;//gdyby nie udało znaleźć się pliku docelowego
        try {
            BufferedWriter zapis = null;
            zapis = new BufferedWriter(new FileWriter(plik));

            //zapisanie nazw kolumn na początku tabeli
            Field[] wiersz0 = tabela.get(0).getClass().getDeclaredFields();
            String nazwyKolumn = "";
            for (Field pole : wiersz0) {
                nazwyKolumn+=pole.getName().toString()+";";
            }
            zapis.write(nazwyKolumn+"\n");

            //zapisywanie kolejnych wierszy w tabeli
            for (T wiersz : tabela) {
                Field[] pola = wiersz.getClass().getDeclaredFields();
                String temp = "";
                for (Field pole : pola) {
                    temp+=pole.get(wiersz).toString()+";";
                }
                zapis.write(temp+"\n");
            }
            zapis.flush();
            zapis.close();
            return true;
        } catch (Exception e) {
            System.out.println("Błąd przy zapisie pliku.");
            e.printStackTrace();
            return false;
        }
    }
}