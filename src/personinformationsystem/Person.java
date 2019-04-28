
package personinformationsystem;
import java.io.Serializable;

public class Person implements Serializable{

  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName){
     this.firstName = firstName;
     this.lastName = lastName;
  }

  @Override
  public String toString(){
     return getFirstName() + " " + getLastName();
  }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}