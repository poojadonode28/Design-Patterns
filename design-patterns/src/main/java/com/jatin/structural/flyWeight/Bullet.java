package com.jatin.structural.flyWeight;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 1 - Separate the intrinsic state - that do not change
@AllArgsConstructor
@Getter
public class Bullet {
    private String image;
}
