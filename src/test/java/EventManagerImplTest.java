import static org.junit.Assert.fail;

import java.time.LocalDateTime;

import org.junit.Test;

import ems.domain.Event;

public class EventManagerImplTest {

	@Test
	public void testBuild() {
		fail("Not yet implemented");
	}

	@Test
	public void test_CreateFailIfDateNotInFuture() {
		Event event = new Event(//
				LocalDateTime.now().plusDays(1), //
				LocalDateTime.now().plusDays(2), //
				"organizer", "Erstes Event", "Beispiel...");
		

		fail("Not yet implemented");
	}
	

}
