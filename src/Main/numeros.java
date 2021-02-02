package Main;

import java.util.ArrayList;
import java.util.List;

public class numeros {
    public static List<Double> conversionStringInt(String s) {
        List<Double> array=new ArrayList<>();
        String[] numerosStr = s.trim().toLowerCase().split("\\s+");
        for (int i = 0; i < numerosStr.length; i++) {
            String cadena = numerosStr[i], nuevacadena="";
            char letra=cadena.charAt(0);
            nuevacadena+=cadena.charAt(0);
            for (int j = 0; j < cadena.length(); j++) {
               
                if (letra!=cadena.charAt(j)){
                    nuevacadena+=cadena.charAt(j);
                    letra=cadena.charAt(j);
                }
            }
            

            array.add(numeroConv(nuevacadena));
        }
        
        return array;
    }
    public static double numeroConv(String s){
        if (s.equalsIgnoreCase("uno"))return 1;
        if (s.equalsIgnoreCase("dos"))return 2;
        if (s.equalsIgnoreCase("tres"))return 3;
        if (s.equalsIgnoreCase("cuatro"))return 4; 
        if (s.equalsIgnoreCase("cinco"))return 5;
        if (s.equalsIgnoreCase("seis"))return 6;
        if (s.equalsIgnoreCase("siete"))return 7;
        if (s.equalsIgnoreCase("ocho"))return 8;
        if (s.equalsIgnoreCase("nueve"))return 9;
        
        return 0;
        
    }
    public static List<Double> reglaDe3(String c, double x) {
        List<Double> regla3=conversionStringInt(c);
        List<Double> resul=new ArrayList<>();
        double suma=0;
        for(int i=0; i<regla3.size(); i++)suma+=regla3.get(i);
        //{array,array, array}=suma
        //valor={necesito la array}
        for(int i=0; i<regla3.size(); i++){
        double nuevoValor=(regla3.get(i)*x)/suma;
            resul.add(to2dec(nuevoValor));
        }
        return resul;
    }

    public static double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }
    public static void main(String[] args) {
        System.out.println(reglaDe3(" UuunnnOOO  DOs  SSeiSS  ", 60));
    }
}
