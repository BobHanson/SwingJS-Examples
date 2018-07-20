package com.example.lambda;

/**
 * @author MikeW
 */
public class RunnableTest {
    public void test2() {};
	public static void main(String[] args) {
    
    System.out.println("=== RunnableTest ===");
    
    // Anonymous Runnable
    Runnable r1 = new Runnable(){
      
      @Override
      public void run(){
        System.out.println("Hello world one!");
      }
    };
    
    System.out.println("run r1");
    r1.run();
    
    // Lambda Runnable
    Runnable r2 = () -> {
    	System.out.println("Hello world two!");
    	System.out.println("Hello world three!");
    };
    
    System.out.println("run r2");
    r2.run();

    // Lambda Runnable
    r2 = () ->System.out.println("Hello world 2b!");
    
    System.out.println("run r2b");
    r2.run();

  }
}
