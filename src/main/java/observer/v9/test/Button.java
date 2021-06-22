package observer.v9.test;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private List<ActionListener> actionListeners = new ArrayList<>();

    public void buttonPressed() {
        ActionEvent actionEvent = new ActionEvent(System.currentTimeMillis(), this);
        for(int i = 0; i < actionListeners.size(); i ++) {
            ActionListener actionListener = actionListeners.get(i);
            actionListener.actionPerformed(actionEvent);
        }
    }

    public void addActionListener(ActionListener actionListener) {
        actionListeners.add(actionListener);
    }
}
