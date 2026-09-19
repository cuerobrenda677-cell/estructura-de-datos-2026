public class OperacionesMatrices {

        //Método que permite llenar la matriz con números enteros
    public int[][] llenarMatriz(int f, int c, int min, int max){
        int[][] m = new int[f][c]; //Declarando la matriz
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = (int)(Math.random() * (max - min - 1 ) + min);
            }
        }
        return m;
    }
    
    //Método que permite mostrar una matriz de enteros
    public String imprimirMatriz(int[][] m){
        String cad = "";
        for(int i = 0; i < m.length; i++){
            cad += "|";
            for(int j = 0; j < m[0].length; j++){
                cad+= m[i][j] + "|";
            }
            cad+= "\n"; //Salto de línea --> \n
        }
        return cad;
    }


    //Método para sumar las filas y columnas de la matriz
    public String sumaFilasColumnas(int[][] m){
        String cad = "";
        int sumaFila, sumaColumnas;
        for(int i = 0; i < m.length; i++){
            sumaFilas = 0;
            sumaColumnas = 0;
            for(int j = 0; j < m[0].length; j++){
                sumaFilas += m[i][j];
                sumaColumnas += m[j][i];
            }
            cad += "suma Fila ->" + i + ":" + sumaFila + "\n";
           cad += "suma Columna ->" + i + ":" + sumaColumna + "\n";


        }        
        return cad;
    }
}
