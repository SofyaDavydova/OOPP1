import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetCurrentRadioStation() {

        radio.setСurrentRadioStation1(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationAboveMax() {

        radio.setСurrentRadioStation1(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationUnderMin() {

        radio.setСurrentRadioStation1(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationToTarget() {

        radio.setСurrentRadioStation1(9);
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

        radio.setСurrentRadioStation1(3);
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

        radio.setСurrentVolume1(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToTarget() {

        int target = 35;
        radio.setСurrentVolume1(54);

        while (radio.getCurrentVolume() != target) {
            radio.decreaseVolume();
        }

        int expected = 35;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeUnderMin() {

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {

        radio.setСurrentVolume1(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeUnderMin() {

        radio.setСurrentVolume1(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinAndMaxRadioStationDefault() {

        Assertions.assertEquals(10, radio.getAmountRadioStations());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void shouldReturnMinAndMaxRadioStationSet() {
        Radio radio = new Radio(15);

        Assertions.assertEquals(15, radio.getAmountRadioStations());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(14, radio.getMaxRadioStation());
    }
}
