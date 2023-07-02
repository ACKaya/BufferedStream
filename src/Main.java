import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*String str="BATUHAN BOZ";
        try {
           FileOutputStream fileOtuputStream = new FileOutputStream("test.txt");
           BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOtuputStream);
           byte [] byteArr=str.getBytes();
            bufferedOutputStream.write(byteArr);
            bufferedOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        try {
            FileInputStream fileInputStream=new FileInputStream("test.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int i=bufferedInputStream.read();
            while(i!=-1){
                System.out.print((char)i);
                i=bufferedInputStream.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
