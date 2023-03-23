package it.unibo.tankBattle.view.api;

import java.util.Set;
import java.util.stream.Stream;

import it.unibo.tankBattle.common.ButtonDirection;
import it.unibo.tankBattle.common.Transform;
import it.unibo.tankBattle.controller.api.GameEngine;

public interface View {
    
    /*public void drawTank(Transform position);

    public void drawBullet(Transform position);*/

    public void gameOver();

    public void render(Transform firstTank, Transform secondTank, Stream<Transform> wall, Stream<Transform> bullet);

    //public void drawWall(Set<Transform> wall);

    public void setController(GameEngine controller);  

    public void updateTankPlayer1(ButtonDirection delta);

    public void updateTankPlayer2(ButtonDirection delta);

    public void updateMap(ButtonDirection delta);
}
