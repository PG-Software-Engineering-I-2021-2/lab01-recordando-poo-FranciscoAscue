package primerproyecto;
import org.testng.Assert;
import org.testng.annotations.Test;
import static primerproyecto.Main.*;


public class MainTest {
    @Test
    public void Test01(){
        Vehiculo audi = new Vehiculo(50,10,2);
        //System.out.println();
        Assert.assertEquals(audi.abastecer(20),"30.00");
    }

    @Test
    public void Test02(){
        Vehiculo audi = new Vehiculo(50,10,2);
        //System.out.println();
        Assert.assertEquals(audi.viajar(12),"El vehiculo necesita reabastecimiento de combustible");
    }

    @Test
    public void Test03(){
        Vehiculo audi = new Vehiculo(50,10,2);
        //System.out.println();
        Assert.assertEquals(audi.viajar(2),"Vehículo viajó 2.0 km y aún tiene 6.00 de combustible");
    }

    @Test
    public void Test04(){
        Camion volvo = new Camion(100,10,1);
        //System.out.println();
        Assert.assertEquals(volvo.abastecer(20),"La cantidad de combustible del camión es: 29.00");
    }

    @Test
    public void Test05(){
        Camion volvo = new Camion(100,90,1);
        //System.out.println();
        Assert.assertEquals(volvo.abastecer(20),"Camión no se puede reabastecer el tanque, está lleno.");
    }
}
