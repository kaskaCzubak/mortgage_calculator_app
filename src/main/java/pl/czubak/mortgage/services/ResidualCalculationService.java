package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Installment;
import pl.czubak.mortgage.model.InstallmentAmounts;
import pl.czubak.mortgage.model.MortgageResidual;

public interface ResidualCalculationService {

    MortgageResidual calculate(InstallmentAmounts installmentAmounts, InputData inputData);

    MortgageResidual calculate(InstallmentAmounts installmentAmounts, final InputData inputData, Installment previousInstallment);

}
