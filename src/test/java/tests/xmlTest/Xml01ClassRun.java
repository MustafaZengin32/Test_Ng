package tests.xmlTest;

public class Xml01ClassRun {

    /*
    *Xml i projelerimizde isteklerimizi iletmek icin kullandigimiz haberlesme dosyasi
    * Istedigimiz test i class a girmeden , run tusuna basmadan xml ile calistiririz(method , class , package..
    *https://testng.org/doc/documentation-main.html burada test ng documentation var , alt kisimlarda 3.testng.xml var
    *Src bazinda bir file olusturup isim verip .xml diyoruz
    *Bunun icine testng xml dokumaninda ilk olarak DOCTYPE i kopyalariz
    * Daha sonra ilk adim olarak suite tag ini olusturmak , name veriyoruz , bu istege bagli , dokumantasyon ve raporlama
    * bu isim yazili olacak
    * Daha sonra test tagini acip optional isim veriyorum
    * Bunun da altinda class tag i acip class taginda name e hangi package icindeki hangi class i calistiracagimi seciyorum
    * <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

      <suite name="Suite1" verbose="1" >
        <test name="Nopackage" >
           <classes>
              <class name="tests.dataProvider.DataProviderTest01" />
           </classes>
        </test>
      </suite>

    *Yukarida class ta inin icindeki class da name kismina hangi javanin altindaki tests package indan baslayarak . ile
    *alt kisimlara ulasana kadar yazacagim , <class name="tests.dataProvider.DataProviderTest01" /> bu sekilde
    * Boylece DataProviderTest01 class ini calistirabilirim , ancak xml dosyasina kodlari yazdiktan sonra Save etmem gerek
    * Save islemi yapilmaz ise calistirma komutu cikmaz
    * Simdi belirli packagelari calistirmayi gorelim
    * <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >

    <suite name="istenen packagelari calistirma">
      <test name="package">
        <packages>
           <package name="tests.smokeTests" />
        </packages>
     </test>
   </suite>

   * Bu sekilde suite test daha sonra package tag i acip , package name e calistirmak istedigimiz package name girilir
   *SImdi belirli methodlari calistirmak icin ilk suite ve test tag lari aciyoruz , sonra class tag aciyoruz
   * Cunku methodlar class icinde bulunur , sonra onunda icine method tag i acip method icine include tag i acariz
   * Daha sonra name e calistirmak istedigimiz methodu yazariz
   * Belirli method disindakileri calistirmadaki tek fark exclude yazariz ve onun icindeki method haric digerleri calisir
   *


    *

     */


}
