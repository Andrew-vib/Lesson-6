package lesoon6;

import java.io.*;

public class CopyFile {

    public static void main (String [] args) throws IOException{

        copyFile();
    }

    public static void copyFile (){

        try{
        // Создание 2-ух текстовых файлов;
            FileInputStream fis1 = new FileInputStream("text_first.txt");
            FileInputStream fis2 = new FileInputStream("text_second.txt");
         // склеивание текстов из файлов
            FileOutputStream fos = new FileOutputStream ("text_copy.txt", true);

            int a;
            while ((a = fis1.read())!= -1) {
                fos.write(a);
                fos.close();
            }
            int b;
            while ((b = fis2.read())!= -1) {
                fos.write(b);
                fos.close();
                }

        } catch (FileNotFoundException ex){
            ex.fillInStackTrace();
        }catch (IOException e){
            e.fillInStackTrace();
        }
    }
}
