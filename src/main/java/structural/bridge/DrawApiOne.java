package structural.bridge;

public class DrawApiOne implements DrawingApi{
    @Override
    public void drawCircle(int x, int y) {
        System.out.println("APIOne drawing circle X :" + x + " Y : " + y);
    }
}
