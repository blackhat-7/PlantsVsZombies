package sample;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.effect.Light;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
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
import java.awt.*;
import java.io.FileInputStream;

public class GameMenu extends Application {

    private int sunCount=0;
    private int lan_count=0;

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
        ImageView initial = imageGetter("src/sample/images/initial.png");
        ImageView image = imageGetter("src/sample/images/menu.jpg");
        ImageView image1 = imageGetter("src/sample/images/adv.png");
        ImageView image2 = imageGetter("src/sample/images/adv2.png");
        ImageView BGimg = imageGetter("src/sample/images/mainBG.png");
        ImageView cherry_card = imageGetter("src/sample/images/card_cherrybomb.png");
        ImageView pea_card = imageGetter("src/sample/images/card_peashooter.png");
        ImageView ice_pea_card = imageGetter("src/sample/images/card_freezepeashooter.png");
        ImageView sun_card = imageGetter("src/sample/images/card_sunflower.png");
        ImageView wallnut_card = imageGetter("src/sample/images/card_wallnut.png");
        ImageView cherry_card2 = imageGetter("src/sample/images/card_cherrybomb2.png");
        ImageView pea_card2 = imageGetter("src/sample/images/card_peashooter2.png");
        ImageView ice_pea_card2 = imageGetter("src/sample/images/card_freezepeashooter2.png");
        ImageView sun_card2 = imageGetter("src/sample/images/card_sunflower2.png");
        ImageView wallnut_card2 = imageGetter("src/sample/images/card_wallnut2.png");

        ImageView me = imageGetter("src/sample/images/me.jpg");
        ImageView me2 = imageGetter("src/sample/images/me2.jpg");
        ImageView quit = imageGetter("src/sample/images/quit.png");
        ImageView quit2 = imageGetter("src/sample/images/quit2.png");
        ImageView help = imageGetter("src/sample/images/help.png");
        ImageView help2 = imageGetter("src/sample/images/help2.png");
        ImageView instructions = imageGetter("src/sample/images/inst.jpg");
        ImageView lm = imageGetter("src/sample/images/LM.png");
        ImageView lm1 = imageGetter("src/sample/images/LM.png");
        ImageView lm2 = imageGetter("src/sample/images/LM.png");
        ImageView lm3 = imageGetter("src/sample/images/LM.png");
        ImageView lm4 = imageGetter("src/sample/images/LM.png");


        ImageView save = imageGetter("src/sample/images/sav.jpg");
        ImageView sav_quit = imageGetter("src/sample/images/sav_quit.png");
        ImageView sav_quit2 = imageGetter("src/sample/images/sav_quit2.png");
        ImageView return_to_game = imageGetter("src/sample/images/return_to_game.png");
        ImageView return_to_game2 = imageGetter("src/sample/images/return_to_game2.png");

        ImageView sunflower = imageGetter("src/sample/images/sunflower.gif");

        ImageView enter = imageGetter("src/sample/images/enter.png");
        location_setter(enter,340,465);
        ImageView enter2 = imageGetter("src/sample/images/enter2.png");
        location_setter(enter2,340,465);

        Pane inroot=new Pane();
        Scene in_s = new Scene(inroot, 800, 600, Color.BLACK);
        TextField tf = new TextField("please enter username");
        tf.setLayoutX(340);
        tf.setLayoutY(100);
        enter.setOnMouseEntered(e ->{
            inroot.getChildren().add(enter2);

        });
        enter2.setOnMouseExited(e1 ->{
            inroot.getChildren().remove(enter2);
        });
        enter2.setOnMouseClicked(f ->{
            Pane root = new Pane();
            Scene s = new Scene(root, 1012, 785, Color.BLACK);



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

            location_setter(lm,0,120);
            location_setter(lm1,0,250);
            location_setter(lm2,0,360);
            location_setter(lm3,0,480);
            location_setter(lm4,0,600);

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

                location_setter(cherry_card2,110,10);
                location_setter(pea_card2,200,10);
                location_setter(ice_pea_card2,290,10);
                location_setter(sun_card2,380,10);
                location_setter(wallnut_card2,470,10);



                cherry_card.setOnMouseEntered(e2 ->{
                    root1.getChildren().add(cherry_card2);
                });
                cherry_card2.setOnMouseExited(e1 ->{
                    root1.getChildren().remove(cherry_card2);
                });
                pea_card.setOnMouseEntered(e3 ->{
                    root1.getChildren().add(pea_card2);
                });
                pea_card2.setOnMouseExited(e1 ->{
                    root1.getChildren().remove(pea_card2);
                });
                ice_pea_card.setOnMouseEntered(e4 ->{
                    root1.getChildren().add(ice_pea_card2);
                });
                ice_pea_card2.setOnMouseExited(e1 ->{
                    root1.getChildren().remove(ice_pea_card2);
                });
                sun_card.setOnMouseEntered(e2 ->{
                    root1.getChildren().add(sun_card2);
                });
                sun_card2.setOnMouseExited(e1 ->{
                    root1.getChildren().remove(sun_card2);
                });
                wallnut_card.setOnMouseEntered(e2 ->{
                    root1.getChildren().add(wallnut_card2);
                });
                wallnut_card2.setOnMouseExited(e1 ->{
                    root1.getChildren().remove(wallnut_card2);
                });

                location_setter(me,855,0);
                location_setter(me2,855,0);

                root1.getChildren().addAll(BGimg,cherry_card,pea_card,ice_pea_card,sun_card,wallnut_card,label1,me,lm,lm1,lm2,lm3,lm4);


                me.setOnMouseEntered(e2 ->{
                    root1.getChildren().add(me2);
                });
                me2.setOnMouseExited(e1 ->{
                    root1.getChildren().remove(me2);
                });
                me2.setOnMouseClicked(e1 ->{
                    stage.setScene(s);


                });

//                BGimg.setOnMouseClicked(e2 ->{
//
//                    root1.getChildren().remove(sunflower);
//
//                    location_setter(sunflower,e2.getSceneX(),e2.getScreenY());
//                    root1.getChildren().add(sunflower);
//                    System.out.println(e2.getSceneX()+" "+e2.getSceneY());
//                });


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

        });
        stage.setScene(in_s);
        inroot.getChildren().addAll(initial,tf,enter);

        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
