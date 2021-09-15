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

    @Test
    public void Test06(){
        Vehiculo jeep = new Vehiculo(60,30,1);
        //System.out.println();
        Assert.assertEquals(jeep.abastecer(20),"50.00");
    }

    @Test
    public void Test07(){
        Automovil jeep = new Automovil(60,60,1);
        //System.out.println();
        Assert.assertEquals(jeep.abastecer(20),"Automóvil no se puede reabastecer el tanque, está lleno.");
    }

    @Test
    public void testMain01() {
        Assert.assertEquals(Main.testAuto(), "Vehículo viajó 4.0 km y aún tiene 80.00 de combustible");
    }

    @Test
    public void testMain02() {
        Assert.assertEquals(Main.testCamion(), "El vehiculo necesita reabastecimiento de combustible");
    }

    @Test(invocationCount = 80,threadPoolSize = 80)
    public void testStress(){
        Camion volvo = new Camion(100,80,2);
        Assert.assertEquals(volvo.abastecer(40),"Camión no se puede reabastecer el tanque, está lleno.");
    }
}
