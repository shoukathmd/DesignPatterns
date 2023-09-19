package bridge;

public class DrawApiTwo implements DrawingApi{
    @Override
    public void drawCircle(int x, int y) {
        System.out.println("APITwo drawing circle X :" + x + " Y : " + y);
    }
}
