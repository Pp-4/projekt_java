package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.CrudActions.CreateModel;
import com.company.CommonClasses.CrudActions.WriteToFile;
import com.company.CommonClasses.EnumsForCommonClasses.ProgramState;
import com.company.CommonClasses.Messages.CommonMessages;
import com.company.Models.BoardGame;
import com.company.Models.User;

import java.util.Scanner;

public class Edit {

    public ProgramState edit(){

        CommonMessages.EditInstructions();

        Scanner sc = new Scanner(System.in);
        ProgramState changeProgramState = ProgramState.inMenu;
        String userCmd;

        try
        {

            CommonMessages.MenuInstrucition();
            userCmd = sc.next();
            switch (userCmd.toUpperCase()) {
                case "U" -> editUsers(sc.nextInt());
                case "Q" -> changeProgramState = ProgramState.inMenu;
                default -> changeProgramState = ProgramState.wait;
            }


        }
        catch(Exception e)
        {
            System.out.println("w aplikacji wystąpił błąd");
        }
        return changeProgramState;
    }
    private ProgramState editUsers(int id) throws Exception {
       var users = DataReturn.BoardGamesReturn("users.cvs", User.class);
       users.set(id-1, CreateModel.createUser(id));
       System.out.println("Udało się pomyslnie edytowac uzytkownika o id: "+ id );
       WriteToFile wtf = new WriteToFile();
       wtf.write("users.csv",users);
       return ProgramState.inMenu;
    }

  /*  private ProgramState editBoardGames(int id) throws Exception {

        var users = DataReturn.BoardGamesReturn("bgg_dataset.csv", BoardGame.class);
        var user = users.get(id-1);
        System.out.println("Ustaw dostępno");
        users.set(id-1, CreateModel.createBoardGame(id));
        System.out.println("Udało się pomyslnie edytowac grę o id: "+ id );
        WriteToFile wtf = new WriteToFile();
        wtf.write("bgg_dataset.csv",users);
        return ProgramState.inMenu;
    }*/
    /*private ProgramState editRentals(int id){

    }*/

}
