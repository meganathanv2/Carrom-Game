public class ThrowVsThrows{
    public static void main(String[] args) {
        try {
            validNumber(15);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void validNumber(int n) throws ArithmeticException{
    if(n%2==0){
        System.err.println("Number is valid");
    }
    else{
        throw new ArithmeticException("number is not valid");
    }
}
}

