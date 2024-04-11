package com.xvalley.openbanking.configs;

import com.xvalley.openbanking.models.persistence.DemoPersistence;
import com.xvalley.openbanking.models.persistence.IPersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public IPersistence persistence(){
        return new DemoPersistence();
    }
}
