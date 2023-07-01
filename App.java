import java.util.ArrayList;
import java.util.List;

import com.play.*;
import com.quizz.Quizz;
public class App {
    public static void main(String[] args){
        Quizz test = new Quizz(2.5, 2);
        System.out.println(test);
        System.out.println(test.getNiveau());
        System.out.println(test.difficulte);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question());
    }   
}
