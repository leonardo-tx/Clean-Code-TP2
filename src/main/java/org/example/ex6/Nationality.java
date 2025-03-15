package org.example.ex6;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public enum Nationality {
    UNCLASSIFIED(new Color[] { Color.GRAY }),
    BELGIAN(new Color[] { Color.BLACK, Color.YELLOW, Color.RED }),
    DUTCH(new Color[] { Color.RED, Color.WHITE, Color.BLUE }),
    FRENCH(new Color[] { Color.BLUE, Color.WHITE, Color.RED }),
    GERMAN(new Color[] { Color.BLACK, Color.RED, Color.YELLOW }),
    ITALIAN(new Color[] { Color.GREEN, Color.WHITE, Color.RED });

    private final Color[] colors;

    Nationality(Color[] colors) {
        this.colors = colors;
    }

    public List<Color> getFlagColors() {
        return Arrays.asList(colors);
    }
}
