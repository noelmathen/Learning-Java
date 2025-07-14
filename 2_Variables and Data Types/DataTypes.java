// package 2_Variables and Data Types;

public class DataTypes {
    public static void main(String[] ards){
        int a = 12345;
        short b = 123;
        long c = 123456745;
        byte d = 1;
        float e = 1.2f;
        double f = 22.345987847;
        boolean g = true;
        char h = 'a';

        System.out.println("Integer: " + a);
        System.out.println("Short: " + b);
        System.out.println("Long: " + c);
        System.out.println("Byte: " + d);
        System.out.println("Float: " + e);
        System.err.println("Double: " + f);
        System.out.println("Boolean: " + g);
        System.out.println("Char: " + h);

        //Type conversion
        double x = 1234562345;
        int z = (int)x;
        System.out.println("Type conversion: " + z);   

        //String to int
        String str = "12345";
        int y = Integer.parseInt(str); //returns primitive data type
        Integer p = Integer.valueOf(str); //return as integer object
        System.out.println(y+" "+p);

        
    }

}
