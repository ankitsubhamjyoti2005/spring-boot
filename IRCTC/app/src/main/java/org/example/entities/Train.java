package org.example.entities;

import org.checkerframework.checker.units.qual.Time;

import java.time.LocalTime;
import java.util.*;
import java.util.List;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map <String, Time> stringTime;
    private List<String> Stations;
}
