/**package personinformationsystem;

import java.util.*;
import java.io.*;

public class TestPerson{
  public static void main (String [] aaaarghs){
    Person [] thePerson = new Person[8];

    thePerson[0] = new Person("Willy", "Wonka");
    thePerson[1] = new RegisteredPerson("Veruca", "Salt", "ABCD1234");
    thePerson[2] = new RegisteredPerson("Charlie", "Bucket", "1234ABCD");
    thePerson[3] = new Person("Mike", "TeeVee");
    thePerson[4] = new Person("Arthur", "Slugworth");
    thePerson[5] = new Person("Violet", "Beauregarde");
    thePerson[6] = new RegisteredPerson("Augustus", "Gloop", "JDIEWFDLJS");
    thePerson[7] = new RegisteredPerson("Grandpa", "Joe", "FHDJEH2343");

    for(Person p : thePerson){
      System.out.println(p.toString());
    }

    String fileName;
    System.out.print("Please enter file name: ");
    Scanner s = new Scanner(System.in);
    fileName = s.nextLine();

    try{
      ObjectOutputStream oout 
        = new ObjectOutputStream(new FileOutputStream(fileName));
      for(Person p: thePerson){
        oout.writeObject(p);
      }
      oout.close();

      Person [] newPerson = new Person[8];
      
      ObjectInputStream oin
        = new ObjectInputStream(new FileInputStream(fileName));
      
      Object buffer;
      for(int i = 0; i < 8; i++){
         buffer = oin.readObject();
         if ( buffer.getClass().equals(RegisteredPerson.class)){
            newPerson[i] = (RegisteredPerson) buffer;
         }
         else{
            newPerson[i] = (Person) buffer;
         }
       }

       System.out.println();
       System.out.println("FROM FILE: ");
       for(Person p : newPerson){
          System.out.println(p.toString());
       }
       

    }
    catch (Exception e){
      System.out.println(e.toString());
    }

  }
}**/