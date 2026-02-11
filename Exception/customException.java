class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class InvalidEvenNumber extends RuntimeException{
    public InvalidEvenNumber(String message){
        super(message);
    }
}

public class customException{
    public static void main(String[] args) {
        try {
            checkAge(10);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            checkEvenNumber(31);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    //checked exception because we extends the exception so we neccessarly used throws keyword
    public static void checkAge(int n) throws InvalidAgeException{
        if(n>18){
            System.out.println("Valid Age");
        }
        else{
            throw new InvalidAgeException("Enter the valid Age");
        }
    }

    //Unchecked exception 
     public static void checkEvenNumber(int n){
        if(n%2==0){
            System.out.println("It's a Even number");
        }
        else{
            throw new InvalidEvenNumber("Enter the valid Even number");
        }
    } 

}