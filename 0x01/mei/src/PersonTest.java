


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mei.Person;

public class PersonTest {

    
    public Person p = new Person();


    @SuppressWarnings("deprecation")
    @BeforeAll
    public void setup(){
       // Person p = new Person();
        p.setName("Paul");
        p.setSurname("McCartney");
        p.setBirthDate(new Date(100,0,1));
        p.setAnotherCompanyOwner(true);
        p.setPensioner(true);
        p.setPublicServer(true);
    }

    @Test
    public void show_full_name(){
       assertEquals("Paul McCartney", p.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        p.setSalary(1200);
        assertEquals(14400, p.calculateYearlySalary() );
    }

    @Test
    public void person_is_MEI(){
        p.setPublicServer(false);
        p.setPensioner(false);
        p.setAnotherCompanyOwner(false);
        p.setSalary(1000);
        assertTrue(p.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        p.setPublicServer(true);
        assertFalse(p.isMEI());
    }
}
