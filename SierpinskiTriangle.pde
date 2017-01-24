public void setup() {
  size(800,800);
}
public void draw() {
  background(0);
  recurse(100,700,600);
}

public void recurse(int x, int y, int len) {
  if(len <= 2) {
    triangle(x,y,x+len/2,y-len,x+len,y);
  } else {
    recurse(x,y,len/2);
    recurse(x+len/2,y,len/2);
    recurse(x+len/4,y-len/2,len/2);
  }
}
