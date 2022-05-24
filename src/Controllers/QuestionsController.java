package Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;


import java.net.URL;
import java.util.ResourceBundle;

public class QuestionsController implements Initializable {

    public VBox page1, page2, page3, page4, page5, page6, page7, page8, page9, page10;
    public Button btnNextQuestion2, btnQuestion1Bookmark;
    public Button btnNextQuestion3, btnQuestion2Bookmark;
    public Button btnNextQuestion4, btnQuestion3Bookmark;
    public Button btnNextQuestion5, btnQuestion4Bookmark;
    public Button btnNextQuestion6, btnQuestion5Bookmark;
    public Button btnNextQuestion7, btnQuestion6Bookmark;
    public Button btnNextQuestion8, btnQuestion7Bookmark;
    public Button btnNextQuestion9, btnQuestion8Bookmark;
    public Button btnNextQuestion10, btnQuestion9Bookmark;
    public Button btnNextQuestion, BtnResult;

    public RadioButton RbtInt, RbtFloat, RbtBoolean, RbtChar;
    public RadioButton Rbtswing, Rbtapplet, RbtObject, RbtActionEvent;
    public RadioButton RbtSwing, RbtApplet, RbtNet, RbtLang;
    public RadioButton Rbtlang, RBtSwing, RBtApplet, RbtAwt;
    public RadioButton RbtUtek, RbtAptech, RbtSSSIT, RbtJTek;
    public RadioButton RbtClass, RbBtInt, RbtGet, RbtIf;
    public RadioButton RBtswing, RbtActionperformed, RBtActionEvent, RbtButton;
    public RadioButton RbtToString, RbtFinalize, RbtEquals, RbtGetDocumentBase;
    public RadioButton RbtInit, RbtMain, RbtStart, RbtDestroy;
    public RadioButton RbtJButton, RbtJList, RbtJButtonGroup, RbtJTextArea;

    int count = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnNextQuestion2.setOnAction(e -> {
//            incrementing count when a correct answer is checked otherwise count is not incremented
            if(RbtFloat.isSelected())
                count = count + 1;
//            setting the next page visible and the previous page invisible because they are all in a stackpane
            page2.setVisible(true);
            page1.setVisible(false);
        });
        btnNextQuestion3.setOnAction(e -> {
            if(RbtObject.isSelected())
                count = count + 1;
            page2.setVisible(false);
            page3.setVisible(true);
        });
        btnNextQuestion4.setOnAction(e -> {
            if(RbtLang.isSelected())
                count = count + 1;
            page3.setVisible(false);
            page4.setVisible(true);
        });
        btnNextQuestion5.setOnAction(e -> {
            if(Rbtlang.isSelected())
                count = count + 1;
            page4.setVisible(false);
            page5.setVisible(true);
        });
        btnNextQuestion6.setOnAction(e -> {
            if(RbtSSSIT.isSelected())
                count = count + 1;
            page5.setVisible(false);
            page6.setVisible(true);
        });
        btnNextQuestion7.setOnAction(e -> {
            if(RbtGet.isSelected())
                count = count + 1;
            page6.setVisible(false);
            page7.setVisible(true);
        });
        btnNextQuestion8.setOnAction(e -> {
            if(RbtActionperformed.isSelected())
                count = count + 1;
            page7.setVisible(false);
            page8.setVisible(true);
        });
        btnNextQuestion9.setOnAction(e -> {
            if(RbtGetDocumentBase.isSelected())
                count = count + 1;
            page8.setVisible(false);
            page9.setVisible(true);
        });
        btnNextQuestion10.setOnAction(e -> {
            if(RbtMain.isSelected())
                count = count + 1;
            page9.setVisible(false);
            page10.setVisible(true);
        });
        BtnResult.setOnAction(e -> {
            if(RbtJButtonGroup.isSelected())
                count = count + 1;
//            displaying the total score in an alert box
            if(count > 7) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Congratulations You got " + count + "/10.");
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "You got " + count + "/10.");
                alert.show();
            }
        });

    }
}
