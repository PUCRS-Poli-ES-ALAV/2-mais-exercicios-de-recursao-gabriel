
import java.util.ArrayList;


public class exercicios{    
    public static void main (String[]args){
        
        // System.out.println("Testando:");
        // System.out.println("Resultado: "+intToBinary(157));

        // ArrayList<Integer> array = new ArrayList<>();

        // array.add(10);
        // array.add(20);
        // array.add(30);

        // System.err.println("Resultado soma array: "+ somaArray(array));

        System.out.println("Resultado: "+nroDigit(17989));

    }

    public static int ex1(int n){
        if(n<0){
            throw new IllegalArgumentException("O número deve ser maior que 0!");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n*=ex1(n-1);
    }

    public static int ex2(int n) {
        if(n == 0) {
            return 0;
        }
        if (n > 0) {
            return n+ex2(n-1);
        }
        return n+ex2(n+1);
    }

    public static int ex3(int n){
        if(n <= 0){
            throw new IllegalArgumentException("O número não pode ser menor ou igual a 0!");
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return n=ex3(n-1)+ex3(n-2);
    }

    public static int ex4(int j, int k) {
        if(j == k) {
            return k;
        }
        if (j > k) {
            return k+ex4(j, k+1);
        }
        return j+ex4(j+1, k);
    }

    // public static boolean isPal(String s){
    //     if(s.lenght() == 1 || s.charAt(s.length()-1) == s.charAt(s.length()-2)){
    //         return true;
    //     }
    //     if(s.charAt(0) != s.charAt(s.length()-1)){
    //         return false;
    //     }

    //     return isPal(s.substring(1,s.length()-2));    
    // }

    public static String intToBinary (int n) {
        if(n == 0) {
            return "0";
        }
        if(n == 1) {
            return "1";
        }
        String aux = Integer.toString(n % 2);
        return intToBinary(n/2) + aux;
    }

    public static int somaArray (ArrayList<Integer> array) {
        if (array.size() == 0){
            return 0;
        }
        int aux = array.remove(array.size()-1);
        return aux + somaArray(array);
    }

    public static int nroDigit (int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + nroDigit(n/10);
    }

}