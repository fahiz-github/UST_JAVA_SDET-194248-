package com.ust.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyClass {
	
	int a1=10;
	int a2=10;

	@Test
	public void testCube(){  
        assertEquals(27,MyClass.cube(3));
        System.out.println("test case cube");  

    }
	
	@Test
	public void add(){  
        assertEquals(15,MyClass.add());
        System.out.println("test case add");  

    }
	
	
	@Test
	public void same(){  
        assertSame(a1,a2);
        System.out.println("test case same");  

    }

}
