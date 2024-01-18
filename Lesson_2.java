public class Lesson_2 {

        public static void main(String[] args) {

            printThreeWords(" ");
            checkSumSign(4,1);
            printColor(101);
            compareNumbers(6,3);

        }

        public static void printThreeWords(String s) {
            System.out.println("Orange\nBanana\nApple " + s);
        }

        public static int checkSumSign(int a, int b){
            int sum = a + b;
            if (sum > 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
            return sum;
        }
        public static int printColor(int value){
            int x = value;
            if (x <= 0){
                System.out.println("Красный");
            }else if ((0 < x) & (x <= 100)){
                System.out.println("Желтый");
            }else if (100 < x){
                System.out.println("Зеленый");
            }
            return x;
        }

        public static void compareNumbers(int a, int b){
            if (b <= a){
                System.out.println("a >= b");
            }else {
                System.out.println("a < b");
            }

        }



    }


