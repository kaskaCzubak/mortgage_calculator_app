package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Installment;

import java.util.List;

public interface InstallmentCalculationService {

    List<Installment> calculate(InputData inputData);
}
