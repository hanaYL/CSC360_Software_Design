import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HPersonTest {

	HPerson min;
	HPerson lee;
	HPerson lou;
	HPerson hong;

	@BeforeEach
	void setUp() throws Exception {
		
		min = new HPerson("Yoongi", "Min", 30);
		lee = new HPerson("Hyein", "Lee", 15);
		lou = new HPerson("YaLing", "Lou", 22);
		hong = new HPerson("Eunchae", "Hong", 17);
		
	}

	@Test
	void testToString() {
		assertEquals("HelloPerson: Yoongi Min, 30", min.toString());
	}
	
	@Test
	void testPerson() {

		assertThrows(UnderAgeException.class, 
				()->{
					lee.makePerson(min);
				});
		
		assertThrows(UnderAgeException.class, 
				()->{
					hong.makePerson(lee);
				});

		HPerson child;
		try {
			child = lou.makePerson(min);
			
			assertEquals(lou.getName(), child.getName());
			assertEquals(min.getSurname(), child.getSurname());
			assertEquals(0, child.getAge());
			
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("There was an error :(");
		}
	}

}
