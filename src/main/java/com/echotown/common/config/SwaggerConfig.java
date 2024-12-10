package com.echotown.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Echo Town API")
                .description("Echo Town API 명세서")
                .version("0.0.1");

        return new OpenAPI()
                .info(info);
    }
}
