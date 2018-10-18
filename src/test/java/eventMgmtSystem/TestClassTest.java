package eventMgmtSystem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestClassTest {

	@InjectMocks
	private TestClass sut;
	
	@Test
	public void test() {
		assertThat(2).isEqualTo(2);
	}
	
}
