package de.test.domain.fails;

import org.unleash.features.annotation.Toggle;

public interface FeatureFails {
    @Toggle(name = "fail", alterBean = "NewFeatureFail")
    String greetings();
    String time();
}
