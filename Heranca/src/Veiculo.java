public class Veiculo {
    protected String fabricante,modelo,cor;
    protected Motor motor;

    public Veiculo(){
        this.fabricante = "";
        this.modelo = "";
        this.cor = "";
    }

    public Veiculo(String fabricante, String modelo, String cor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public Motor getMotor(){
        return this.motor;
    }
}
