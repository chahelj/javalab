// Custom exception for wrong age
class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

// Custom exception for son age problem
class SonAgeException extends Exception {
    public SonAgeException(String message) {
        super(message);
    }
}

// Base class Father
class Father {
    protected int fatherAge;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative!");
        }
        this.fatherAge = age;
        System.out.println("Father's age is set to: " + fatherAge);
    }
}

// Derived class Son
class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException, SonAgeException {
        super(fatherAge); // Call Father constructor
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative!");
        }
        if (sonAge >= fatherAge) {
            throw new SonAgeException("Son's age cannot be greater than or equal to Father's age!");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is set to: " + sonAge);
    }
}

// Main class to test
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Son s = new Son(50, 25); // Valid ages
        } catch (WrongAgeException e) {
            System.out.println("WrongAgeException caught: " + e.getMessage());
        } catch (SonAgeException e) {
            System.out.println("SonAgeException caught: " + e.getMessage());
        }

        System.out.println("\nTesting invalid cases...");

        try {
            Son s2 = new Son(-5, 10); // Invalid father age
        } catch (WrongAgeException e) {
            System.out.println("WrongAgeException caught: " + e.getMessage());
        } catch (SonAgeException e) {
            System.out.println("SonAgeException caught: " + e.getMessage());
        }

        try {
            Son s3 = new Son(40, 50); // Son age >= father age
        } catch (WrongAgeException e) {
            System.out.println("WrongAgeException caught: " + e.getMessage());
        } catch (SonAgeException e) {
            System.out.println("SonAgeException caught: " + e.getMessage());
        }
    }
}
