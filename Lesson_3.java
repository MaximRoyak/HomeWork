public class Lesson_3 {
    public static void main(String[] args) {
        System.out.println(summ(1, 8));
        positiveNum(0);
        System.out.println(num(0));
        stringNum("lets play game", 2);
        leap(2004);
        value(6,10);
    }
    public static boolean summ(int a, int b) {
        int c = a + b;
        if ((10 <= c) & (c <= 20)) {
            return true;
        } else {
            return false;
        }
    }
    public static void positiveNum(int a) {
        if (0 <= a) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean num(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void stringNum(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
    public static boolean leap(int x) {

        if ((x % 4 == 0 || x % 400 == 0) && (x % 100 != 0)){
             return true;
        }else{
            return false;
        }
    }

    public static void value(int len, int initialValue){
    int a = len;
    int b = initialValue;
    int [] val = new int[a];
        for (int i = 0; i < val.length; i++) {
        val[i] = b;
        }
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i]);
        }
    }

}




