package test.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Driver;

public class DataProviderTest01 {

    //Veri havuzu olusturup , test case lere data gondermek icin kullanilir
    //Sadece TestNg ye ozeldir , Junit ya da Cucumber de kullanilmaz
    //Bu yolla bircok veri test case lere loop kullanilmadan gonderilir
    //2 boyutlu Arrayler kullanilir
    //2 parametre olabilir ama zorunlu degil , name yeni isimlendirme , parallel paralel test icin kullanilir
    //Data Driver = Data Driven Testing DDT
    //@DataProvider anotasyonu ile veri havuzu olusturulur , @Test methodlarina bu data havuzu dataProvider parametresi ile baglanir

    @DataProvider //(name ='smoke_test_data)
    public  Object [][] urunler(){
        //Objekt ten bir array olusutururuz
        Object urunListesi[][]= {
                {"renoult"},{"mercedes"}, {"honda"},{"volvo"}
        };

        return  urunListesi; //method ve return u
        }


        @Test(dataProvider = "urunler") //Bu sekilde DataProvider icindeki urunler array methoduna ulasirim
        public void googleAramasi(String malzeme) throws InterruptedException {

        //1.Google a git
        Driver.getDriver().get("https://www.google.com");

        //COOKIES CIKANLAR ICIN

        try {
            Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        }catch (Exception e){
        }


       //2.Araclari arama kutusuna gir ve enter a bas
        Driver.getDriver().findElement(By.name("q")).sendKeys(malzeme + Keys.ENTER);//Method icine yazdi isem

            Thread.sleep(2000);

        //3.Yazilan malzemenin title da var olup olmadigini kontrol et
        Assert.assertTrue(Driver.getDriver().getTitle().contains(malzeme));

            //Bu sekilde for kullanmadan testng bize bu verileri saglar
            //Array tek boyutlu oldugu icin method icine sadece malzeme yazdik , 2 boyutlu olsa idi iki veri yazardik


        }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}


