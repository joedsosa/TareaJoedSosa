/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_joedsosa;

import java.util.Scanner;

public class Tarea_JoedSosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 1;
        Scanner cathy = new Scanner(System.in);
        while (opc >= 1 && opc <= 5) {
            System.out.println("Bienvenido al Menu Principal");
            System.out.println("Ingrese el ejercicio que desea ");
            System.out.println("1. Pares e Impares  2. Triangulos y mas Triangulos  3.Anita lava la tina  4. Codigos Secretos");
            opc = cathy.nextInt();
            if (opc == 1) {
                System.out.println("Ingrese un numero");
                int numeroIngresado = cathy.nextInt();
                int countPares = 0;
                int countImpares = 0;
                String strPares = "";
                String strImpares = "";
                for (int i = 0; i <= numeroIngresado; i++) {
                    if (i % 2 == 0) {
                        countPares++;
                        strPares += i + ",";
                    } else {
                        countImpares++;
                        strImpares += i + ",";
                    }
                }
                System.out.println("Entre 0 y " + numeroIngresado + " existen " + countPares + " numeros pares y estos son: " + strPares.substring(0, strPares.length() - 1));
                System.out.println("Entre 0 y " + numeroIngresado + " existen " + countImpares + " numeros Impares y estos son: " + strImpares.substring(0, strImpares.length() - 1));

            } else if (opc == 2) {
                int opciones = 1;
                while (opciones >= 1 && opc <= 2) {
                    System.out.println("Que tipo de triangulo quiere?");
                    System.out.println("1. Equilatero  2. Triangulo Rectangulo");
                    opciones = cathy.nextInt();
                    if (opciones == 2) {
                        System.out.println("Ingrese la altura");
                        int b = cathy.nextInt();
                        for (int i = 1; i <= b; i++) {
                            for (int j = 1; j <= b - i; j++) {
                                System.out.print(" ");
                            }
                            for (int ola = 0; ola < i * 2 - 1; ola++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    } else if (opciones == 1) {
                        System.out.println("Ingrese la altura");
                        int a = cathy.nextInt();
                        for (int wz = 0; wz < a; wz++) {
                            for (int mw = 0; mw < wz + 1; mw++) {
                                System.out.print("*");
                            }
                            System.out.println("");

                        }
                    } 

                    }
                }else if (opc == 3) {
                        System.out.println("Ingrese una palabra");
                        String cadenaOriginal = "Anita lava la tina" ;
                        String cadenaInvertida = "";
                        // RECORREMOS LA CADENA DE ATRAS PARA ADELANTE
                        for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {
                            // CONCATENAMOS
                            cadenaInvertida += cadenaOriginal.charAt(i);
                        }
                        System.out.println("Cadena original: " + cadenaOriginal);
                        System.out.println("Cadena invertida: " + cadenaInvertida);

            }else if(opc==4){
                System.out.println(""); 
                        Scanner leer =new Scanner(System.in);
                        Scanner olis = new Scanner(System.in);
                        String letrasraras,numero;
                        int numero1=0,posi=1;
                        int c2=0;
                        System.out.println("Ingrese una cadena con numeros y letras ");
                        letrasraras = leer.next();
                        for(int k=0;k<letrasraras.length();k+=2){
                            char y=letrasraras.charAt(k);
                            char x=letrasraras.charAt(posi);
                            
                            numero= Character.toString(y);
                            
                            numero1 = Integer.parseInt(numero );
                            for(int j=0;j<numero1;j++){
                                System.out.print(x);
                            }
                            posi+=2;
                        }
                        System.out.println("");
                        
                    
                }

        }
    }
}
