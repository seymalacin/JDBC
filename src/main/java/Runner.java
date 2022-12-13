import java.sql.Connection;
import java.sql.Statement;

public class Runner {

    public static void main(String[] args) {
        //1. Adım: Driver'a kaydol
        //2. Adım: Datbase'e bağlan
         Connection connection = JdbcUtils.connectToDataBase("localhost","postgres","postgres","1234");

         //3.Adim:Statement olustur
        Statement statement = JdbcUtils.createStatement();

        //4.Adim:Query calistir
         //JdbcUtils.execute("CREATE TABLE students (name VARCHAR(20),id INT, address VARCHAR(80))");


        //5.Adim: Baglanti ve Statement'i kapat.
        JdbcUtils.closeConnectionAndStatement();


    }


}