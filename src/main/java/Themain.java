import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Themain {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Car carr  = new Car(111, "i20", "hyundai", 2018, 800000L);
        Class carCls = new Car(111, "i20", "hyundai", 2018, 800000L).getClass();


        Class carCls2 = Car.class.getClass();

        // constructors

        Constructor constructorCar = carCls.getDeclaredConstructor();
        Car s = (Car)constructorCar.newInstance();

        System.out.println("PP: constructorCar: " + s);

        // methods
        Method[] decMethods = carCls.getDeclaredMethods();
        System.out.println("Declared Methods list:");
        for (Method decMethod: decMethods) {
            System.out.println("Method: " + decMethod.getName());
        }
        Method[] methods = carCls.getMethods();
        System.out.println("\nMethods list:");
        for (Method method: methods) {
            System.out.println("Method: " + method.getName());
        }

        Method methodBuyCar = carCls.getMethod("buyCar", Car.class);
        methodBuyCar.invoke(carr,carr);


        SecurityManager sm = new SecurityManager();
        Method privateMethod_details = carCls.getDeclaredMethod("printDetails", String.class);
        privateMethod_details.setAccessible(true);
        String reply = (String)privateMethod_details.invoke(carr,"short");
        System.out.println(reply);

        // set private field

        Field field = carCls.getDeclaredField("modelName");


        // get private field








    }
}
