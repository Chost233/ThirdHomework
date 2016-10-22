/**
 * Created by Administrator on 2016/10/22.
 */
public  class Circle extends Shape{

    public int GetArea(int radius) {
        int area = (int) (4*Math.PI*(Math.pow(radius,2)));
        return area;
    }

    @Override
    public int GetArea() {
        return 0;
    }
}
