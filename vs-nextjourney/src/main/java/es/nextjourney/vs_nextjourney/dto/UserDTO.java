package es.nextjourney.vs_nextjourney.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserDTO(
    Long id,
    String username,
    String name,      // Add this
    String lastName,  // Add this
    String email,
    String dateOfBirth, // Add this (ensure your mapper handles the String -> Date conversion)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String password,
    ImageDTO image,
    List<String> roles
) {}