package ru.netology.RadioJ10.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStationNumber;


    public Radio(int currentStationNumber) {
        this.maxStation = minStation + currentStationNumber - 1;
        this.currentStationNumber = maxStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStation) {
            return;
        }
        if (currentStationNumber < minStation) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void next() {
        if (currentStationNumber < maxStation) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStation;
        }
    }

    public void prev() {
        if (currentStationNumber > minStation) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStation;
        }
    }
}

