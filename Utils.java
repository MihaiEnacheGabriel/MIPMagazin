
import java.util.List;
import java.util.ArrayList;

public class Utils {
    public static List<String> Execute(List<Magazin> students)
    {
        List<String> helloMessages = new ArrayList<String>();

        for (Magazin s : students) {
            if (s.getNume() != null) {
                helloMessages.add(s.GetWelcomeMessage());
            }
        }

        return helloMessages;
    }
}