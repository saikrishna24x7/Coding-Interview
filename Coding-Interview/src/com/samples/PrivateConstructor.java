package com.samples;

public class PrivateConstructor
{
	private PrivateConstructor() {
		System.out.println("Q");
	}
	
	static class A {
        private A() {
        }
    }

    static class B extends A {
    	public B() {
    	}
    }
    
	public static void main(String[] args) {
		new B();
	}

}
