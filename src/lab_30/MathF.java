package lab_30;

public class MathF {
    static int pow(int number, int degree){
        int result = 1;
        for(int i = 0; i<degree; i++){
            result*=number;
        }
        return result;
    }

    static int factorial(int number){
        if (number<=0) {
            return 1;
        }
        int result=1;
        for(int i=1; i<=number; i++){
            result*=i;
        }
        return result;
    }
}