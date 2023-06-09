package org.baydak.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@ComponentScan("org.baydak")
@EnableJpaRepositories("org.baydak.repository")
public class ConfigurationPr19 { }
