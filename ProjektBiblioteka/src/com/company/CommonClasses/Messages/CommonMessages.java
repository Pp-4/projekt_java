package com.company.CommonClasses.Messages;

//CommonMessages to klasa która zawiera wszystkie podstawowe komunikaty, któe są wyświetlane przy przejściu do nowego stnu maszyny
//TODO: zrobienie funkcji wyświetlających informacje dla każdego stnu maszyny
public  class CommonMessages {



    public static void LogInInstrucitions(){
        //TODO: wyświetlnie opcji wyoru przy logowaniu
        //podobnie przy innych stanach
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
