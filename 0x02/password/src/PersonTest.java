

public class PersonTest {

    Person person;

    @BeforeAll
    static setup(){
        person = new Person();

    }

    @ParameterizedTest
    @ValueSource(Strings = {"PaulMcCartney2", "NeilArms2"})
    void check_user_valid(String user){
        assertTrue(person.checkUser(user));
    }

    @ParameterizedTest
    @ValueSource(Strings = {"Paul#McCartney", "Neil@Arms"})
    void check_user_not_valid(String user){
        assertFalse(person.checkUser(user));
    }
    @ParameterizedTest
    @ValueSource(Strings = {"123456789", "#$%1234"})
    void does_not_have_letters(String password){
        assertFalse(person.check_password(password));


    }
    @ParameterizedTest
    @ValueSource(Strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    void does_not_have_numbers(String password){
        assertFalse(person.check_password(password));

    }
    @ParameterizedTest
    @ValueSource(Strings = {"Abc@123", "12$@hbt"})
    void does_not_have_eight_chars(String password){
        assertFalse(person.check_password(password));
    }
    @ParameterizedTest
    @ValueSource(Strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    void check_password_valid(String password){
        assetTrue(person.check_password(password));
    }
}
