package ru.sap.atm.policy;

import ru.sap.atm.model.Log;
import ru.sap.atm.model.Video;
import ru.sap.atm.service.LogService;
import ru.sap.atm.service.VideoService;

public class AdminServicePolicyImpl implements AdminServicePolicy {
    private VideoService videoService;
    private LogService logService;

    public AdminServicePolicyImpl(VideoService videoService, LogService logService) {
        this.videoService = videoService;
        this.logService = logService;
    }

    @Override
    public Video getVideo(Long id) {
        return videoService.getVieoById(id);
    }

    @Override
    public Log getLog(Long id) {
        return logService.getLogById(id);
    }
}
