package primerproyecto;

public class Main {
    public static String testAuto() {
        Automovil auto = new Automovil(100, 80, 5);
        auto.abastecer(20);
        return auto.viajar(4);
    }

    public static String testCamion() {
        Camion camion = new Camion(100, 80, 10);
        camion.abastecer(20);
        return camion.viajar(12);
    }

    public static void main(String[] args) {
        Main.testAuto();
        Main.testCamion();
    }



}


