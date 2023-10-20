package Ejercicio2.Modelo;

import java.util.Collection;

public interface  Interfaz_Multimap <K,V>{
    public void add(K key, V value);
    public void addIfAbsent(K key, V value);
//    public Collection<V> get(K key);
//    public boolean remove (K key, V value);
    public long totalSize();

}
