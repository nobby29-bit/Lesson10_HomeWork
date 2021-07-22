package ru.geekbrains;

import java.io.PrintStream;
import java.util.*;

public class ArrayWords {
    public static void main (String [] args){

        arrayWork ();

    }

    public static void arrayWork (){
       String[] arWords = {
            "Месяц",
               "Зима",
               "Зима",
               "Декабрь",
               "Январь",
               "Февраль",
               "Весна",
               "Март",
               "Апрель",
               "Май",
               "Лето",
               "Июнь",
               "Июль",
               "Август",
               "Месяц",

       };

       Set<String> uniqueList = new HashSet<>(); // это для набивки руки
        HashMap<String, Integer> hMaps = new HashMap<>(); //я знаю что можно было использовать только его для решения обеих задач

       System.out.printf("Уникальные значения\n");
       for (String arr: arWords){
           uniqueList.add(arr);
           hMaps.putIfAbsent(arr,0);
       }

        Iterator<String> integer = uniqueList.iterator();
       while (integer.hasNext()){
           System.out.printf(integer.next()+"\n"); // тут можно было напечать только ключи из map
       }

        for (String word: arWords){
            hMaps.merge(word, 1, Integer::sum);
        }
       System.out.printf("Число вхождений\n");

      for (Map.Entry<String, Integer> eMap: hMaps.entrySet()){
           System.out.printf(eMap.getKey()+": "+eMap.getValue()+"\n");
       }


    }



}
