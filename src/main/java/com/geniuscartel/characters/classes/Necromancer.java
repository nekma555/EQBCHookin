package com.geniuscartel.characters.classes;

import com.geniuscartel.characters.EQCharacter;
import com.geniuscartel.characters.ShortClass;
import com.geniuscartel.workers.characterworkers.CharacterManager;

public class Necromancer extends EQCharacter {
    private ShortClass className = ShortClass.NEC;

    public Necromancer(String name, String[] NBPacket, CharacterManager boss) {
        super(name, NBPacket, boss);
    }

    @Override
    public void restStateAction() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void followStateAction() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void combatStateAction() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
