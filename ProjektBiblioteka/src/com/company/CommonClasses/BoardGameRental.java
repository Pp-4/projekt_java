package com.company.CommonClasses;

import com.company.CommonClasses.BasicStates.Menu;
import com.company.CommonClasses.EnumsForCommonClasses.ProgramState;


//BoardGameRental jest to główna klasa programu,
//W ProramLoop znajduje się prosta maszyna stanów
//TODO: obsłużenie wszystkich pozostałych stanów maszyny

public class BoardGameRental {

    public ProgramState programState;
    boolean isDone = false;
    public BoardGameRental() {

        //docelowo program powinien zaczynać się od zalogowanie
        //programState = ProgramState.logIn;
        programState = ProgramState.inMenu;
        ProgramLoop();




    }

    public void ProgramLoop(){

        while  (!isDone){

            switch(programState) {
                case logIn:
                    //logIn()
                    //TODO:logowanie/rejestracja
                    break;
                case inMenu:
                    programState = Menu.MenuLoop();
                    break;
                case addingNewDBObject:
                    // addingNewDBObject()
                    //TODO: dodanie nowego elementu do bazy danych
                    break;
                case reading:
                    //reading();
                    //TODO:to odczytanie listy książek, użytkowników, lub wypożyczeń
                    break;
                case importFromFile:
                    //importFromFile
                    //TODO:importowanie listy użytkowników i gier
                    break;
                case exit:
                    isDone = true;
            }
        }



    }





}
