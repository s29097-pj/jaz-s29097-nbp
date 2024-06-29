package pl.jaz.s29097.nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jaz.s29097.nbp.model.CurrencyRate;

import java.time.LocalDate;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {
    CurrencyRate findByCurrencyCodeAndStartDateAndEndDate(String currencyCode, LocalDate startDate, LocalDate endDate);
}
