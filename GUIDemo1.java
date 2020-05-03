import java.awt.*;
import java.awt.event.*;
 
public class GUIDemo1 implements TextListener, ActionListener {
    Frame frame;
    TextField text;
     
    public static void main(String[] args) {
        new GUIDemo1();
    }
     
    public GUIDemo1() {
        frame = new Frame("AWTDemo");
        frame.addWindowListener(new AdapterDemo());
        frame.setLayout(new FlowLayout());
          
        text = new TextField(20);
        text.addTextListener(this);
        text.addActionListener(this);
        text.setBackground(Color.white);
        text.setEditable(true);
        text.setText("There is no spoon.");
        text.selectAll();
 
        frame.add(text);
         
        frame.pack();
        frame.setVisible(true);
         
        System.out.println("Background: " + text.getBackground());
        System.out.println("CaretPosition: " + text.getCaretPosition());
        System.out.println("Editable: " + text.isEditable());
        System.out.println("Text: " + text.getText());
    }
     
    public void textValueChanged(TextEvent e) {
        if (text.getText().length() > 20) {
            text.select(5, 15);
            System.out.println("SelectedText: " + text.getSelectedText());
        }
    }
     
    public void actionPerformed(ActionEvent e) {
        text.setSelectionStart(12);
        text.setSelectionEnd(16);
        System.out.println("SelectedText: " + text.getSelectedText());
        text.setCaretPosition(9);
    }
}
 
class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}