import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];

        int totalElementos = productos.length;


        
        productos[0] = "Kingtone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("--------- Usando for -----------------------");
        for (int i = 0; i < totalElementos; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("--------- Usando foreach -------------------");
        for (String producto : productos){
            System.out.println("producto = " + producto);
        }

        System.out.println("--------- Usando while ---------------------");
        int i = 0;
        while(i < totalElementos){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("--------- Usando do while ------------------");
        int j = 0;
        do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }while(j < totalElementos);


        int[] numeros = new int[10];
        int totalNumeros = numeros.length;

        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k * 3;
        }

        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }
        



    }
}
