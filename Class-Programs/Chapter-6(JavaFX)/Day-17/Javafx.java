package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class Javafx extends Application 
{
    TextField t1, t2;
    Label l;
    @Override
    public void start(Stage stage) throws Exception 
    {
        GridPane grid=new GridPane();
        t1=new TextField();
        t2=new TextField();
        Button b=new Button("Add");
        b.setOnAction(new Handler());
        l=new Label("Result");
        //Adding all controls in the rows 
        grid.addRow(0, t1);
        grid.addRow(1, t2);
        grid.addRow(2, b);
        grid.addRow(3, l);
        //Creating Scene Object
        Scene scene=new Scene(grid, 300, 300);       //width and height are 300
        stage.setScene(scene);
        stage.show();
    }
    class Handler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent t) {
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            l.setText("Sum="+(n1+n2));
        }
        
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
