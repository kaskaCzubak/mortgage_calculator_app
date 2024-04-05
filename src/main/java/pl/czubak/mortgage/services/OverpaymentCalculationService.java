package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {

    Overpayment calculate(final BigDecimal installmentNumber, final InputData inputData);
}
