package com.demo.common.model;

import javafx.scene.paint.Color;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Serializable representation of a Color object for JSON serialization.
 * This class is used to store color values in a format that can be easily
 * serialized and deserialized, particularly for use in WebSocket communication.
 */

@Setter
@Getter
@Builder
public class SerializableColor {
    private double red;
    private double green;
    private double blue;
    private double alpha;

    public SerializableColor() {
    }

    public SerializableColor(double red, double green, double blue, double alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public SerializableColor(Color fxColor) {
        this.red = fxColor.getRed();
        this.green = fxColor.getGreen();
        this.blue = fxColor.getBlue();
        this.alpha = fxColor.getOpacity();
    }

    public Color toFXColor() {
        return new Color(red, green, blue, alpha);
    }
}
