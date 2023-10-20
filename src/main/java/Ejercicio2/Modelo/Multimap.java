package Ejercicio2.Modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Multimap <K,V> implements Interfaz_Multimap<K,V>{
    private K key;
    private ArrayList<V> values;

    public Multimap(K key, ArrayList<V> values) {
        this.key = key;
        this.values = values;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public ArrayList<V> getValues() {
        return values;
    }

    public void setValues(ArrayList<V> values) {
        this.values = values;
    }

    public void add(K key, V value){
      //añade el elemento value para la clave key
        if (key.equals(this.key)){
            this.values.add(value);
        }
    }

    public void addIfAbsent(K key, V value){
        //añade el elemento value para la clave key, si no está presente ya en asociación en el multimap, si ya está presente no lo añade
        for (V value1: values) {
            if (values.indexOf(value1) > 0){
                System.out.println("Ya está en la colección");
            } else {
                values.add(value1);
            }

        }
    }


    public long totalSize() {
        //devuelve el número de elementos asociados.
        return this.values.size();

    }
 }
