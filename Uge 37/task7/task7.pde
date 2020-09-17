/*7.a create an integer called input and assign it a value of 20. use a loop to print the value and all values from there, until it reaches 0, with the following exceptions:
 if the number is 6, instead print the string "six".
 Once the number is half of the input value, print "HALF!"
 7.b Run exercise 7.a again with a different input value and make sure it still works. You should also consider if it will work with a negative input, e.g. -20.*/


//Changed input for 7B, Confused about negative

int input = 40;
int half = input/2;

for (int e = input; e >= 0; e--)
{
  if (e == 6)
  {
    println("six");
  }
    else if (e == half)
    {
      println("half");
    }
  else
  {
    println(e);
  }
}
