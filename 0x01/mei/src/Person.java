import java.time.Year;
import java.time.YearMonth;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner, pensioner, publicServer;
    private float salary;

    public String fullName() {
        return name + " " + surname;
    }

    public float calculateYearlySalary() {
        return getSalary() * 12;
    }

    @SuppressWarnings("deprecation")
    public boolean isMEI() {
        Date dataAtual = new Date(125, 0, 1);
        birthDate = new Date(100, 0, 1);
        if (((getSalary() * 12) < 13000) &&
                ((dataAtual.getYear() - birthDate.getYear()) > 18) &&
                (anotherCompanyOwner == false) &&
                (pensioner == false) &&
                (publicServer == false)) {
                    return true;
        }
        return false;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    

}
