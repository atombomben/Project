//Trafficlight with rect+ellipse

void setup()
{
  size(500, 500);
}

//+adding gray (variable has to be outsite voids)

  color red = color(255, 0, 0);
  color yellow = color(255, 255, 0);
  color green = color(17, 234, 29);
  color white = color(255);
  color gray = color(100);
  
void draw()
{

  background(white);
  strokeWeight(10);
  stroke(0);
  fill(0);
  rectMode(CORNER);
  rect(200, 100, 100, 300);
  ellipseMode(CENTER);
  fill(red);
  ellipse(250, 150, 80, 80);
  fill(yellow);
  ellipse(250, 245, 80, 80);
  fill(green);
  ellipse(250, 340, 80, 80);

  //pressing key 1,2,3 turning light off to gray
}
void keyPressed()
{
  if (keyPressed == true && key =='1') {
    red = (gray);
  }
  if (keyPressed == true && key =='2') {
    yellow = gray;
  }
  if (keyPressed == true && key =='3') {
    green = gray;
  }
  
}
