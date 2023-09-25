import java.util.Scanner;
public class App {
    public static byte opc, sizefilas,sizecolum, sizefilasB,sizecolumB;
    public static byte count = 3; //3 intentos, cada error sera -1
    public static boolean igualdad;
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Que tipo de operación desea hacer?\n" +
                            "1) Igualdad de matrices\n" +
                            "2) Suma de matrices\n" +
                            "3) Matriz cero\n" +
                            "4) Matriz inversa aditiva\n" +
                            "5) Resta de matrices\n" +
                            "6) Escalar de matriz\n" +
                            "7) Multiplicacion de matrices");
        do {
           opc = scan.nextByte(); 
        } while (opc < 1 || opc > 10);

        System.out.println("¿Cuantas filas tendra la matriz A?");
                do {
                    sizefilas = scan.nextByte(); 
                    if (sizefilas <= 0) { //condicion de 3-1 intentos
                        count--; 
                        System.out.println("El valor debe ser mayor que cero. Intentos restantes: " + count);
                    }
                } while (sizefilas <= 0 && count > 0);

                if (count == 0) { //condicion de salida si se acabaron los intentos
                    System.out.println("Se han agotado los intentos, ejecute de nuevo");
                    return;
                }

                System.out.println("¿Cuantas columnas tendra la matriz A?");
                do {
                    sizecolum = scan.nextByte(); 
                    if (sizecolum <= 0) {
                        count--;
                        System.out.println("El valor debe ser mayor que cero. Intentos restantes: " + count);
                    }
                } while (sizecolum <= 0 && count > 0);

                if (count == 0) {
                    System.out.println("Se han agotado los intentos, ejecute de nuevo");
                    return;
                }
                
                if (opc == 3 || opc == 4 || opc == 6) {
                    System.out.println();
                } else {
                    System.out.println("¿Cuantas filas tendra la matriz B?");
                    do {
                        sizefilasB = scan.nextByte(); 
                        if (sizefilasB <= 0) {
                           count--;
                            System.out.println("El valor debe ser mayor que cero. Intentos restantes: " + count);
                        }
                    } while (sizefilasB <= 0 && count > 0);

                    if (count == 0) {
                        System.out.println("Se han agotado los intentos, ejecute de nuevo");
                        return;
                    }

                    System.out.println("¿Cuantas columnas tendra la matriz B?");
                    do {
                        sizecolumB = scan.nextByte(); 
                        if (sizecolumB <= 0) {
                            count--;
                            System.out.println("El valor debe ser mayor que cero. Intentos restantes: " + count);
                        }
                    } while (sizecolumB <= 0 && count > 0);

                    if (count == 0) {
                        System.out.println("Se han agotado los intentos, ejecute de nuevo");
                        return;
                    }
                }
                

                int [][] matrizA = new int[sizefilas][sizecolum];
                int [][] matrizB = new int[sizefilasB][sizecolumB];
                int [][] resultado = new int[sizefilas][sizecolum];

        switch (opc) {
            case 1:
             System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("IGUALDAD DE MATRICES");
                
                if (matrizA.length != matrizB.length) {
                    igualdad = false;
                } else {
                System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < sizefilasB; i++) {
                    for (int j = 0; j < sizecolumB; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");

                    for (int i = 0; i < sizefilas; i++) {
                        for (int j = 0; j < sizecolum; j++) {
                            if (matrizA[i][j] != matrizB[i][j]) {
                            igualdad = false; 
                            break;     
                            }
                        }
                        if (!igualdad) {
                        break;
                        }
                    }
                }
                
                if (igualdad) {
                    System.out.println("Las matrices son iguales");
                }else{
                    System.out.println("Las matrices no son iguales");
                }
                
            break;

            case 2:
            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("SUMA DE MATRICES");
                
                if (sizefilas == sizefilasB && sizecolum == sizecolumB) {
                System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                 
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < sizefilasB; i++) {
                    for (int j = 0; j < sizecolumB; j++) {
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
            case 3:
            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("MATRIZ CERO");

                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print(matrizA[i][j] + "\t");
                    }
                    System.out.println();
                }

                break;
            case 4:
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("MATRIZ INVERSA ADITIVA");

                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La inversa aditiva es: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print(matrizA[i][j] * (-1) + "\t");
                    }
                    System.out.println();
                }

            break;
            case 5:

            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("RESTA DE MATRICES");
              
                if (sizefilas == sizefilasB && sizecolum == sizecolumB) {
                System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < sizefilasB; i++) {
                    for (int j = 0; j < sizecolumB; j++) {
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

                case 6:
                
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("ESCALAR POR LA MATRIZ");

                System.out.println("¿Cual es el escalar?");
                int escalar = scan.nextInt();

                System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }

                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("El resultado es: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                       
                        System.out.print(matrizA[i][j] * escalar + "\t");
                    }
                    System.out.println();
                }
                
                break;

                case 7:
                
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("MULTIPLICACION DE MATRICES");

                if (sizecolum != sizefilasB) {
                    System.out.println("No se pueden multiplicar las matrices");
                } else {
                    System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolum; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextInt();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < sizefilasB; i++) {
                    for (int j = 0; j < sizecolumB; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextInt();
                    }
                }

                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolumB; j++) {
                        for (int k = 0; k < sizecolum; k++) {
                            resultado[i][j] = matrizA[i][k] * matrizB[i][k];
                        }
                    }
                }

                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La multiplicacion de AB es: ");

                for (int i = 0; i < sizefilas; i++) {
                    for (int j = 0; j < sizecolumB; j++) {
                        System.out.print(resultado[i][j] + "\t");
                    }
                    System.out.println();
                }

                }

                break;
        }
        

    }
}
