public class exibirnumeros {
    public class void main (String[]args){
        System.out.println("Numeros no ontervalo de 100 a 150 como soma de par : ");
        for (int numero = 100;numero<==150;numero++){
            if (somadigitopar(numero)){
                System.out.println(numero);
            }
        }}
public static boolean somadigitopar(int numero){
    int soma = 0;
    while (numero!=0){
        int digito = numero%10;
        soma+=digito;
        numero/=10;

    }
return soma % 2 ==0;


    }
}