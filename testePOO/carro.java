package testePOO;

// Classe base Veiculo
class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacao() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

// Classe Carro que herda as características de Veiculo
public class Carro extends Veiculo {
    private int portas;
    private int rodas;
    private String cor;
    private String placa;

    public Carro(String marca, String modelo, int ano, int portas, int rodas, String cor, String placa) {
        super(marca, modelo, ano);
        this.portas = portas;
        this.rodas = rodas;
        this.cor = cor;
        this.placa = placa;
    }

    public void exibirInformacao() {
        super.exibirInformacao();
        System.out.println("Número de portas: " + portas);
        System.out.println("Número de rodas: " + rodas);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
    }
}