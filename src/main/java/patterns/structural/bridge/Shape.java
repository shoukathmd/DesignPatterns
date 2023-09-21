package patterns.structural.bridge;

public abstract class Shape {

    protected DrawingApi drawingApi;

    public Shape(DrawingApi drawingApi) {
        this.drawingApi = drawingApi;
    }

    public abstract void draw();
}
