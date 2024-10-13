package AtividadeEstruturaDecisão;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double valorBolsa;
        
        int tempoEstagio = 0;
        
        System.out.println("Qual o valor da sua bolsa?");
          valorBolsa = leia.nextDouble();
          
          if(valorBolsa >= 750 && valorBolsa <= 950){
              System.out.println("Está dentro do requisito");
          }
          else{
              System.out.println("Não participa");
          }
          
          System.out.println("Qual seu tempo de estagio");
          tempoEstagio = leia.nextInt();
          
          if(tempoEstagio >= 2){
              System.out.println("Voce participa");
          }
          else{
              System.out.println("FORA");
          }
    }
}
