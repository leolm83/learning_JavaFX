package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			int largura=800;
			int altura=400;
			Group root =new Group();
			Scene scene = new Scene(root,largura,altura,Color.DEEPSKYBLUE);
			Stage stage = new Stage();
			
			Text text =new Text();
			text.setText("MEU TEXTO Está APARECENDO !!!!");
			text.setX(50);
			text.setY(50);
			text.setFont(Font.font("Verdana",25));
			text.setFill(Color.LIMEGREEN);
			
			Line line = new Line();
			line.setStartX(200);
			line.setStartY(200);
			line.setEndX(500);
			line.setEndY(200);
			//tamanho da linha
			line.setStrokeWidth(5);
			//cor da linha
			line.setStroke(Color.CRIMSON);
			//opacidade da linha
			line.setOpacity(0.5);
			//rotacionar a linha
			line.setRotate(45);
			
			//-----------------RETANGULO
			
			
			Rectangle rectangle = new Rectangle();
			//posicao
			rectangle.setX(100);
			rectangle.setY(100);
			//tamanho
			rectangle.setWidth(200);
			rectangle.setHeight(200);
			//preenchimento
			rectangle.setFill(Color.DARKORANGE);
			
			//alguns metodos possiveis no retangulo:
			//tamanho da "borda"
			rectangle.setStrokeWidth(10);
			//cor da "borda"
			rectangle.setStroke(Color.THISTLE);
			//rotacao do retangulo
			rectangle.setRotate(45);
			//opacidade do triangulo
			rectangle.setOpacity(0.1);
			
			
			//-----------------TRIANGULO
			
			
			Polygon triangle = new Polygon();
			triangle.getPoints().setAll(
					425.0,200.0,//primeiro ponto(necessario serem double)
					350.0,350.0,
					500.0,350.0
					);
			triangle.setFill(Color.YELLOW);
			
			/*---------------Eixo X
			 * 
			 * 
			 E 
			 I 
			 X 
			 O
			 *
			 Y
			 */
			
			
			//-----------------Circulo
			Circle circle =new Circle();
			circle.setCenterX(400);
			circle.setCenterY(200);
			circle.setRadius(100);
			circle.setFill(Color.AQUAMARINE);
		
			//-----------------IMAGEM
			Image image = new Image("logo.png");
			ImageView imageView = new ImageView(image);
			imageView.setX(700);
			imageView.setY(30);
			
			root.getChildren().add(imageView);
			root.getChildren().add(circle);
			root.getChildren().add(triangle);
			root.getChildren().add(rectangle);
			root.getChildren().add(text);
			root.getChildren().add(line);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
