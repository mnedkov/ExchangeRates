package eu.automationlabs.exchangerates.boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "eu.automationlabs.exchangerates")
public class ApplicationConfiguration implements WebMvcConfigurer {
    // Configuration settings can be added here
}
