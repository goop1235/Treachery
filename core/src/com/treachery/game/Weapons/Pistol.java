package com.treachery.game.Weapons;

import com.badlogic.gdx.math.Vector2;
import com.treachery.game.Game;

public class Pistol extends Gun {
    public Pistol (Game parent) {
        this.parent = parent;
        damage = 10;
        velocity = 40;
        fireRate = 0.3f;
        ammoType = PISTOL;
        clipSize = 8;
        ammoLoaded = clipSize;
        texture = "pistol";
        ID = 1;
    }

    @Override
    public void Shoot(Vector2 startPosition, Vector2 targetPosition, Game parent) {
        super.Shoot(startPosition, targetPosition, parent);
    }
    @Override
    public Weapon getWeapon() {
        return new Pistol(parent);
    }
}
