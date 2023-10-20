package org.example;

import java.util.ArrayList;
import java.util.List;

public class PaintingsList<T> {

    private List<T> paintings = new ArrayList<>();

    public void addPaintings(T painting) {
        List<T> paintings = this.getPaintings();
        paintings.add(painting);
    }

    public List<T> getPaintings() {
        return paintings;
    }

    public void setPaintings(List<T> paintings) {
        this.paintings = paintings;
    }
}
