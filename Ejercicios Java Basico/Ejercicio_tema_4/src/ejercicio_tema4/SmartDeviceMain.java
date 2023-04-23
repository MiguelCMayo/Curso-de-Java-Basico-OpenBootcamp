package ejercicio_tema4;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartDevice obj1 = new SmartDevice();
        SmartDevice obj2 = new SmartDevice("Samsung","Negro",120.0,150.2,52.3);
        System.out.println(obj1 + "\n" + obj2);
        System.out.println();

        SmartPhone obj3 = new SmartPhone(false,false);
        SmartPhone obj4 = new SmartPhone("Apple","Blanco",115.2,130.6,45.9,true,false);
        System.out.println(obj3 + "\n" + obj4);
        System.out.println();

        SmartWatch obj5 = new SmartWatch(true,true);
        SmartWatch obj6 = new SmartWatch("Huawei","Azul",105.2,160.6,47.9,false,true);
        System.out.println(obj5 + "\n" + obj6);
        System.out.println();

        SmartDevice obj7 = new SmartPhone("LG","Rojo",145.2,110.6,45.5,false,false);
        SmartDevice obj8 = new SmartWatch("Huawei","Azul",105.2,160.6,47.9,true,true);
        System.out.println(obj7 + "\n" + obj8);
    }
}
