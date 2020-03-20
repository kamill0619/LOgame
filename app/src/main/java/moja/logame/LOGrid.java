package moja.logame;

import java.io.File;

public class LOGrid {
    private boolean[][] lo_grid;
    private int width;
    private int length;

    public LOGrid() {
    }

    public LOGrid(File file){
        genFromFile(file);
    }

    private void genFromFile(File file) {
    }

    public boolean[][] getLo_grid() {
        return lo_grid;
    }

    public void setLo_grid(boolean[][] lo_grid) {
        this.lo_grid = lo_grid;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }




}
