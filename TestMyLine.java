import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
       
       // Constructors
        MyLine l1 = new MyLine(2, 2, 2, 2);
        System.out.println(l1);

        MyPoint begin1 = new MyPoint(1, 2);
        MyPoint end1 = new MyPoint(1, 2);
        MyLine l2 = new MyLine(begin1, end1);
        System.out.println(l2);

        // getBegin and setBegin 
        System.out.println("l1 begin: " + l1.getBegin());
        MyPoint newBegin = new MyPoint(3, 3);
        l1.setBegin(newBegin);
        System.out.println("l1 new begin: " + l1.getBegin());

        // getEnd and setEnd
        System.out.println("l1 end: "+ l1.getEnd());
        MyPoint newEnd = new MyPoint(4, 4);
        l1.setEnd(newEnd);
        System.out.println("l1 new end: "+ l1.getEnd());

        // getBeginX, setBeginX, getBeginY, setBeginY
        System.out.println("l1 begin X: "+ l1.getBeginX());
        l1.setBeginX(5);
        System.out.println("l1 new begin X: "+l1.getBeginX());

        System.out.println("l1 begin Y:"+ l1.getBeginY());
        l1.setBeginY(6);
        System.out.println("l1 new begin Y:"+l1.getBeginY());

        // getEndX, setEndX, getEndY, setEndY

        System.out.println("l1 begin X: "+ l1.getEndX());
        l1.setEndX(7);
        System.out.println("l1 new begin X: "+l1.getEndX());

        System.out.println("l1 begin Y:"+ l1.getEndY());
        l1.setEndY(8);
        System.out.println("l1 new begin Y:"+l1.getEndY());

        // getBeginXY, setBeginXY, getEndXY, setEndXY
        System.out.println("l1 begin XY:"+ l1.getBeginXY());
        l1.setBeginXY(9, 9);
        System.out.println("l1 new begin XY: "+ Arrays.toString(l1.getBeginXY()));

        System.out.println("l1 end XY:"+ l1.getEndXY());
        l1.setEndXY(10, 10);
        System.out.println("l1 new begin XY: "+ Arrays.toString(l1.getEndXY()));

        // getLength and getGradient

        System.out.println("l1 length: " +l1.getLength());
        System.out.println("l1 gradient: " +l1.getGradient());

        // toString

        System.out.println("l1 toString: "+ l1.toString());















        

        




       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // MyPoint begin = new MyPoint(1, 1);
        // MyPoint end = new MyPoint(1, 1);

        // System.out.println(begin);
        // System.out.println(end);

        // MyLine line1 = new MyLine(begin, end);
        // System.out.println(line1);


    }
}
