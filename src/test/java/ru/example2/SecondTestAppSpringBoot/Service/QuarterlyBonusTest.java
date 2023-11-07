package ru.example2.SecondTestAppSpringBoot.Service;

import org.junit.jupiter.api.Test;
import ru.example2.SecondTestAppSpringBoot.Model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class QuarterlyBonusTest {
    @Test
    void calculate() {
        Positions positions = Positions.TL;
        double salary = 100000.00;
        double bonus = 2;
        int workDays = 243;
        double result = new QuarterlyBonusServiceImpl().calculate(salary, positions, bonus, workDays);

        double expected = 78106.99588477366;
        assertThat(result).isEqualTo(expected);
    }
}