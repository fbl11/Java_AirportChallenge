import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AirportTest {
    private Airport subjectUnderTest;
    private Plane somePlane = new Plane(); // no need to mock object if no methods are called on it
//    @Mock
//    private Plane mockPlane;


    @BeforeEach
    void setUp() {
        subjectUnderTest = new Airport();
    }

    @Test
    void clearForLanding_givenCalledWithPlane_thenAddsPlaneToPlaneList() {
//        Airport airport = new Airport();  use SetUp instead
        subjectUnderTest.clearForLanding(somePlane);
        assertEquals(Collections.singletonList(somePlane), subjectUnderTest.getPlaneList());
    }

    @Test
    void clearForTakeOff_givenCalledWithPlane_thenRemovesPlaneFromPlaneList() {
//        subjectUnderTest.setPlaneList(new LinkedList<>(Collections.singletonList(somePlane)));
        subjectUnderTest.clearForLanding(somePlane);
        subjectUnderTest.clearForTakeOff(somePlane);
        assertEquals(Collections.emptyList(), subjectUnderTest.getPlaneList());
    }
}