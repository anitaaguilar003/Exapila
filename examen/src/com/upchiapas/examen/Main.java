package com.upchiapas.examen;
import com.upchiapas.examen.models.Palabra;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Palabra operacion = new Palabra("A+B/C*D");
        System.out.println(operacion.op());
    }
}