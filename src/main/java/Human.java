import java.time.LocalDate;

public class Human implements HumanWriter{
    private String name;
    private LocalDate birthDate;
    public enum Gender { MALE , FEMALE };
    private Gender gender;
    public enum BloodGroup {FIRST , SECOND, THIRD , FOURTH};
    private BloodGroup bloodGroup;

    public Human() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }
    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Human(String name, LocalDate birthDate, Gender gender, BloodGroup bloodGroup) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public LocalDate birthday() {
        return null;
    }

    @Override
    public Gender gender() {
        return null;
    }
}
