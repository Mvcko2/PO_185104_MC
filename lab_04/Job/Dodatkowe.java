package Job;
import Human.Person;

public class Dodatkowe {
    public void testAccess() {
        Person person = new Person();
        // System.out.println(person.privateField);        //Brak dostępu
        // System.out.println(person.packagePrivateField); //Brak dostępu
        // System.out.println(person.protectedField);      //Brak dostępu
        System.out.println(person.publicField);            //Dostęp możliwy
    }
}