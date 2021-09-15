package primerproyecto;
import org.testng.Assert;
import org.testng.annotations.Test;
import static primerproyecto.Main.*;


public class MainTest {
    @Test
    public void Test01(){
        Vehiculo audi = new Vehiculo(100,30,2);
        Assert.assertEquals("asdasd","asdasd");
    }
}
