import java.util.InputMismatchException;

public class Passenger {
    private String firstName;
    private String lastName;


    public Passenger(String firstName, String lastName) {
        try{
        this.firstName = firstName;
        this.lastName = lastName;
        } catch(InputMismatchException error){
            System.out.println("Invalid input, please enter name in words");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        try {
            this.firstName = firstName;
        } catch(InputMismatchException error){
            System.out.println("Invalid input, please enter name in words");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        try {
            this.lastName = lastName;
        } catch(InputMismatchException error){
            System.out.println("Invalid input, please enter name in words");
        }
    }


    @Override
    public String toString() {
        return String.format("Passenger: %s %s", getFirstName(), getLastName());
    }
}
