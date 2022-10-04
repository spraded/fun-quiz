import java.util.ArrayList;

public class MultipleChoice extends Question {


    public MultipleChoice(int pointValue, String text, ArrayList<Integer> choices) {
        super(pointValue, text);
        ArrayList<Integer> choices1 = new ArrayList<>();
        choices = choices1;
    }

    @Override
    public void displayAnswers() {

    }

    @Override
    public int getAnswers() {
        return 0;
    }
}
