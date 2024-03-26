//package B16_IO_Text_File.apj_number_in_file;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class readFileEx {
//    public void readFileEx(String filePath){
//        try{
//            File file = new File(filePath);
//            if(!file.exists()){
//                throw new FileNotFoundException();
//            }
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line ="";
//            int sum = 0;
//            while ((line = br.readLine())!= null){
//                System.out.println(line);
//                sum += Integer.parseInt(line);
//            };
//            br.close();
//            System.out.println("Tong: " + sum);
//        } catch (Exception e) {
//            System.out.println("File khong ton tai");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Nhap duong dan File");
//        Scanner input = new Scanner(System.in);
//        String path = new input.nextLine();
//        ReadFileEx readFileEx;
//        readFileEx = new readFileEx();
//        readFileEx.readFileText(path);
//    }
//}