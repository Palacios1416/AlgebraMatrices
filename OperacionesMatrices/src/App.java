import java.util.Scanner;
public class App {
    public static byte opc;
    public static int sizefilas,sizecolum;
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Que tipo de operación desea hacer?\n" +
                            "1) Suma de matrices\n" +
                            "2) Resta de matrices\n" +
                            "3) Multiplicacion de matrices");
        do {
           opc = scan.nextByte(); 
        } while (opc < 1 || opc > 3);

        System.out.println("¿Cuantas filas tendra la matriz?");
                do {
                    sizefilas = scan.nextByte(); 
                } while (sizefilas <= 0);
                System.out.println("¿Cuantas columnas tendra la matriz?");
                do {
                    sizecolum = scan.nextByte(); 
                } while (sizecolum <= 0);
                int [][] matrizA = new int[sizefilas][sizecolum];
                int [][] matrizB = new int[sizefilas][sizecolum];
                int [][] resultado = new int[sizefilas][sizecolum];

        switch (opc) {
            case 1:
            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("SUMA DE MATRICES");
                
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La suma de A y B es: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }

                break;
            case 2:

            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("RESTA DE MATRICES");
              
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La resta de A y B es: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        resultado[i][j] = matrizA[i][j] - matrizB[i][j];
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }

                break;
                case 3:
                
                break;
        }
        

    }
}
