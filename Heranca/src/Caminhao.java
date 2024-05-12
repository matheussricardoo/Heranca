public class Caminhao extends Veiculo {
    protected int qtdeEixos;
    protected double capacidadeCarga;

    public Caminhao(){
        this.qtdeEixos = 0;
        this.capacidadeCarga = 0;
    }

    public Caminhao(String fabricante, String modelo, String cor, double capacidadeCarga, int qtdeEixos){
        super(fabricante, modelo, cor);
        this.capacidadeCarga = capacidadeCarga;
        this.qtdeEixos = qtdeEixos;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getQtdeEixos() {
        return qtdeEixos;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }
}
