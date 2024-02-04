import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class AppData {
    private String[] header;
    private int[][] data;
    public static void save(AppData appData, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.join(";", appData.getHeader()));
            writer.newLine();
            for (int[] row : appData.getData()) {
                String rowAsString = Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(";"));
                writer.write(rowAsString);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String headerLine = reader.readLine();
            String[] header = headerLine.split(";");
            List<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                int[] row = Arrays.stream(values)
                        .mapToInt(Integer::parseInt)
                        .toArray();
                dataList.add(row);
            }
            AppData appData = new AppData();
            appData.setHeader(header);
            appData.setData(dataList.toArray(new int[0][0]));

            return appData;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String[] getHeader() {
        return header;
    }
    public void setHeader(String[] header) {
        this.header = header;
    }
    public int[][] getData() {
        return data;
    }
    public void setData(int[][] data) {
        this.data = data;
    }
}
public class Lesson_6 {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value1", "Value2", "Value3"});
        appData.setData(new int[][]{{100, 200, 123}, {300, 400, 500}});
        AppData.save(appData, "Example.csv");
        AppData loadedData = AppData.load("Example.csv");
        if (loadedData != null) {
            System.out.println("Loaded Header: " + String.join("; ", loadedData.getHeader()));
            System.out.println("Loaded Data:");
            for (int[] row : loadedData.getData()) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}

