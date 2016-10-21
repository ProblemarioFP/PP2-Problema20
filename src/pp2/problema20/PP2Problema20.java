/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema20;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a,b,sumA=0,sumB=0;    // Declaracion de variables
    boolean res;
    
    a= pedirDato();         //Declaracion de metodos
    b= pedirDato();
    sumA= Dividendos(a);
    sumB= Dividendos(b);
    res= Comparacion(a,b,sumA,sumB);
    mostrarResultado(res,a,b);
    }
    
    public static int pedirDato() {     //Metodo que pide datos para evaluar si son amigos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca dato númerico para calcular si es número amigo");
        return entrada.nextInt();
    }
    
    public static int Dividendos(int a) {   //Metodo que calcula la suma de los divisores de cada número introducido al programa
        int pi=0;
        int suma=0;
        for (int i=1; i<a;i++){
            if(a%i==0){
                suma=i+suma;              
            }
            }
        //System.out.println(suma);
        return suma;}

    public static void mostrarResultado(boolean res, int a, int b) {    //metodo que muestra en pantalla si 2 numeros son amigos o no
        if(res==true){
        System.out.println(a+" y "+b+ " son números amigos.");
        }else{
        System.out.println(a+" y "+b+ " no son números amigos.");
        }
    }
    
    public static boolean Comparacion(int a, int b, int sumA, int sumB) {   //Metodo que compara si la suma de los divisores de A es igual al valor de B
        return a==sumB&&b==sumA;                                            //y viceversa
    }}
