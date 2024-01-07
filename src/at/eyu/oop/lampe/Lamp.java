package at.eyu.oop.lampe;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> gluhElements;
    private double overallPowerUsage;

    public Lamp() {
        this.gluhElements = new ArrayList<>();
        this.overallPowerUsage = 0.0;
    }

    public void addLightElement(LightElement lightElement) {
        gluhElements.add(lightElement);
    }

    public void turnAllOn() {
        for (LightElement lightElement : gluhElements) {
            lightElement.turnOn();
            overallPowerUsage += lightElement.getPowerUsage();
        }
    }

    public double getOverallPowerUsage() {
        return overallPowerUsage;
    }

    public void printNamesOfLightElements() {
        for (LightElement lightElement : gluhElements) {
            System.out.println("Name: " + lightElement.getName());
        }
    }
}
