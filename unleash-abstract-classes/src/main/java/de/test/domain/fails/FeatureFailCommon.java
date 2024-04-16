package de.test.domain.fails;

public abstract class FeatureFailCommon implements FeatureFails {
    @Override
    public String time() {
        return "12:00";
    }
}
