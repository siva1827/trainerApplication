package com.ust.TrainerJobNotificationApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ust.TrainerJobNotificationApp.model.JobNotification;
import com.ust.TrainerJobNotificationApp.service.JobNotificationService;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {
    
    @Autowired
    private JobNotificationService jobNotificationService;

    @PostMapping("/addjob")
    public JobNotification addJob(@RequestBody JobNotification jobNotification) {
        return jobNotificationService.addJobNotification(jobNotification);
    }

    @GetMapping("getjob")
    public List<JobNotification> getAllJobs() {
        return jobNotificationService.getAllJobNotifications();
    }

    @GetMapping("/getjob/{id}")
    public JobNotification getjobbyid(@PathVariable Long id){
        return jobNotificationService.getJobNotificationById(id);
    }
}
