public class Carro extends Veiculo {
    protected int numPortas, cambio;
    protected boolean automatico;

    public Carro() {
        this.numPortas = 0;
        this.cambio = 0;
        this.automatico = false;
    }

    public Carro(String fabricante, String modelo, String cor, int numPortas, int cambio, boolean automatico) {
        super(fabricante, modelo, cor);
        this.numPortas = numPortas;
        this.cambio = cambio;
        this.automatico = automatico;
    }

    public int getNumPortas() {
        return this.numPortas;
    }

    public int getCambio() {
        return this.cambio;
    }

    public boolean isAutomatico() {
        return this.automatico;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}
