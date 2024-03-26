package B16_IO_Text_File;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("us.gift");
        System.out.println("Does is exist? "+file.exists());
        System.out.println("The file has "+ file.length()+" bytes");
    }
}
