class Shield {

  float x;
  float y;
  float w;
  float h;
  float speedY;
  color c;

  Shield(float tmpX, float tmpY, float tmpW, float tmpH) {
    x = tmpX;
    y = tmpY;
    w = tmpW;
    h = tmpH;
    speedY = 0;
    c=(255);
  }

  void move() {
    y += speedY;
  }


    void display() {
      fill(c);
      rect(x-w/2, y-h/2, w, h);
    }
  }
