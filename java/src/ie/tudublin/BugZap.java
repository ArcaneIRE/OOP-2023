package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
  public void settings() {
    size(500, 500);
  }

  public void setup() {
    colorMode(HSB);
    background(0);
  }

  public void draw() {
    strokeWeight(2);
    stroke(255, 255, 255);
  }
}
