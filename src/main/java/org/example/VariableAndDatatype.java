package org.example;

public class VariableAndDatatype {
    public static void main(String[]args){

        int a=100; //declaration + assigning the value
        System.out.println(a);

        int b,c,d;
        b=20;
        c=30;
        d=40;

        System.out.println(b+c+d);

     // if diff data type
        int df=43;
        String fg ="hello";
        int gf=56;

        System.out.println(df+gf);
        System.out.println(fg);

        // same data type different value
          int rf,tg,yh;
          rf=65;
          tg=54;
          yh=76;

        System.out.println(rf+tg+yh);

        // 3rd approach
        int gb=54,hn=65,jm=78;
        System.out.println("The total value:"+ (gb+hn+jm));  // for total value of multiple variables
        System.out.println("The concatenated value of all the variables:"+ gb+hn+jm); // concatenation

    }



}
