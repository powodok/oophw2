package org.example;

public class Radio {
    private int currentStation;
    private int volume;
    private int totalStations;

    public Radio() {
        this.totalStations = 10;
    }

    public Radio(int totalStations) {
        this.totalStations = totalStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < totalStations) {
            currentStation = station;
        }
    }

    public void nextStation() {
        if (currentStation == totalStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = totalStations - 1;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
