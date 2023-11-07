public class Rectangle
{
    private double d1;private double d2;private double alpha;
    private double a;private double b;private double c;private double d; private double beta;
    Rectangle(){}

    Rectangle(double a, double b, double alp){
        this.d1 = a;
        this.d2 = b;
        this.alpha = alp;
    }

    private double areaDiag(){
        double S = Math.toRadians(alpha)*d2*d1*0.5;
        System.out.println(S);
        return S;}
    public void getArea(){
        double f = areaDiag();
        System.out.println(f);
    }
    private double areaDiag(double d1,double d2,double alpha){
        double S = Math.toRadians(alpha)*d2*d1*0.5;
        return S;
    }

    public void getArea(double d1,double d2,double alpha){
        double f = areaDiag(d1,d2,alpha);
        System.out.println(f);
    }







    Rectangle(double a ,double b,double c,double d,double alp ,double bet){
        this.a=a; this.b=b; this.c=c; this.d=d; this.alpha=alp; this.beta=bet;
    }

    private double areaFourSide(){
        double cut = Math.toRadians((alpha+beta)*0.5);
        double p = (a+b+c+d)*0.5;
        double S = Math.sqrt((p-a)*(p-b)*(p-c)*(p-d)-((a*b*c*d)*Math.pow(Math.cos(cut),2)));
        return S;
    }
    public void getAreaFourSide(){
        double f = areaFourSide();
        System.out.println(f);
    }


    private double areaFourSide(double a ,double b,double c,double d,double alpha ,double beta){
        double cut = Math.toRadians((alpha+beta)*0.5);
        double p = (a+b+c+d)*0.5;
        double S = Math.sqrt((p-a)*(p-b)*(p-c)*(p-d)-((a*b*c*d)*Math.pow(Math.cos(cut),2)));
        return S;
    }

    public void getAreaFourSide(double a ,double b,double c,double d,double alpha ,double beta){
        double f = areaFourSide( a , b, c, d, alpha ,beta);
        System.out.println(f);
    }



    public double getAlpha() {
        return alpha;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
}
