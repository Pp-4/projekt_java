package com.company.CommonClasses.BasicStates;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.CommonClasses.CrudActions.WriteToFile;
import com.company.Models.BoardGame;
import com.company.Models.Rental;
import com.company.Models.User;

public class Rent {
    public Rent()throws Exception{
        System.out.println("Chwilowo nie da sie wyporzyczac");
        ReadFromFile test = new ReadFromFile();//przykładowy odczyt tabeli i zapisanie wyników do arraylist
        //ArrayList<BoardGame> ListaGier =  test.read("bgg_dataset.csv",BoardGame.class);
        //ArrayList<User> Listaużytkowników =  test.read("users.csv",User.class);
        ArrayList<Rental> ListaWypozyczen =  test.read("rentTab.csv",Rental.class);

        String Polecenia[] = {"Wypożyczanie gry użytkownikowi","Podaj ID uzytkownika : ","Podaj ID gry : "};
        System.out.println(Polecenia[0]);
        int output[] = {-1,-1};
        for(int i = 0;i<2;i++){
            do{
                System.out.print(Polecenia[i+1]);
                String input = "";
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                input = reader.readLine();
                if(input.equals("exit"))break;
                try {
                    output[i] = Integer.parseInt(input);
                } catch (Exception e) {
                    output[i] = -1;
                }
            }while(output[i] == -1);
        }
        ListaWypozyczen.add(new Rental(ListaWypozyczen.size()+1, output[0], output[1], false, "01-01-1970", "31-12-2038", 0f));
        WriteToFile zapis = new WriteToFile();
        zapis.write("rentTab.csv", ListaWypozyczen);
    }
}