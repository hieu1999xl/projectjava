
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class test 
{
    public static void main(String[] args)
    {
        String s1 ="as";
        String s2 ="cx";
        String s3 ="kiethao@yahoo.com";
        String s4 ="kiethao112@yahoo.com";
        
        String s5="admin";
        
        Scanner x  = new Scanner(System.in);
        do
        {
            s5 = x.nextLine();
            if(!kiemtra(s5) )
            {
                System.out.println("sai dinh dang");
            }
            
        }while(!kiemtra(s5));
         
       
        
        
    }
    private static boolean kiemtra(String s)
    {
        String reg ="^[\\w-_.]{5,15}+\\@[\\w&&[^0-9]]{5,8}+\\.com+$";
        String maudienthoai = "^[0]([0-9]{9,10})$";
        Pattern p = Pattern.compile(maudienthoai);
        Matcher matcher = p.matcher(s);
        if(matcher.matches() )
        {
            return true;
        }
        return false;
    }
    
    private static boolean kiemtraPass(String k)
    {
        String maupp = "^([A-Z]){1}([\\w_\\.!@#$%^&*()]+){5,31}$";
        String maupass = "^([\\w_\\.!@#$%^&*()([A-Z])]+){8,31}$";
        String maudt ="^[0]([1-9]{9})$";
        String mauusername = "^[admin]$";
        Pattern p = Pattern.compile(mauusername);
        Matcher m = p.matcher(k);
        if(m.matches() )
        {
            return true;
        }
        return false;
    }
}
