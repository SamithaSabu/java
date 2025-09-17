package module4;

import javax.swing.*;
public class SwingDemo {
SwingDemo(){
JFrame f =new JFrame("Button Example");
JButton b = new JButton("Click Here");
JPanel p = new JPanel();
p.setBounds(40,70,200,200);
b.setBounds(60,100,95,30);
p.add(b);
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}

public static void main(String[] args) {
new SwingDemo();


}

}
