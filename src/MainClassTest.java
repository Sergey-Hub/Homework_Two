import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        int a = this.getClassNumber();

        if (a > 45){
            System.out.println("Метод getClassNumber возвращает число > 45");
        } else {
            System.out.println("Ошибка - Метод getClassNumber возвращает число меньше 45");
        }
    }

}
