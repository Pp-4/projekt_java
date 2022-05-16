package com.company.CommonClasses.EnumsForCommonClasses;

//Podstawe stany programu, dodawać w razie potrzeby

public enum ProgramState {
    logIn,
    inMenu,
    addingNewDBObject,
    addingNewUser,
    addingNewBoardGame,
    addingNewRental,
    reading,
    update,
    remove,
    importFromFile,
    fatalError,
    nullAction,
    exit
}
