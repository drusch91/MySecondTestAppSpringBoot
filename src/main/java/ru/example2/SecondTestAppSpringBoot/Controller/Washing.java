package ru.example2.SecondTestAppSpringBoot.Controller;

import ru.example2.SecondTestAppSpringBoot.Model.*;
import ru.example2.SecondTestAppSpringBoot.Service.QuarterlyBonusService;
import ru.example2.SecondTestAppSpringBoot.Util.DateTimeUtil;

import java.util.Date;

public class Washing {
    public static Response rsp(Request request, QuarterlyBonusService quarterlyBonus) {
        return Response.builder()
                .uid(request.getUid())
                .operationUid(request.getOperationUid())
                .systemTime(DateTimeUtil.getCustomFormat().format(new Date()))
                .code(Codes.SUCCESS)
                .quarterlyBonus(quarterlyBonus.calculate(request.getSalary(), Positions.TL,
                        request.getBonus(), request.getWorkDays()))
                .errorCode(ErrorCodes.EMPTY)
                .errorMessage(ErrorMessages.EMPTY)
                .build();
    }
}

