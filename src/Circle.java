public class Circle {

    public int calculatePoints(float x, float y){
        double rad;
        rad = Math.sqrt((x*x)+(y*y));
        System.out.println("Radius = " +rad);

        //inner circle
        if(rad >= 0 && rad <= 1 ){
            return 10;
        }

        //middle circle
        if(rad >= 1 && rad <= 5 ){
            return 5;
        }

        //outer circle
        if(rad >= 5 && rad <= 10 ){
            return 1;
        }

        return 0;
        }


    }


