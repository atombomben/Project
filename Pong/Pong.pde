//Gameboard
/*float left(){
    return x-diameter/2;
  }
  float right(){
    return x+diameter/2;
  }
  float top(){
    return y-diameter/2;
  }
  float bottom(){
    return y+diameter/2;
  }
*/
Shield shield_L;
Shield shield_R;
Ball ball1;
boolean[] keys;
float grav = 0.1;
int scorePlayer1 = 0;
int scorePlayer2 = 0;

void setup() {
size(750, 450);
textSize(60);
textAlign(CENTER);
shield_L = new Shield(15, height/2, 50, 120);
shield_R = new Shield(width-15, height/2, 50, 120);
ball1 = new Ball(375, 225);
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
  
  if( keys[0]) 
  {  
    shield_L.speedY = -5;
  }
  if( keys[1]) 
  {
    shield_L.speedY= +5;
  }
  if( keys[2])
  {
    shield_R.speedY= -5;
  }
  if( keys[3])
  {
    shield_R.speedY = +5;
  }
    
}

void keyPressed()
{
  if(key=='w')
    keys[0]=true;
  if(key=='s')
    keys[1]=true;
  if(keyCode==UP)
    keys[2]=true;
  if(keyCode==DOWN)
    keys[3]=true;
}

void keyReleased()
{
  if(key=='w')
    shield_L.speedY = 0;
    keys[0]=false;
  if(key=='s')
    shield_L.speedY = 0;
    keys[1]=false;
  if(keyCode==UP)
    shield_R.speedY = 0;
    keys[2]=false;
  if(keyCode==DOWN)
    shield_R.speedY = 0;
    keys[3]=false;
}

  
  
/*
   if (ball1.right() > width) { //if stuff between () is true, execute code between {}
    ball.speedX = -ball1.speedX;
  }
  if (ball1.left() < 0) {
    ball1.speedX = -ball1.speedX;
  }

  if (ball1.bottom() > height) {
    ball1.speedY = -ball1.speedY;
  }

  if (ball1.top() < 0) {
    ball1.speedY = -ball1.speedY;
  } */
