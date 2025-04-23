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

    // получение минимального номера радиотсанции
    public int getMinRadioStation() {
        return minRadioStation;
    }

    // получение максимального номера радиостанции
    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    // получение текущего количества радиостанций
    public int getAmountRadioStations() {
        return amountRadioStations;
    }

        // переключение на следующую станцию
    public void next() {
        if (currentRadioStation < getMaxRadioStation()) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = getMinRadioStation();
        }
    }

    // переключение на предыдущую станцию
    public void prev() {
        if (currentRadioStation > getMinRadioStation()) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = getMaxRadioStation();
        }
    }

    // получение текущей температуры
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // установка номера радиостанции вручную
    public void setСurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < getMinRadioStation()) {
            return;
        }
        if (newCurrentRadioStation > getMaxRadioStation()) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    // получение текущего уровня звука
    public int getCurrentVolume() {
        return currentVolume;
    }

    // установка уровня звука вручную
    public void setСurrentVolume(int newCurrentVolume) {
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
