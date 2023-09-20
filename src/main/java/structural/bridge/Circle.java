package structural.bridge;

public class Circle extends Shape{
    int x;
    int y;
    public Circle(int x, int y, DrawingApi drawingApi) {
        super(drawingApi);
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        drawingApi.drawCircle(x, y);
    }
}
