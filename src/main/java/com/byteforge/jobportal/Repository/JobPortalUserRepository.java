package com.byteforge.jobportal.Repository;

import com.byteforge.jobportal.entity.JobPortalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JobPortalUserRepository extends JpaRepository<JobPortalUser, Long> {
//    @Query("select j from JobPortalUser j where j.email = ?1 and j.mobileNumber = ?2")
    Optional<JobPortalUser> readUserByEmailOrMobileNumber(String email, String mobileNumber);

//    @Query("select j from JobPortalUser j where j.email = ?1")
    Optional<JobPortalUser> findJobPortalUserByEmail(String email);


}