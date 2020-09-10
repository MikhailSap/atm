package ru.sap.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sap.atm.service.LogService;
import ru.sap.atm.service.VideoService;

@Controller
public class AdminController {
    private LogService logService;
    private VideoService videoService;

    public AdminController(LogService logService, VideoService videoService) {
        this.logService = logService;
        this.videoService = videoService;
    }

    @GetMapping("log")
    public String getLog(@RequestParam(name = "id") Long id, Model model) {
        model.addAttribute("log", logService.getLogById(id));
        return "/log";
    }

    @GetMapping("video")
    public String getVideo(@RequestParam(name = "id") Long id, Model model) {
        model.addAttribute("video", videoService.getVieoById(id));
        return "/video";
    }





}
