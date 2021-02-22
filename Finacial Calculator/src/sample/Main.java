package sample;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    public static void main (String[]args){
        launch(args);

    }

    public static void show() {

        //----------Creating new stage-----------//

        Stage Main = new Stage();
        StackPane root = new StackPane();
        root.setId("pane");


        //---------AnchorPane for main page-----------//

        AnchorPane a1 = new AnchorPane();

        //---------------Anchor pane for sub page------------//

        AnchorPane aP1 = new AnchorPane();

        //------------------setting stage------------------//

        Main.setTitle("Financial Calculator");
        Scene scene = new Scene(root, 800, 600);
        Main.setScene(scene);
        Main.show();

        //----------Create a label----------//

        Label lb1 = new Label("Financial Calculator");
        lb1.setLayoutX(220);
        lb1.setLayoutY(150);
        lb1.setStyle("-fx-text-alignment: center;" + "-fx-font: 100px Tahoma;" +"-fx-font-size: 40;" + "-fx-text-fill:white;");


        //--------------create begin button---------------//

        Button beginButton = new Button();
        beginButton.setText("Begin");
        beginButton.setLayoutX(310);
        beginButton.setLayoutY(240);
        beginButton.setStyle("-fx-background-color:midnightblue;" + "-fx-text-fill:whitesmoke;" + "-fx-font-size: 20;" + "-fx-border-color: white;" + "-fx-pref-height: 40;" + "-fx-pref-width: 150;");

        //---------------Set on action for begin button-----------------//

        beginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().add(aP1);
                FadeTransition hideEditorRootTransition = new FadeTransition(Duration.millis(500), a1);
                hideEditorRootTransition.setFromValue(1.0);
                hideEditorRootTransition.setToValue(0.0);
                FadeTransition showFileRootTransition = new FadeTransition(Duration.millis(500), aP1);
                showFileRootTransition.setFromValue(0.0);
                showFileRootTransition.setToValue(1.0);
                hideEditorRootTransition.play();
                showFileRootTransition.play();
            }
        });

        //--------------create help button---------------//

        Button aboutButton = new Button();
        aboutButton.setText("About");
        aboutButton.setLayoutX(310);
        aboutButton.setLayoutY(310);
        aboutButton.setStyle("-fx-background-color:midnightblue;" + "-fx-text-fill:whitesmoke;" + "-fx-font-size: 20;" + "-fx-border-color: white;" + "-fx-pref-height: 40;" + "-fx-pref-width: 150;");

        //--------------Set on action for help button----------------//

        aboutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                About.root6();
                Main.close();
            }
        });

        //----------label----------//

        Label lb2 = new Label("Select Calculator");
        lb2.setLayoutX(250);
        lb2.setLayoutY(80);
        lb2.setStyle("-fx-text-alignment: center;" + "-fx-font: 100px Tahoma;" +"-fx-font-size: 40;" + "-fx-text-fill:white;");

        //------------------Image-----------------------------//

        Image image = new Image("file:image9.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);
        a1.getChildren().addAll(img,beginButton, aboutButton, lb1);
        root.getChildren().add(a1);

        //--------------create back button---------------//

        Button backBtn = new Button();
        backBtn.setLayoutX(320);
        backBtn.setLayoutY(360);
        backBtn.setStyle("-fx-background-color:midnightblue;" + "-fx-text-fill:whitesmoke;" + "-fx-font-size: 20;" + "-fx-border-color: white;" + "-fx-pref-height: 40;" + "-fx-pref-width: 150;");
        Image imgI = new Image("file:icon.png");
        ImageView view = new ImageView(imgI);
        view.setFitHeight(30);
        view.setPreserveRatio(true);
        backBtn.setGraphic(view);

        //--------------Set on action for back button----------------//

        backBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override

            public void handle(ActionEvent event) {

                FadeTransition hideFileRootTransition = new FadeTransition(Duration.millis(500), aP1);
                hideFileRootTransition.setFromValue(1.0);
                hideFileRootTransition.setToValue(0.0);

                FadeTransition showEditorRootTransition = new FadeTransition(Duration.millis(500), a1);
                showEditorRootTransition.setFromValue(0.0);
                showEditorRootTransition.setToValue(1.0);

                showEditorRootTransition.play();
                hideFileRootTransition.play();
                root.getChildren().remove(aP1);
            }
        });

        //--------------create savings button---------------//

        Button savingBtn = new Button("Savings ");
        savingBtn.setLayoutX(240);
        savingBtn.setLayoutY(200);
        savingBtn.setStyle("-fx-background-color:midnightblue;" + "-fx-text-fill:whitesmoke;" + "-fx-font-size: 20;" + "-fx-border-color: white;" + "-fx-pref-height: 40;" + "-fx-pref-width: 150;");

        //--------------Set on action for finance button----------------//

        savingBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Savings.root1();
                Main.close();
            }
        });

        //--------------create mortgage button---------------//

        Button mortgageBtn = new Button("Mortgage");
        mortgageBtn.setLayoutX(410);
        mortgageBtn.setLayoutY(200);
        mortgageBtn.setStyle("-fx-background-color:midnightblue;" + "-fx-text-fill:whitesmoke;" + "-fx-font-size: 20;" + "-fx-border-color: white;" + "-fx-pref-height: 40;" + "-fx-pref-width: 150;");


        //--------------Set on action for mortgage button----------------//

        mortgageBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Mortgage.root2();
                Main.close();
            }
        });

        //--------------create loan button---------------//

        Button loanBtn = new Button("Loan");
        loanBtn.setLayoutX(240);
        loanBtn.setLayoutY(280);
        loanBtn.setStyle("-fx-background-color:midnightblue;" + "-fx-text-fill:whitesmoke;" + "-fx-font-size: 20;" + "-fx-border-color: white;" + "-fx-pref-height: 40;" + "-fx-pref-width: 150;");


        //--------------Set on action for loan button----------------//

        loanBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Loan.root3();
                Main.close();
            }
        });

        //--------------create compound button---------------//

        Button compoundBtn = new Button("Compound");
        compoundBtn.setLayoutX(410);
        compoundBtn.setLayoutY(280);
        compoundBtn.setStyle("-fx-background-color:midnightblue;" + "-fx-text-fill:whitesmoke;" + "-fx-font-size: 20;" + "-fx-border-color: white;" + "-fx-pref-height: 40;" + "-fx-pref-width: 150;");

        //--------------Set on action for compound button---------------//

        compoundBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                CompoundInterest.root4();
                Main.close();
            }
        });

        //------------------Adding background image-----------------------------//

        Image image1 = new Image("file:image9.jpg");
        ImageView img1 = new ImageView(image1);
        img1.setFitHeight(600);
        img1.setFitWidth(800);
        Group rt2 = new Group();
        rt2.getChildren().addAll(img1);

        //-------------------Returns the childrens of the pane------------------//

        aP1.getChildren().addAll(img1,backBtn, savingBtn, mortgageBtn, loanBtn, compoundBtn, lb2);

    }


    @Override
    //--------------Launch the Application----------------//
    public void start(Stage primaryStage) throws Exception {
        Main.show();
    }
}