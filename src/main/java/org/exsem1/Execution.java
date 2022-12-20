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
import java.util.List;

public class Execution {
    public boolean checkArray(Integer[] arr) {
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) { if (arr[i] == null) index.add(i); }
        if (index.isEmpty()) return true;
        else throw new RuntimeException(String.format("Elements is null. Index list: %S", index.toString()));
    }
}
