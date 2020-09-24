//4.a Write a method that takes in an integer as a parameter and prints all values 
//between 0 and 100 that are divisible by the parameter received.


//4AB

int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

void setup() {

  arrayNumber(10);
  println(arr[Kappa]);
  printNumber(10);
  fibunacciSequence(1, 1);
}

void arrayNumber(int j) {

  for (int i = 1; i <= 100; i++) {
    if (i % j == 0) {
      println(i);
    }
  }
}

//4C

int Kappa = int(random(arr.length));


//4D 

void printNumber (int i) {
  println(i);
  i --;
  if (i < 0) {
    return;
  }
  printNumber(i);
}

//4E

void fibunacciSequence(int a, int b) {
  println(a + "\t" + b + "\t" + (a + b));
  int c = b;
  b = b + a;
  a = c;
  if (a < 10000) {
    fibunacciSequence(a, b);
  }
}
