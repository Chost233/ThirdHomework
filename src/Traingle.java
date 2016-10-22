/**
 * Created by Administrator on 2016/10/22.
 */
public class Traingle extends Shape{
    public int GeaArea(int base,int heigh){
        int area = base*heigh/2;
        return area;
    }

    @Override
    public int GetArea() {
        return 0;
    }
}
