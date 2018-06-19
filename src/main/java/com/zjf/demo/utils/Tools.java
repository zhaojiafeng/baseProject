package com.zjf.demo.utils;

import java.util.LinkedList;
import java.util.List;

public class Tools {

    public static List<Integer> addList(List<Integer> oldList,List<Integer> newList){
        List<Integer> addList = new LinkedList<>();
        for (Integer id : newList){
            if (!oldList.contains(id)){
                addList.add(id);
            }
            continue;
        }
        return addList;
    }

    public static List<Integer> deleteList(List<Integer> oldList,List<Integer> newList){
        List<Integer> deleteList = new LinkedList<>();
        for (Integer id : oldList){
            if (!newList.contains(id)){
                deleteList.add(id);
            }
            continue;
        }
        return deleteList;
    }
}
