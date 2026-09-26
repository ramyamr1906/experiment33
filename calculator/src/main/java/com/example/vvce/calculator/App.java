package com.example.vvce.calculator;

/**
 * Hello world!
 */
public class App {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
    public static void main(String[] args) {
    	App app = new App();
    	System.out.println(app.add(5,  6));
    	System.out.println(app.sub(5,  6));
    }
    
}
