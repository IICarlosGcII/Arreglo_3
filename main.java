import javax.swing.*;
import java.util.Scanner;
//Programa para pedir n numero de datos en el arreglo y luego mostrarlos (caracteres)
public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nElementos; //Declaramos la variales para contar los elementos

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elmentos del arreglo")); //Guardamos el numero con la ventana emergente JOPtionPane.

        char[] letras = new char[nElementos]; //Creamos el arreglo con su cantidad de nElementos

        for(int i=0;i<nElementos;i++){ //Guardamos los caracteres en el escanner

            System.out.println("Digite un caracter: ");
            letras[i] = entrada.next().charAt(0); //Usamos charAT(0) para guardar el primer caracter en la posicion 0

        }
        System.out.println("Los caracteres del arreglo son: ");
        for(int i=0;i<nElementos;i++){ //Recorremos los datos del arreglo para mostrarlos
            System.out.println(letras[i]);


        }
    }
}
