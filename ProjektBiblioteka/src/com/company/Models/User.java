package com.company.Models;

import com.company.Models.EnumsForModels.AccesLevel;

import java.util.List;

public class User implements IDataBaseObject{

    public int id;
    public String firtsName;
    public  String lastName;
    public int age;
    public AccesLevel accesLevel;
    public List<Rental> boardGamesRentals;





    public User(int id,String firstName, String lastName, int age, AccesLevel accesLevel){

        this.id = id;
        this.firtsName = firstName;
        this.lastName =lastName;
        this.age= age;
        this.accesLevel = accesLevel;
    }

    public String toString(){

        return String.format("id: %1$s, FirstName: %2$s, LasName: %3$s", id,firtsName,lastName);

    }

    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }





}
