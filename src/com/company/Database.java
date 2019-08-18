package com.company;

import java.util.HashMap;
import java.util.Map;

class Database {

    Map<Integer, Employee> m1 = new HashMap<>();

    void dbInput (Integer x, Employee e){

        m1.put(x, e);
    }
}
