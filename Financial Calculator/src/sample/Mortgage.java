package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static java.lang.Math.pow;


public class Mortgage {

    public static Pane root2() {

        //----------Creating new stage-----------//

        Stage stage = new Stage();

        //----------------Label-----------------//

        Label lb1 = new Label("Home Price ");
        lb1.setLayoutX(40);
        lb1.setLayoutY(50);
        lb1.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb2 = new Label("Down Payment ");
        lb2.setLayoutX(40);
        lb2.setLayoutY(101);
        lb2.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb3 = new Label("Loan Term ");
        lb3.setLayoutX(40);
        lb3.setLayoutY(160);
        lb3.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb4 = new Label("Interest Rate");
        lb4.setLayoutX(40);
        lb4.setLayoutY(215);
        lb4.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");


        Label lb6 = new Label("Result");
        lb6.setLayoutX(40);
        lb6.setLayoutY(370);
        lb6.setStyle("-fx-font: 30px Bahnschrift;"+"-fx-text-fill:white;"+" -fx-font-weight: bold;");

        Label lb7 = new Label("Monthly Payment");
        lb7.setLayoutX(40);
        lb7.setLayoutY(420);
        lb7.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb8 = new Label("Total Mortgage Payment");
        lb8.setLayoutX(40);
        lb8.setLayoutY(470);
        lb8.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb9 = new Label("Loan Amount");
        lb9.setLayoutX(40);
        lb9.setLayoutY(520);
        lb9.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        //------------------Empty label to display output-----------------//

        Label lb10 = new Label();
        lb10.setLayoutX(220);
        lb10.setLayoutY(420);
        lb10.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb11 = new Label();
        lb11.setLayoutX(220);
        lb11.setLayoutY(470);
        lb11.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb12 = new Label();
        lb12.setLayoutX(220);
        lb12.setLayoutY(520);
        lb12.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb13 = new Label();
        lb13.setLayoutX(200);
        lb13.setLayoutY(540);
        lb13.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:black;"+"-fx-background-color: lavender");


        //------------------------Textfield--------------------------//

        TextField tf1 = new TextField();
        tf1.setPromptText("£");
        tf1.setLayoutX(200);
        tf1.setLayoutY(45);
        tf1.setPrefHeight(30);
        tf1.setPrefWidth(160);

        TextField tf2 = new TextField();
        tf2.setPromptText("£");
        tf2.setLayoutX(200);
        tf2.setLayoutY(100);
        tf2.setPrefHeight(30);
        tf2.setPrefWidth(160);

        TextField tf3 = new TextField();
        tf3.setLayoutX(200);
        tf3.setLayoutY(155);
        tf3.setPrefHeight(30);
        tf3.setPrefWidth(160);

        TextField tf4 = new TextField();
        tf4.setLayoutX(200);
        tf4.setLayoutY(210);
        tf4.setPrefHeight(30);
        tf4.setPrefWidth(160);
        tf4.setPromptText("%");

        //------------------Creating Calculate Button------------------//

        Button calculateBtn1 = new Button("Calculate");
        calculateBtn1.setPrefWidth(100);
        calculateBtn1.setPrefHeight(50);
        calculateBtn1.setLayoutX(260);
        calculateBtn1.setLayoutY(312);
        calculateBtn1.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");


        //--------------------Creating Clear Button------------------//

        Button clear1= new Button("Clear");
        clear1.setPrefWidth(100);
        clear1.setPrefHeight(50);
        clear1.setLayoutX(570);
        clear1.setLayoutY(530);
        clear1.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        //-------------------Set on action for clear button-----------//

        clear1.setOnAction(event -> {
            tf1.clear();
            tf2.clear();
            tf3.clear();
            tf4.clear();
            lb10.setText("");
            lb11.setText("");
            lb12.setText("");
            lb13.setText("");

        });


        //----------------Back Button------------------//

        Button backButton = new Button("Back");
        backButton.setPrefWidth(100);
        backButton.setPrefHeight(50);
        backButton.setLayoutX(680);
        backButton.setLayoutY(530);
        backButton.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");
        Image img1 = new Image("file:Financial Calculator/images/icon.png");
        ImageView view = new ImageView(img1);
        view.setFitHeight(30);
        view.setPreserveRatio(true);
        backButton.setGraphic(view);

        //--------------Set on action for back button----------------//

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
                Main.show();

            }
        });

        //---------------------Help-----------------------//

        Button help= new Button();
        help.setPrefHeight(49);
        help.setLayoutX(190);
        help.setLayoutY(312);
        help.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");
        Image img2 = new Image("file:Financial Calculator/images/help.png");
        ImageView view1 = new ImageView(img2);
        view1.setFitHeight(30);
        view1.setPreserveRatio(true);
        help.setGraphic(view1);

        //--------------Set on action for help button----------------//

        help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Help.mortgageHelp();
            }
        });

        //------------------Adding background image-----------------------------//

        Image image = new Image("file:Financial Calculator/images/image6.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);


        //------------------Set on action for calculate button------------//

        calculateBtn1.setOnAction(e -> {
            try {
                double n = 12;
                double HP = Double.parseDouble(tf1.getText());  //Home Price
                double DP = Double.parseDouble(tf2.getText());  //Down Payment
                double t = Double.parseDouble(tf3.getText());   //Loan Term
                double r = Double.parseDouble(tf4.getText());   //Interest Rate

                //-------------Calculating Loan Amount------------//
                double LA = HP - DP; //Loan Amount= Home price - Down Payment
                lb12.setText("£"+String.format("%.2f", LA));

                //--------------Calculating Monthly Payment----------//
                double MP;//Monthly Payment
                MP = ((r / n) / 100 * LA / (1 - pow((1 + (r / n) / 100), -n * t)));
                lb10.setText("£"+String.format("%.2f", MP));

                //---------------Calculating Total Mortgage Payment-------//
                double TMP = MP * (t * n);//Total Mortgage Payment
                lb11.setText("£"+String.format("%.2f", TMP));
            }catch (Exception prompt){
                lb13.setText("Invalid Input! Please enter integer value");
            }
        });


        //------------------KeyPad--------------------//

        Button number1 = new Button("1");
        number1.setPrefHeight(50);
        number1.setPrefWidth(50);
        number1.setLayoutX(500);
        number1.setLayoutY(80);
        number1.setStyle("-fx-background-color:darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color:lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number2 = new Button("2");
        number2.setPrefHeight(50);
        number2.setPrefWidth(50);
        number2.setLayoutX(560);
        number2.setLayoutY(80);
        number2.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number3 = new Button("3");
        number3.setPrefHeight(50);
        number3.setPrefWidth(50);
        number3.setLayoutX(620);
        number3.setLayoutY(80);
        number3.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number4 = new Button("4");
        number4.setPrefHeight(50);
        number4.setPrefWidth(50);
        number4.setLayoutX(500);
        number4.setLayoutY(140);
        number4.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number5 = new Button("5");
        number5.setPrefHeight(50);
        number5.setPrefWidth(50);
        number5.setLayoutX(560);
        number5.setLayoutY(140);
        number5.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number6 = new Button("6");
        number6.setPrefHeight(50);
        number6.setPrefWidth(50);
        number6.setLayoutX(620);
        number6.setLayoutY(140);
        number6.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number7 = new Button("7");
        number7.setPrefHeight(50);
        number7.setPrefWidth(50);
        number7.setLayoutX(500);
        number7.setLayoutY(200);
        number7.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number8 = new Button("8");
        number8.setPrefHeight(50);
        number8.setPrefWidth(50);
        number8.setLayoutX(560);
        number8.setLayoutY(200);
        number8.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button number9 = new Button("9");
        number9.setPrefHeight(50);
        number9.setPrefWidth(50);
        number9.setLayoutX(620);
        number9.setLayoutY(200);
        number9.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button decimalPoint = new Button(".");
        decimalPoint.setPrefHeight(50);
        decimalPoint.setPrefWidth(50);
        decimalPoint.setLayoutX(500);
        decimalPoint.setLayoutY(260);
        decimalPoint.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");


        Button number0 = new Button("0");
        number0.setPrefHeight(50);
        number0.setPrefWidth(50);
        number0.setLayoutX(560);
        number0.setLayoutY(260);
        number0.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button negativeSign = new Button("-");
        negativeSign.setPrefHeight(50);
        negativeSign.setPrefWidth(50);
        negativeSign.setLayoutX(620);
        negativeSign.setLayoutY(260);
        negativeSign.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        Button backBtn = new Button();
        backBtn.setPrefHeight(35);
        backBtn.setPrefWidth(170);
        backBtn.setLayoutX(500);
        backBtn.setLayoutY(320);
        backBtn.setStyle("-fx-background-color: darkslategrey;"+"-fx-border-width:3;"+"-fx-border-color: lightskyblue;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");
        Image imgI = new Image("file:Financial Calculator/images/backspace.jpg");
        ImageView view2 = new ImageView(imgI);
        view2.setFitHeight(30);
        view2.setPreserveRatio(true);
        backBtn.setGraphic(view2);

        //------------Set on action for textfield 1-----------//

        tf1.setOnMouseClicked(event ->{

            number1.setOnAction(e -> tf1.setText(tf1.getText()+"1"));
            number2.setOnAction(e -> tf1.setText(tf1.getText()+"2"));
            number3.setOnAction(e -> tf1.setText(tf1.getText()+"3"));
            number4.setOnAction(e -> tf1.setText(tf1.getText()+"4"));
            number5.setOnAction(e -> tf1.setText(tf1.getText()+"5"));
            number6.setOnAction(e -> tf1.setText(tf1.getText()+"6"));
            number7.setOnAction(e -> tf1.setText(tf1.getText()+"7"));
            number8.setOnAction(e -> tf1.setText(tf1.getText()+"8"));
            number9.setOnAction(e -> tf1.setText(tf1.getText()+"9"));
            decimalPoint.setOnAction(e -> tf1.setText(tf1.getText()+"."));
            number0.setOnAction(e -> tf1.setText(tf1.getText()+"0"));
            negativeSign.setOnAction(e -> tf1.setText(tf1.getText()+"-"));
            backBtn.setOnAction(e -> tf1.setText(tf1.getText().substring(0, tf1.getText().length() - 1)));

        });


        //------------Set on action for textfield 2-----------//

        tf2.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf2.setText(tf2.getText()+"1"));
            number2.setOnAction(e -> tf2.setText(tf2.getText()+"2"));
            number3.setOnAction(e -> tf2.setText(tf2.getText()+"3"));
            number4.setOnAction(e -> tf2.setText(tf2.getText()+"4"));
            number5.setOnAction(e -> tf2.setText(tf2.getText()+"5"));
            number6.setOnAction(e -> tf2.setText(tf2.getText()+"6"));
            number7.setOnAction(e -> tf2.setText(tf2.getText()+"7"));
            number8.setOnAction(e -> tf2.setText(tf2.getText()+"8"));
            number9.setOnAction(e -> tf2.setText(tf2.getText()+"9"));
            decimalPoint.setOnAction(e -> tf2.setText(tf2.getText()+"."));
            number0.setOnAction(e -> tf2.setText(tf2.getText()+"0"));
            negativeSign.setOnAction(e -> tf2.setText(tf2.getText()+"-"));
            backBtn.setOnAction(e -> tf2.setText(tf2.getText().substring(0, tf2.getText().length() - 1)));

        });

        //------------Set on action for textfield 3-----------//

        tf3.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf3.setText(tf3.getText()+"1"));
            number2.setOnAction(e -> tf3.setText(tf3.getText()+"2"));
            number3.setOnAction(e -> tf3.setText(tf3.getText()+"3"));
            number4.setOnAction(e -> tf3.setText(tf3.getText()+"4"));
            number5.setOnAction(e -> tf3.setText(tf3.getText()+"5"));
            number6.setOnAction(e -> tf3.setText(tf3.getText()+"6"));
            number7.setOnAction(e -> tf3.setText(tf3.getText()+"7"));
            number8.setOnAction(e -> tf3.setText(tf3.getText()+"8"));
            number9.setOnAction(e -> tf3.setText(tf3.getText()+"9"));
            decimalPoint.setOnAction(e -> tf3.setText(tf3.getText()+"."));
            number0.setOnAction(e -> tf3.setText(tf3.getText()+"0"));
            negativeSign.setOnAction(e -> tf3.setText(tf3.getText()+"-"));
            backBtn.setOnAction(e -> tf3.setText(tf3.getText().substring(0, tf3.getText().length() - 1)));

        });

        //------------Set on action for textfield 4-----------//

        tf4.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf4.setText(tf4.getText()+"1"));
            number2.setOnAction(e -> tf4.setText(tf4.getText()+"2"));
            number3.setOnAction(e -> tf4.setText(tf4.getText()+"3"));
            number4.setOnAction(e -> tf4.setText(tf4.getText()+"4"));
            number5.setOnAction(e -> tf4.setText(tf4.getText()+"5"));
            number6.setOnAction(e -> tf4.setText(tf4.getText()+"6"));
            number7.setOnAction(e -> tf4.setText(tf4.getText()+"7"));
            number8.setOnAction(e -> tf4.setText(tf4.getText()+"8"));
            number9.setOnAction(e -> tf4.setText(tf4.getText()+"9"));
            decimalPoint.setOnAction(e -> tf4.setText(tf4.getText()+"."));
            number0.setOnAction(e -> tf4.setText(tf4.getText()+"0"));
            negativeSign.setOnAction(e -> tf4.setText(tf4.getText()+"-"));
            backBtn.setOnAction(e -> tf4.setText(tf4.getText().substring(0, tf4.getText().length() - 1)));

        });


        //-----------------------Create new pane----------------//

        Pane root2 = new Pane();

        //-------------------Returns the childrens of the pane------------------//

        root2.getChildren().addAll(img,lb1, lb2, lb3, lb4,lb6,lb7,lb8,lb9,lb10,lb11,lb12, tf1, tf2, tf3, tf4, calculateBtn1,backButton,clear1,help,number1,number2,number3,number4,number5,number6,number7,number8,number9,decimalPoint,number0,negativeSign,backBtn);

        //---------------------Setting stage------------------//

        Scene scene = new Scene(root2, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Mortgage Calculator");
        stage.show();

        return root2;
    }

}

