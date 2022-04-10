//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int maxStationNumber = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStationNumber = 0;
    private int currentVolume = 0;

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
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
}
