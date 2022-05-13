package com.company.Models;

import java.util.Date;

public class Rental implements  IDataBaseObject{



    public BoardGame boardGame;
    public User user;
    public boolean isGameReturned;
    public Date rentalDate;
    public int payment;

    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }
}
