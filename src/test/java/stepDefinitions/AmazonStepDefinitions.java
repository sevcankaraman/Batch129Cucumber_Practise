package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasinda")
    public void kullanici_amazon_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        assertTrue(amazonPage.sonucYazisi.getText().contains("Nutella"));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }


    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);

    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        assertTrue(amazonPage.sonucYazisi.getText().contains("Java"));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullanici_iphone_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("iphone"));
    }



    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(istenenKelime));

    }


    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapAr(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }


}