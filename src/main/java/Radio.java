import lombok.Data;

@Data

public class Radio {
    private int currentRadioStation; // текущая радиостанция
    private int currentVolume; // текущий уровень громкости
    private int amountRadioStations = 10; // количество радиостанций
    private int minRadioStation; // минимальный номер радиостанции
    private int maxRadioStation; // максимальный номер радиостанции

    public Radio(int size) {
        this.amountRadioStations = size;
        this.maxRadioStation = size - 1;
    }

    public Radio(){
        this.maxRadioStation = getAmountRadioStations() - 1;
    }

      // установка номера радиостанции вручную

    public void setСurrentRadioStation1(int newCurrentRadioStation) {
        if (newCurrentRadioStation < getMinRadioStation()) {
            return;
        }
        if (newCurrentRadioStation > getMaxRadioStation()) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    // установка уровня звука вручную
    public void setСurrentVolume1(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

        // переключение на следующую станцию
    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    // переключение на предыдущую станцию
    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    // увеличение звука на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    // уменьшение звука на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
