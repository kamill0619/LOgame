package moja.logame;

import java.util.ArrayList;

public class LOInfo {
    private ArrayList top;
    private ArrayList left;

    public LOInfo() {
    }
    public LOInfo(LOGrid loGrid) {
        generateLOInfo(loGrid);
    }

    private void generateLOInfo(LOGrid loGrid) {
    }

    public ArrayList getTop() {
        return top;
    }

    public void setTop(ArrayList top) {
        this.top = top;
    }

    public ArrayList getLeft() {
        return left;
    }

    public void setLeft(ArrayList left) {
        this.left = left;
    }
}
