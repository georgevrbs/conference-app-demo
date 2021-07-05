package com.example.demo.components;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MaxMemoryHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean invalidMemory = Runtime.getRuntime().maxMemory() < (100 * 1024 * 1024);
        Status status = invalidMemory ? Status.DOWN : Status.UP;
        return Health.status(status).build();
    }
}
