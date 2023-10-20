package Ejercicio2Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Ejercicio2.Modelo.Multimap;

import java.util.ArrayList;

public class MultimapTest {


    ArrayList <String> values = new ArrayList<>();
    Multimap <Integer, String> multimapTest = new Multimap<>(1, values);

    @Test
    public void addTest (){
        this.multimapTest.add(1, "hola");
        Assertions.assertEquals(1, this.multimapTest.getKey());

    }

    @Test
    public void addIfAbsentTest(){
        this.multimapTest.add(1, "hola");
        Assertions.assertEquals(1, this.multimapTest.getKey());
    }

    @Test
    public void totalSizeTest(){
        this.multimapTest.add(1, "hola");
        Assertions.assertEquals(1, this.multimapTest.totalSize());
    }

}
