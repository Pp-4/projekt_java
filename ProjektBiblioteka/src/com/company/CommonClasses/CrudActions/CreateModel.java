package com.company.CommonClasses.CrudActions;

import com.company.CommonClasses.BasicStates.Rent;
import com.company.CommonClasses.EnumsForCommonClasses.ProgramState;
import com.company.Models.BoardGame;
import com.company.Models.Rental;
import com.company.Models.User;

import java.util.Scanner;

public class CreateModel {

    public static User createUser(int id){

        Scanner sc = new Scanner(System.in);
        ProgramState changeProgramState = ProgramState.inMenu;

        System.out.println("Entar first name");
        String firstname = sc.next();
        System.out.println("Enter last name");
        String lastname = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        System.out.println("Enter age");
        Integer age = sc.nextInt();
        System.out.println("Enter acces level");
        Boolean acceslevel = sc.nextBoolean();


        return new User(id,firstname,lastname,password,age,acceslevel);
    }
   /* public static BoardGame createBoardGame(int id){
       // double avgRating,String[] mechanics, int overallRank,double complexity,String[] domains,boolean isAvailable
        Scanner sc = new Scanner(System.in);
        ProgramState changeProgramState = ProgramState.inMenu;

        System.out.println("Entar name");
        String name = sc.next();
        System.out.println("Enter publish year");
        int publishyear = sc.nextInt();
        System.out.println("Enter minPlayers");
        int minPlayers = sc.nextInt();
        System.out.println("Enter maxPlayers");
        Integer maxPlayers = sc.nextInt();
        System.out.println("Enter playing time in minutes");
        int playingTimeinMinutes = sc.nextInt();
        System.out.println("Enter avg rating");
        Double avgRating = sc.nextDouble();
        System.out.println("Enter overall rank");
        Integer overallRank = sc.nextInt();
        System.out.println("Enter mechanic");
        String mechanic = sc.next();
        System.out.println("Enter domains");
        String mechanic = sc.next();
        return new BoardGame();
    }
    public static Rental createRental(){
        return new Rental();
    }*/
}
