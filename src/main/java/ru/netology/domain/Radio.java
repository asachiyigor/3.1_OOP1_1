package ru.netology.domain;

public class Radio {

    private int maxStationNumber = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStationNumber = 0;
    private int currentVolume = 0;
    private boolean on;

    public Radio() {

    }

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStationNumber(int NewCurrentStationNumber) {
        if (NewCurrentStationNumber > (maxStationNumber - 1)) {
            return;
        }
        if (NewCurrentStationNumber < 0) {
            return;
        }
        this.currentStationNumber = NewCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber == (maxStationNumber - 1)) {
            setCurrentStationNumber(0);
        } else {
            setCurrentStationNumber(currentStationNumber + 1);
        }
    }

    public void prev() {
        if (currentStationNumber == maxStationNumber) {
            setCurrentStationNumber(maxStationNumber);
        } else {
            setCurrentStationNumber(currentStationNumber - 1);
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }
}
