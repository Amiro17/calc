package calc;

import java.awt.*;

import javax.swing.*;


public class ui_main {

    public static JButton b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,k_a,k_z;
    public static JLabel output;


    public static JButton b_plus,b_minus,b_mul,b_div,b_eq,b_pt,b_del,b_bs,b_pw;



    public void gui_main(){
        JFrame frame = new JFrame("Calc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,800);
        frame.setLayout(null); 
        frame.setVisible(true);
        op_bn(frame);
        nm_bn(frame);
        btn_actionlistener act = new btn_actionlistener();
        act.action_handler();
        print_op(frame);


     
     }

     public void print_op(JFrame frame_ot){
        output = new JLabel("");
        output.setBounds(60,100, 500,60);
        output.setFont(new Font("Bold", Font.PLAIN, 52));
        frame_ot.add(output);
        
     }
 
     public void op_bn(JFrame frame_op){
         b_plus = new JButton("+");
         b_minus = new JButton("-");
         b_mul = new JButton("*");
         b_div = new JButton("/");
         b_eq = new JButton("=");
         

 
         int w_opbn = 105;
         int h_opbn = 80;
         int x_opbn = 325; 
         int y_opbn = 330;

 
         b_plus.setBounds(x_opbn, y_opbn, w_opbn,h_opbn);
         b_minus.setBounds(x_opbn, y_opbn+h_opbn, w_opbn,h_opbn);
         b_mul.setBounds(x_opbn, y_opbn + 2*h_opbn, w_opbn,h_opbn);
         b_div.setBounds(x_opbn, y_opbn+ 3 * h_opbn, w_opbn,h_opbn);
         b_eq.setBounds(x_opbn, y_opbn+ 4*h_opbn, w_opbn,h_opbn);
          
         b_plus.setBackground(Color.lightGray);
         b_minus.setBackground(Color.lightGray);
         b_mul.setBackground(Color.lightGray);
         b_div.setBackground(Color.lightGray);
         b_eq.setBackground(Color.lightGray);
 
 
         frame_op.add(b_plus);
         frame_op.add(b_minus);
         frame_op.add(b_mul);
         frame_op.add(b_div); 
         frame_op.add(b_eq);  
 
 
 
     }
     public void nm_bn(JFrame frame_nm){

        b_0 = new JButton("0");
        b_1 = new JButton("1");
        b_2 = new JButton("2"); 
        b_3 = new JButton("3");
        b_4 = new JButton("4");
        b_5 = new JButton("5");
        b_6 = new JButton("6");
        b_7 = new JButton("7");
        b_8 = new JButton("8");
        b_9 = new JButton("9");
        b_pt = new JButton(".");
        b_del = new JButton("del");
        b_bs = new JButton("<-");
        b_pw = new JButton("^");
      k_a = new JButton("(");
        k_z = new JButton(")");
        
        int w_nmbn = 105;
        int h_nmbn = 80;
        int x_nmbn = 10;
        int y_nmbn = 570;

        
        b_0.setBounds(x_nmbn, y_nmbn+h_nmbn, w_nmbn,h_nmbn);
        b_pt.setBounds(x_nmbn+w_nmbn, y_nmbn+h_nmbn, w_nmbn,h_nmbn);
        b_bs.setBounds(x_nmbn+2*w_nmbn, y_nmbn+h_nmbn, w_nmbn,h_nmbn);
        b_1.setBounds(x_nmbn, y_nmbn, w_nmbn,h_nmbn);
        b_2.setBounds(x_nmbn+w_nmbn, y_nmbn, w_nmbn,h_nmbn);
        b_3.setBounds(x_nmbn+2*w_nmbn, y_nmbn, w_nmbn,h_nmbn);
        b_4.setBounds(x_nmbn, y_nmbn-h_nmbn, w_nmbn,h_nmbn);
        b_5.setBounds(x_nmbn+w_nmbn, y_nmbn-h_nmbn, w_nmbn,h_nmbn);
        b_6.setBounds(x_nmbn+2*w_nmbn, y_nmbn-h_nmbn, w_nmbn,h_nmbn);
        b_7.setBounds(x_nmbn, y_nmbn-2*h_nmbn, w_nmbn,h_nmbn);
        b_8.setBounds(x_nmbn+w_nmbn, y_nmbn-2*h_nmbn, w_nmbn,h_nmbn);
        b_9.setBounds(x_nmbn+2*w_nmbn, y_nmbn-2*h_nmbn, w_nmbn,h_nmbn);
        b_del.setBounds(x_nmbn+2*w_nmbn, y_nmbn-3*h_nmbn, w_nmbn,h_nmbn);
        b_pw.setBounds(x_nmbn+w_nmbn, y_nmbn-3*h_nmbn, w_nmbn,h_nmbn);
        k_a.setBounds(x_nmbn+2*w_nmbn, y_nmbn-4*h_nmbn, w_nmbn,h_nmbn);
        k_z.setBounds(x_nmbn+3*w_nmbn, y_nmbn-4*h_nmbn, w_nmbn,h_nmbn);




        b_0.setBackground(Color.GRAY);

        
        frame_nm.add(b_0);
        frame_nm.add(b_pt);
        frame_nm.add(b_bs);
        frame_nm.add(b_1);
        frame_nm.add(b_2);
        frame_nm.add(b_3);
        frame_nm.add(b_4);
        frame_nm.add(b_5);
        frame_nm.add(b_6);
        frame_nm.add(b_7);
        frame_nm.add(b_8);
        frame_nm.add(b_9);
        frame_nm.add(b_del);
        frame_nm.add(b_pw);
        frame_nm.add(k_a);
        frame_nm.add(k_z);



         
     }
}
