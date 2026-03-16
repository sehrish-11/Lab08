package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);

        // its there?
        assertTrue(list.hasCity(city));
        // shld fail
        list.deleteCity(city);
        // check if gone
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");

        // initial count 0
        assertEquals(0, list.countCities());
        // add city - count 1
        list.addCity(city);
        assertEquals(1, list.countCities());
    }
}
