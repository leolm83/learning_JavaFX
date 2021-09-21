package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,Color.AQUA);
			
			//obtem imagem para ser o icone
			Image icon = new Image("logo.png");
			//altera o icone para ser a imagem 
			stage.getIcons().add(icon);
			
			//altera o titulo da janela
			stage.setTitle("First Program with Java FX");
			//altera as dimensoes do stage
			stage.setWidth(450);
			stage.setHeight(450);
			//nao deixa aumentar ou diminuir a janela
			stage.setResizable(false);
			
			//posicionamento do stage na tela 
			//stage.setX(50);//eixo horizontal
			//stage.setY(500);//eixo vertical
			
			//deixa o stage em full screen
			stage.setFullScreen(true);
			stage.setFullScreenExitHint("TEXTO EXIBIDO PARA SAIR DO FULL SCREEN (Aperte Q para sair!!)");
			//alterar a tecla para sair do full screen(a padrao é ESC)
			stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
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
