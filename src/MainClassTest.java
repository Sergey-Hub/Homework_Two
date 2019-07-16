import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetClassNumber()
    {
        MainClass c = new MainClass();
        int a = this.getClassNumber();

        if (a > 45){
            System.out.println("Метод getClassNumber возвращает число > 45");
        } else {
            System.out.println("Ошибка - Метод getClassNumber возвращает число меньше 45");
        }
    }

}
