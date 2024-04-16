package de.test.domain.fails.api;

import de.test.domain.fails.FeatureFail;
import de.test.domain.fails.FeatureFails;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fail")
public class FailController {
    FeatureFails service;

    public FailController(@Qualifier("FeatureFail") final FeatureFail service) {
        this.service = service;
    }

    @GetMapping("/greeting")
    public String Greeting() { return this.service.greetings(); }

    @GetMapping("/time")
    public String Time() { return this.service.time(); }
}
