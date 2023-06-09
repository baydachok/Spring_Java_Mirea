package org.baydak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;


@Configuration
@ComponentScan("org.baydak")
@EnableJpaRepositories("org.baydak.repository")
@EnableAsync
public class ConfigurationPr21 {

}
