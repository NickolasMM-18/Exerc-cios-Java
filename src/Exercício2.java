public class Exercício2 {
    public static void main(String[] args) {
        int numero,
            soma = 0;

        for(numero = 1; numero <= 1000; numero++) {
            soma += numero;
        }
        System.out.println("Soma: "+soma);
    }
}