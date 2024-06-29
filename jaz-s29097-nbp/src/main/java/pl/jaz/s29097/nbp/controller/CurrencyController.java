package pl.jaz.s29097.nbp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.jaz.s29097.nbp.model.CurrencyRate;
import pl.jaz.s29097.nbp.service.CurrencyService;

import java.time.LocalDate;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/averageRate")
    public CurrencyRate getAverageRate(@RequestParam String currencyCode,
                                       @RequestParam String startDate,
                                       @RequestParam String endDate) {
        return currencyService.getAverageRate(currencyCode, LocalDate.parse(startDate), LocalDate.parse(endDate));
    }
}
