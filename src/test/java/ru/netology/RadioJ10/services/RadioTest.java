package ru.netology.RadioJ10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

//    @Test
//    public void shouldSetVolume() {
//        Radio volume = new Radio();
//
//        volume.setCurrentVolume(5);
//
//        int expected = 5;
//        int actual = volume.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//
//    }

//    @Test
//    public void shouldSetToMaxVolume() {
//        Radio volume = new Radio();
//
//        volume.setToMaxVolume();
//
//        int expected = 10;
//        int actual = volume.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
