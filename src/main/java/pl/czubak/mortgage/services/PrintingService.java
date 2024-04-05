package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Installment;
import pl.czubak.mortgage.model.Summary;

import java.util.List;

public interface PrintingService {

    String SCHEDULE_TABLE_FORMAT =
        "%-4s %3s " +
            "%-4s %3s " +
            "%-7s %3s " +
            "%-7s %3s " +
            "%-4s %10s " +
            "%-7s %10s " +
            "%-7s %10s " +
            "%-7s %10s " +
            "%-8s %10s " +
            "%-8s %10s%n";

    List<String> INSTALLMENT_LINE_KEYS = List.of(
        "NO:",
        "YEAR:",
        "MONTH:",
        "DATE:",
        "RATE:",
        "INTEREST:",
        "CAPITAL:",
        "OVERPAY:",
        "ResAmount:",
        "ResDuration:"
    );

    String INTRO_INFORMATION = """
        LOAN AMOUNT: %s EUR
        LOAN TERM: %s MONTHS
        INTEREST: %s %%
        OVERPAYMENTS START MONTH: %s MONTH
        """;

    String OVERPAYMENT_INFORMATION = """
        %s
        SCHEME FOR MAKING OVERPAYMENTS:
        %s""";

    String SUMMARY_INFORMATION = """    
        
        TOTAL INTEREST: %s EUR
        COMMISSION FOR OVERPAYMENT: %s EUR
        TOTAL LOSSES: %s EUR
        TOTAL CAPITAL: %s EUR
        
        """;

    String OVERPAYMENT_REDUCE_INSTALLMENT = "OVERPAYMENT - REDUCE INSTALLMENT";
    String OVERPAYMENT_REDUCE_PERIOD = "OVERPAYMENT - REDUCE PERIOD";
    String OVERPAYMENT_SCHEMA = "MONTH: %s, AMOUNT: %s EUR%n";

    void printIntroInformation(InputData inputData);

    void printSchedule(List<Installment> installments, final InputData inputData);

    void printSummary(Summary summaryNoOverpayment);
}
