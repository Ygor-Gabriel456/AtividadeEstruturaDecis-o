
package AtividadeEstruturaDecisão;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double qth, valorHora;
        String turno;
        
        System.out.println("Informe seu turno de trabalho");
        turno = leia.next();

        System.out.println("Informe a quantidade de horas trabalhada");
        qth = leia.nextDouble();

        if(turno.equalsIgnoreCase("N")){
           valorHora = 45.00;
        }
        else{
            valorHora = 37.00;
        }
        
        double salario = qth * valorHora; 
        
        System.out.println("Seu salario é RS " + salario);
        
    }

}
