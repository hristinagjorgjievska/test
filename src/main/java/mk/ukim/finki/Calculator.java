package mk.ukim.finki;

public class Calculator{

    public double divide(double a, double b){
        return a/b;
    }

    public int calculateIntInterval(int from, int to){
        int total = 0;
        for (int i = from; i < to; i++){
            total += i;
        }
        return total;
    }
}