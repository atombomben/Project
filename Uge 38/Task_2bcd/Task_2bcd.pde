//Task 2BCD
void setup() {
 kappa1(5, 5);
 println(kappa1(5,5));
 String gerr2 = kappa2("nyhederne");
 String g = "jesper";
 println(gerr2);
 kappa3(g);

}


int kappa1 (int herr, int gerr) {
  
  
  return herr + gerr;
}

String kappa2 (String gerrzan) {
  
  return gerrzan.toUpperCase();
}

boolean kappa3(String gerrr) {
  if (Character.isUpperCase(gerrr.charAt(0)) == true) {
    println("true");
    return true;
  } else {
    println("false");
    return false;
  }
}
  
