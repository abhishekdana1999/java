import java.util.*;

class Rectangle {
    public int length , bredth , area;

    Rectangle(int length , int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public int calculate_Area(int length , int bredth) {
        int area = length * bredth;
        return(area);
    }
}


class Cube extends Rectangle {
    public int height , volume;

    Cube(int length , int bredth , int height) {
        super(length , bredth);
        this.height = height;
        
    }

    public int calculate_Vol() {
        return(length*bredth*height);
    }

    public static void main(String args[]){
        Cube c1 = new Cube(10 , 20 , 30);

        int res = c1.calculate_Area(10,20);
        int res1 = c1.calculate_Vol();

        System.out.println("Area Of Rectange : " +res);
        System.out.println("Volume Of Cube : "+res1);
    }
}