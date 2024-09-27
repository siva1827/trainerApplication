package com.ust.TrainerJobNotificationApp.service;

import com.ust.TrainerJobNotificationApp.model.JobNotification;
import com.ust.TrainerJobNotificationApp.repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobNotificationService {

    @Autowired
    private JobRepository jobRepository;

    public JobNotification addJobNotification(JobNotification jobNotification) {
        return jobRepository.save(jobNotification);
    }

    public List<JobNotification> getAllJobNotifications() {
        return jobRepository.findAll();
    }

    public JobNotification getJobNotificationById(Long jobId) {
        return jobRepository.findById(jobId).orElse(null);
    }
}