//Creating the class Ball
class Ball {
  float x;
  float y;
  float xspeed, yspeed;
  float diameter;
  Ball(float tempX, float tempY) {
    int randomIntX = (int)random(1,3);
    int randomIntY = (int)random(1,3);
    x = tempX;
    y = tempY;
    if (randomIntX == 1) {
     xspeed = -5;
    }
    else {
      xspeed = 5;
    }
     if (randomIntY == 1) {
     yspeed = -5;
    }
    else {
     yspeed = 5;
    }
  }
 
  void display() {
    fill(255);
    stroke(0);
    ellipseMode(CENTER);
    ellipse(x, 225, 20, 20);
  }
  void move() {
    x += xspeed;
    y += yspeed; // Increment y
        //player1  //player2
    if (x > width || x < 0) {
      Goal();
      Goal1();
    }
    // Check vertical edges
    if (y > height || y < 0) {
      yspeed *= -1;
    }
  }

  void Goal() {
    ball1 = new Ball(375, 225);
    ball1.display();
    ball1.move();
  }

  void Goal1() {
    x += xspeed;
    y += yspeed;
  if (x > width) {
    scorePlayer1 = scorePlayer1 + 1;
  }
  if (x < 0) {
    scorePlayer2 = scorePlayer2 + 1;
  }
  }
}
