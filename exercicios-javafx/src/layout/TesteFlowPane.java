package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

    public TesteFlowPane(){
        Quadrado q1 = new Quadrado(i * 10);
        Quadrado q2 = new Quadrado(i * 10);
        Quadrado q3 = new Quadrado(i * 10);
        Quadrado q4 = new Quadrado(i * 10);
        Quadrado q5 = new Quadrado(i * 10);

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));

        setOrientation(Orientation.VERTICAL);
        setAlignment(Pos.CENTER_RIGHT);

        getChildren().addAll(q1, q2, q3, q4, q5);
    }
}
