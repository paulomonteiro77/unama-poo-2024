class TesteIdade {
    public static void main (String[] arg){
        int idade;
        idade = 29;
        System.out.println(idade);

        int idadeAnoQueVem = idade + 1;
        System.out.println(idadeAnoQueVem);

        double pi = 3.14;
        int raio = 5;
        double result = 2 * raio * pi;
        System.out.println(result == 31.4);
        
        boolean menorDeidade = idade >= 18;
        System.out.println(menorDeidade);

        char letra = 'a';

        System.out.println(letra);

        int i = 5; // i:5
        int j = i; // j:5
        i = j +1; // i:6, j:6
        System.out.println(i);
        System.out.println(j);
    }
}