//6.a make 2 integer variables named a and b. Print "Success!" if either of them is equal to 10 or if the sum is. If not, print "Failure!".
//6.b make 3 integer variables named x, y and z. Print "Success!" if their sum is 30, but none of them may have the value of 10, 20 or 30. Otherwise print "Failure!".

//Make 2 int variables

int a = 20;
int b = 10;
int x = 12;
int y = 14;
int z = 4;

if (a == 10 && b == 10 || a - b == 10) {
  println("Succes");
} else {
  print("failure");
}

//My 3 new variables sum 30 = succes, 10-20-30 failure

if (x == 10 || x == 20 || x == 30) {
  print("failure");
} else if (y == 10 || y == 20 || y == 30) {
  print("failure");
} else if (z == 10 || z == 20 || z == 30) {
  print("failure");
} else if (x + y + z == 30) {
  print("SUCCES");
}
