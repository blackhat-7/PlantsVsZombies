package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.text.Font;

//import javafx.*;
//import javafx.scene.*;
import javafx.scene.control.Label;
//import java.awt.*;
import java.io.FileInputStream;

public class GameMenu extends Application {

    private int sunCount=0;

    public ImageView imageGetter(String s) throws Exception{
        FileInputStream fl=new FileInputStream(s);
        Image img=new Image(fl);
        ImageView image = new ImageView(img);
        return image;
    }
    public void location_setter(ImageView image,double x,double y){
        image.setX(x);
        image.setY(y);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Pane root = new Pane();
        Scene s = new Scene(root, 1012, 785, Color.BLACK);

        Canvas canvas = new Canvas(1012, 785);
        GraphicsContext gc = canvas.getGraphicsContext2D();


        ImageView image = imageGetter("src/sample/images/menu.jpg");
        ImageView image1 = imageGetter("src/sample/images/adv.png");
        ImageView image2 = imageGetter("src/sample/images/adv2.png");
        ImageView BGimg = imageGetter("src/sample/images/mainBG.png");
        ImageView cherry_card = imageGetter("src/sample/images/card_cherrybomb.png");
        ImageView pea_card = imageGetter("src/sample/images/card_peashooter.png");
        ImageView ice_pea_card = imageGetter("src/sample/images/card_freezepeashooter.png");
        ImageView sun_card = imageGetter("src/sample/images/card_sunflower.png");
        ImageView wallnut_card = imageGetter("src/sample/images/card_wallnut.png");
        ImageView me = imageGetter("src/sample/images/me.jpg");
        ImageView quit = imageGetter("src/sample/images/quit.png");
        ImageView quit2 = imageGetter("src/sample/images/quit2.png");
        ImageView help = imageGetter("src/sample/images/help.png");
        ImageView help2 = imageGetter("src/sample/images/help2.png");
        ImageView instructions = imageGetter("src/sample/images/inst.jpg");

        ImageView save = imageGetter("src/sample/images/sav.jpg");
        ImageView sav_quit = imageGetter("src/sample/images/sav_quit.png");
        ImageView sav_quit2 = imageGetter("src/sample/images/sav_quit2.png");
        ImageView return_to_game = imageGetter("src/sample/images/return_to_game.png");
        ImageView return_to_game2 = imageGetter("src/sample/images/return_to_game2.png");

        Label label1 = new Label(Integer.toString(sunCount));
        label1.setTextFill(Color.web("#ff0000", 0.8));
        label1.setLayoutX(60);
        label1.setLayoutY(80);

        location_setter(image1,510,100);
        location_setter(image2,510,100);
        location_setter(quit,882,567);
        location_setter(quit2,882,567);
        location_setter(help,797,545);
        location_setter(help2,797,545);

//        Listener for MouseClick
        image1.setOnMouseEntered(e ->{
            root.getChildren().add(image2);
        });
        image2.setOnMouseExited(e1 ->{
            root.getChildren().remove(image2);
        });
        image2.setOnMouseClicked(e -> {
            Pane root1 = new Pane();
            Scene s1 = new Scene(root1, 1000, 752, Color.BLACK);
            location_setter(cherry_card,110,10);
            location_setter(pea_card,200,10);
            location_setter(ice_pea_card,290,10);
            location_setter(sun_card,380,10);
            location_setter(wallnut_card,470,10);
            location_setter(me,855,0);

            root1.getChildren().addAll(BGimg,canvas,cherry_card,pea_card,ice_pea_card,sun_card,wallnut_card,label1,me);


            pea_card.setOnMouseClicked(e1 ->{
                location_setter(sun_card,600,10);
                sunCount++;
                label1.setText(Integer.toString(sunCount));


            });
            me.setOnMouseClicked(e1 ->{
                stage.setScene(s);


            });

            stage.setScene(s1);
        });
        quit.setOnMouseEntered(e ->{
            root.getChildren().add(quit2);
        });
        quit2.setOnMouseExited(e1 ->{
            root.getChildren().remove(quit2);
        });
        quit2.setOnMouseClicked(e2 ->{
//            stage.set
            Stage stage2=new Stage();
            Pane root2 = new Pane();
            Scene s2 = new Scene(root2, 676, 388, Color.BLACK);
            location_setter(sav_quit,150,200);
            location_setter(return_to_game,150,100);
            location_setter(sav_quit2,150,200);
            location_setter(return_to_game2,150,100);

            sav_quit.setOnMouseEntered(e ->{
                root2.getChildren().add(sav_quit2);
            });
            sav_quit2.setOnMouseExited(e1 ->{
                root2.getChildren().remove(sav_quit2);
            });
            return_to_game.setOnMouseEntered(e ->{
                root2.getChildren().add(return_to_game2);
            });
            return_to_game2.setOnMouseExited(e1 ->{
                root2.getChildren().remove(return_to_game2);
            });
            sav_quit2.setOnMouseClicked(e ->{
                stage2.close();
                stage.close();
            });
            return_to_game2.setOnMouseClicked(e ->{
                stage2.close();
            });
            root2.getChildren().addAll(save,sav_quit,return_to_game);
            stage2.setScene(s2);
            stage2.show();
        });
        help.setOnMouseEntered(e ->{
            root.getChildren().add(help2);
        });
        help2.setOnMouseExited(e1 ->{
            root.getChildren().remove(help2);
        });

        help2.setOnMouseClicked(e2 ->{
//            stage.set
            Stage stage2=new Stage();
            Pane root2 = new Pane();
            Scene s2 = new Scene(root2, 960, 640, Color.BLACK);
            location_setter(sav_quit,150,200);
            location_setter(return_to_game,150,100);

            instructions.setOnMouseClicked(e ->{
                stage2.close();
            });
            root2.getChildren().addAll(instructions);
            stage2.setScene(s2);
            stage2.show();
        });


        root.getChildren().addAll( image,image1,quit,help);

        stage.setScene(s);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
