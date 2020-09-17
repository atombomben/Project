void setup() {
  function1();
  function2("Mikkel");
  function3("Peter", 25);
}
  
  
  void function1() {
    println("Hvem");
    println("  ");
    println("er");
  }
  
  void function2(String input) {
    println(input);
  }
  
  void function3(String name, int age) {
    println("My name is " + name + ", I am " + age + " years old");
  }
