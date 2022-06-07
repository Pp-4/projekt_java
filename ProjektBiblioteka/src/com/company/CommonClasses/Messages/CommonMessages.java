package com.company.CommonClasses.Messages;

//CommonMessages to klasa która zawiera wszystkie podstawowe komunikaty, któe są wyświetlane przy przejściu do nowego stnu maszyny
//TODO: zrobienie funkcji wyświetlających informacje dla każdego stanu maszyny
public  class CommonMessages {



    public static void MenuInstrucition(){
        //Podpowiedź gdy niezalogowano użytkownika
        ClearConsole.clearConsole();
        System.out.println("-------------------");
        System.out.println("L - Log in");
        System.out.println("R - Register new user");
        System.out.println("U - Show available users");
        System.out.println("B - Show available board game ");
        System.out.println("Q - Exit");
        System.out.println("-------------------");

    }
    public static void AdminInstrucition(){
        //Podpowiedź gdy zalogowano jako administrator
        ClearConsole.clearConsole();
        System.out.println("-------------------");
        System.out.println("L - Log out");
        System.out.println("R - Rent a board game");
        System.out.println("I - Show your data");
        System.out.println("U - Show and edit available users");
        System.out.println("B - Show and edit available board game ");
        System.out.println("Q - Exit");
        System.out.println("-------------------");

    }
    public static void UserInstrucition(){
        //Podpowiedź gdy zalogowano jako użytkownik
        ClearConsole.clearConsole();
        System.out.println("-------------------");
        System.out.println("L - Log out");
        System.out.println("R - Rent a board game");
        System.out.println("I - Show your data");
        System.out.println("U - Show available users");
        System.out.println("B - Show available board game ");
        System.out.println("Q - Exit");
        System.out.println("-------------------");

    }



    public static void ShowInstruction(){
        ClearConsole.clearConsole();
        System.out.println("-------------------");
        System.out.println("C - Add new item to DB");
        System.out.println("R - Show list of data");
        System.out.println("U - Update data");
        System.out.println("D - Remove data");
        System.out.println("Q - Exit");
        System.out.println("-------------------");
    }






}
