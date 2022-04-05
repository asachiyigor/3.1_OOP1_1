//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.domain;

public class Radio {
    private int maxStationNumber = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStationNumber = 0;
    private int currentVolume = 0;

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getMaxStationNumber() {
        return this.maxStationNumber;
    }

    public int getCurrentStationNumber() {
        return this.currentStationNumber;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber <= this.maxStationNumber) {
            if (newCurrentStationNumber >= 0) {
                this.currentStationNumber = newCurrentStationNumber;
            }
        }
    }

    public void next() {
        if (this.currentStationNumber == this.maxStationNumber - 1) {
            this.setCurrentStationNumber(0);
        } else {
            this.setCurrentStationNumber(this.currentStationNumber + 1);
        }

    }

    public void prev() {
        if (this.currentStationNumber == this.maxStationNumber) {
            this.setCurrentStationNumber(this.maxStationNumber - 1);
        } else {
            this.setCurrentStationNumber(this.currentStationNumber - 1);
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= this.maxVolume) {
            if (newCurrentVolume >= this.minVolume) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public void volumeUp() {
        if (this.currentVolume < 100) {
            ++this.currentVolume;
        }

    }

    public void volumeDown() {
        if (this.currentVolume > 0) {
            --this.currentVolume;
        }

    }

    public Radio() {
    }

    public Radio(int maxStationNumber, int minVolume, int maxVolume, int currentStationNumber, int currentVolume) {
        this.maxStationNumber = maxStationNumber;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentStationNumber = currentStationNumber;
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

}
