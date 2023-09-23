import java.util.Scanner;
public class App {
    public static byte opc, sizefilas,sizecolum, sizefilasB,sizecolumB;
    public static boolean compare;
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Que tipo de operación desea hacer?\n" +
                            "1) Igualdad de matrices\n" +
                            "2) Suma de matrices\n" +
                            "5) Resta de matrices\n" +
                            "7) Multiplicacion de matrices");
        do {
           opc = scan.nextByte(); 
        } while (opc < 1 || opc > 3);

        System.out.println("¿Cuantas filas tendra la matriz A?");
                do {
                    sizefilas = scan.nextByte(); 
                } while (sizefilas <= 0);
                System.out.println("¿Cuantas columnas tendra la matriz A?");
                do {
                    sizecolum = scan.nextByte(); 
                } while (sizecolum <= 0);
        System.out.println("¿Cuantas filas tendra la matriz B?");
                do {
                    sizefilasB = scan.nextByte(); 
                } while (sizefilasB <= 0);
                System.out.println("¿Cuantas columnas tendra la matriz B?");
                do {
                    sizecolumB = scan.nextByte(); 
                } while (sizecolumB <= 0);
                int [][] matrizA = new int[sizefilas][sizecolum];
                int [][] matrizB = new int[sizefilasB][sizecolumB];
                int [][] resultado = new int[sizefilas][sizecolum];

        switch (opc) {
            case 1:
             System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("IGUALDAD DE MATRICES");

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
                
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        if (matrizA[i][j] != matrizB[i][j]) {
                            compare = false;      
                        }else{
                            compare = true;
                        }
                    }
                }
                if (compare) {
                    System.out.println("Las matrices son iguales");
                }else{
                    System.out.println("Las matrices no son iguales");
                }
                
            break;

            case 2:
            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("SUMA DE MATRICES");
                
                if (sizefilas == sizefilasB && sizecolum == sizecolumB) {
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
                } else {
                    System.out.println("Para poder sumar las matrices deben tener las mismas dimensiones");
                }
                

                break;
            case 5:

            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("RESTA DE MATRICES");
              
                if (sizefilas == sizefilasB && sizecolum == sizecolumB) {
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
                } else {
                    System.out.println("Para poder restar las matrices deben tener las mismas dimensiones");
                }

                break;
                case 7:
                
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("MULTIPLICACION DE MATRICES");
                
                break;
        }
        

    }
}
