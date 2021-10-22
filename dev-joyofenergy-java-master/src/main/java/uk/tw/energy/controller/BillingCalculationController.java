package uk.tw.energy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.tw.energy.domain.ElectricityReading;
import uk.tw.energy.service.AccountService;
import uk.tw.energy.service.MeterReadingService;

@RestController
@RequestMapping("/billing")
public class BillingCalculationController {

    private final MeterReadingService meterReadingService;

    private AccountService accountService;

    public BillingCalculationController(MeterReadingService meterReadingService, AccountService accountService) {
        this.meterReadingService = meterReadingService;
        this.accountService = accountService;
    }

    @GetMapping("/lastweek/{smartMeterId}")
    public ResponseEntity calculateBill(@PathVariable String smartMeterId) {
        Optional<List<ElectricityReading>> readings = meterReadingService.getReadings(smartMeterId);
        //List<ElectricityReading>> readingsLastWeek = 
        if(readings.isPresent()) {
        	//readings.filter(reading -> reading.)
            String value = accountService.getPricePlanIdForSmartMeterId(smartMeterId);
            return ResponseEntity.ok(value);

        }
        return ResponseEntity.notFound().build();
    }
}
