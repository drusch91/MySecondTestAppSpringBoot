package ru.example2.SecondTestAppSpringBoot.Model;

public enum SysName {
    ERP("Enterprise Resource Planning"),
    CRM("Customer Relationship Management"),
    WMS("Warehouse Management System");
    public final String sysName;

    SysName(String systems) {
        this.sysName = systems;
    }
}