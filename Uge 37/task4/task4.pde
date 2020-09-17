//print out numbers 0-20

for (int number = 0; number <= 20; number++)
{
  println(number);
}

for (int k = 0; k <= 20; k+=2) {
  println(k);
}

//while loop 0-20

int p = 0;

while (p <= 20)
{
  if (p % 2 == 0)
  {
    println(p);
  }
  p += 1;
}
