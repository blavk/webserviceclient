package com.example.demo;

import com.example.consumingwebservice.wsdl.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryClientIntegrationTest {

    @Autowired
    CountryClient countryClient;

    @Test
    public void shouldDownloadCountry() {
        // given
        String countryName = "Poland";

        // when
        Country country = countryClient.getCountry(countryName).getCountry();

        System.out.println("ok" + country.getName() + " " + country.getCapital());
        // then
//        Country expectedCountry = new Country();
//        expectedCountry.setName("Poland");
//        expectedCountry.setCapital("Warsaw");
//        expectedCountry.setCurrency(Currency.PLN);
//        expectedCountry.setPopulation(38186860);

//        assertThat(country.getName()).isEqualTo("Poland");
//        assertThat(country.getCapital()).isEqualTo("Warsaw");
//        assertThat(country.getCurrency()).isEqualTo(Currency.PLN);
//        assertThat(country.getPopulation()).isEqualTo(38186860);
    }

}
