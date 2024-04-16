package de.test.domain.fails;

import org.springframework.stereotype.Service;

@Service("NewFeatureFail")
public class FeatureFailNew extends FeatureFailCommon {
    @Override
    public String greetings() {
        return "Hello from the new fail World!";
    }
}
