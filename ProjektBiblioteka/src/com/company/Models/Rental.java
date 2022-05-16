package com.company.Models;

import com.company.Models.EnumsForModels.Complexity;
import com.company.Models.EnumsForModels.GameCategory;

import java.util.Date;
import java.util.List;

public class Rental implements  IDataBaseObject{



    public int rentalId;
    public BoardGame boardGame;
    public User user;
    public boolean isGameReturned;
    public Date rentalDate;
    public Date returnDate;
    public float payment;

    public Rental(int rentalId,BoardGame boardGame, User user, boolean isGameReturned, Date rentalDate, Date returnDate,float payment){

        this.rentalId = rentalId;
        this.boardGame = boardGame;
        this.user = user;
        this.isGameReturned = isGameReturned;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
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
