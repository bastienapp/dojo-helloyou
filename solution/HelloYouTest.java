import junit.framework.*;
import org.junit.Test;

public class HelloYouTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testTacos() throws Exception {
		assertEquals("Hello Tacos", HelloYou.sayHello("Tacos"));
	}

    @Test
	public void testUser() throws Exception {
		assertEquals("Hello User", HelloYou.sayHello(""));
	}
}
