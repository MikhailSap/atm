package ru.sap.atm.service;

import org.springframework.stereotype.Service;
import ru.sap.atm.model.Video;
import ru.sap.atm.repo.VideoRepo;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    private VideoRepo videoRepo;

    public VideoServiceImpl(VideoRepo videoRepo) {
        this.videoRepo = videoRepo;
    }

    @Override
    public Video getVieoById(Long id) {
        return videoRepo.getOne(id);
    }

    @Override
    public List<Video> getAll() {
        return videoRepo.findAll();
    }
}
