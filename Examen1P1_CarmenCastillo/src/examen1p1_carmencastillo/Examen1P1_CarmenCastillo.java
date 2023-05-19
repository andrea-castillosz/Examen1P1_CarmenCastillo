/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_carmencastillo;
import java.util.Scanner;
/**
 *
 * @author casti
 */
public class Examen1P1_CarmenCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        boolean seguirmenu = true;
        
        while (seguirmenu){
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Sumador Binario.");
            System.out.println("2. Estrella de David.");
            System.out.println("3. Salir.");
            System.out.print("Ingrese la opción a ejecutar: ");
            int opcion = leer.nextInt();
            
            
            switch (opcion){
                case 1: 
                    System.out.print("Ingrese el primer número: ");
                    String binario1 = leer.next();
                    System.out.print("Ingrese el segundo número: ");
                    String binario2 = leer.next();
                    
                    for (int cont = 0; cont < binario1.length(); cont++){
                        char cara = 0;
                        cara += 1;        
                    }
                    
                    while (binario2.length() < binario1.length() ) {
                        System.out.println("Los números deben de tener el mismo número de bits.");
                    }
                    
                    break;
                    
                case 2:
                    System.out.print("Ingrese un tamaño: ");
                    int tama = leer.nextInt();
                    if ((tama % 2 == 0) || (tama < 9)) {
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                    }else {
                        for (int i=-1;i<(tama/2)+1;i++) {
                            for (int j=0; j<tama; j++){
                                if (i==0){ 
                                    System.out.print("*");
                                }else if (i==j){ //triangulo invertido/linea izquierda
                                    System.out.print("*"); //triangulo invertido/linea izquierda
                                }else if (j>=tama/2 && j==(tama-1)-i){ //triangulo invertido/linea derecha
                                    System.out.print("*");  
                                    
                                }else if (i==(tama/2)-1){ //linea de abajo del triangulo
                                    System.out.print("+");
                                    
                                }else if (j>(tama/2) && i==j){ //este no sirve 
                                    System.out.print("0");   
                                    
                                }else if (j==(tama/2)-i && j<=(tama/2)+1){ //linea izquierda
                                    System.out.print("+");  
                                    
                                }else{
                                    System.out.print(" "); //los que sobren quedan en blanco
                                }    
                            }   
                            System.out.println(" "); //columna 
                        }  
                        
                    }
                    //(tama/2)-1
                    
                    break;
                    
                    
                default: 
                    seguirmenu = false;
                    
                      
            }
            
        }
        
    }
    
}
