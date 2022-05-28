package com.company.CommonClasses.CrudActions;
import java.io.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
public class WriteToFile {
    public <T> Boolean write(String nazwaBazy, String lokalizacja ,ArrayList<T> tabela) {
        File plik = GetFile.Plik(nazwaBazy, lokalizacja);
        if(plik == null)return false;//gdyby nie udało znaleźć się pliku docelowego
        try {
            BufferedWriter zapis = null;
            zapis = new BufferedWriter(new FileWriter(plik,StandardCharsets.UTF_8));

            //zapisanie nazw kolumn na początku tabeli
            Field[] wiersz0 = tabela.get(0).getClass().getDeclaredFields();
            String nazwyKolumn = "";
            for (int i = 0;i<wiersz0.length;i++) {
                nazwyKolumn+=wiersz0[i].getName().toString()+(( i + 1 == wiersz0.length)? "" : ";");
            }
            zapis.write(nazwyKolumn+"\n");

            //zapisywanie kolejnych wierszy w tabeli
            for (T wiersz : tabela) {
                Field[] pola = wiersz.getClass().getDeclaredFields();
                String temp = "";
                for(int i = 0; i < pola.length; i++){
                    if(pola[i].getType() == String[].class){
                        String[] strArr = (String[]) pola[i].get(wiersz);
                        StringBuilder strBuilder = new StringBuilder();
                        for (int j = 0; j < strArr.length; j++) {
                           strBuilder.append(strArr[j]+((j + 1 == strArr.length)? "" : ","));
                        }
                        String newString = strBuilder.toString();
                        temp+=newString+";";
                    }
                    else temp+=pola[i].get(wiersz).toString()+(( i + 1 == pola.length)? "" : ";");
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