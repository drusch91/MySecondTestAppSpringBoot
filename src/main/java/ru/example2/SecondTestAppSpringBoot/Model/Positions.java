package ru.example2.SecondTestAppSpringBoot.Model;

import lombok.Getter;

@Getter
public enum Positions {
    DEV(2.2, false),
    HR(1.2, false),
    TL(2.6, true),
    QA(2.0, false), // Тестировщик
    MARKETING(1.8, false), // Маркетолог
    SELLER(3.0, true); // Продажник

    private final double positionsCoefficient;
    private final boolean isManager;

    Positions(Double positionsCoefficient, boolean isManager) {
        this.positionsCoefficient = positionsCoefficient;
        this.isManager = isManager;
    }
}