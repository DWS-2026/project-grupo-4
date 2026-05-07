package es.nextjourney.vs_nextjourney.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UserDTO(
    Long id,
    String username,
    String email,
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    String password,
    ImageDTO image,
    List<String> roles
) {}