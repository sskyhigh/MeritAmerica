package com.techelevator;

public class Television {
    private boolean check = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return check;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        check = false;
    }

    public void turnOn() {
        check = true;
    }

    public void changeChannel(int newChannel) {
        if (isOn()) {
            if (newChannel >= 3 && newChannel <= 18) {
                currentChannel = newChannel;
            }
        }
    }

    public void channelUp() {
        if (isOn()) {
            ++currentChannel; if (currentChannel > 18) {
                currentChannel = 3;
            }
        }
    }

    public void channelDown() {
        if (isOn()) {
            --currentChannel; if (currentChannel < 3) {
                currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if (isOn()) {
            if (currentVolume <= 10) {
                ++currentVolume;
            }
        }
    }

    public void lowerVolume() {
        if (isOn()) {
            if (currentVolume > 0) {
                --currentVolume;
            }
        }
    }
}
