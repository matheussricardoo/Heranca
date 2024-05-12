public class Motor {
    private int numCilindros,cilindradas,potencia;
    private String combustivel,toString;
    private boolean turbo;

    public Motor(){
        this.numCilindros = 0;
        this.cilindradas = 0;
        this.combustivel = "";
        this.potencia = 0;
        this.turbo = false;
    }

    public Motor(int numCilindros, int cilindradas, String combustivel, int potencia, boolean turbo) {
        this.numCilindros = numCilindros;
        this.cilindradas = cilindradas;
        this.combustivel = combustivel;
        this.potencia = potencia;
        this.turbo = turbo;
    }

    public int getNumCilindros() {
        return this.numCilindros;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public boolean isTurbo() {
        return this.turbo;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

}