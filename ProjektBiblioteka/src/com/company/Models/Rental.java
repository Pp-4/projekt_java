package com.company.Models;

import com.company.Models.EnumsForModels.Complexity;
import com.company.Models.EnumsForModels.GameCategory;

import java.util.Date;
import java.util.List;

public class Rental implements  IDataBaseObject{



    public Integer rentalId;
    public Integer boardGameID;
    public Integer userID;
    public Boolean isGameReturned;
    public Date rentalDate;
    public Date returnDate;
    public Float payment;

    public Rental(Integer rentalId,Integer boardGame, Integer user, Boolean isGameReturned, Date rentalDate, Date returnDate,Float payment){

        this.rentalId = rentalId;
        this.boardGameID = boardGame;
        this.userID = user;
        this.isGameReturned = isGameReturned;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.payment = payment;


    }
    public Rental(){}
    @Override
    public String toString() {

        String output = "Rental Id: "+ rentalId + " Board Game:  " + boardGameID +" User : " + userID+ " Status: " + isGameReturned;
        return output;
    }

    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }
}
