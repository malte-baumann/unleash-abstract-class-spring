package de.test.domain.works;

import org.springframework.stereotype.Service;

@Service("NewFeatureDemo")
public class FeatureDemoNew implements FeatureDemoService {
    @Override
    public String greetings() {
        return "Hello from the new demo World!";
    }

    @Override
    public String time() {
        return "12:00";
    }
}
