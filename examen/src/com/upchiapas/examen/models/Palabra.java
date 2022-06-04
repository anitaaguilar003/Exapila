package com.upchiapas.examen.models;
import java.util.Stack;
public class Palabra {
    private Character op;
    String cadena;
    public Palabra(String cadenaE){
        this.cadena=cadenaE;
    }
    public String op (){

        String letra = " ";
        String simbolo = " ";

        for (int i=0; i<cadena.length();i++) {
            Stack<Character> pila = new Stack<Character>();
            pila.push(cadena.charAt(i));
            while (!pila.isEmpty()){
                char caracter = cadena.charAt(i);
                if (caracter == '+'|| caracter =='-'|| caracter == '/'|| caracter == '*'){
                    simbolo += pila.pop();
                }
                else{
                    letra += pila.pop();
                }
            }
        }
        String OpFinal = simbolo + letra;
        return OpFinal;
    }
}
