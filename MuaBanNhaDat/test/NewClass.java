
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class NewClass {

    public static void main(String[] arg) {
        String[] chu = {"a", "b", "c", "d", "e", "f", "g", "h", "t", "u", "o", "p", "q", "r", "y", "i", "x", "w", "1", "2", "3", "4", "5", "6",
            "7", "8", "9"};
        Random rd = new Random();   // khai báo 1 đối tượng Random

        // trả về 1 số bất kỳ có kiểu long
        long longNumber ;
        do
        {
            longNumber = rd.nextLong();
        }while(longNumber<0);
        System.out.println("Số vừa được sinh ra là " + longNumber);
        
    }

}
