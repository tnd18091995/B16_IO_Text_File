package B16_IO_Text_File.Read_And_Write_File;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("number.text");
        int maxValue = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("Result.txt", maxValue);
    }
}
