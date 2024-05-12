public class TestaVeiculo {
    public static void exibir(Veiculo veiculo) {
        System.out.println("");
        System.out.println("Fabricante: " + veiculo.getFabricante());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Cor: " + veiculo.getCor());
        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            System.out.println("Número de Portas: " + carro.getNumPortas());
            System.out.println("Câmbio: " + carro.getCambio());
            System.out.println("Automático: " + carro.isAutomatico());
            System.out.println("");
            System.out.println("Motor");
            System.out.println("");
            System.out.println("NumCilindros: " + carro.getMotor().getNumCilindros());
            System.out.println("Cilindradas: " + carro.getMotor().getCilindradas());
            System.out.println("Combustivel: " + carro.getMotor().getCombustivel());
            System.out.println("Potencia: " + carro.getMotor().getPotencia());
            System.out.println("Turbo: " + carro.getMotor().isTurbo());
        }
        if (veiculo instanceof Caminhao) {
            Caminhao caminhao = (Caminhao) veiculo;
            System.out.println("Quantidade de Eixos: " + caminhao.getQtdeEixos());
            System.out.println("Capacidade de Carga: " + caminhao.getCapacidadeCarga());
            System.out.println("");
            System.out.println("Motor");
            System.out.println("");
            System.out.println("NumCilindros: " + caminhao.getMotor().getNumCilindros());
            System.out.println("Cilindradas: " + caminhao.getMotor().getCilindradas());
            System.out.println("Combustivel: " + caminhao.getMotor().getCombustivel());
            System.out.println("Potencia: " + caminhao.getMotor().getPotencia());
            System.out.println("Turbo: " + caminhao.getMotor().isTurbo());
        }

    }

    public static void main(String[] args) {
        Motor motorFerrari = new Motor(8, 3588, "Gasolina", 620, true);
        Carro ferrari = new Carro("Ferrari", "Roma Spider", "Vermelho", 2, 7, true);
        ferrari.setMotor(motorFerrari);
        exibir(ferrari);

        Motor motorCaminhao = new Motor(6, 7200, "Diesel", 300, false);
        Caminhao volvo = new Caminhao("Volvo", "FH16", "Azul", 40.0, 2);
        volvo.setMotor(motorCaminhao);
        exibir(volvo);
    }
}
