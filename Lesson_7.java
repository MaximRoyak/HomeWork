public class Lesson_7 {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},{"e", "6", "7", "8"},{"9", "10", "11", "12"},{"13", "14", "15", "16"},{"17","18","19","20"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        try {
            int result = sumArrayElements(array);
            System.out.println("Сумма " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int strings = 4;
        int columns = 4;

        if (array.length != strings || array[0].length != columns) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;

        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}