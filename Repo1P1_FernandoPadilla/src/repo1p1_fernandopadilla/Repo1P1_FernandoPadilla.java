
package repo1p1_fernandopadilla;
import java.util.Scanner;

public class Repo1P1_FernandoPadilla {

    static Scanner read = new Scanner (System.in);
 
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("1.Ola de palabras");
            System.out.println("2.Mini codificador");
            System.out.println("3.sqrt(2)");
            System.out.println("4.Salida");
            opcion = read.nextInt();
            switch (opcion){
                case 1:
                    String str;
                    System.out.println("Ingrese una cadena: ");
                    str = read.next();
                    Ola(str);
                    break;
                    
                case 2:
                    int num;
                    String str1;
                    System.out.println("Ingrese un numero del 1 al 10: ");
                    num = read.nextInt();
                    System.out.println("Ingrese la cadena que desea codificar: ");
                    str1 = read.next();
                    System.out.println("La cadena codificada es: "+Codificacion(num,str1));
                    break;
                    
                case 3:
                    int N;
                    System.out.println("Ingrese el valor de N: ");
                    N = read.nextInt();
                    System.out.println("El resultado es: "+Productoria(N));
                    break;
                    
                case 4:
                    opcion = 4;
                    break;
                    
                    
                default:
                    System.out.println("Opcion no valida");
            }
        
        }while (opcion != 4) ;
    }
   //metodo de Ola
    public static void Ola(String str){
        String temp = "";
        String temp1 = "";
        String temp2 = "";
        for (int i = 0; i < str.length();i++){
            temp = temp.toLowerCase();
            temp = str.substring(i,i+1).toUpperCase();
            temp1 = str.substring(i+1);
            temp2 = str.substring(0,i);
            System.out.println(temp2 +temp + temp1);
        }
    }
    
    //metodo de codificacion
    public static String Codificacion(int num, String str){
        String acum ="";
        int validacion;
        for (int i = 0; i< str.length();i++){
            char letter = str.charAt(i);
            validacion = i % 2;
            if (validacion == 0){
                acum += Character.toString(letter+num);
            }else{
                acum += Character.toString(letter-num);
            }
        }
        return acum;
    }
    
    //metodo de productoria
    public static double Productoria(int N) {

        double denominador;
        double result = 1;
        for (int i = 0; i <= N; i++) {
            denominador =(4*i+2);
            result *= 1-(1/(denominador*denominador));
        }
        return 1/result;
    }
}

