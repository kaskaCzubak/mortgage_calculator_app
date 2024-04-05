package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Installment;
import pl.czubak.mortgage.model.InstallmentAmounts;
import pl.czubak.mortgage.model.MortgageReference;

public interface ReferenceCalculationService {

    MortgageReference calculate(InstallmentAmounts installmentAmounts, InputData inputData);

    MortgageReference calculate(InstallmentAmounts installmentAmounts, final InputData inputData, Installment previousInstallment);

}
