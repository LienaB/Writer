import java.time.LocalDate;

public interface HumanWriter {
    String name();
    LocalDate birthday();
    Human.Gender gender();
}
