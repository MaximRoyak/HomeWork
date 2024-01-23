import java.util.Arrays;
public class Lesson_3Arr {
    public static void main(String[] args) {

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
        int[] nums = new int [100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < 6){
                nums1[i] = nums1[i] * 2;
            }else {
            }
        }
        System.out.println(Arrays.toString(nums1));
        int a = 5;
        int [][] cons = new int[a][a];
        for (int i = 0; i < a; i++) {
            cons[i][i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                System.out.printf("%d",cons[i][j]);
            System.out.println();
        }
    }
}

