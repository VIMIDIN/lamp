package com.example.lamp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class Switch {
    private final Lamp lamp;

    // Внедрение зависимости через конструктор (DI)
    public Switch(@Qualifier("lamp") Lamp lamp) {
        this.lamp = lamp;
    }

    void turnOn() {
        lamp.turnOn();
    }
}