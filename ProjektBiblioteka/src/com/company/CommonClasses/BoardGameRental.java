package com.company.CommonClasses;

import com.company.CommonClasses.BasicStates.*;
import com.company.CommonClasses.EnumsForCommonClasses.ProgramState;

//BoardGameRental jest to główna klasa programu,
//W ProramLoop znajduje się prosta maszyna stanów
//TODO: obsłużenie wszystkich pozostałych stanów maszyny

public class BoardGameRental {

    public ProgramState programState;
    boolean isDone = false;
    public BoardGameRental() throws Exception {

        //docelowo program powinien zaczynać się od zalogowanie
        //programState = ProgramState.logIn;
        programState = ProgramState.inMenu;
        ProgramLoop();




    }
    public void ProgramLoop() throws Exception {

        while  (!isDone){
            switch(programState) {
                case logIn:
                    new LogIn();
                    if(Variables.logInSucces){
                        if(Variables.globalAdmin){
                            programState = Menu.AdminLoop();
                        }
                        else{programState = Menu.UserLoop();}
                    }
                    else {
                        programState = Menu.MenuLoopFirst();
                    }
                    break;

                case logOut:
                    new LogOut();
                    programState = Menu.MenuLoopFirst();
                    break;

                case inMenu:
                    programState = Menu.MenuLoopFirst();
                    break;

                case register:
                    new Register();
                    programState = Menu.MenuLoopFirst();
                    break;

                case userShow:
                    new UserShow();
                    if(Variables.logInSucces){
                        programState = Menu.UserLoop();
                    }
                    else{programState = Menu.MenuLoopFirst();}
                    break;

                case gameShow:
                    new GameShow();
                    if (Variables.logInSucces){
                        if(Variables.globalAdmin){
                            programState = Menu.AdminLoop();
                        }
                        else {programState = Menu.UserLoop();}
                    }
                    else {programState = Menu.MenuLoopFirst();}
                    break;

                case date:
                    new Date();
                    if (Variables.logInSucces){
                        if(Variables.globalAdmin){
                            programState = Menu.AdminLoop();
                        }
                        else {programState = Menu.UserLoop();}
                    }
                    else {programState = Menu.MenuLoopFirst();}
                    break;

                case exit:
                    isDone = true;
                    break;

                case wait:
                    if (Variables.logInSucces){
                        if(Variables.globalAdmin){
                            programState = Menu.AdminLoop();
                        }
                        else {programState = Menu.UserLoop();}
                    }
                    else {programState = Menu.MenuLoopFirst();}
                    break;

                case adminRegister:
                    new AdminRegister();
                    programState = Menu.MenuLoopFirst();
                    break;

                case rent:
                    new Rent();
                    if(Variables.globalAdmin){
                        programState = Menu.AdminLoop();
                    }
                    else {programState = Menu.UserLoop();}
                    break;

            }
        }
    }
}
