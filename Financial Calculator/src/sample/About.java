package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class About {

    public static Pane root6() {

        //----------Creating new stage-----------//

        Stage stage = new Stage();

        //------------Label for heading------------//

        Label head =  new Label("Financial Calculator");
        head.setLayoutY(20);
        head.setLayoutX(30);
        head.setMaxWidth(550);
        head.setWrapText(true);
        head.setStyle("-fx-font: 30 Bahnschrift;"+"-fx-text-fill:white;"+"-fx-font-weight: bold;");

        //--------------Label for content------------//

        Label lb1 =  new Label("Financial calculator performs financial functions commonly needed in business and commerce communities.This Calculator includes 4 types of calculations such as Savings, Mortgage, Loan, Compound Interest Savings." );
        lb1.setLayoutY(60);
        lb1.setLayoutX(30);
        lb1.setMaxWidth(550);
        lb1.setWrapText(true);
        lb1.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white");

        //------------Label for heading------------//

        Label lb2 =  new Label("Savings Calculator" );
        lb2.setLayoutY(170);
        lb2.setLayoutX(30);
        lb2.setMaxWidth(550);
        lb2.setWrapText(true);
        lb2.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;"+"-fx-font-weight: bold;");

        //--------------Label for content------------//

        Label lb3 =  new Label("Savings Calculator supports to find the values of future value, present value, payment, interest rate,No of periods." );
        lb3.setLayoutY(200);
        lb3.setLayoutX(30);
        lb3.setMaxWidth(550);
        lb3.setWrapText(true);
        lb3.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;");

        //------------Label for heading------------//

        Label lb4=  new Label("Mortgage Calculator" );
        lb4.setMaxWidth(550);
        lb4.setLayoutY(260);
        lb4.setLayoutX(30);
        lb4.setWrapText(true);
        lb4.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;"+"-fx-font-weight: bold;");

        //--------------Label for content------------//

        Label lb5 =  new Label("Mortgage Calculator supports to calculate the monthly payment, Total mortgage payment, Loan Amount " );
        lb5.setLayoutY(290);
        lb5.setLayoutX(30);
        lb5.setMaxWidth(550);
        lb5.setWrapText(true);
        lb5.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;");

        //------------Label for heading------------//

        Label lb6=  new Label("Loan Calculator" );
        lb6.setLayoutY(350);
        lb6.setLayoutX(30);
        lb6.setMaxWidth(550);
        lb6.setWrapText(true);
        lb6.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;"+"-fx-font-weight: bold;");

        //--------------Label for content------------//

        Label lb7 =  new Label("Loan Calculator is used to calculate the total interest, total payment, payment for every month." );
        lb7.setLayoutY(380);
        lb7.setLayoutX(30);
        lb7.setMaxWidth(550);
        lb7.setWrapText(true);
        lb7.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;");

        //------------Label for heading------------//

        Label lb8=  new Label("Compound Interest Savings Calculator" );
        lb8.setLayoutY(440);
        lb8.setLayoutX(30);
        lb8.setMaxWidth(550);
        lb8.setWrapText(true);
        lb8.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;"+"-fx-font-weight: bold;");

        //--------------Label for content------------//

        Label lb9 =  new Label("Compound Interest savings supports to calculate the compound interest." );
        lb9.setLayoutY(470);
        lb9.setLayoutX(30);
        lb9.setMaxWidth(550);
        lb9.setWrapText(true);
        lb9.setStyle("-fx-font: 18 Bahnschrift;"+"-fx-text-fill:white;");


        //--------------Create Back Button------------------//

        Button backButton = new Button("");
        backButton.setPrefWidth(30);
        backButton.setPrefHeight(30);
        backButton.setLayoutX(740);
        backButton.setLayoutY(540);
        backButton.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        //--------------Addig image icon to Back Button------------------//

        Image img1 = new Image("file:Financial Calculator/images/icon.png");
        ImageView view = new ImageView(img1);
        view.setFitHeight(30);
        view.setPreserveRatio(true);
        backButton.setGraphic(view);

        //--------------Set on action to back button----------------//

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
                Main.show();
            }
        });

        //------------------Adding background image-----------------------------//

        Image image = new Image("file:Financial Calculator/images/image4.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);

        //-------------------Returns the childrens of the pane------------------//

        Pane root6 = new Pane();
        root6.getChildren().addAll(img,backButton,lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,head);

        //------------------setting stage------------------//

        stage.setTitle("About");
        stage.setScene(new Scene(root6, 800, 600));
        stage.show();

        //---------------Returning root6----------------//
        return root6;
    }
}


