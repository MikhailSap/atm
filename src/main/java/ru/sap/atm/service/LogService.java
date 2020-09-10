package ru.sap.atm.service;

import ru.sap.atm.model.Log;

import java.util.List;

public interface LogService {
    Log getLogById(Long id);
    List<Log> getAll();
}
