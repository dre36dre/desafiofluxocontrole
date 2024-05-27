import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        
        try {
            int n1,n2=0;
            System.out.println("Entre com o numero 1");
            n1=entrada.nextInt();

            System.out.println("Entre com o numero 2");
            n2=entrada.nextInt();
            contar(n1, n2);
        
        }catch (ParametrosInvalidosException e) {
        System.out.println("O segundo parametro deve ser maior que o primeiro");
        
        entrada.close();
    }
}
    static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if(p1 > p2){
            throw new ParametrosInvalidosException();
        }else{
            int contagem=p2-p1;
            int contagens[]=new int[contagem];
            System.out.println("Numero de interações:" + contagem);
            for(int i=1;i<=contagens.length;i++)
                System.out.println("Imprimindo o numero " + i);
        }
        
        }
}
