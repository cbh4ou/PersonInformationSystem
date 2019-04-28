
package personinformationsystem;

import java.io.Serializable;

public class RegisteredPerson extends Person implements Serializable {

  private String govID;
  
  public RegisteredPerson(String firstName, String lastName, String govID){
     super(firstName, lastName);
     this.govID = govID;
  }

  @Override
  public String toString(){
      return getFirstName() + " " + getGovID();
  }

    /**
     *
     * @return
     */
    
  
    public String getGovID() {
        return govID;
    }

    /**
     * @param govID the govID to set
     */
    public void setGovID(String govID) {
        this.govID = govID;
    }

    
}