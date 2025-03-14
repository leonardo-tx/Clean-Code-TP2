package org.example.ex6;

import java.util.List;
import java.awt.Color;

public class Cliente {
    public List<Color> getFlagColors(Nationality nationality) {
        return nationality.getColors();
    }
}
