public class Main {
  public static void main(String[] args) {
    String func = args[0];
    int a = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    Calculator calc = new Calculator();

    switch(func) {
      case "add":
        System.out.println(calc.add(a, b));
        break;
      case "subtract":
        System.out.println(calc.subtract(a, b));
        break;
      case "multiply":
        System.out.println(calc.multiply(a, b));
        break;
      case "divide":
        System.out.println(calc.divide(a, b));
        break;
      case "fib":
        System.out.println(calc.fibonacciNumberFinder(a));
        break;
      case "binary":
        System.out.println(calc.intToBinaryNumber(a));
        break;
    }
  }
}
