// Use // to comment
/* Slash * also works. End w StarBackwardsSlash*/
public class lesson{
  public static void main(String agrs[]){
//Above is the main function.
    System.out.println("Learning FUNCTIONS");
//A function gives
    System.out.println("Main function is- public static void main(String args[]){}");
    sayHello();
/*when writing sayHello();, the computer checks if there is a sayHello command which is below.*/
//Addition
    addnum(3, 4);
//Subtraction
    int a = getDifference(39, 13);
    System.out.println(a);
//Division
    int b = divideNum(8751, 3);
    System.out.println(b);
//Add String
    String c = addString("Hello", " Goodbye  ;)");
    System.out.println(c);
  }


//Helper string function.
  public static void sayHello(){
    System.out.println("Hello");
  }
//Helper addition function
  public static void addnum(int x, int y){
    System.out.println(x + y);
  }
//Helper subtract function.
  public static int getDifference(int a, int b){
  return a-b;
/*Return gives the getDifference a new value.Don't type anything after return.*/
  }
//Helper divide function.
  public static int divideNum(int a, int b){
    return a/b;
  }
//
  public static String addString(String a, String b){
    return a+b;
  }
}
