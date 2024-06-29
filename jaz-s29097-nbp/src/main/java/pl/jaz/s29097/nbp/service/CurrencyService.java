package pl.jaz.s29097.nbp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.jaz.s29097.nbp.model.CurrencyRate;
import pl.jaz.s29097.nbp.repository.CurrencyRateRepository;

import java.time.LocalDate;

@Service
public class CurrencyService {

    private final CurrencyRateRepository currencyRateRepository;
    private final RestTemplate restTemplate;

    @Value("${nbp.api.url}")
    private String apiUrl;

    public CurrencyService(CurrencyRateRepository currencyRateRepository, RestTemplate restTemplate) {
        this.currencyRateRepository = currencyRateRepository;
        this.restTemplate = restTemplate;
    }

    public CurrencyRate getAverageRate(String currencyCode, LocalDate startDate, LocalDate endDate) {
        String endpoint = "/exchangerates/rates/A/" + currencyCode + "/" + startDate + "/" + endDate + "/";
        String fullUrl = apiUrl + endpoint;

        // RestTemplate HTTP GET
        CurrencyRate currencyRate = restTemplate.getForObject(fullUrl, CurrencyRate.class);

        // Zapisywanie do bazy danych
        assert currencyRate != null;
        currencyRateRepository.save(currencyRate);

        return currencyRate;
    }
}