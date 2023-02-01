package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {

  int screenWidth = 700;
  int screenHeight = 700;

  public void settings() {
    size(screenWidth, screenHeight);
  }

  public void setup() {
    colorMode(RGB);
    background(0);
    strokeWeight(2);
    stroke(255, 255, 255);
    fill(255, 255, 255);
  }

  float playerWidth = 60;
  float playerX = screenWidth / 2;
  float playerY = 600;

  float bugWidth = 40;
  float bugX = random(0 + bugWidth, screenWidth - bugWidth);
  float bugY = 0;

  public void draw() {
    background(0);
    drawPlayer(playerX, playerY, playerWidth);
    drawBug(bugX, bugY, bugWidth);
    if (frameCount % 2 == 0) {
      moveBug();
    }
  }

  public void drawPlayer(float x, float y, float width) {
    rect(x, y, width, width);
    rect(x + width / 2 - (width / 8), y - width / 2, width / 4, width / 2);
  }

  public void drawBug(float x, float y, float width) {
    rect(x, y, width, width);
  }

  public void moveBug() {
    bugY += 5;
    if (bugY > screenHeight) {
      bugY = 0;
      bugX = screenWidth / 2;
    }

    bugX += random(-5, +5);
    if (bugX <= 0) {
      bugX += 5;
    } else if (bugX >= screenWidth) {
      bugX -= 5;
    }
  }

  public void keyPressed() {
    int moveIncrement = 10;

    if (keyCode == LEFT) {
      if (playerX > (0 + moveIncrement)) {
        playerX -= 10;
      }
    }
    if (keyCode == RIGHT) {
      if (playerX < (screenWidth - moveIncrement - playerWidth)) {
        playerX += 10;
      }
    }
    if (key == ' ') {
      System.out.println("SPACE key pressed");
    }
  }
}
