/* 
    To demonstrate Operators - Arithmetic
*/
class Program9 {
   public static void main(String [] args) {
       int x = 10;
       int y = 20;
       int add = x + y;
       System.out.println("Addition of " + x + " + " + y + " = " + add);

       int sub = y - x;
       System.out.println("Subtraction of " + y + " - " + x + " = " + sub);

       int mul = x * y;
       System.out.println("Multiplication of " + x + " * " + y + " = " + mul);

       int div = y / x;
       System.out.println("Division of " + y + " / " + x + " = " + div);

       int modoper = y % 2;
       System.out.println("Modulo Operation of " + y + " % 2" + " = " + modoper);

       System.out.println("Post Increment of " + x + " is " + x++);
       System.out.println("Pre Increment of " + x + " is " + ++x);

       System.out.println("Post Decrement of " + y + " is " + y--);
       System.out.println("Pre Decrement of " + y + " is " + --y);

       x += 1;   //  x = x + 1
       y -= 10;  // y = y - 10
       x *= 2; // x = x * 2
       y /= 2; // y = y / 2
       
       System.out.println("+= Operator " + x);
       System.out.println("-= Operator " + y);
       System.out.println("*= Operator " + x);
       System.out.println("/= Operator " + y);

   }
}