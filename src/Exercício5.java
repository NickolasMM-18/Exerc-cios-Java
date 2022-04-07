public class Exercício5 {
    public static void main(String[] args) {
        System.out.println("O fatorial de 0 é 1");
        for(long n = 1, fatorial = 1; n <= 40; n++) {
            long aux = n;
            fatorial = n;
            
            while(aux != 1) {
                aux = aux - 1;
                fatorial = fatorial * aux;
                
            }
            System.out.println("O fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fatorial);        
        }
    }
}