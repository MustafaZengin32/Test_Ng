package test;

import org.testng.annotations.Test;

public class Day21TestNg02DependsOnMethods {

    //@ methodu birbirine baglayabilir , max 2 , 3 olmaz
    //Baglancak olan methoda hangi methodu baglayacagiz yazariz
    //Mesela search methodunu , login e bagimli yapariz ki , ilk login yapsin , sonra search yapsin
    //Ancak arada farkli method varsa onun onceligi natural order a goredir
    //Yani bu islem sadece ard ard yap demek degil , oncelik sirasi belirlemek icin kullanilir



    @Test
    public void login(){
        System.out.println("Login Testi Çalıştı");
    }

    @Test(dependsOnMethods="login")
    public void search(){
        System.out.println("Seach Testi Çalıştı");
    }


    @Test
    public void result(){
        System.out.println("Result Testi çalıştı");
    }




}
