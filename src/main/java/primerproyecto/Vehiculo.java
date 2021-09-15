package primerproyecto;

public class Vehiculo {
    protected double capacidadCombustible;
    protected double cantidadCombustible;
    protected double consumoPorKilometro;

    public Vehiculo(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
        this.capacidadCombustible = capacidadCombustible;
        this.cantidadCombustible = cantidadCombustible;
        this.consumoPorKilometro = consumoPorKilometro;
    }

    public String abastecer(double combustible) {
        this.cantidadCombustible += combustible;
        return String.format("%.2f", this.cantidadCombustible);
    }

    public String viajar(int distancia) {
        double combustibleRequerido = this.consumoPorKilometro * distancia;
        String clase = this.getClass().getSimpleName();
        if (combustibleRequerido > this.cantidadCombustible) {
            //System.out.println(clase + " necesita reabastecimiento de combustible");
            return "El vehiculo necesita reabastecimiento de combustible";
        } else {
            this.cantidadCombustible -= combustibleRequerido;
            //System.out.println(clase + " viajo " + String.format(" %.1f", (double)distancia) + " km y aún tiene " + String.format("%.2f", this.cantidadCombustible) + " de combustible");
            return "Vehículo viajó " + String.format("%.1f", (double) distancia) + " km y aún tiene " + String.format("%.2f", this.cantidadCombustible) + " de combustible";
        }
    }
}
