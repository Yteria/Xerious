package com.xerious.game.states;

import com.xerious.game.util.KeyHandler;
import com.xerious.game.util.MouseHandler;

import java.awt.*;

public class PlayState extends GameState {

    public PlayState(GameStateManager gsm) {
        super(gsm);
    }

    public void update() {

    }
    public void input(MouseHandler mouse, KeyHandler key) {
        if(key.up.down) {
            System.out.println("'W' is being pressed" );
        }
    }
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 64, 64);
    }

}
