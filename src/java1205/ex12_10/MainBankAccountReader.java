package java1205.ex12_10;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainBankAccountReader {

     public static void main(String[] args) {
         File file = new File("BankAccounts.txt");

         try {
             FileReader fr = new FileReader(file);
             int ch;
             while((ch=fr.read()) != -1){
                 System.out.print((char)ch);
             }
             fr.close();
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
}
