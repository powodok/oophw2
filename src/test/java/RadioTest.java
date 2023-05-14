import org.example.Radio;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    public void setCurrentStation_ValidStation_SetsCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation_InvalidStation_DoesNotSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int expected = 0; // currentStation should not be changed
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation_CurrentStationIsNine_SetsCurrentStationToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation_CurrentStationIsNotNine_IncreasesCurrentStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation_CurrentStationIsZero_SetsCurrentStationToNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation_CurrentStationIsNotZero_DecreasesCurrentStationByOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume_ValidVolume_SetsVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume_InvalidVolume_DoesNotSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(-10);

        int expected = 0; // volume should not be changed
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume_InvalidVolume_DoesNotExceedMaximumVolume() {
        Radio radio = new Radio();
        radio.setVolume(150);

        int expected = 0; // volume should not exceed maximum value
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume_VolumeIsMaximum_DoesNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100; // volume should not increase beyond maximum
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume_VolumeIsMinimum_DoesNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0; // volume should not decrease below minimum
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume_VolumeIsPositive_DecreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume_VolumeIsZero_DoesNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0; // volume should remain zero
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume_MaximumVolume_SetsVolumeToMaximum() {
        Radio radio = new Radio();
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume_VolumeIsBelowMaximum_IncreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void setVolume_NegativeVolume_DoesNotSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(-50);

        int expected = 0; // volume should not be changed
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume_VolumeIsZero_IncreasesVolumeToMinimum() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume_VolumeIsGreaterThanZero_DecreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentStation_InvalidNegativeStation_DoesNotSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0; // currentStation should not be changed
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation_InvalidGreaterStation_DoesNotSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0; // currentStation should not be changed
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }







}
