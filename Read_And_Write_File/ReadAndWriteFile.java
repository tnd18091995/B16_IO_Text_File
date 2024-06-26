package B16_IO_Text_File.Read_And_Write_File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();}
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = br.readLine())!= null){
                    numbers.add(Integer.parseInt(line));
                }
                br.close();
        } catch (Exception e) {
           System.err.println("File khong ton tai hoac co loi");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try{
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Gia tri lon nhat la: "+ max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for ( int i = 0; i < numbers.size(); i++){
            if( max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
}
