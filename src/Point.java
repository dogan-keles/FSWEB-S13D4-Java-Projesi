public class Point {
    private int x ;
    private int y ;
    public Point (int x,int y){
        this.x = x ;
        this.y = y ;

    }
    public int getX (){

        return x ;
    }
    public int getY (){

        return y ;
    }
    public void setX (int x){

        this.x = x ;
    }
    public void setY (int y){

        this.y = y;
    }

    public double distance () {
        return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
    }
    public double distance (Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    public double distance ( int a , int b ){
        return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
    }
}