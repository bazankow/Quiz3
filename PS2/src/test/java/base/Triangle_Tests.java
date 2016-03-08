package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Tests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Triangle t = new Triangle(5,6,7);
		assertTrue(t.getPerimeter()==5+6+7);
		double per = (5+6+7)/2;
		assertTrue(t.getArea()==Math.pow(per*(per-5)*(per-6)*(per-7),0.5));
		
		Triangle t2 = new Triangle(6,4,8);
		assertTrue(t2.getPerimeter()==6+4+8);
		per = (6+4+8)/2;
		//System.out.println(t2.getArea());
		//System.out.println(Math.pow(per*(per-2)*(per-4)*(per-8),0.5));
		assertTrue(t2.getArea()==Math.pow(per*(per-6)*(per-4)*(per-8),0.5));
		
	}

}
