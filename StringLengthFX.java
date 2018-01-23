import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.util.List;

import javafx.application.Application;
public class StringLengthFX extends Application{

	public static void main(String[] args) {
		launch(args);
		
	}
	
	@Override
	public void start(Stage stage)
	{
		stage.setTitle("Ali Youssef 4.20");
		TextField txt = new TextField();
		Button btn = new Button();
		Label lbl = new Label();
		Label lbl2 = new Label();
		btn.setText("Enter");
		btn.setOnAction(new EventHandler<ActionEvent>()
				{
				@Override
				public void handle(ActionEvent event)
				{
					String input = txt.getText();
					int count = 0;
					for(int i = 0; i<input.length(); i++)
				      {
				         
				         count++;
				      }
					lbl.setText(input + " is " + count + " characters long");
					lbl2.setText("The first character is: " + input.charAt(0));		
				   
					System.out.println(count);
				}
			
				});
				
		GridPane root = new GridPane();
		root.add(btn, 2, 0);
		root.add(txt, 1, 0);
		root.add(lbl, 1, 3);
		root.add(lbl2, 1, 4);
		stage.setScene(new Scene(root, 400, 400));
		stage.show();
	}
	
	
	

}
