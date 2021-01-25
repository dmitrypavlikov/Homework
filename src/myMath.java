public class myMath {
    private myMath(){}
    private static final myMath instance = new myMath();
    public static myMath getInstance(){
        return instance;
    }
    public static Double exponentiation(Double a, Double b){
        Double n = 1.0;
        for(int i = 0; i < b; i++) {
            n = n * a;
        }
        return n;
    }
    public static Double factorial(Double a){
        Double n = 1.0;
        for(int i = 1; i < a+1; i++) {
            n = n * i;
        }
        return n;
    }
    public void myMathInfo(){
        System.out.println("It works!");
    }

}
