package org.baydak.configuration;

import org.baydak.service.FileHashService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HashAppConfiguration {
    @Bean
    public FileHashService fileHashService() {
        return new FileHashService();
    }
}
