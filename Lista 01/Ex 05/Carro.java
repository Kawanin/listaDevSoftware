public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;


    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }


    public void acelerar(int incrementoVelocidade) {
        this.velocidadeAtual += incrementoVelocidade;
    }


    public void frear(int decrementoVelocidade) {
        this.velocidadeAtual -= decrementoVelocidade;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
