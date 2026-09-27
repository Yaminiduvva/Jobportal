package com.byteforge.jobportal.dto;

import java.time.Instant;

public record LoginResponseDto(String mesaage, UserDto userDto , String  jwtToken) {
}
