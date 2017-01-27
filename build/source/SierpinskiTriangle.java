import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

public void setup() {
  
}
public void draw() {
  background(0);
  recurse(100,700,600);
}

public void recurse(int x, int y, int len) {
  if(len <= 20) {
    fill((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    //stroke(255);
    triangle(x,y,x+len/2,y-len,x+len,y);
  } else {
    recurse(x,y,len/2);
    recurse(x+len/2,y,len/2);
    recurse(x+len/4,y-len/2,len/2);
  }
}
  public void settings() {  size(800,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
