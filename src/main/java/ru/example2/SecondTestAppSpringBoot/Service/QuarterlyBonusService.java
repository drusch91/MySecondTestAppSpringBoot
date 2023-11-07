package ru.example2.SecondTestAppSpringBoot.Service;

import org.springframework.stereotype.Service;
import ru.example2.SecondTestAppSpringBoot.Model.Positions;

@Service
public interface QuarterlyBonusService {
    double calculate(double salary, Positions positions, double bonus, int workDays);

}