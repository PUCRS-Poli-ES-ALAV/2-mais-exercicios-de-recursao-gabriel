import java.util.*;

public class exercicios2{

    public static void main (String[]args){
        ArrayList<Integer> teste = new ArrayList<>(Arrays.asList(1, 4, 7, 3, 2, 6));        
        System.out.println("Testando:");
        System.out.println("Resultado: "+findBiggest(teste));

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

    public static boolean isPal(String s){
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        if(s.length() == 1){
            return true;
        }
        isPal(s.substring(1,s.length()-2));
        return true;    
    }

    public static int findBiggest(ArrayList<Integer> ar){
        if(ar.size()==1){
            return ar.get(0);
        }
        int aux = ar.remove(ar.size()-1);
        int aux2 = findBiggest(ar);
        if (aux > aux2) {
            return aux;
        }
        return aux2;
    }

    public static ArrayList<String> permutations(String s){
        
    }
}