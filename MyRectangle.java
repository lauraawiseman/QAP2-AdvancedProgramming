public class MyRectangle {
    private MyPoint topLeft = new MyPoint(0, 0);
    private MyPoint bottomRight = new MyPoint(0, 0);

    // Constructers
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight)
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

   // Getters and setters
    public void setTopLeft(MyPoint topLeft)
    {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) 
    {
        this.bottomRight = bottomRight;
    }

    public int getWidth()
    {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }
    
    public int getHeight()
    {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getArea()
    {
        return getWidth() * getHeight();
    }

    public int getPerimeter()
    {
        return 2 * (getWidth() * getHeight());
    }

    public String toString(){
        return "Rectangle:[TopLeft="+topLeft + ", BottomRight="+ bottomRight +"]";
    }
};

