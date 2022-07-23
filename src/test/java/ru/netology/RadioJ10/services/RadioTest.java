package ru.netology.RadioJ10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        radio.next();

        int actual = radio.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToZeroStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.next();

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);

        radio.prev();

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToZeroStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prev();

        int actual = radio.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNoMoreLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustNotBeLessThanTheFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
