package com.company.CommonClasses.BasicStates;

import com.company.CommonClasses.CrudActions.ReadFromFile;
import com.company.Models.BoardGame;
import com.company.Models.IDataBaseObject;

import java.util.ArrayList;

public class DataReturn {

    public static  <T>ArrayList<T> BoardGamesReturn(String nazwaBazy, Class<T> typeParameterClass) throws Exception {
        ReadFromFile test = new ReadFromFile();
        ArrayList<T> returnList =  test.read(nazwaBazy,typeParameterClass);

        return returnList;
    }
}
