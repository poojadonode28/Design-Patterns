package com.jatin.structural.flyWeight;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 2 - Create a class for extrinsic - that can change
@AllArgsConstructor
@Getter
public class FlyingBullet {
    private Double x;
    private Double y;
    private Double z;

    private Double radius;
    private Double length;
    private Integer damage;

    private BulletType type;

    // Step 3 - Add a reference of the intrinsic state - composition
    private Bullet bullet;
}
