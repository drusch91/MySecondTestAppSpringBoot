package ru.example2.SecondTestAppSpringBoot.Model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    /***
     * Идентификатор пользователя
     */
    private String uid;
    /***
     * Идентификатор операции
     */
    private String operationUid;
    /***
     * Системное время
     */
    private String systemTime;
    /***
     * Кодировка
     */
    private Codes code;
    /***
     * Премия
     */
    private Double quarterlyBonus;
    /***
     * Код ошибки
     */
    private ErrorCodes errorCode;
    /***
     * Текст ошибки
     */
    private ErrorMessages errorMessage;
}
