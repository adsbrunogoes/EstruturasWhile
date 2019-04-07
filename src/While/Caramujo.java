
package While;

public class Caramujo {
    public static void main(String[] args) {
    double altura = 0;
    int dias = 0;
    while (altura < 21){
        dias += +1;
        altura += +4;
        if (altura < 21){
            altura = altura - 1.5;
        }
    }System.out.println(dias);
    
    }
}
