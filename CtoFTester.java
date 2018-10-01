public class CtoFTester{

  public static double celsiusToFahrenheit(double celsius){
    return celsius*1.8+32;
  }

  public static double fahrenheitToCelsius(double fahrenheit){
    return (fahrenheit-32)/1.8;
  }

  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(0));//32
    System.out.println(celsiusToFahrenheit(100));//212
    System.out.println(celsiusToFahrenheit(-40));//-40

    System.out.println(fahrenheitToCelsius(32));//0
    System.out.println(fahrenheitToCelsius(212));//100
    System.out.println(fahrenheitToCelsius(-40));//-40
  }
}
