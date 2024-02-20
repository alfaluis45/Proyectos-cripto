/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Scytale {

    public static String cad;
    public static int numRow;
    public static double numCol = 6.0;
    public static char arreBi[][] = null;

    public Scytale() {
        cad = "";
        numRow = 0;
        numCol = 6.0;
        arreBi = null;
    }

    public Scytale(double numCol) {
        cad = "";
        numRow = 0;
        Scytale.numCol = numCol;
        arreBi = null;
    }

    public static String getCad() {
        return cad;
    }

    public static void setCad(String cad) {
        Scytale.cad = cad;
    }

    public static int getNumRow() {
        return numRow;
    }

    public static void setNumRow(int numRow) {
        Scytale.numRow = numRow;
    }

    public static double getNumCol() {
        return numCol;
    }

    public static void setNumCol(double numCol) {
        Scytale.numCol = numCol;
    }

    public static char[][] getArreBi() {
        return arreBi;
    }

    public static void setArreBi(char[][] arreBi) {
        Scytale.arreBi = arreBi;
    }

    public static String cifrar(String cadePlana) {
        char[] arreCar = cadePlana.toCharArray();
        int k = 0;
        numRow = (int) (cadePlana.length() / numCol + 0.9);
        arreBi = new char[numRow][(int) numCol];
        String cadeCifrada = "";
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {
                if (k < cadePlana.length()) {
                    arreBi[i][j] = arreCar[k++];
                } else {
                    arreBi[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < numCol; i++) {
            for (int j = 0; j < numRow; j++) {

                cadeCifrada += arreBi[j][i];

            }
        }
        return cadeCifrada;
    }
    
    public static String descifrar(String cadeCifrada){
        char[] arreCar = cadeCifrada.toCharArray();
        int k = 0;
        numRow = (int) (cadeCifrada.length() / numCol + 0.9);
        arreBi = new char[(int) numCol][numRow];
        String cadePlana = "";
        for (int i = 0; i < numCol; i++) {
            for (int j = 0; j < numRow; j++) {
                if (k < cadeCifrada.length()) {
                    arreBi[i][j] = arreCar[k++];
                } else {
                    arreBi[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCol; j++) {

                cadePlana += arreBi[j][i];

            }
        }
        return cadePlana;
    }

}
