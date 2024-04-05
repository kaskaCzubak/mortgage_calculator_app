package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.InputData;
import pl.czubak.mortgage.model.Installment;
import pl.czubak.mortgage.model.InstallmentAmounts;
import pl.czubak.mortgage.model.Overpayment;

public interface ConstantAmountsCalculationService {

    InstallmentAmounts calculate(InputData inputData, Overpayment overpayment);

    InstallmentAmounts calculate(InputData inputData, Overpayment overpayment, Installment previousInstallment);
}
