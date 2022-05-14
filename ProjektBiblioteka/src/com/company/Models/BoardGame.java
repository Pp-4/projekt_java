package com.company.Models;

import com.company.Models.EnumsForModels.AccesLevel;
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


    public BoardGame(String title,String designer,boolean isAvailable, int playingTimeInMinutes,int overallRank,int minimalAge,Complexity complexity,List<GameCategory>gameCategory){

        this.title = title;
        this.designer = designer;
        this.isAvailable = isAvailable;
        this.playingTimeInMinutes = playingTimeInMinutes;
        this.overallRank = overallRank;
        this.complexity = complexity;
        this.gameCategory = gameCategory;

    }


    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }




}
