package ru.sap.atm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sap.atm.model.Video;

@Repository
public interface VideoRepo extends JpaRepository<Video, Long> {
}
