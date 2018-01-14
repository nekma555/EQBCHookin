package com.geniuscartel.Toon.classes;

import com.geniuscartel.Toon.ShortClass;
import com.geniuscartel.workers.characterworkers.CharacterManager;

public class ShadowKnight extends Character {
    private ShortClass className = ShortClass.SHD;

    public ShadowKnight(String name, String[] NBPacket, CharacterManager boss) {
        super(name, NBPacket, boss);
    }

    @Override
    public void run() {
        while(isRunning()){
            synchronized (this){
                try {
                    super.sendCommand(this.getName(), "//bca hello from shadowknight");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
