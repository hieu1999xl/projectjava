
import java.util.Random;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewClass1 {

    public static void main(String[] args) {
        int a = 4;
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rd = new Random();
        String uuid = UUID.randomUUID().toString();
        String kichhoat = "http://localhost:8081/MuaBanNha/tokens/kichhoat?= \n" + uuid;
        System.out.println(kichhoat);

    }

    String randomString(int len, String AB) {
        StringBuilder sb = new StringBuilder(len);
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
}
