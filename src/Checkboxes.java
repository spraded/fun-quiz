import java.util.ArrayList;

public class Checkboxes extends Question {

    private ArrayList<Integer> choices = new ArrayList<>();

    public Checkboxes(int pointValue, String text) {
        super(pointValue, text);
    }

    @Override
    public void displayAnswers() {

    }

    @Override
    public int getAnswers() {
        return 0;
    }
}
