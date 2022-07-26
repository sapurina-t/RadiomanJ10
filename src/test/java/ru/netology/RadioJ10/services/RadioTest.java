package ru.netology.RadioJ10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest{

    @Test
    public void constructorStationOptions() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(29, radio.getCurrentStationNumber());

        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStationNumber());

        radio.prev();
        Assertions.assertEquals(29, radio.getCurrentStationNumber());
    }

    Radio radio = new Radio();
    @Test
    public void shouldIncreaseVolumeOverMax() {
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMin() {
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOverMin() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToTheNextStation() {
        radio.setCurrentStationNumber(8);

        radio.next();

        int actual = radio.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToZeroStationNext() {
        radio.setCurrentStationNumber(9);

        radio.next();

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePreviousStation() {
        radio.setCurrentStationNumber(1);

        radio.prev();

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToZeroStationPrev() {
        radio.setCurrentStationNumber(0);

        radio.prev();

        int actual = radio.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNoMoreLastStation() {
        radio.setCurrentStationNumber(10);

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustNotBeLessThanTheFirstStation() {
        radio.setCurrentStationNumber(-1);

        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
