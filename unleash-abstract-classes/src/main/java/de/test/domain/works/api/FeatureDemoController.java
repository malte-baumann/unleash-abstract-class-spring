package de.test.domain.works.api;

import de.test.domain.works.FeatureDemoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeatureDemoController {
    FeatureDemoService service;

    public FeatureDemoController(@Qualifier("FeatureDemo") final FeatureDemoService service) {
        this.service = service;
    }

    @GetMapping("/greeting")
    public String Greeting() { return this.service.greetings(); }

    @GetMapping("/time")
    public String Time() { return this.service.time(); }
}
