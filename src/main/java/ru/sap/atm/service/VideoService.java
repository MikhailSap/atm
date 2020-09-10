package ru.sap.atm.service;

import ru.sap.atm.model.Video;

import java.util.List;

public interface VideoService {
    Video getVieoById(Long id);
    List<Video> getAll();
}
