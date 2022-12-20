package org.exsem1;

/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве
аргумента целочисленный одномерный массив. Метод должен пройтись
по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null,
то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках,
то идеально было бы все их “подсветить”
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Execution ex = new Execution();
        Integer[] arr = {1,2,null,4,null};
        System.out.println(ex.checkArray(arr));
    }
}