package ru.sap.atm.service;

import org.springframework.stereotype.Service;
import ru.sap.atm.model.Log;
import ru.sap.atm.repo.LogRepo;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    private LogRepo logRepo;

    public LogServiceImpl(LogRepo logRepo) {
        this.logRepo = logRepo;
    }

    @Override
    public Log getLogById(Long id) {
        return logRepo.getOne(id);
    }

    @Override
    public List<Log> getAll() {
        return logRepo.findAll();
    }
}
