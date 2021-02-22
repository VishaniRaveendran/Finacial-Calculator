package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Savings {

    public static Pane root1(){

        //----------------------Creating new stage-------------------//

        Stage stage1 = new Stage();

        //----------------------Creating a TabPane---------------//

        TabPane tabPane = new TabPane();
        tabPane.setSide(Side.TOP);
        tabPane.setPrefWidth(800);


        //-----------------Creating the first tab-----------------//
        //-----------------Future Value---------------//

        Tab tab1 = new Tab();
        tab1.setText("Future Value");        //Setting the text
        tab1.setClosable(false);
        tab1.setStyle("-fx-background-color:white;");


        //-------------Creating Label---------------//

        Label lb1 = new Label("N (# Of periods) ");
        lb1.setLayoutX(40);
        lb1.setLayoutY(50);
        lb1.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb2= new Label("Present Value");
        lb2.setLayoutX(40);
        lb2.setLayoutY(100);
        lb2.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb3 = new Label("I/Y (Interest) ");
        lb3.setLayoutX(40);
        lb3.setLayoutY(160);
        lb3.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb4= new Label("PMT (Annuity Payment) ");
        lb4.setLayoutX(40);
        lb4.setLayoutY(215);
        lb4.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb21 = new Label();
        lb21.setLayoutX(40);
        lb21.setLayoutY(360);
        lb21.setStyle("-fx-font: 20px Bahnschrift;"+"-fx-background-color: lavender;"+"fx-text-fill:black;"+"-fx-font-weight: bold;");

        //-----------------Textfield---------------------//

        TextField tf1= new TextField();
        tf1.setLayoutX(200);
        tf1.setLayoutY(45);
        tf1.setPrefHeight(30);
        tf1.setPrefWidth(160);
        tf1.setPromptText("Year");

        TextField tf2= new TextField();
        tf2.setPromptText("£");
        tf2.setLayoutX(200);
        tf2.setLayoutY(100);
        tf2.setPrefHeight(30);
        tf2.setPrefWidth(160);

        TextField tf3= new TextField();
        tf3.setPromptText("%");
        tf3.setLayoutX(200);
        tf3.setLayoutY(155);
        tf3.setPrefHeight(30);
        tf3.setPrefWidth(160);

        TextField tf4= new TextField();
        tf4.setLayoutX(200);
        tf4.setLayoutY(210);
        tf4.setPrefHeight(30);
        tf4.setPrefWidth(160);

        //------------Creating Calculate Button------------------//

        Button calculateBtn1 = new Button("Calculate");
        calculateBtn1.setPrefWidth(100);
        calculateBtn1.setPrefHeight(50);
        calculateBtn1.setLayoutX(260);
        calculateBtn1.setLayoutY(282);
        calculateBtn1.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:black;");

        //----------------Creating Clear Button------------------//

        Button clear1= new Button("Clear");
        clear1.setPrefWidth(100);
        clear1.setPrefHeight(50);
        clear1.setLayoutX(570);
        clear1.setLayoutY(500);
        clear1.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        //-----------------Set on action for clear button-----------------//

        clear1.setOnAction(event -> {
            tf1.clear();
            tf2.clear();
            tf3.clear();
            tf4.clear();
            lb21.setText("");
        });


        //------------------Set action for Future Value calculate button------------//

        calculateBtn1.setOnAction(e -> {
            try{
                int n = 12;
                double t = Double.parseDouble(tf1.getText());//N (# Of periods)
                double p = Double.parseDouble(tf2.getText());//Present Value
                double r = Double.parseDouble(tf3.getText())/100;//I/Y (Interest)
                double PMT = Double.parseDouble(tf4.getText());//PMT (Annuity Payment)

                double A;
                A= ( PMT * (( pow (( 1 + (r/n) ),( n * t ))-1 ) /( r/n )))+(p*(pow(( 1 + ( r / n ) ),( n*t))));
                lb21.setText("The Future Value is £"+ String.format("%.2f",A));
            } catch (Exception prompt) {
                lb21.setText("Invalid Input! Please enter integer value ");
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
        Image imgI = new Image("file:backspace.jpg");
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


        //-------------------------creating pane--------------------------//

        Pane a1 = new Pane();

        //-------------------Returns the childrens of the pane a1-------------//

        a1.getChildren().addAll(lb1,lb2,lb3,lb4,tf1,tf2,tf3,tf4,calculateBtn1,lb21,clear1,number1,number2,number3,number4,number5,number6,number7,number8,number9,decimalPoint,number0,negativeSign,backBtn);
        tab1.setContent(a1);


        //-----------------Creating the second tab-----------------//
        //-----------------Payment---------------//

        Tab tab2 = new Tab();
        tab2.setText("Payment");
        tab2.setClosable(false);
        tab2.setStyle("-fx-background-color:white;");

        //-------------------Label-----------------------//

        Label lb5 = new Label("FV (Future Value)");
        lb5.setLayoutX(40);
        lb5.setLayoutY(50);
        lb5.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:#ffffff;");

        Label lb6= new Label("N (# Of periods)");
        lb6.setLayoutX(40);
        lb6.setLayoutY(100);
        lb6.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb7 = new Label("Present Value");
        lb7.setLayoutX(40);
        lb7.setLayoutY(160);
        lb7.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb8= new Label("I/Y (Interest) ");
        lb8.setLayoutX(40);
        lb8.setLayoutY(215);
        lb8.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb22 = new Label();
        lb22.setLayoutX(40);
        lb22.setLayoutY(360);
        lb22.setStyle("-fx-font: 20px Bahnschrift;"+"-fx-background-color: lavender;"+"fx-text-fill:black;"+"-fx-font-weight: bold;");


        //-----------------Textfield---------------------//

        TextField tf5= new TextField();
        tf5.setLayoutX(200);
        tf5.setLayoutY(45);
        tf5.setPrefHeight(30);
        tf5.setPrefWidth(160);
        tf5.setPromptText("£");

        TextField tf6= new TextField();
        tf6.setLayoutX(200);
        tf6.setLayoutY(100);
        tf6.setPrefHeight(30);
        tf6.setPrefWidth(160);
        tf5.setPromptText("Year");

        TextField tf7= new TextField();
        tf7.setLayoutX(200);
        tf7.setLayoutY(155);
        tf7.setPrefHeight(30);
        tf7.setPrefWidth(160);
        tf7.setPromptText("£");

        TextField tf8= new TextField();
        tf8.setLayoutX(200);
        tf8.setLayoutY(210);
        tf8.setPrefHeight(30);
        tf8.setPrefWidth(160);
        tf8.setPromptText("%");

        //----------------Creating Calculate Button------------------//

        Button calculateBtn2 = new Button("Calculate");
        calculateBtn2.setPrefWidth(100);
        calculateBtn2.setPrefHeight(50);
        calculateBtn2.setLayoutX(260);
        calculateBtn2.setLayoutY(282);
        calculateBtn2.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:black;");

        //-----------------Creating Clear Button------------------//

        Button clear2= new Button("Clear");
        clear2.setPrefWidth(100);
        clear2.setPrefHeight(50);
        clear2.setLayoutX(570);
        clear2.setLayoutY(500);
        clear2.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        //---------------Set on action for clear button--------------//

        clear2.setOnAction(event -> {
            tf5.clear();
            tf6.clear();
            tf7.clear();
            tf8.clear();
            lb22.setText("");
        });

        //-------------------------creating pane--------------------------//

        Pane a2 = new Pane();

        //-------------------Returns the childrens of the pane a2-------------//

        a2.getChildren().addAll(lb5,lb6,lb7,lb8,tf5,tf6,tf7,tf8,calculateBtn2,lb22,clear2,number1,number2,number3,number4,number5,number6,number7,number8,number9,decimalPoint,number0,negativeSign,backBtn);
        tab2.setContent(a2);

        //------------------Set on action for Payment calculate button------------//

        calculateBtn2.setOnAction(e -> {
            try{
                int n = 12;
                double A = Double.parseDouble(tf5.getText());//FV (Future Value)
                double t = Double.parseDouble(tf6.getText());//N (# Of periods)
                double p = Double.parseDouble(tf7.getText());//Present Value
                double r= Double.parseDouble(tf8.getText())/100;//I/Y (Interest)

                double PMT;
                PMT = ( A- ( p * pow (( 1 + ( r / n )) ,( n * t )))) / (( pow (( 1 + ( r / n )) , ( n * t )) -1 ) / ( r / n ));
                lb22.setText("The Payment is £"+ String.format("%.2f",PMT));
            } catch (Exception prompt) {
                lb22.setText("Invalid Input! Please enter integer value ");
            }

        });


        //------------Set on action for textfield 5-----------//

        tf5.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf5.setText(tf5.getText()+"1"));
            number2.setOnAction(e -> tf5.setText(tf5.getText()+"2"));
            number3.setOnAction(e -> tf5.setText(tf5.getText()+"3"));
            number4.setOnAction(e -> tf5.setText(tf5.getText()+"4"));
            number5.setOnAction(e -> tf5.setText(tf5.getText()+"5"));
            number6.setOnAction(e -> tf5.setText(tf5.getText()+"6"));
            number7.setOnAction(e -> tf5.setText(tf5.getText()+"7"));
            number8.setOnAction(e -> tf5.setText(tf5.getText()+"8"));
            number9.setOnAction(e -> tf5.setText(tf5.getText()+"9"));
            decimalPoint.setOnAction(e -> tf5.setText(tf5.getText()+"."));
            number0.setOnAction(e -> tf5.setText(tf5.getText()+"0"));
            negativeSign.setOnAction(e -> tf5.setText(tf5.getText()+"-"));
            backBtn.setOnAction(e -> tf5.setText(tf5.getText().substring(0, tf5.getText().length() - 1)));

        });

        //------------Set on action for textfield 6-----------//

        tf6.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf6.setText(tf6.getText()+"1"));
            number2.setOnAction(e -> tf6.setText(tf6.getText()+"2"));
            number3.setOnAction(e -> tf6.setText(tf6.getText()+"3"));
            number4.setOnAction(e -> tf6.setText(tf6.getText()+"4"));
            number5.setOnAction(e -> tf6.setText(tf6.getText()+"5"));
            number6.setOnAction(e -> tf6.setText(tf6.getText()+"6"));
            number7.setOnAction(e -> tf6.setText(tf6.getText()+"7"));
            number8.setOnAction(e -> tf6.setText(tf6.getText()+"8"));
            number9.setOnAction(e -> tf6.setText(tf6.getText()+"9"));
            decimalPoint.setOnAction(e -> tf6.setText(tf6.getText()+"."));
            number0.setOnAction(e -> tf6.setText(tf6.getText()+"0"));
            negativeSign.setOnAction(e -> tf6.setText(tf6.getText()+"-"));
            backBtn.setOnAction(e -> tf6.setText(tf6.getText().substring(0, tf6.getText().length() - 1)));

        });

        //------------Set on action for textfield 7-----------//

        tf7.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf7.setText(tf7.getText()+"1"));
            number2.setOnAction(e -> tf7.setText(tf7.getText()+"2"));
            number3.setOnAction(e -> tf7.setText(tf7.getText()+"3"));
            number4.setOnAction(e -> tf7.setText(tf7.getText()+"4"));
            number5.setOnAction(e -> tf7.setText(tf7.getText()+"5"));
            number6.setOnAction(e -> tf7.setText(tf7.getText()+"6"));
            number7.setOnAction(e -> tf7.setText(tf7.getText()+"7"));
            number8.setOnAction(e -> tf7.setText(tf7.getText()+"8"));
            number9.setOnAction(e -> tf7.setText(tf7.getText()+"9"));
            decimalPoint.setOnAction(e -> tf7.setText(tf7.getText()+"."));
            number0.setOnAction(e -> tf7.setText(tf7.getText()+"0"));
            negativeSign.setOnAction(e -> tf7.setText(tf7.getText()+"-"));
            backBtn.setOnAction(e -> tf7.setText(tf7.getText().substring(0, tf7.getText().length() - 1)));


        });

        //------------Set on action for textfield 8-----------//

        tf8.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf8.setText(tf8.getText()+"1"));
            number2.setOnAction(e -> tf8.setText(tf8.getText()+"2"));
            number3.setOnAction(e -> tf8.setText(tf8.getText()+"3"));
            number4.setOnAction(e -> tf8.setText(tf8.getText()+"4"));
            number5.setOnAction(e -> tf8.setText(tf8.getText()+"5"));
            number6.setOnAction(e -> tf8.setText(tf8.getText()+"6"));
            number7.setOnAction(e -> tf8.setText(tf8.getText()+"7"));
            number8.setOnAction(e -> tf8.setText(tf8.getText()+"8"));
            number9.setOnAction(e -> tf8.setText(tf8.getText()+"9"));
            decimalPoint.setOnAction(e -> tf8.setText(tf8.getText()+"."));
            number0.setOnAction(e -> tf8.setText(tf8.getText()+"0"));
            negativeSign.setOnAction(e -> tf8.setText(tf8.getText()+"-"));
            backBtn.setOnAction(e -> tf8.setText(tf8.getText().substring(0, tf8.getText().length() - 1)));


        });


        //-----------------Creating the third tab-----------------//
        //-----------------Interest---------------//

        Tab tab3 = new Tab();
        tab3.setText("Interest");
        tab3.setClosable(false);
        tab3.setStyle("-fx-background-color:white;");

        //-------------------Label-----------------------//

        Label lb9 = new Label("FV (Future Value)");
        lb9.setLayoutX(40);
        lb9.setLayoutY(50);
        lb9.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb10= new Label("N (# Of periods)");
        lb10.setLayoutX(40);
        lb10.setLayoutY(100);
        lb10.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb11 = new Label("Present Value ");
        lb11.setLayoutX(40);
        lb11.setLayoutY(160);
        lb11.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb12= new Label("PMT (Annuity Payment) ");
        lb12.setLayoutX(40);
        lb12.setLayoutY(215);
        lb12.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb23 = new Label();
        lb23.setLayoutX(40);
        lb23.setLayoutY(360);
        lb23.setStyle("-fx-font: 20px Bahnschrift;"+"-fx-background-color: lavender;"+"fx-text-fill:black;"+"-fx-font-weight: bold;");

        //-----------------Textfield---------------------//

        TextField tf9= new TextField();
        tf9.setLayoutX(200);
        tf9.setLayoutY(45);
        tf9.setPrefHeight(30);
        tf9.setPrefWidth(160);
        tf9.setPromptText("£");

        TextField tf10= new TextField();
        tf10.setLayoutX(200);
        tf10.setLayoutY(100);
        tf10.setPrefHeight(30);
        tf10.setPrefWidth(160);
        tf10.setPromptText("Year");

        TextField tf11= new TextField();
        tf11.setLayoutX(200);
        tf11.setLayoutY(155);
        tf11.setPrefHeight(30);
        tf11.setPrefWidth(160);
        tf11.setPromptText("£");

        TextField tf12= new TextField();
        tf12.setLayoutX(200);
        tf12.setLayoutY(210);
        tf12.setPrefHeight(30);
        tf12.setPrefWidth(160);
        tf12.setPromptText("£");

        //----------------Creating Calculate Button------------------//

        Button calculateBtn3 = new Button("Calculate");
        calculateBtn3.setPrefWidth(100);
        calculateBtn3.setPrefHeight(50);
        calculateBtn3.setLayoutX(260);
        calculateBtn3.setLayoutY(282);
        calculateBtn3.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:black;");

        //----------------Creating Calculate Button------------------//

        Button clear3= new Button("Clear");
        clear3.setPrefWidth(100);
        clear3.setPrefHeight(50);
        clear3.setLayoutX(570);
        clear3.setLayoutY(500);
        clear3.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        //---------------Set on action for clear button--------------//
        clear3.setOnAction(event -> {
            tf9.clear();
            tf10.clear();
            tf11.clear();
            tf12.clear();
            lb23.setText("");
        });

        //-------------------------creating pane--------------------------//

        Pane a3 = new Pane();

        //-------------------Returns the childrens of the pane a1-------------//

        a3.getChildren().addAll(lb9,lb10,lb11,lb12,tf9,tf10,tf11,tf12,calculateBtn3,lb23,clear3,number1,number2,number3,number4,number5,number6,number7,number8,number9,decimalPoint,number0,negativeSign,backBtn);
        tab3.setContent(a3);

        //------------------Set on action for Interest calculate button------------//

        calculateBtn3.setOnAction(e -> {
            try {
                int n = 12;
                double A = Double.parseDouble(tf9.getText());//Future Value
                double t = Double.parseDouble(tf10.getText());//N (# Of periods)
                double p = Double.parseDouble(tf11.getText());//Present Value
                double PMT = Double.parseDouble(tf12.getText());//PMT (Annuity Payment)

                double r;
                r = n * (pow((A / p), (1 / (n * t))) - 1)*100;
                lb23.setText("The Interest is " + String.format("%.2f", r) + "%");
            }catch (Exception prompt){
                lb23.setText("Invalid Input! Please enter integer value");
            }
        });

        //------------Set on action for textfield 9-----------//

        tf9.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf9.setText(tf9.getText()+"1"));
            number2.setOnAction(e -> tf9.setText(tf9.getText()+"2"));
            number3.setOnAction(e -> tf9.setText(tf9.getText()+"3"));
            number4.setOnAction(e -> tf9.setText(tf9.getText()+"4"));
            number5.setOnAction(e -> tf9.setText(tf9.getText()+"5"));
            number6.setOnAction(e -> tf9.setText(tf9.getText()+"6"));
            number7.setOnAction(e -> tf9.setText(tf9.getText()+"7"));
            number8.setOnAction(e -> tf9.setText(tf9.getText()+"8"));
            number9.setOnAction(e -> tf9.setText(tf9.getText()+"9"));
            decimalPoint.setOnAction(e -> tf9.setText(tf9.getText()+"."));
            number0.setOnAction(e -> tf9.setText(tf9.getText()+"0"));
            negativeSign.setOnAction(e -> tf9.setText(tf9.getText()+"-"));
            backBtn.setOnAction(e -> tf9.setText(tf9.getText().substring(0, tf9.getText().length() - 1)));

        });

        //------------Set on action for textfield 10-----------//

        tf10.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf10.setText(tf10.getText()+"1"));
            number2.setOnAction(e -> tf10.setText(tf10.getText()+"2"));
            number3.setOnAction(e -> tf10.setText(tf10.getText()+"3"));
            number4.setOnAction(e -> tf10.setText(tf10.getText()+"4"));
            number5.setOnAction(e -> tf10.setText(tf10.getText()+"5"));
            number6.setOnAction(e -> tf10.setText(tf10.getText()+"6"));
            number7.setOnAction(e -> tf10.setText(tf10.getText()+"7"));
            number8.setOnAction(e -> tf10.setText(tf10.getText()+"8"));
            number9.setOnAction(e -> tf10.setText(tf10.getText()+"9"));
            decimalPoint.setOnAction(e -> tf10.setText(tf10.getText()+"."));
            number0.setOnAction(e -> tf10.setText(tf10.getText()+"0"));
            negativeSign.setOnAction(e -> tf10.setText(tf10.getText()+"-"));
            backBtn.setOnAction(e -> tf10.setText(tf10.getText().substring(0, tf10.getText().length() - 1)));

        });

        //------------Set on action for textfield 11-----------//

        tf11.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf11.setText(tf11.getText()+"1"));
            number2.setOnAction(e -> tf11.setText(tf11.getText()+"2"));
            number3.setOnAction(e -> tf11.setText(tf11.getText()+"3"));
            number4.setOnAction(e -> tf11.setText(tf11.getText()+"4"));
            number5.setOnAction(e -> tf11.setText(tf11.getText()+"5"));
            number6.setOnAction(e -> tf11.setText(tf11.getText()+"6"));
            number7.setOnAction(e -> tf11.setText(tf11.getText()+"7"));
            number8.setOnAction(e -> tf11.setText(tf11.getText()+"8"));
            number9.setOnAction(e -> tf11.setText(tf11.getText()+"9"));
            decimalPoint.setOnAction(e -> tf11.setText(tf11.getText()+"."));
            number0.setOnAction(e -> tf11.setText(tf11.getText()+"0"));
            negativeSign.setOnAction(e -> tf11.setText(tf11.getText()+"-"));
            backBtn.setOnAction(e -> tf11.setText(tf11.getText().substring(0, tf11.getText().length() - 1)));

        });


        //------------Set on action for textfield 12-----------//
        tf12.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf12.setText(tf12.getText()+"1"));
            number2.setOnAction(e -> tf12.setText(tf12.getText()+"2"));
            number3.setOnAction(e -> tf12.setText(tf12.getText()+"3"));
            number4.setOnAction(e -> tf12.setText(tf12.getText()+"4"));
            number5.setOnAction(e -> tf12.setText(tf12.getText()+"5"));
            number6.setOnAction(e -> tf12.setText(tf12.getText()+"6"));
            number7.setOnAction(e -> tf12.setText(tf12.getText()+"7"));
            number8.setOnAction(e -> tf12.setText(tf12.getText()+"8"));
            number9.setOnAction(e -> tf12.setText(tf12.getText()+"9"));
            decimalPoint.setOnAction(e -> tf12.setText(tf12.getText()+"."));
            number0.setOnAction(e -> tf12.setText(tf12.getText()+"0"));
            negativeSign.setOnAction(e -> tf12.setText(tf12.getText()+"-"));
            backBtn.setOnAction(e -> tf12.setText(tf12.getText().substring(0, tf12.getText().length() - 1)));

        });


        //-----------------Creating the fourth tab-----------------//
        //-----------------Number of periods---------------//

        Tab tab4 = new Tab();
        tab4.setText("Number of periods");
        tab4.setClosable(false);
        tab4.setStyle("-fx-background-color:white;");

        //-------------------Label-----------------------//

        Label lb13 = new Label("FV (Future Value)");
        lb13.setLayoutX(40);
        lb13.setLayoutY(50);
        lb13.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb14= new Label("Present Value ");
        lb14.setLayoutX(40);
        lb14.setLayoutY(100);
        lb14.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb15 = new Label("I/Y (Interest) ");
        lb15.setLayoutX(40);
        lb15.setLayoutY(160);
        lb15.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb16= new Label("PMT (Annuity Payment) ");
        lb16.setLayoutX(40);
        lb16.setLayoutY(215);
        lb16.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb24 = new Label();
        lb24.setLayoutX(40);
        lb24.setLayoutY(360);
        lb24.setStyle("-fx-font: 20px Bahnschrift;"+"-fx-background-color: lavender;"+"fx-text-fill:black;"+"-fx-font-weight: bold;");


        //------------------Textfield-------------------------//

        TextField tf13= new TextField();
        tf13.setLayoutX(200);
        tf13.setLayoutY(45);
        tf13.setPrefHeight(30);
        tf13.setPrefWidth(160);
        tf13.setPromptText("£");

        TextField tf14= new TextField();
        tf14.setLayoutX(200);
        tf14.setLayoutY(100);
        tf14.setPrefHeight(30);
        tf14.setPrefWidth(160);
        tf14.setPromptText("£");

        TextField tf15= new TextField();
        tf15.setLayoutX(200);
        tf15.setLayoutY(155);
        tf15.setPrefHeight(30);
        tf15.setPrefWidth(160);
        tf15.setPromptText("%");

        TextField tf16= new TextField();
        tf16.setLayoutX(200);
        tf16.setLayoutY(210);
        tf16.setPrefHeight(30);
        tf16.setPrefWidth(160);
        tf16.setPromptText("£");

        Button calculateBtn4 = new Button("Calculate");
        calculateBtn4.setPrefWidth(100);
        calculateBtn4.setPrefHeight(50);
        calculateBtn4.setLayoutX(260);
        calculateBtn4.setLayoutY(282);
        calculateBtn4.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:black;");


        //--------------------Clear Button---------------//

        Button clear4= new Button("Clear");
        clear4.setPrefWidth(100);
        clear4.setPrefHeight(50);
        clear4.setLayoutX(570);
        clear4.setLayoutY(500);
        clear4.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        //---------------Set on action for clear button--------------//

        clear4.setOnAction(event -> {
            tf13.clear();
            tf14.clear();
            tf15.clear();
            tf16.clear();
            lb24.setText("");
        });

        //-------------------------creating pane--------------------------//

        Pane a4 = new Pane();

        //-------------------Returns the childrens of the pane a1-------------//

        a4.getChildren().addAll(lb13,lb14,lb15,lb16,tf13,tf14,tf15,tf16,calculateBtn4,lb24,clear4,number1,number2,number3,number4,number5,number6,number7,number8,number9,decimalPoint,number0,negativeSign,backBtn);
        tab4.setContent(a4);

        //------------------Set on action for Number Of Period calculate button------------//

        calculateBtn4.setOnAction(e -> {
            try{
                int n = 12;
                double A = Double.parseDouble(tf13.getText());//Future Value
                double p = Double.parseDouble(tf14.getText());//Present Value
                double r = Double.parseDouble(tf15.getText())/100;//I/Y (Interest)
                double PMT= Double.parseDouble(tf16.getText());//PMT (Annuity Payment)

                double t;
                t=log(( A + ( PMT*n / r )) / ( p + ( PMT*n / r ))) / ( log( 1 + ( r/n )) *n);
                lb24.setText("The Number of period is "+ String.format("%.0f",t));
            } catch (Exception prompt) {
                lb24.setText("Invalid Input! Please enter integer value ");
            }


        });

        //------------Set on action for textfield 13-----------//

        tf13.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf13.setText(tf13.getText()+"1"));
            number2.setOnAction(e -> tf13.setText(tf13.getText()+"2"));
            number3.setOnAction(e -> tf13.setText(tf13.getText()+"3"));
            number4.setOnAction(e -> tf13.setText(tf13.getText()+"4"));
            number5.setOnAction(e -> tf13.setText(tf13.getText()+"5"));
            number6.setOnAction(e -> tf13.setText(tf13.getText()+"6"));
            number7.setOnAction(e -> tf13.setText(tf13.getText()+"7"));
            number8.setOnAction(e -> tf13.setText(tf13.getText()+"8"));
            number9.setOnAction(e -> tf13.setText(tf13.getText()+"9"));
            decimalPoint.setOnAction(e -> tf13.setText(tf13.getText()+"."));
            number0.setOnAction(e -> tf13.setText(tf13.getText()+"0"));
            negativeSign.setOnAction(e -> tf13.setText(tf13.getText()+"-"));
            backBtn.setOnAction(e -> tf14.setText(tf14.getText().substring(0, tf14.getText().length() - 1)));

        });

        //------------Set on action for textfield 14-----------//

        tf14.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf14.setText(tf14.getText()+"1"));
            number2.setOnAction(e -> tf14.setText(tf14.getText()+"2"));
            number3.setOnAction(e -> tf14.setText(tf14.getText()+"3"));
            number4.setOnAction(e -> tf14.setText(tf14.getText()+"4"));
            number5.setOnAction(e -> tf14.setText(tf14.getText()+"5"));
            number6.setOnAction(e -> tf14.setText(tf14.getText()+"6"));
            number7.setOnAction(e -> tf14.setText(tf14.getText()+"7"));
            number8.setOnAction(e -> tf14.setText(tf14.getText()+"8"));
            number9.setOnAction(e -> tf14.setText(tf14.getText()+"9"));
            decimalPoint.setOnAction(e -> tf14.setText(tf14.getText()+"."));
            number0.setOnAction(e -> tf14.setText(tf14.getText()+"0"));
            negativeSign.setOnAction(e -> tf14.setText(tf14.getText()+"-"));
            backBtn.setOnAction(e -> tf14.setText(tf14.getText().substring(0, tf14.getText().length() - 1)));

        });

        //------------Set on action for textfield 15-----------//

        tf15.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf15.setText(tf15.getText()+"1"));
            number2.setOnAction(e -> tf15.setText(tf15.getText()+"2"));
            number3.setOnAction(e -> tf15.setText(tf15.getText()+"3"));
            number4.setOnAction(e -> tf15.setText(tf15.getText()+"4"));
            number5.setOnAction(e -> tf15.setText(tf15.getText()+"5"));
            number6.setOnAction(e -> tf15.setText(tf15.getText()+"6"));
            number7.setOnAction(e -> tf15.setText(tf15.getText()+"7"));
            number8.setOnAction(e -> tf15.setText(tf15.getText()+"8"));
            number9.setOnAction(e -> tf15.setText(tf15.getText()+"9"));
            decimalPoint.setOnAction(e -> tf15.setText(tf15.getText()+"."));
            number0.setOnAction(e -> tf15.setText(tf15.getText()+"0"));
            negativeSign.setOnAction(e -> tf15.setText(tf15.getText()+"-"));
            backBtn.setOnAction(e -> tf15.setText(tf9.getText().substring(0, tf15.getText().length() - 1)));

        });

        //------------Set on action for textfield 16-----------//

        tf16.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf16.setText(tf16.getText()+"1"));
            number2.setOnAction(e -> tf16.setText(tf16.getText()+"2"));
            number3.setOnAction(e -> tf16.setText(tf16.getText()+"3"));
            number4.setOnAction(e -> tf16.setText(tf16.getText()+"4"));
            number5.setOnAction(e -> tf16.setText(tf16.getText()+"5"));
            number6.setOnAction(e -> tf16.setText(tf16.getText()+"6"));
            number7.setOnAction(e -> tf16.setText(tf16.getText()+"7"));
            number8.setOnAction(e -> tf16.setText(tf16.getText()+"8"));
            number9.setOnAction(e -> tf16.setText(tf16.getText()+"9"));
            decimalPoint.setOnAction(e -> tf16.setText(tf16.getText()+"."));
            number0.setOnAction(e -> tf16.setText(tf16.getText()+"0"));
            negativeSign.setOnAction(e -> tf16.setText(tf16.getText()+"-"));
            backBtn.setOnAction(e -> tf16.setText(tf16.getText().substring(0, tf16.getText().length() - 1)));

        });



        //-----------------Creating the fifth tab-----------------//
        //-----------------Start Principal---------------//

        Tab tab5 = new Tab();
        tab5.setText("Start Principal");
        tab5.setClosable(false);
        tab5.setStyle("-fx-background-color:white;");

        //--------------------Label--------------------//
        Label lb17 = new Label("FV (Future Value)");
        lb17.setLayoutX(40);
        lb17.setLayoutY(50);
        lb17.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb18= new Label("N (# of periods)");
        lb18.setLayoutX(40);
        lb18.setLayoutY(100);
        lb18.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb19 = new Label("I/Y (Interest) ");
        lb19.setLayoutX(40);
        lb19.setLayoutY(160);
        lb19.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb20= new Label("PMT (Annuity Payment) ");
        lb20.setLayoutX(40);
        lb20.setLayoutY(215);
        lb20.setStyle("-fx-font: 15px Bahnschrift;"+"-fx-text-fill:white;");

        Label lb25 = new Label();
        lb25.setLayoutX(40);
        lb25.setLayoutY(360);
        lb25.setStyle("-fx-font: 20px Bahnschrift;"+"-fx-background-color: lavender;"+"fx-text-fill:black;"+"-fx-font-weight: bold;");


        //-----------------Textfield---------------------//

        TextField tf17= new TextField();
        tf17.setLayoutX(200);
        tf17.setLayoutY(45);
        tf17.setPrefHeight(30);
        tf17.setPrefWidth(160);
        tf17.setPromptText("£");

        TextField tf18= new TextField();
        tf18.setLayoutX(200);
        tf18.setLayoutY(100);
        tf18.setPrefHeight(30);
        tf18.setPrefWidth(160);
        tf18.setPromptText("Year");

        TextField tf19= new TextField();
        tf19.setLayoutX(200);
        tf19.setLayoutY(155);
        tf19.setPrefHeight(30);
        tf19.setPrefWidth(160);
        tf19.setPromptText("%");

        TextField tf20= new TextField();
        tf20.setLayoutX(200);
        tf20.setLayoutY(210);
        tf20.setPrefHeight(30);
        tf20.setPrefWidth(160);
        tf20.setPromptText("£");

        //---------------------Creating Calculate Button----------------------//

        Button calculateBtn5 = new Button("Calculate");
        calculateBtn5.setPrefWidth(100);
        calculateBtn5.setPrefHeight(50);
        calculateBtn5.setLayoutX(260);
        calculateBtn5.setLayoutY(282);
        calculateBtn5.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:black;");


        //-----------------Creating Clear Button---------------//

        Button clear5= new Button("Clear");
        clear5.setPrefWidth(100);
        clear5.setPrefHeight(50);
        clear5.setLayoutX(570);
        clear5.setLayoutY(500);
        clear5.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");

        //-------------------Set on action for clear button-----------//

        clear5.setOnAction(event -> {
            tf17.clear();
            tf18.clear();
            tf19.clear();
            tf20.clear();
            lb25.setText("");
        });

        //-------------------------creating pane--------------------------//

        Pane a5 = new Pane();

        //-------------------Returns the childrens of the pane a1-------------//

        a5.getChildren().addAll(lb17,lb18,lb19,lb20,tf17,tf18,tf19,tf20,calculateBtn5,clear5,lb25,number1,number2,number3,number4,number5,number6,number7,number8,number9,decimalPoint,number0,negativeSign,backBtn);
        tab5.setContent(a5);

        //------------------Set on action for Start Prinipal calculate button------------//

        calculateBtn5.setOnAction(e -> {
            try {
                int n = 12;
                double A = Double.parseDouble(tf17.getText());//Future Value
                double t = Double.parseDouble(tf18.getText());//N (# of periods)
                double r = Double.parseDouble(tf19.getText()) / 100;//I/Y (Interest)
                double PMT = Double.parseDouble(tf20.getText());//PMT (Annuity Payment)

                double p;
                p =(A-(PMT*((pow((1+(r/n)),(n*t))-1)/(r/n))))/(pow((1+(r/n)),(n*t)));

                lb25.setText("The Start principal is  £" + String.format("%.2f", p));
            }catch (Exception prompt){
                lb25.setText("Invalid Input! Please enter integer value ");
            }
        });

        //------------Set on action for textfield 17-----------//

        tf17.setOnMouseClicked(event -> {
            number1.setOnAction(e -> tf17.setText(tf17.getText()+"1"));
            number2.setOnAction(e -> tf17.setText(tf17.getText()+"2"));
            number3.setOnAction(e -> tf17.setText(tf17.getText()+"3"));
            number4.setOnAction(e -> tf17.setText(tf17.getText()+"4"));
            number5.setOnAction(e -> tf17.setText(tf17.getText()+"5"));
            number6.setOnAction(e -> tf17.setText(tf17.getText()+"6"));
            number7.setOnAction(e -> tf17.setText(tf17.getText()+"7"));
            number8.setOnAction(e -> tf17.setText(tf17.getText()+"8"));
            number9.setOnAction(e -> tf17.setText(tf17.getText()+"9"));
            decimalPoint.setOnAction(e -> tf17.setText(tf17.getText()+"."));
            number0.setOnAction(e -> tf17.setText(tf17.getText()+"0"));
            negativeSign.setOnAction(e -> tf17.setText(tf17.getText()+"-"));
            backBtn.setOnAction(e -> tf17.setText(tf17.getText().substring(0, tf17.getText().length() - 1)));

        });



        //------------Set on action for textfield 18-----------//

        tf18.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf18.setText(tf18.getText()+"1"));
            number2.setOnAction(e -> tf18.setText(tf18.getText()+"2"));
            number3.setOnAction(e -> tf18.setText(tf18.getText()+"3"));
            number4.setOnAction(e -> tf18.setText(tf18.getText()+"4"));
            number5.setOnAction(e -> tf18.setText(tf18.getText()+"5"));
            number6.setOnAction(e -> tf18.setText(tf18.getText()+"6"));
            number7.setOnAction(e -> tf18.setText(tf18.getText()+"7"));
            number8.setOnAction(e -> tf18.setText(tf18.getText()+"8"));
            number9.setOnAction(e -> tf18.setText(tf18.getText()+"9"));
            decimalPoint.setOnAction(e -> tf18.setText(tf18.getText()+"."));
            number0.setOnAction(e -> tf18.setText(tf18.getText()+"0"));
            negativeSign.setOnAction(e -> tf18.setText(tf18.getText()+"-"));
            backBtn.setOnAction(e -> tf18.setText(tf18.getText().substring(0, tf18.getText().length() - 1)));

        });

        //------------Set on action for textfield 19-----------//

        tf19.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf19.setText(tf19.getText()+"1"));
            number2.setOnAction(e -> tf19.setText(tf19.getText()+"2"));
            number3.setOnAction(e -> tf19.setText(tf19.getText()+"3"));
            number4.setOnAction(e -> tf19.setText(tf19.getText()+"4"));
            number5.setOnAction(e -> tf19.setText(tf19.getText()+"5"));
            number6.setOnAction(e -> tf19.setText(tf19.getText()+"6"));
            number7.setOnAction(e -> tf19.setText(tf19.getText()+"7"));
            number8.setOnAction(e -> tf19.setText(tf19.getText()+"8"));
            number9.setOnAction(e -> tf19.setText(tf19.getText()+"9"));
            decimalPoint.setOnAction(e -> tf19.setText(tf19.getText()+"."));
            number0.setOnAction(e -> tf19.setText(tf19.getText()+"0"));
            negativeSign.setOnAction(e -> tf19.setText(tf19.getText()+"-"));
            backBtn.setOnAction(e -> tf19.setText(tf19.getText().substring(0, tf19.getText().length() - 1)));

        });

        //------------Set on action for textfield 20-----------//

        tf20.setOnMouseClicked(event ->{
            number1.setOnAction(e -> tf20.setText(tf20.getText()+"1"));
            number2.setOnAction(e -> tf20.setText(tf20.getText()+"2"));
            number3.setOnAction(e -> tf20.setText(tf20.getText()+"3"));
            number4.setOnAction(e -> tf20.setText(tf20.getText()+"4"));
            number5.setOnAction(e -> tf20.setText(tf20.getText()+"5"));
            number6.setOnAction(e -> tf20.setText(tf20.getText()+"6"));
            number7.setOnAction(e -> tf20.setText(tf20.getText()+"7"));
            number8.setOnAction(e -> tf20.setText(tf20.getText()+"8"));
            number9.setOnAction(e -> tf20.setText(tf20.getText()+"9"));
            decimalPoint.setOnAction(e -> tf20.setText(tf20.getText()+"."));
            number0.setOnAction(e -> tf20.setText(tf20.getText()+"0"));
            negativeSign.setOnAction(e -> tf20.setText(tf20.getText()+"-"));
            backBtn.setOnAction(e -> tf20.setText(tf20.getText().substring(0, tf20.getText().length() - 1)));

        });

        //----------------Creating Back Button------------------//

        Button backButton = new Button("Back");
        backButton.setPrefWidth(100);
        backButton.setPrefHeight(50);
        backButton.setLayoutX(680);
        backButton.setLayoutY(530);
        backButton.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");
        Image img1 = new Image("file:icon.png");
        ImageView view = new ImageView(img1);
        view.setFitHeight(30);
        view.setPreserveRatio(true);
        backButton.setGraphic(view);

        //--------------Set on action for back button----------------//

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage1.close();
                Main.show();
            }
        });

        //---------------------Help-----------------------//

        Button help= new Button();
        help.setPrefHeight(49);
        help.setLayoutX(190);
        help.setLayoutY(312);
        help.setStyle("-fx-background-color: royalblue;"+"-fx-border-width:1;"+"-fx-border-color: white;"+"-fx-font: 15px Bahnschrift;"+"-fx-font-weight: bold;"+"-fx-text-fill:white;");
        Image img2 = new Image("file:help.png");
        ImageView view1 = new ImageView(img2);
        view1.setFitHeight(30);
        view1.setPreserveRatio(true);
        help.setGraphic(view1);

        //--------------Set on action for help button----------------//

        help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Help.savingsHelp();
            }
        });

        //------------------Adding background image--------------------------//

        Image image = new Image("file:image6.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);

        tabPane.getTabs().addAll(tab1, tab2, tab3,tab4,tab5);

        //Setting  pane as the layout

        Pane root1 = new Pane();

        //-------------------Returns the childrens of the pane-------------//

        root1.getChildren().addAll(img,tabPane,backButton,help,number1,number2,number3,number4,number5,number6,number7,number8,number9,decimalPoint,number0,negativeSign,backBtn);


        //--------------------Setting the stage--------------------//

        Scene scene = new Scene(root1, 800, 600);
        stage1.setTitle("Savings Calculator");
        stage1.setScene(scene);
        stage1.show();

        return root1;
    }

}