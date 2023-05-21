import org.example.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    private Radio radio;

    @Before
    public void setUp() {
        radio = new Radio(5);
    }

    @Test
    public void testGetCurrentStation() {
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_ValidStation() {
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation_InvalidStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStation() {
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testNextStation_MaxStation() {
        radio.setCurrentStation(4);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        radio.setCurrentStation(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation_MinStation() {
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testGetVolume() {
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetVolume_ValidVolume() {
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());
    }

    @Test
    public void testSetVolume_InvalidVolume() {
        radio.setVolume(110);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testIncreaseVolume() {
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void testIncreaseVolume_MaxVolume() {
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        radio.setVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume_MinVolume() {
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    // ...

    @Test
    public void testSetCurrentStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationInRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testNextStationLooping() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationLooping() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setVolume(-10);

        assertEquals(0, radio.getVolume());

        radio.setVolume(110);

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testIncreaseVolumeToMaximum() {
        Radio radio = new Radio();
        radio.setVolume(99);

        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolumeToMinimum() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testIncreaseVolumeBeyondMaximum() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolumeBeyondMinimum() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetCurrentStationWithinRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        assertEquals(5, radio.getCurrentStation());
    }


    @Test
    public void testNextStationWithMaximumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationWithMinimumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void testIncreaseVolumeWithinRange() {
        Radio radio = new Radio();

        radio.setVolume(50);
        radio.increaseVolume();

        assertEquals(51, radio.getVolume());
    }

    @Test
    public void testIncreaseVolumeAtMaximum() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    public void testDecreaseVolumeWithinRange() {
        Radio radio = new Radio();

        radio.setVolume(50);
        radio.decreaseVolume();

        assertEquals(49, radio.getVolume());
    }

    @Test
    public void testDecreaseVolumeAtMinimum() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testSetCurrentStationAtMaximum() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationAtMinimum() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        assertEquals(0, radio.getCurrentStation());
    }

}

