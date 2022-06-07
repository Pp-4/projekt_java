package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.Models.BoardGame;
import com.company.Models.User;

import java.util.ArrayList;

public class GameShow {
    public GameShow() throws Exception {
        ReadFromFile test = new ReadFromFile();
        ArrayList<BoardGame> GameList =  test.read("bgg_dataset.csv",BoardGame.class);

        for (BoardGame a : GameList){
            System.out.println(a.toString());
        }
    }
}
