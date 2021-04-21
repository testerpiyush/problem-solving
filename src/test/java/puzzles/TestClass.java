/*
package puzzles;

import java.util.Stack;

public class TestClass {

  public static void main(String[] args) {

    findProfit("[(])");
  }


   public static void findProfit(String a){

     Stack<Character> stack =

     for(int i=0;i<a.length();i++){

       if(a.charAt(i)=='[' || a.charAt(i)=='{' || a.charAt(i)=='('){

         stack.push(a.charAt(i));

       }

       switch (a.charAt(i)){

         case ')':
           if(stack.pop()==(')')) {
             stack.pop();
           }
           break;
         case '}':
           if(stack.pop()==('}')) {
             stack.pop();
           }
           break;
         case ']':
           if(stack.pop()==(']')) {
             stack.pop();
           }
           break;
       }






     }
     if (stack.isEmpty()) {
       System.out.println("Balanced");
     } else {
       System.out.println("Not Balanced");
     }





   }
}
*/
