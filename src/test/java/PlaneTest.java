import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class PlaneTest {
    private Plane subjectUnderTest;

    @Mock
    private Airport mockAirport;

    @BeforeEach
    void setUp() {
        initMocks(this);  // Mocks need to be initialised when testing their methods
        subjectUnderTest = new Plane();
    }

    @Test
    void land_givenAirportIssuesClearForLanding_thenIsSuccessful() {
        when(mockAirport.clearForLanding(subjectUnderTest)).thenReturn(true);
        Boolean result = subjectUnderTest.land(mockAirport);
        verify(mockAirport).clearForLanding(subjectUnderTest);
        assertEquals(true, result);
    }

    @Test
    void takeOff_givenAirportIssuesClearForTakeoff_thenIsSuccessful() {
        when(mockAirport.clearForTakeOff(subjectUnderTest)).thenReturn(true);
        Boolean result = subjectUnderTest.takeOff(mockAirport);
        verify(mockAirport).clearForTakeOff(subjectUnderTest);
        assertEquals(true, result);
    }
}

// what's Springrunner?