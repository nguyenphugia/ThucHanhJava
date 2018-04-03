
package bai1;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Bai1 {
    static Label labA, labB, labKQ;
    static TextField txtA, txtB, txtKQ;
    static Button btTong, btHieu, btNhan, btChia;
    
    public static void main(String[] args) {
        Frame fr= new Frame();
        fr.setSize (400,300);
        fr.setLayout (new FlowLayout());
        
// Sử dụng GridLayout 
// GridLayout l = new GridLayout(4,2);
// 4 nút +-*/ gom vào 1 Panel và gán vào GridLayout
// Panel p = new Panel();
// fr.add(p);
// p.setLayout(new F);
// p.add(btCong);
// p.add(btHieu);
// p.add(btNhan);
// p.add(btChia);

        labA = new Label("A = ");
        fr.add(labA);
        txtA = new TextField(20);
        fr.add(txtA);
        labB = new Label ("B = ");
        fr.add(labB);
        txtB = new TextField(20);
        fr.add(txtB);
        
        btTong = new Button("+");
        fr.add(btTong);
        btTong.addActionListener(new LangNgheCong());
        btHieu = new Button ("-");
        fr.add(btHieu);
        btHieu.addActionListener(new LangNgheHieu());
        btNhan = new Button ("x");
        fr.add(btNhan);
        btNhan.addActionListener(new LangNgheNhan());
        btChia = new Button (":");
        fr.add(btChia);
        btChia.addActionListener(new LangNgheChia());
        
        labKQ = new Label("Kết quả là: ");
        fr.add(labKQ);
        txtKQ = new TextField(20);
        fr.add(txtKQ);
        
        Button tat = new Button("CLOSE"); //DONG Frame//
        fr.add(tat);
       tat.addActionListener(new TatFrame());

        fr.setVisible (true);
    }
     
        public static class TatFrame implements ActionListener{
            public void actionPerformed (ActionEvent e) {
        System.exit(0);   
        }
        }
    public static class LangNgheCong implements ActionListener {
        /**
         *
         * @param e
         */
        @Override
        public void actionPerformed (ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int Tong = a + b;
            txtKQ.setText(String.valueOf(Tong));
        }
     }
        public static class LangNgheHieu implements ActionListener {
        /**
         *
         * @param e
         */
        @Override
        public void actionPerformed (ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int Hieu = a - b;
            txtKQ.setText(String.valueOf(Hieu));
        }
     }
            public static class LangNgheNhan implements ActionListener {
        /**
         *
         * @param e
         */
        @Override
        public void actionPerformed (ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int Nhan = a * b;
            txtKQ.setText(String.valueOf(Nhan));
        }
     }
    public static class LangNgheChia implements ActionListener {
        /**
         *
         * @param e
         */
        @Override
        public void actionPerformed (ActionEvent e) {
            float a = Float.parseFloat(txtA.getText());
            float b = Float.parseFloat(txtB.getText());
            if (a != 0)
            {float Chia = a / b;
            txtKQ.setText(String.valueOf(Chia));
            }
            else
                txtKQ.setText("Phép tính không hợp lệ!!");          
        }
     }
    
}
   
