package com.jatin.structural.flyWeight;

public class Main {
    public static void main(String[] args) {
        Bullet bullet = new Bullet("Image");

        FlyingBullet bullet1 = new FlyingBullet(1.0,1.0,1.0,0.9,5.0,10,BulletType.NINE_MM,bullet);
        System.out.println(bullet1.getType() + " " + bullet1.getBullet().getImage());
    }
}
