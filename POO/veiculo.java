package POO;

public class veiculo {
    public static void main(String[] args) {
    // Classe principal que representa um veículo genérico
        class Veiculo {
        // Atributos básicos de um veículo
            private String marca;
            private String modelo;
            private int ano;

    // Construtor para inicializar os atributos do veículo
            public Veiculo(String marca, String modelo, int ano) {
                this.marca = marca;
                this.modelo = modelo;
                this.ano = ano;
        }

    // Métodos para acessar os atributos do veículo
            public String getMarca() {
                return marca;
    }

            public String getModelo() {
                return modelo;
        }

            public int getAno() {
                return ano;
    }

    
    // Método para exibir as informações do veículo
        public void exibirInformacao() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
    }
    }
    }
}
}