import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import ems.domain.Event;
import ems.domain.EventManager.InvalidEventException;
import ems.domain.EventManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class EventManagerImplTest {

	@InjectMocks
	private EventManagerImpl sut;// subject under test

	@Test
	public void testBuild() {
		fail("Not yet implemented");
	}

	@Test
	public void test_CreateFailIfDateNotInFuture() {
		Event event = new Event(//
				LocalDateTime.now().minusDays(2), //
				LocalDateTime.now().minusDays(1), //
				"organizer", "Erstes Event", "Beispiel...");
		try {
			sut.create(event);
			Assert.fail("Should fail");
		} catch (InvalidEventException ex) {

		}
	}
//
//	@Test
//	public void newEventMinimalByOrganizer() {
//		Event resultEvent = sut.newEvent(LocalDateTime.now().plusDays(1), //
//				LocalDateTime.now().plusDays(2), //
//				"organizer");
//
//		assertThat(resultEvent).isNotNull();
//	}

}
