package tw.com.fcb.fruit;

import java.util.Scanner;

public class FruitApp
{
    public static void main( String[] args ) {
        FruitService s1 = new FruitServiceImp();
        System.out.println(s1.getByCode("A01"));
        Scanner scan1 = new Scanner(System.in);
//      apple kiwi
        System.out.println("請輸入想要的水果名稱(英文小寫)：");
        String scanFruit = scan1.nextLine();
        if (s1.getByName(scanFruit).size() == 0){
            System.out.println("抱歉~查無此水果資料");
        }else{
            System.out.println(s1.getByName(scanFruit));
        }

        System.out.println("請輸入價格區間(以空白鍵分開)：");
        int scanAmt1 = scan1.nextInt();
        int scanAmt2 = scan1.nextInt();
        if (s1.getByPrice(scanAmt1,scanAmt2).size() == 0){
            System.out.println("抱歉~此價格區間無資料");
        }else{
            System.out.println(s1.getByPrice(scanAmt1,scanAmt2));
        }

        Scanner scan2 = new Scanner(System.in);
        System.out.println("請輸入水果名稱(英文小寫)");
        String scanFruitx = scan2.nextLine();
        System.out.println("請輸入上述水果價格區間(以空白鍵分開)");
        int scanAmt1x = scan2.nextInt();
        int scanAmt2x = scan2.nextInt();
        if (s1.getByFruit(scanFruitx,scanAmt1x,scanAmt2x).size() == 0){
            System.out.println("抱歉~此價格區間無資料");
        }else{
            System.out.println(s1.getByFruit(scanFruitx,scanAmt1x,scanAmt2x));
        }
    }
}
