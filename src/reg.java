import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reg {
    private JPanel panelMain;
    private JTextField textStName;
    private JButton calcButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    public static void main(String[] args) {
        JFrame frame = new JFrame("reg");
        frame.setContentPane(new reg().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public reg() {
    calcButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int m1, m2, m3, total;
            double avg;

            m1=Integer.parseInt(txtMarks1.getText());
            m2=Integer.parseInt(txtMarks2.getText());
            m3=Integer.parseInt(txtMarks3.getText());

            total=m1+m2+m3;
            avg=total/3;
            txtTotal.setText(String.valueOf(total));
            txtAvg.setText(String.valueOf(avg));
            if (avg>50){
                txtGrade.setText("Passed!");
            }
            else {
                txtGrade.setText("Failed!");
            }
        }
    });
}
}
