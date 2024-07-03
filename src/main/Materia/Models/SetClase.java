package main.Materia;

import java.util.HashSet;
import java.util.Set;

public class SetClase {

    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Manza");
        conjunto.add("Banana");
        conjunto.add("Orange");

        System.out.println("Fruits in the set: " + conjunto);
    }
}
