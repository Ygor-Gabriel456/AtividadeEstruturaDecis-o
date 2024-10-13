package AtividadeEstruturaDecisão;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um valor de 0 a 9");
        num = leia.nextInt();
        
        if(num >=0 && num <9){
            System.out.println("Valor correto");
        }
        else{
            System.out.println("Valor incorreto");
        }
    }
}
