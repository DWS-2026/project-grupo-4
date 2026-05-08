package es.nextjourney.vs_nextjourney.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
	title = "NextJourney REST API",
	version = "v1",
	description = "API REST de NextJourney para gestionar usuarios, destinos, viajes, imágenes y reseñas"))
@SecurityScheme(
	name = "bearerAuth",
	type = SecuritySchemeType.HTTP,
	scheme = "bearer",
	bearerFormat = "JWT",
	in = SecuritySchemeIn.HEADER)
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi nextJourneyApi() {
	return GroupedOpenApi.builder()
		.group("nextjourney-api")
		.pathsToMatch("/api/**")
		.build();
    }
}
