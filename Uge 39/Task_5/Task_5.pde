//5A

int herr = 8;
int gerr = 8;
int[][] board = new int[herr][gerr];
int sideLength = 40;


//5B
void setup () {
  size(350, 350);

  //5C

  for (int x = 0; x < herr; x++)
  {
    for (int y = 0; y < gerr; y++)
    {
      if (x % 2 == 0 && y % 2 == 0)
      {
        board[x][y] = 0;
      } else if (x % 2 == 0 && y % 2 != 0) 
      {
        board[x][y] = 1;
      } else if (x % 2 != 0 && y % 2 == 0) 
      {
        board[x][y] = 1;
      } else if (x % 2 != 0 && y % 2 != 0)
      {
        board[x][y] = 0;
      }
    }
  }
}

//5DE

void draw() {

  for (int x = 0; x < herr; x++)
  {
    for (int y = 0; y < gerr; y++)
    {
      if (board[x][y] == 0) 
      {
        fill(0);
      } else if (board[x][y] == 1) 
      {
        fill(255);
      }
      rect(x * sideLength, y * sideLength, sideLength, sideLength);
    }
  }
}
