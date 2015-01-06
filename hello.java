class Hello {
  public static void main (String[] args){
    System.out.println("Hello World");
    double y = 1.0 / 3.0;
    System.out.println(y);
    System.out.print("Enter your name: ");
    String input = System.console().readLine();

    howdy(input);

    test("1", "2", "3");

    blastoff(5);

    System.out.println(distance(5.2, 5.5, 6.9, 12.1));

    System.out.println("factorial: " + factorial(6));

    printMultTable(6);

  }

  public static void howdy(String s){
    System.out.println("Howdy " + s);
  }

  public static void test(String one, String two, String three){
    System.out.println("First Arg "  + one);
    System.out.println("2nd Arg "  + two);
    System.out.println("3rd Arg " + three);
  }

  public static void blastoff(int n){
    if(n == 0){
      System.out.println("Blastoff!");
    } else {
      --n;
      System.out.println(n);
      blastoff(n);
    }
  }

  public static double absoluteValue(double x){
    if(x < 0 ){
      return -x;
    } else {
      return x;
    }
  }

  public static double distance(double x2, double y2, double x1, double y1){
    double dx = x2 - x1;
    double dy = y2 - y1;
    double dsquared = dx*dx+dy*dy;
    return Math.sqrt(dsquared);
  }
  public static int factorial(int num){
    if(num == 0){
      return 1;
    } else {
      return num*factorial(num-1);
    }
  }

  public static int fib(int num){
    if(num == 0 || num == 1){
      return 1;
    } else {
      return fib(num-1) + fib(num-2);
    }
  }

  public static void printMultiples(int n, int high){
    int i = 1;

    while(i <= high){
      System.out.print(n*i + "   ");
      i++;
    }
    System.out.println("");
  }

  public static void printMultTable(int high) {
    int i = 1;
    while (i <= high) {
      printMultiples(i, high);
      i = i + 1;
    }
  }
}
