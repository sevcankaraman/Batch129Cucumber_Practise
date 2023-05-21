# Bir Scenario olusturunuz

# kullanici amazon anasayfasinda
# kullanici "Nutella" icin arama yapar
# sonuclarin "Nutella" icerdigini test eder
# sayfayi kapatir

Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapar

    Given kullanici amazon sayfasinda
    Then kullanici "top" icin arama yapar
    And sonuclarin "top" icerdigini test eder
    And sayfayi kapatir