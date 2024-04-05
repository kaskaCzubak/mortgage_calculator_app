package pl.czubak.mortgage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.czubak.mortgage.configuration.CalculatorConfiguration;
import pl.czubak.mortgage.services.MortgageCalculationService;

public class MortgageCalculatorApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);
        MortgageCalculationService mortgageCalculationService = context.getBean(MortgageCalculationService.class);
        mortgageCalculationService.calculate();
    }
}
