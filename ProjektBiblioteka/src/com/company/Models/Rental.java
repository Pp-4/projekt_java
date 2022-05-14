package com.company.Models;

import com.company.Models.EnumsForModels.Complexity;
import com.company.Models.EnumsForModels.GameCategory;

import java.util.Date;
import java.util.List;

public class Rental implements  IDataBaseObject{



    public BoardGame boardGame;
    public User user;
    public boolean isGameReturned;
    public Date rentalDate;
    public int payment;

    public Rental(BoardGame boardGame, User user, boolean isGameReturned, Date rentalDate, int payment){

        this.boardGame = boardGame;
        this.user = user;
        this.isGameReturned = isGameReturned;
        this.rentalDate = rentalDate;
        this.payment = payment;


    }

    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }
}
