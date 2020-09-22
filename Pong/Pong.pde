//Gameboard
Shield shield_L;
Shield shield_R;
Ball ball1;
boolean[] keys;
int scorePlayer1 = 0;
int scorePlayer2 = 0;

void setup() {
  size(750, 450);
  textSize(60);
  textAlign(CENTER);
  shield_L = new Shield(15, height/2, 50, 120);
  shield_R = new Shield(width-15, height/2, 50, 120);
  ball1 = new Ball(375, 225, 20, 20);
  keys=new boolean[4];
  keys[0]=false;
  keys[1]=false;
  keys[2]=false;
  keys[3]=false;
}

void draw() {
  background(0);
  ball1.display();
  ball1.move();
  text(scorePlayer1, width/2-50, 60);
  text(scorePlayer2, width/2+50, 60);
  shield_L.move();
  shield_L.display();
  shield_R.move();
  shield_R.display();
  fill(00, 200, 00);
  rect(00, 00, 20, 750);
  rect(730, 00, 750, 750);

  if (ball1.x > width || ball1.x < 0) {
    Goal1();    
    Goal();
  }
  // Check vertical edges
  if (ball1.y > height || ball1.y < 0) {
    ball1.yspeed *= -1;
  }

  if ( keys[0]) 
  {  
    shield_L.speedY = -5;
  }
  if ( keys[1]) 
  {
    shield_L.speedY= +5;
  }
  if ( keys[2])
  {
    shield_R.speedY= -5;
  }
  if ( keys[3])
  {
    shield_R.speedY = +5;
  }
  
  if ( ball1.left() < shield_L.right() && ball1.y > shield_L.top() && ball1.y < shield_L.bottom()){
 ball1.xspeed = -ball1.xspeed;
 }
 
 if ( ball1.right() > shield_R.left() && ball1.y > shield_R.top() && ball1.y < shield_R.bottom()) {
 ball1.xspeed = -ball1.xspeed;
 }
  
}

void keyPressed()
{
  if (key=='w')
    keys[0]=true;
  if (key=='s')
    keys[1]=true;
  if (keyCode==UP)
    keys[2]=true;
  if (keyCode==DOWN)
    keys[3]=true;
}

void keyReleased()
{
  if (key=='w')
    shield_L.speedY = 0;
  keys[0]=false;
  if (key=='s')
    shield_L.speedY = 0;
  keys[1]=false;
  if (keyCode==UP)
    shield_R.speedY = 0;
  keys[2]=false;
  if (keyCode==DOWN)
    shield_R.speedY = 0;
  keys[3]=false;
}

void Goal() {
  ball1 = new Ball(375, 225, 20, 20);
  ball1.display();
  ball1.move();
}

void Goal1() {
  ball1.x += ball1.xspeed;
  ball1.y += ball1.yspeed;
  if (ball1.x > width) {
    scorePlayer1 = scorePlayer1 + 1;
  }
  if (ball1.x < 0) {
    scorePlayer2 = scorePlayer2 + 1;
  }
}
