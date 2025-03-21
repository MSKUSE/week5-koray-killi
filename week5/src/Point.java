public class Point {


    // Order: Constructor -> Setter and Getter -> Methods -> String
    // Things we have learned in this class: 'new' identifier, constructors, Object Orianted Paradigms' Essentials, UML
    public int xCoord, yCoord;

    public Point(){
        this.xCoord = 0;
        this.yCoord = 0;
    }
    public Point(int x, int y){
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point(int x) {
        this.xCoord = x;
        this.yCoord = x;
    }

    /*
    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }*/
}
