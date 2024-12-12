import java.io.*;

public class FileManager {
    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }

    public static void writeFile(String path, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(content);
        writer.close();
    }
}
