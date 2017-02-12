import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.script.*;
import java.util.*;

public class Tmpkeyman implements KeyListener{
	//TmpMan tmp = new TmpMan();
 	int keyCode;

	public void keyPressed(KeyEvent ke){
		keyCode = ke.getKeyCode();
		//tmp.label.setText(String.valueOf(keyCode));
		System.out.println(keyCode);
	}//keyPressed

	public void keyReleased(KeyEvent ke){
		keyCode = ke.getKeyCode();
		//何もしない
	}//keyReleased

	public void keyTyped(KeyEvent ke){
		keyCode = ke.getKeyCode();
	}//keyTyped

}//Tmpkeyman

