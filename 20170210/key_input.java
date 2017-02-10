//******************************************************************************
//キーボード入力のためのクラス“key_input”
//KeyListenerを実装
//以下のメソッドを実装する必要があります。（使わなくても必要）
//keyPressed()：キーボードが押された時に呼ばれる
//keyReleased()：キーボードが押された状態から、離した時に呼ばれる
//keyTyped()：キーボードがタイプされたときに呼ばれる
//登録の際は、“addKeyListener()”を使う
//******************************************************************************


//インポート
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class key_input implements KeyListener
{

 //=============================================================================
 //クラスのフィールド
 //=============================================================================
 //キーコードを入れる変数
 int KeyCode;


 //=============================================================================
 //キーが押されたときに呼ばれるメソッド
 //=============================================================================
 public void keyPressed(KeyEvent event)
 {
  //キーコード取得
  KeyCode = event.getKeyCode();

  //画面に表示
  System.out.println("「" + KeyCode + "」が押されました。");
 }


 //=============================================================================
 //キーが離されたときに呼ばれるメソッド
 //=============================================================================
 public void keyReleased(KeyEvent event)
 {
  //キーコード取得
  KeyCode = event.getKeyCode();

  //画面に表示
  System.out.println("「" + KeyCode + "」が離されました。");
 }


 //=============================================================================
 //キーがタイプされたときに呼ばれるメソッド
 //=============================================================================
 public void keyTyped(KeyEvent event)
 {
  //何もしない
 }

}
//******************************************************************************
//key_inputクラスここまで
//******************************************************************************