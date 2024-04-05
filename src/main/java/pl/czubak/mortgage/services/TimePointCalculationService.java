package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Installment;
import pl.czubak.mortgage.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointCalculationService {

    TimePoint calculate(final BigDecimal installmentNumber, final InputData inputData);

    TimePoint calculate(BigDecimal installmentNumber, Installment previousInstallment);

}
