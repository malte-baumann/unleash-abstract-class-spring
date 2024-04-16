package de.test.domain.works;

import org.springframework.stereotype.Service;

@Service("FeatureDemo")
public class FeatureDemoServiceOld implements FeatureDemoService {
    @Override
    public String greetings() {
        return "Hello from the old demo World!";
    }

    @Override
    public String time() {
        return "12:00";
    }
}
