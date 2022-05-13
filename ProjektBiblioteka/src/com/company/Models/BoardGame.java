package com.company.Models;

import com.company.Models.EnumsForModels.Complexity;
import com.company.Models.EnumsForModels.GameCategory;

import java.util.List;

public class BoardGame implements IDataBaseObject{

    public int gameId;


    //Wszystkie poniższe informacje o grach planszowych można znależć na boardgamegeek.com
    public String title;
    public String designer;
    public boolean isAvailable;
    public int playingTimeInMinutes;
    public int overallRank;
    public int minimalAge;
    public Complexity complexity;
    public List<GameCategory> gameCategory;





    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }




}
