import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;


public class Counter implements ActionListener {
  JLabel labelRight = new JLabel(); 
  JLabel labelLeft = new JLabel();

  int rightCount,leftCount;
  Counter() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
    JButton reset = new JButton("Reset");

    rightCount = 0;
    leftCount = 0;

    left.addActionListener(this);
    right.addActionListener(this);
    reset.addActionListener(this);

    frame.add(left);
    frame.add(right);
    frame.add(reset);
    frame.add(labelLeft);
    frame.add(labelRight);

    labelRight.setText("Count" + rightCount);
    labelLeft.setText("Count" + leftCount);

    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals("Left")) {
      leftCount++;
      labelLeft.setText("Count" + leftCount);
    }else if(ae.getActionCommand().equals("Right")){
      rightCount++;
      labelRight.setText("Count "+rightCount);
    }else{
      rightCount = leftCount = 0;
      labelRight.setText("Count " + rightCount);
      labelLeft.setText("Count " + leftCount);
    }
  }
}