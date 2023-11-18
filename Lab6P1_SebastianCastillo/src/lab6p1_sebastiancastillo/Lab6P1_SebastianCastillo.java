/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_sebastiancastillo;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class Lab6P1_SebastianCastillo {

    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();

    public static int[] Set1(int size) {
        int temporal[] = new int[size];
        for (int i = 0; i < size; i++) {
            temporal[i] = random.nextInt((73 - 65) + 1) + 65;
        }
        return temporal;
    }

    public static int[] Set2(int size2) {
        int temporal[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            temporal[i] = random.nextInt((73 - 65) + 1) + 65;
        }
        return temporal;
    }

    public static void imprimir(int[] arreglo) {
        char letra;
        for (int i = 0; i < arreglo.length; i++) {
            letra = (char) arreglo[i];
            System.out.print("[" + letra + "]");
        }
    }

    public static char interseccion(int[] arreglo, int[] arreglo2) {
        char temporal = ' ';
        char vacio = ' ';
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo2[i] == arreglo[j]) {
                    temporal = (char) arreglo2[j];
                        System.out.print("[" + temporal + "]");
                }
            }
        }
        return temporal;
    }

    public static char diferencia(int[] arreglo, int[] arreglo2) {
        char temporal = ' ';
        char vacio = ' ';
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo2[i] != arreglo[j]) {
                    temporal = (char) arreglo2[i];
                    System.out.print("[" + temporal + "]");
                }
            }
        }
        return temporal;
    }

    public static int[] array (int tam,int superior,int inferior){
        int temporal[] = new int[tam];
        for (int i = 0; i < tam; i++) {
            temporal[i] = random.nextInt((superior - inferior) + 1) + inferior;
        }
        return temporal;
    }
    public static boolean isprime(int[]arreglo){
        boolean prim = false;
        int cont_prim=0;
        int total=0;
        for(int i=0;i<arreglo.length;i++){
            for (int j = 0; j <arreglo[i]; j++) {
                total=arreglo[i]%j;
                if (total==0){
                    cont_prim++;
                }
                if(cont_prim==2){
                    prim=true;
                }else{
                    prim=false;
                }
            }
        }
        return prim;
    }
      public static int countPrimeFactors(int[] arreglo, boolean prim) {
    int prim_fact = 0;
    int acum = 0;
    int num = 1;
    if (!prim) {
        for (int i = 0; i < arreglo.length; i++) {
            acum = arreglo[i];
            while (acum%num!= 0) {
                if (acum%num == 0) {
                    acum=acum/num;
                    prim_fact++;
                }
                num++;
            }
        }
    } else {
        prim_fact = 1;
    }
    return prim_fact;
}

public static int getTotalPrimeCount(int[]arreglo) {
    int total = 0;
    for (int i = 0; i < arreglo.length; i++) {
        total += countPrimeFactors(arreglo, false);
    }
    int prim_fact = total;
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print("[" + total + "]");
    }
    return total;
}

    public static void imprimir2(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
    }

    public static void main(String[] args) {
        System.out.println("***** M E N U *****");
        System.out.println("1.Conjuntos");
        System.out.println("2.¿Cuántos primos tienes?");
        System.out.println("3. Para Salir");
        int opcion = leer.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    int nums[];
                    int nums2[];
                    System.out.println("Ingrese el tamaño del set 1");
                    int size = leer.nextInt();
                    System.out.println("Ingrese el tamaño del set 2");
                    int size2 = leer.nextInt();
                    nums = Set1(size);
                    nums2 = Set2(size2);
                    System.out.println("Congunto generados");
                    System.out.print("SET 1:");
                    imprimir(nums);
                    System.out.println();
                    System.out.print("SET 2:");
                    imprimir(nums2);
                    System.out.println();
                    System.out.println("Operaciones");
                    System.out.println("1. Intersecciones");
                    System.out.println("2. Diferencia");
                    int operacion = leer.nextInt();
                    while (operacion < 1 || operacion > 2) {
                        System.out.println("Ingrese una opcion valida");
                        operacion = leer.nextInt();
                    }
                    switch (operacion) {
                        case 1:
                            System.out.print("Interseccion (SET1,SET2)");
                            char inter;
                            inter = interseccion(nums, nums2);
                            break;
                        case 2:
                            System.out.print("Interseccion (SET1,SET2)");
                            char diff;
                            diff = diferencia(nums, nums2);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño del array");
                    int tam = leer.nextInt();
                    System.out.println("Ingrese el limite inferior");
                    int inferior = leer.nextInt();
                    System.out.println("Ingrese el limite superior");
                    int superior = leer.nextInt();
                    while (inferior >= superior||inferior<1) {
                        System.out.println("El inferiror tiene que ser menor que el superior y mayor que 1");
                        System.out.println("Ingrese el limite inferior");
                        inferior = leer.nextInt();
                        System.out.println("Ingrese el limite superior");
                        superior = leer.nextInt();
                    }
                    int disp[];
                    int fin[];
                    disp=array(tam,superior,inferior);
                    imprimir2(disp);
                    
                    break;
                default:
                    System.out.println("Porfavor eliga una opcion correcta");
                    break;
            }
            System.out.println();
            System.out.println("***** M E N U *****");
            System.out.println("1.Conjuntos");
            System.out.println("2.¿Cuántos primos tienes?");
            System.out.println("3. Para Salir");
            opcion = leer.nextInt();
        }//fin while
    }

}
