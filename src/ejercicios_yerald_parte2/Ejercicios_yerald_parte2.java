/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_yerald_parte2;
import java.util.Random;
import  java.util.Scanner;
/**
 *
 * @author Felipe
 */
public class Ejercicios_yerald_parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,fila,cont,columna;
        Scanner leer = new Scanner(System.in);
        int vector [][]= new int [4][4];
        Random azar = new Random();
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                
                vector[i][j]=azar.nextInt(10)+1;
            }
        }
        System.out.println("el vector es: ");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++)
            System.out.print(vector[i][j]+"\t");
        System.out.println();
        }
        
        System.out.println("ingrese fila a sumar");
        fila=leer.nextInt();
        
        cont=0;
        for(j=0;j<4;j++){
            cont=vector[fila-1][j]+cont;
        }
        System.out.println("la suma de la fila es: "+(cont));
                
        System.out.println("");
        
        System.out.println("ingrese columna a sumar");
        columna=leer.nextInt();
        
        cont=0;
        for(i=0;i<4;i++){
            cont=vector[i][columna-1]+cont;
        }
        System.out.println("la suma de la columna es: "+(cont));
        System.out.println("");
        
        System.out.println("la suma de cada fila es: ");
        cont=0;
        System.out.println("");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                cont=vector[i][j]+cont;
                
            }
            System.out.println("la suma de la fila: "+(i+1)+" es: "+(cont));
            cont=0;
        }
        System.out.println("");
        System.out.println("la suma de cada columna es: ");
        System.out.println("");
        for(j=0;j<4;j++){
            for(i=0;i<4;i++){
                cont=vector[i][j]+cont;
                
            }
            System.out.println("la suma de la fila: "+(j+1)+" es: "+(cont));
            cont=0;
        }
        
        
    }
    
}
