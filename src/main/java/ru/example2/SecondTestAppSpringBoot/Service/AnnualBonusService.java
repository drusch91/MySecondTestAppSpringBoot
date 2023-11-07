package ru.example2.SecondTestAppSpringBoot.Service;

import org.springframework.stereotype.Service;
import ru.example2.SecondTestAppSpringBoot.Model.Positions;

@Service
public interface AnnualBonusService {
    double calculate(Positions positions, double salary, double bonus, int workDays);
}