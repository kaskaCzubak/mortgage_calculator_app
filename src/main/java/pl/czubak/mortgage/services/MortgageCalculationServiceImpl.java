package pl.czubak.mortgage.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Installment;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class MortgageCalculationServiceImpl implements MortgageCalculationService {

    private final InputDataService inputDataService;

    private final InstallmentCalculationService installmentCalculationService;

    private final PrintingService printingService;

    private final SummaryService summaryService;

    @Override
    public void calculate() {
        final Optional<InputData> inputData = inputDataService.read();
        if (inputData.isEmpty()) {
            log.error("Empty input data. Exit.");
            return;
        }

        printingService.printIntroInformation(inputData.get());

        log.info("Installments calculation start");
        List<Installment> installments = installmentCalculationService.calculate(inputData.get());
        log.info("Installments calculation end. Calculated: [{}] installments", installments.size());
        installments.forEach(installment -> log.debug("Installment: [{}]", installment));

        printingService.printSummary(summaryService.calculateSummary(installments));
        printingService.printSchedule(installments, inputData.get());
        log.info("Calculation finished successfully");
    }

}
