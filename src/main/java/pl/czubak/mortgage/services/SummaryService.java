package pl.czubak.mortgage.services;

import pl.czubak.mortgage.model.Installment;
import pl.czubak.mortgage.model.Summary;

import java.util.List;

public interface SummaryService {

    Summary calculateSummary(List<Installment> installments);
}
