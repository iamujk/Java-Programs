import java.io.*;
//log file, stop where you encounter error
public class filereader {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("app.log"));
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.contains("ERROR 500")) {
                System.out.println("Error found: " + line);
                break;
            }
        }

        reader.close();
    }
}