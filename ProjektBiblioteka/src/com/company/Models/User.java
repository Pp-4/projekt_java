package com.company.Models;

import com.company.Models.EnumsForModels.AccesLevel;
import com.company.ValidationAndHashing.PasswordHashing;

import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

public class User implements IDataBaseObject{

    public Integer id;
    public String firtsName;
    public String lastName;
    public Integer age;
    public String password;
    public Boolean accesLevel;
    
    public User(int id,String firstName, String lastName,String password, int age, Boolean accesLevel){

        this.id = id;
        this.firtsName = firstName;
        this.lastName =lastName;
        this.password = PasswordHashing.doHashing(password);
        this.age= age;
        this.accesLevel = accesLevel;
    }
    public User(){}

    public String toString(){

        return "Id: "+ id + " | Imie i nazwisko: " + firtsName +" " + lastName;
    }

    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }





}
