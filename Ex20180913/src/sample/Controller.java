package sample;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {


    /**
     * 當這個函式被呼叫時，將會更改按鈕文字。
     */
    public Button button_1;
    public Button button_2;
    public Button button_3;
    public Button button_4;
    public Button button_5;
    public Button button_6;
    public Button button_7;
    public Button button_8;
    public Button button_9;
    public Button change;
    public Label result;

    private boolean flag = true;

    public void changeButtonText_1 (ActionEvent event)
    {
        if (flag){
            button_1.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_1.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_1.setDisable(true);
        checkResult();
    }

    public void changeButtonText_2 (ActionEvent event)
    {
        if (flag){
            button_2.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_2.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_2.setDisable(true);
        checkResult();
    }

    public void changeButtonText_3 (ActionEvent event)
    {
        if (flag){
            button_3.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_3.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_3.setDisable(true);
        checkResult();
    }

    public void changeButtonText_4 (ActionEvent event)
    {
        if (flag){
            button_4.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_4.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_4.setDisable(true);
        checkResult();
    }

    public void changeButtonText_5 (ActionEvent event)
    {
        if (flag){
            button_5.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_5.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_5.setDisable(true);
        checkResult();
    }

    public void changeButtonText_6 (ActionEvent event)
    {
        if (flag){
            button_6.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_6.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_6.setDisable(true);
        checkResult();
    }

    public void changeButtonText_7 (ActionEvent event)
    {
        if (flag){
            button_7.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_7.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_7.setDisable(true);
        checkResult();
    }

    public void changeButtonText_8 (ActionEvent event)
    {
        if (flag){
            button_8.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_8.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_8.setDisable(true);
        checkResult();
    }

    public void changeButtonText_9 (ActionEvent event)
    {
        if (flag){
            button_9.setText("O");
            flag = false;
            change.setText("輪到X");
        }else {
            button_9.setText("X");
            flag = true;
            change.setText("輪到O");
        }
        button_9.setDisable(true);
        checkResult();
    }

    /**
     * 當這個函式被呼叫時，會檢查是否有無串成一直線。
     */
    public void checkResult() {
        if (!button_1.getText().equals("") && button_1.getText().equals(button_2.getText()) && button_1.getText().equals(button_3.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        } else if (!button_4.getText().equals("") && button_4.getText().equals(button_5.getText()) && button_4.getText().equals(button_6.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        } else if (!button_7.getText().equals("") && button_7.getText().equals(button_8.getText()) && button_7.getText().equals(button_9.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        } else if (!button_1.getText().equals("") && button_1.getText().equals(button_4.getText()) && button_1.getText().equals(button_7.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        } else if (!button_2.getText().equals("") && button_2.getText().equals(button_5.getText()) && button_2.getText().equals(button_8.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        } else if (!button_3.getText().equals("") && button_3.getText().equals(button_6.getText()) && button_3.getText().equals(button_9.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        } else if (!button_1.getText().equals("") && button_1.getText().equals(button_5.getText()) && button_1.getText().equals(button_9.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        } else if (!button_3.getText().equals("") && button_3.getText().equals(button_5.getText()) && button_3.getText().equals(button_7.getText())) {
            button_1.setDisable(true);
            button_2.setDisable(true);
            button_3.setDisable(true);
            button_4.setDisable(true);
            button_5.setDisable(true);
            button_6.setDisable(true);
            button_7.setDisable(true);
            button_8.setDisable(true);
            button_9.setDisable(true);
            change.setText("再來一局");
            change.setDisable(false);
            result.setText(button_1.getText() + "獲勝");
        }
    }

    /**
     * 當這個函數被呼叫，重置所有事物。
     */
    public void reset(ActionEvent event){
        button_1.setDisable(false);
        button_1.setText("");
        button_2.setDisable(false);
        button_2.setText("");
        button_3.setDisable(false);
        button_3.setText("");
        button_4.setDisable(false);
        button_4.setText("");
        button_5.setDisable(false);
        button_5.setText("");
        button_6.setDisable(false);
        button_6.setText("");
        button_7.setDisable(false);
        button_7.setText("");
        button_8.setDisable(false);
        button_8.setText("");
        button_9.setDisable(false);
        button_9.setText("");
        change.setText("輪到O");
        change.setDisable(true);
        result.setText("");
        flag = true;
    }
}
