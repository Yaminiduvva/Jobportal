package com.byteforge.jobportal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.byteforge.jobportal.entity.Contact}
 */
public record ContactRequestDto(
        @NotBlank(message = "email should not be empty")
        @Email(message = "email is invalid")
        String email,

        @NotBlank(message = "email should not be empty")
        @Size(message = "message must be between 5 to 300 character")
        String message,

        @NotBlank(message = "name should not be empty")
        @Size(message = "name must be between 5 to 30 character")
        String name,

        @NotBlank(message = "usertype should not be empty")
        @Pattern(regexp = "Job Seeker|Employer|Other", message = "UserType must be one of: Job Seeker, Employer, Other")
        String userType,

        @NotBlank(message = "subject should not be empty")
        @Size(message = "subject must be between 5 to 150 character")
        String subject
        ) implements Serializable {
}