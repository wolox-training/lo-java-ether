package wolox.training;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class TrainingApplicationTests {

	@Test
	void contextLoads() {
	}

	/*@Test
	public void givenNullString_whenCheckNotNullWithMessage_throwsException () {
		String nullObject = null;
		String message = "Please check the Object supplied, it's null!";

		assertThatThrownBy(() -> Preconditions.checkNotNull(nullObject,message))
				.isInstanceOf(NullPointerException.class)
				.hasMessage(message).hasNoCause();
	} */

}
