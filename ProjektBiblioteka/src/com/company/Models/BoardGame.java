package com.company.Models;

import com.company.Models.EnumsForModels.AccesLevel;
import com.company.Models.EnumsForModels.Complexity;
import com.company.Models.EnumsForModels.GameCategory;

import java.util.List;

public class BoardGame implements IDataBaseObject{

    //Wszystkie poniższe informacje o grach planszowych można znależć na boardgamegeek.com  
    public int gameId;
    public String name;
    public int yearPublished;
    public int minPlayers;
    public int maxPlayers;
    public int playingTimeInMinutes;
    public int minimalAge;
    public double avgRating;
    public int overallRank;
    public double complexity;
    public int OwnedUsers;
    public List<String> mechanics;
    public List<String> domains;
    public boolean isAvailable;

//da się coś z tym zrobić ?
public BoardGame(int gameId,String name,int yearPublished,int minPlayers,int maxPlayers, int playTime, int minimalAge,double avgRating,List<String>mechanics, int overallRank,double complexity,List<String>domains,boolean isAvailable){

        this.gameId = gameId;
        this.name = name;
        this.yearPublished = yearPublished;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.avgRating = avgRating;
        this.minimalAge = minimalAge;
        this.mechanics = mechanics;
        this.playingTimeInMinutes = playingTimeInMinutes;
        this.overallRank = overallRank;
        this.complexity = complexity;
        this.domains = domains;
        this.isAvailable = isAvailable;
    }


    @Override
    public String sqlTableName() {

        //TODO: wskazanie odpowiadającej tabeli z bazy danych
        //poniżej znajduje się kod z C#, który jest za to odpowiedzialny
        //public override string SqlTableName { get { return "Users"; }  }
        return null;
    }




}
