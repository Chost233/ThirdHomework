/**
 * Created by Administrator on 2016/10/22.
 */
public class Square extends Shape {

    public int GerArea(int sideLength){
        int area = (int) Math.pow(sideLength,2);
        return area;
    }

    @Override
    public int GetArea() {
        return 0;
    }
}
