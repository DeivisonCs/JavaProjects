package learning.test.app.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinMessage {
    @Autowired
    private FinTeam finT;

    @Override
    public String toString() {
        return "Name: " + finT.getName() +
                "\nEmail: " + finT.getEmail() +
                "\nTopic: " + finT.getTopic();
    }
}
