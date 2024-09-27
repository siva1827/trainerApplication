package com.ust.TrainerJobNotificationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.TrainerJobNotificationApp.model.JobNotification;

@Repository
public interface JobRepository extends JpaRepository<JobNotification,Long> {
}
