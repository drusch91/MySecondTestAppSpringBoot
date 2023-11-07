package ru.example2.SecondTestAppSpringBoot.Service;

import org.springframework.stereotype.Service;
import ru.example2.SecondTestAppSpringBoot.Model.Positions;
import ru.example2.SecondTestAppSpringBoot.Util.LeapYear;

@Service
public class QuarterlyBonusServiceImpl implements QuarterlyBonusService {
    @Override
    public double calculate(double salary, Positions positions, double bonus, int workDays) {
        if (positions.isManager()) {

            return ((salary * bonus * LeapYear.check() * positions.getPositionsCoefficient() / workDays)
                    * 0.1);
        } else return 0.0;
    }
}