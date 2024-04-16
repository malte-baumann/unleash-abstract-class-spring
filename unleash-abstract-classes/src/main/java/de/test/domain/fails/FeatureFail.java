package de.test.domain.fails;

import org.springframework.stereotype.Service;

@Service("FeatureFail")
public class FeatureFail extends FeatureFailCommon {
    @Override
    public String greetings() {
        return "Hello from the old fail World!";
    }
}
