package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	//essa variavel precisa ter o valor do id no scenebuilder!!
	@FXML
	private Circle myCircle;
	private double circleX;
	private double circleY;
	public void up(ActionEvent e) {
		myCircle.setCenterY(circleY-=10);
		
	}
	public void right(ActionEvent e) {
		myCircle.setCenterX(circleX+=10);
		
	}
	public void down(ActionEvent e) {
		myCircle.setCenterY(circleY+=10);
	}
	public void left(ActionEvent e) {
		myCircle.setCenterX(circleX-=10);
		
	}
}
