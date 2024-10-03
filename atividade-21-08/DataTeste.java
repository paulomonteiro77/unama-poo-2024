public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(7, 4, 2017);
        Data data2 = new Data(15, 5, 2017);

        // Exibir as duas datas
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);

        // Trocar as duas datas
        data1.trocarCom(data2);

        // Exibir as duas datas novamente
        System.out.println("Após a troca:");
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
    }
}
