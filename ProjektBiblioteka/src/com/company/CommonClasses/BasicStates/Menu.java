package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.EnumsForCommonClasses.ProgramState;
import com.company.CommonClasses.Messages.CommonMessages;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static ProgramState MenuLoop(){

        ProgramState changeProgramState = ProgramState.nullAction;
        String userCmd;

        try
        {

            CommonMessages.ShowInstruction();
            userCmd = sc.next();
            switch (userCmd.toUpperCase()) {
                case "C" -> changeProgramState = ProgramState.addingNewDBObject;
                case "R" -> changeProgramState = ProgramState.reading;
                case "U" -> changeProgramState = ProgramState.update;
                case "D" -> changeProgramState = ProgramState.remove;
                case "Q" ->changeProgramState = changeProgramState.exit;
            }


        }
        catch(Exception e)
        {
            System.out.println("w aplikacji wystąpił błąd");
        }
        return changeProgramState;
    }
}
