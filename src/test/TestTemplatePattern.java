import templatepattern.Bouilli;
import templatepattern.DodishTemplate;
import templatepattern.EggsWithTomato;

public class TestTemplatePattern {
    public static void main(String[] args) {
        DodishTemplate eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("-----------------------------");

        DodishTemplate bouilli = new Bouilli();
        bouilli.dodish();



    }
}
