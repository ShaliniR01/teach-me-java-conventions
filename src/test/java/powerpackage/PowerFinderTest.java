package powerpackage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {
        @Test
        public void shouldReturnOneWhenOneIsRaisedToOne() {

            assertEquals(1,PowerFinder.calculatePower(1,1));

        }

        @Test
        public void shouldReturnTwoWhenTwoIsRaisedToOne() {

            assertEquals(2,PowerFinder.calculatePower(2,1));

        }

        @Test
        public void shouldReturnFourWhenTwoIsRaisedToTwo() {

            assertEquals(4, PowerFinder.calculatePower(2,2));

        }

        @Test
        public void shouldReturnNineWhenThreeIsRaisedToThree() {

            assertEquals(9,PowerFinder.calculatePower(3,2));

        }
}





