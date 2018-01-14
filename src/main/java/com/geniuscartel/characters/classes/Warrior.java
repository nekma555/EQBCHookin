package com.geniuscartel.characters.classes;

import com.geniuscartel.characters.ShortClass;
import com.geniuscartel.workers.characterworkers.CharacterManager;

public class Warrior extends Character {
    private ShortClass className = ShortClass.WAR;

    public Warrior(String name, String[] NBPacket, CharacterManager boss) {
        super(name, NBPacket, boss);
    }

    @Override
    void restStateAction() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    void followStateAction() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    void combatStateAction() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
