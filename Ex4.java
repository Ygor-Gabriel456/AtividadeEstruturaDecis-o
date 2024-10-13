
package AtividadeEstruturaDecisão;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double a,b,c,delta;
        
        System.out.println("Digite um numero");
        a = leia.nextDouble();
        
        System.out.println("Digite um outro numero");
        b = leia.nextDouble();
        
        System.out.println("Digite o ultimo numero");
        c = leia.nextDouble();
        
        delta = (b * b) - 4 * a * c;
      
      
        
    }         
}
