public class Converting {
    private   double num = 0 ;
    final double parsec = 3.240779289444365e-17;
    final double lightYear=1.0570008340246154e-16;
    final double lightMin = 5.5594015866358675e-11;
    final double lightSec = 3.3356409519815204e-9;
    Converting(){}
    Converting(double num){
        this.num =num;
    }

    public void convert(){
        double n1= num *parsec;
        double n2 = num *lightYear;
        double n3 = num *lightMin;
        double n4 = num *lightSec;
        System.out.println("в "+ num +"м є "+n1+"парсеків");
        System.out.println("в "+ num +"м є "+n2+"світлових років ");
        System.out.println("в "+ num +"м є "+n3+"світлових хвилин");
        System.out.println("в "+ num +"м є "+n4+"світлових секунд");
    }
    public void convert(final double NUM){
        double n1= NUM*parsec;
        double n2 = NUM*lightYear;
        double n3 = NUM*lightMin;
        double n4 = NUM*lightSec;
        System.out.println("в "+NUM+"м є "+n1+"парсеків");
        System.out.println("в "+NUM+"м є "+n2+"світлових років ");
        System.out.println("в "+NUM+"м є "+n3+"світлових хвилин");
        System.out.println("в "+NUM+"м є "+n4+"світлових секунд");
    }







}
