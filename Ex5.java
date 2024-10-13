
package AtividadeEstruturaDecisão;

import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome;
        
        int idade;
        
        System.out.println("Qual o seu nome");
        nome = leia.next();
        
        System.out.println("Informe sua idade");
        idade = leia.nextInt();
        
        if(idade <= 16 ){
            System.out.println("Não vota");
        }else if(idade >= 18 && idade <= 65){
            System.out.println("Seu voto e obrigatorio");
        }else if(idade > 16 || idade < 19 && idade > 65  ){
            System.out.println("Eleitor facultativo");
        }
        else{
            System.out.println("NADA");
        }
    }
}
