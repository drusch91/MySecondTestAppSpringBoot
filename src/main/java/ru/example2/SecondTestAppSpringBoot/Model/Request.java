package ru.example2.SecondTestAppSpringBoot.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.text.Position;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    /***
     * Идентификатор пользователя
     */
    @NotBlank(message = "uid не может быть пустым")
    @Size(max = 32, message = "uid не должен превышать 32 символа")
    private String uid;
    /***
     * Идентификатор операции
     */
    @NotBlank(message = "operationUid не может быть пустым")
    @Size(max = 32, message = "operationUid не может превышать 32 символа")
    private String operationUid;
    /***
     * Имя системы
     */
    private String systemName;
    /***
     * Системное время
     */
    @NotBlank(message = "systemTime не может быть пустым")
    private String systemTime;
    /***
     * Источник
     */
    private String source;
    /***
     * Позиция
     */
    private Positions position;
    /***
     * Заработная плата
     */
    private Double salary;
    /***
     * Бонус
     */
    private Double bonus;
    /***
     * Количество дней
     */
    private Integer workDays;
    /***
     * Идентификатор связи
     */
    @Min(value = 1, message = "communicationId не может быть меньше 1")
    @Max(value = 100000, message = "communicationId не может быть больше 100000")
    private int communicationId;
    /***
     * Идентификатор шаблона
     */
    private int templateId;
    /***
     * Код продукта
     */
    private int productCode;
    /***
     * Смс-код
     */
    private int smsCode;

    @Override
    public String toString() {
        return "Request{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", positions=" + position +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", workDays=" + workDays +
                ", communicationId=" + communicationId +
                ", templateId=" + templateId +
                ", productCode=" + productCode +
                ", smsCode=" + smsCode +
                '}';
    }
}