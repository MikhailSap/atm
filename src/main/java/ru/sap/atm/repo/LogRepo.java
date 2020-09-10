package ru.sap.atm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sap.atm.model.Log;

@Repository
public interface LogRepo extends JpaRepository<Log, Long> {
}
