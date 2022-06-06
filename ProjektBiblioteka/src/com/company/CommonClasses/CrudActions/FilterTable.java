package com.company.CommonClasses.CrudActions;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterTable<T> {
    //TODO Filtrowanie tabeli
   
    public <T>ArrayList<T> filtr(ArrayList<T> collection,String filterValue)
    {
        ArrayList<T> outputList = new<T>ArrayList<T>();
        for (var obj :collection){

            for (var method : obj.getClass().getDeclaredFields()) {

                method.setAccessible(true);
                try {
                    var value = method.get(obj);
                    if(value.toString().contains(filterValue)){
                        outputList.add(obj);
                        break;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }




        return outputList;
    }
}
