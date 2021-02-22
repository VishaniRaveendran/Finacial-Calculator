package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Help{

    public static Pane savingsHelp() {

        //----------Creating new stage-----------//

        Stage stage1 = new Stage();

        //--------------------Label----------------//

        Label lb1 =  new Label("Savings calculator can used to find the values such as Final value, Payment, Interest, No of period, Start principal.There are 5 tabs to find each and every value. By entering correct value to textfield we can calculate result you want." );
        lb1.setLayoutY(15);
        lb1.setLayoutX(30);
        lb1.setMaxWidth(750);
        lb1.setWrapText(true);
        lb1.setStyle("-fx-font: 13 Bahnschrift;"+"-fx-text-fill:black;"+"-fx-background-color:lavender;");

        //------------------Adding background image----------------------//

        Image image = new Image("file:Finacial Calculator/images/image4.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);

        //--------------------Adding explanation image---------------//

        Image image1 = new Image("file:Financial Calculator/images/savings.png");
        ImageView img1 = new ImageView(image1);
        img1.setFitHeight(500);
        img1.setFitWidth(750);
        img1.setLayoutY(85);
        img1.setLayoutX(30);
        Group rt2 = new Group();
        rt2.getChildren().addAll(img1);

        //-----------------------Create new pane----------------//

        Pane savingsHelp = new Pane();

        //-------------------Returns the childrens of the pane------------------//

        savingsHelp.getChildren().addAll(img,lb1,img1);

        //-----------------Setting stage-----------------//

        stage1.setTitle("Help");
        stage1.setScene(new Scene(savingsHelp,800,600));
        stage1.show();

        return savingsHelp;
    }

    public static Pane mortgageHelp() {

        //----------Creating new stage-----------//

        Stage stage2 = new Stage();

        //--------------------Label----------------//

        Label lb1 =  new Label("Mortgage calculator can used to find the values such as Monthly Payment, Total Mortgage Payment and loan amount. By entering correct value to textfield we can calculate result." );
        lb1.setLayoutY(15);
        lb1.setLayoutX(30);
        lb1.setMaxWidth(750);
        lb1.setWrapText(true);
        lb1.setStyle("-fx-font: 13 Bahnschrift;"+"-fx-text-fill:black;"+"-fx-background-color:lavender;");

        //------------------Adding image background----------------------//

        Image image = new Image("file:Financial Calculator/images/image4.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);

        //--------------------Adding explanation image---------------//

        Image image1 = new Image("file:mortgage.png");
        ImageView img1 = new ImageView(image1);
        img1.setFitHeight(500);
        img1.setFitWidth(750);
        img1.setLayoutY(85);
        img1.setLayoutX(30);
        Group rt2 = new Group();
        rt2.getChildren().addAll(img1);

        //-----------------------Create new pane----------------//

        Pane mortgageHelp = new Pane();

        //-------------------Returns the childrens of the pane------------------//

        mortgageHelp.getChildren().addAll(img,lb1,img1);

        //-----------------Setting stage-----------------//

        stage2.setTitle("Help");
        stage2.setScene(new Scene(mortgageHelp,800,600));
        stage2.show();

        return mortgageHelp;
    }

    public static Pane loanHelp() {

        //----------Creating new stage-----------//

        Stage stage3 = new Stage();

        //--------------------Label----------------//

        Label lb1 =  new Label("Loan calculator can used to find the values such as Payment every month, Total Payment and Total interest . By entering correct value to textfield we can calculate result." );
        lb1.setLayoutY(15);
        lb1.setLayoutX(30);
        lb1.setMaxWidth(750);
        lb1.setWrapText(true);
        lb1.setStyle("-fx-font: 13 Bahnschrift;"+"-fx-text-fill:black;"+"-fx-background-color:lavender;");

        //------------------Adding background image--------------------//

        Image image = new Image("file:image4.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);

        //--------------------Adding explanation image---------------//

        Image image1 = new Image("file:loan.png");
        ImageView img1 = new ImageView(image1);
        img1.setFitHeight(500);
        img1.setFitWidth(750);
        img1.setLayoutY(85);
        img1.setLayoutX(30);
        Group rt2 = new Group();
        rt2.getChildren().addAll(img1);


        //-----------------------Create new pane----------------//

        Pane loanHelp = new Pane();

        //-------------------Returns the childrens of the pane------------------//

        loanHelp.getChildren().addAll(img,img1,lb1);

        //-----------------Setting stage-----------------//

        stage3.setTitle("Help");
        stage3.setScene(new Scene(loanHelp,800,600));
        stage3.show();

        return loanHelp;
    }
    public static Pane compoundHelp() {

        //----------Creating new stage-----------//

        Stage stage4 = new Stage();

        //--------------------Label----------------//

        Label lb1 =  new Label("Compound calculator can used to find the values of compound interest. By entering correct value to textfield we can calculate result." );
        lb1.setLayoutY(15);
        lb1.setLayoutX(30);
        lb1.setMaxWidth(750);
        lb1.setWrapText(true);
        lb1.setStyle("-fx-font: 13 Bahnschrift;"+"-fx-text-fill:black;"+"-fx-background-color:lavender;");

        //------------------Adding background image----------------------//

        Image image = new Image("file:image4.jpg");
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(800);
        Group rt1 = new Group();
        rt1.getChildren().addAll(img);

        //--------------------Adding explanation image---------------//

        Image image1 = new Image("file:compound.png");
        ImageView img1 = new ImageView(image1);
        img1.setFitHeight(500);
        img1.setFitWidth(750);
        img1.setLayoutY(85);
        img1.setLayoutX(30);
        Group rt2 = new Group();
        rt2.getChildren().addAll(img1);

        //-----------------------Create new pane----------------//

        Pane compoundHelp = new Pane();

        //-------------------Returns the childrens of the pane------------------//

        compoundHelp.getChildren().addAll(img,img1,lb1);

        //-----------------Setting stage-----------------//

        stage4.setTitle("Help");
        stage4.setScene(new Scene(compoundHelp,800,600));
        stage4.show();

        return compoundHelp;
    }
}
