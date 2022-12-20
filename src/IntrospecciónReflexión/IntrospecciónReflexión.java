/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IntrospecciónReflexión;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Guillermo
 */
public class IntrospecciónReflexión {

    /**
     * @param args the command line arguments
     * @author Guillermo Benítez Márquez
     * @url https://docs.oracle.com/javase/10/docs/api/java/lang/Class.html
     * @comments: Revisando luego en varias documentaciones, he podido lograr sacar esta aplicacón, algo muy sencilla de hacer
     * era lo unico que he podido hacer, ya que no entendia algunos metodos para poder implementarlo
     * he podido implementar los metodos nombrado en el ejercicio 4.4.1 Analisisi del mecanismo de reflexión, donde se indica los metodos, menos el forName
     * que no he podido saber para que se requiere ni como usarlo aun buscandolo en docuementaciones, 
     * contando que en clase ya tenia algo empezado de cuando se mando este ejercicio
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre de la clase a obtener la información deseada: ");
        String claseObtener = sc.nextLine();
        
        try {
            Class cls = Class.forName(claseObtener);
            System.out.println("Caracteristicas de " + cls.getName());
            System.out.println("==============================================");
            
            System.out.println("getModifiers(): " + cls.getModifiers());
            System.out.println("getConstructor(): " + Arrays.toString(cls.getConstructors()));
            System.out.println("getFields(): " + Arrays.toString(cls.getFields()));
            
        } catch (ClassNotFoundException e){
            System.out.println("ERROR");
            System.out.println("Debes de introducir una clase correcta, intentalo de nuevo.");
        }
    }
}
