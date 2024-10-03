public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Métodos acessadores
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Método modificador
    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    // Método para trocar as datas
    public void trocarCom(Data outraData) {
        int tempDia = this.dia;
        int tempMes = this.mes;
        int tempAno = this.ano;

        this.dia = outraData.dia;
        this.mes = outraData.mes;
        this.ano = outraData.ano;

        outraData.dia = tempDia;
        outraData.mes = tempMes;
        outraData.ano = tempAno;
    }
}
