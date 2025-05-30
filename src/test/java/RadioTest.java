import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setСurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setСurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setСurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationToTarget() {
        Radio radio = new Radio();

        radio.setСurrentRadioStation(9);
        int target = 6;

        while (radio.getCurrentRadioStation() != target) {
            radio.next();
        }

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationToTarget() {
        Radio radio = new Radio();

        radio.setСurrentRadioStation(3);
        int target = 5;

        while (radio.getCurrentRadioStation() != target) {
            radio.prev();
        }

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToTarget() {
        Radio radio = new Radio();

        int target = 30;

        while (radio.getCurrentVolume() != target) {
            radio.increaseVolume();
        }

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setСurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToTarget() {
        Radio radio = new Radio();

        int target = 35;
        radio.setСurrentVolume(54);

        while (radio.getCurrentVolume() != target) {
            radio.decreaseVolume();
        }

        int expected = 35;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeUnderMin() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setСurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setСurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
