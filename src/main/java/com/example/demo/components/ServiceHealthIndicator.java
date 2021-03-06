package com.example.demo.components;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ServiceHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up()
                    .withDetail("dummy-health", true)
                    .build();
    }
}
