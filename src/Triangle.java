public class Triangle
{
    public static double a;
    public static double b;
    public static double c;

    Triangle(){
        System.out.println("введіть 3 значення для певних формул 2 остадніх можуть бути кутами залежить від формули ");
    }
    Triangle(double a,double b, double c){
        System.out.println("введіть 3 значення для певних формул 2 остадніх можуть бути кутами залежить від формули ");
        Triangle.a =a; // звернувся до змінної через назву класу тому, що змінні є статичними
        Triangle.b =b;
        Triangle.c =c;
    }

    public static void areaThreeSide(){
        double p = (a+b+c)*0.5;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(S);
    }
    public static void areaThreeSide(double  a1,double b1,double c1){
        double p = (a1+b1+c1)*0.5;
        double S = Math.sqrt(p*(p-a1)*(p-b1)*(p-c1));//)))))))))))))))))))))))))))))))cheating
        System.out.println(S);
    }
    public static void area2Side1Cut(){
        double S = 0.5*a * b * Math.toRadians(c);
        System.out.println(S);

    }
    public static void area2Side1Cut(double a,double b, double y){
        double S = 0.5*a * b * Math.toRadians(y);
        System.out.println(S);

    }
















}

