package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20TestNg01SoftAssertations {
    //Normal Assertation da hata alirsan sonrakilere bakmaz ve kod calismasini durdurur , buna hard assert denir
    //Komple kodu durdurma sonra toptan incele , hata alsamda islem devam etson dersen buna da soft assert denir
    //Bunu kullanmak icin SoftAssert sinifindan Obje olusturmak gerekir
    //Ayrica en son assertAll demez isek hatalari sonrasinda gormeyiz

    @Test
    public void test(){

    SoftAssert softAssert=new SoftAssert();//public class SoftAssert extends Assertion

    System.out.println("calisma 1");

    softAssert.assertEquals(5,2);    //==> Fail

    System.out.println("calisma 2");


    System.out.println("calisma 3");

    softAssert.assertTrue(true);

    System.out.println("calisma 4");

       //Yukaridaki islemlerde Assertation Yontemi Soft oldugu icin hata olsada akis devam etti
       //Ayrica en sona assertAll yazmadigimiz icin hata raporu bile almadim , bu unutulmamali

       softAssert.assertAll();

        System.out.println("calisma 5");//Yukarida assertAll yapinca yukaridaki hatalar uyarinca assertAll ile birlikte
                                        //hata aldigimiz icin alttaki kodu okumadi ve hata verdi








    }

}


