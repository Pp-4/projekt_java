package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.EnumsForCommonClasses.ProgramState;
import com.company.CommonClasses.Messages.CommonMessages;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static ProgramState MenuLoopFirst(){

        ProgramState changeProgramState = ProgramState.inMenu;
        String userCmd;

        try
        {

            CommonMessages.MenuInstrucition();
            userCmd = sc.next();
            switch (userCmd.toUpperCase()) {
                case "L" -> changeProgramState = ProgramState.logIn;
                case "R" -> changeProgramState = ProgramState.register;
                case "U" -> changeProgramState = ProgramState.userShow;
                case "B" -> changeProgramState = ProgramState.gameShow;
                case "Q" -> changeProgramState = ProgramState.exit;
                case "ADMIN" -> changeProgramState = ProgramState.adminRegister;
                default -> changeProgramState = ProgramState.wait;
            }


        }
        catch(Exception e)
        {
            System.out.println("w aplikacji wystąpił błąd");
        }
        return changeProgramState;


    }

    public static ProgramState UserLoop(){

        ProgramState changeProgramState = ProgramState.inMenu;
        String userCmd;

        try
        {

            CommonMessages.UserInstrucition();
            userCmd = sc.next();
            switch (userCmd.toUpperCase()) {
                case "L" -> changeProgramState = ProgramState.logOut;
                case "R" -> changeProgramState = ProgramState.rent;
                case "I" -> changeProgramState = ProgramState.date;
                case "U" -> changeProgramState = ProgramState.userShow;
                case "B" -> changeProgramState = ProgramState.gameShow;
                case "Q" -> changeProgramState = ProgramState.exit;
                default -> changeProgramState = ProgramState.wait;
            }


        }
        catch(Exception e)
        {
            System.out.println("w aplikacji wystapil blad");
        }
        return changeProgramState;
    }
    public static ProgramState AdminLoop(){

        ProgramState changeProgramState = ProgramState.inMenu;
        String userCmd;

        try
        {

            CommonMessages.UserInstrucition();
            userCmd = sc.next();
            switch (userCmd.toUpperCase()) {
                case "L" -> changeProgramState = ProgramState.logOut;
                case "R" -> changeProgramState = ProgramState.rent;
                case "I" -> changeProgramState = ProgramState.date;
                case "U" -> changeProgramState = ProgramState.userShowAndEdit;
                case "B" -> changeProgramState = ProgramState.gameShowAndEdit;
                case "Q" -> changeProgramState = ProgramState.exit;
                default -> changeProgramState = ProgramState.wait;
            }


        }
        catch(Exception e)
        {
            System.out.println("w aplikacji wystapil blad");
        }
        return changeProgramState;
    }
}
