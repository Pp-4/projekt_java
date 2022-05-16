package com.company.Models;

import com.company.Models.EnumsForModels.AccesLevel;
import com.company.Models.EnumsForModels.Complexity;
import com.company.Models.EnumsForModels.GameCategory;

import java.util.List;

public class BoardGame implements IDataBaseObject{

    public int gameId;
    public String name;
    public int yearPublished;
    public int minPlayers;
    public int maxPlayers;
    //Wszystkie poniższe informacje o grach planszowych można znależć na boardgamegeek.com



    public int playingTimeInMinutes;
    public float avgRating;
    public int overallRank;
    public int minimalAge;
    public float complexity;
    public List<String> mechanics;
    public List<String> domains;
    public boolean isAvailable;


    public BoardGame(int gameId,String name,int yearPublished,int minPlayers,int maxPlayers, int playingTimeInMinutes,float avgRating, int minimalAge,List<String>mechanics, int overallRank,float complexity,List<String>domains,boolean isAvailable){

        this.gameId = gameId;
        this.yearPublished = yearPublished;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.avgRating =avgRating;
        this.minimalAge = minimalAge;
        this.mechanics = mechanics;
        this.name = name;

        this.isAvailable = isAvailable;
        this.playingTimeInMinutes = playingTimeInMinutes;
        this.overallRank = overallRank;
        this.complexity = complexity;
        this.domains = domains;

    }


    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }




}
