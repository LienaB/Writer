import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human Arthur = new Human("Arthur" ,
                LocalDate.of(1990,8,7),
                Human.Gender.MALE , Human.BloodGroup.THIRD);
        System.out.println(Arthur.getName());

        Writer arthurWriter = new Writer();
        System.out.println(arthurWriter.getName());
    }
}
