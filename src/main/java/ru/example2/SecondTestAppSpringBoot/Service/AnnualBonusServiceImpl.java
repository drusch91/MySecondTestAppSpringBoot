package ru.example2.SecondTestAppSpringBoot.Service;

import org.springframework.stereotype.Service;
import ru.example2.SecondTestAppSpringBoot.Model.Positions;
import ru.example2.SecondTestAppSpringBoot.Util.LeapYear;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService {
    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {

        return salary * bonus * LeapYear.check() * positions.getPositionsCoefficient() / workDays;
    }
}