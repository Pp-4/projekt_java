package com.company.Models;

import com.company.Models.EnumsForModels.AccesLevel;
import com.company.Models.EnumsForModels.Complexity;
import com.company.Models.EnumsForModels.GameCategory;

import java.util.List;

public class BoardGame implements IDataBaseObject{

    //Wszystkie poniższe informacje o grach planszowych można znależć na boardgamegeek.com
    // wszytie typy muszą mieć wrappery(typy pierwotne nie mają metody/pola class , dlaczego ? nie wiem)
    public Integer gameId;
    public String name;
    public Integer yearPublished;
    public Integer minPlayers;
    public Integer maxPlayers;
    public Integer playingTimeInMinutes;
    public Integer minimalAge;
    public Integer overallRank;
    public Double avgRating;
    public Integer BGGRank;//tymczasowy fix ze względu na niekompatybilność modelu a rzeczywistej tabeli
    public Double complexity;
    public Integer OwnedUsers;
    public String[] mechanics;
    public String[] domains;
    public Boolean isAvailable;
    public BoardGame(){}
//da się coś z tym zrobić ?
public BoardGame(int gameId,String name,int yearPublished,int minPlayers,int maxPlayers, int playTime, int minimalAge,double avgRating,String[] mechanics, int overallRank,double complexity,String[] domains,boolean isAvailable){

        this.gameId = gameId;
        this.name = name;
        this.yearPublished = yearPublished;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.avgRating = avgRating;
        this.minimalAge = minimalAge;
        this.mechanics = mechanics;
        this.playingTimeInMinutes = playTime;
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
