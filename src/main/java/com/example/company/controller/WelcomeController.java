package com.example.company.controller;

import lombok.extern.slf4j.Slf4j;
import org.fluentd.logger.FluentLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WelcomeController {

    private static final FluentLogger fluentLogger = FluentLogger.getLogger("app", "localhost", 24224);

    @GetMapping
    public String welcome() {
        log.info("Welcome to the company");
        return "Welcome !";
    }
}
