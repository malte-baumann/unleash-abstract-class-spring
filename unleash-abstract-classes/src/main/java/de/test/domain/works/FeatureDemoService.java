package de.test.domain.works;

import org.unleash.features.annotation.Toggle;

public interface FeatureDemoService {
    @Toggle(name = "demo", alterBean = "NewFeatureDemo")
    String greetings();

    String time();
}
