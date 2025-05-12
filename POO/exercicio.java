import POO.veiculo.veiculo$Veiculo;
import testePOO.carro.Carro;
// Classe principal para executar o programa
public class exercicio {
    public static void main(String[] args) {
        // Criando um carro com todas as informações necessárias
        Carro meuCarro = new Carro("Ferrari", "F8 Tributo", 2022, 2, 4, "Vermelho", "ABC-1234");

        // Exibindo as informações do carro no console
        meuCarro.exibirInformacao();
    }
}
