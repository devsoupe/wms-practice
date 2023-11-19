package com.devsoupe.wmspractice.product.feature;

public enum TemperatureZone {
    ROOM_TEMPERATURE("상온");

    private final String description;

    TemperatureZone(final String description) {
        this.description = description;
    }
}
