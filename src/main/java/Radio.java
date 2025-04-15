public class Radio {
    private int currentRadioStation; // текущая радиостанция
    private int currentVolume; // текущий уровень громкости

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

    // получение текущей температуры
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // установка номера радиостанции вручную
    public void setСurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    // получение текущего уровня звука
    public int getCurrentVolume() {
        return currentVolume;
    }

    // установка уровня звука вручную
    public void setСurrentVolume (int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
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
