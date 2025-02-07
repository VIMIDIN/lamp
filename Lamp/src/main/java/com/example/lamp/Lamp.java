package com.example.lamp;
import org.springframework.stereotype.Component;
@Component
class Lamp {
    void turnOn() {
        System.out.println("💡 Лампа включена!");
    }
}