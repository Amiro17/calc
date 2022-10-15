package calc;

import java.awt.event.*;


public class btn_actionlistener extends ui_main  implements ActionListener{
        
        public static String main_input = "";
        
        public void action_handler(){

            parser pars = new parser();
            b_eq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               double x = pars.eval(main_input);
               x = (double)Math.round(x * 100000d) / 100000d;
               main_input = Double.toString(x);
               output.setText(main_input);
            }
            });

            b_bs.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    StringBuffer sb= new StringBuffer(main_input);  
                    sb.deleteCharAt(sb.length()-1);  
                    main_input = sb.toString();
                    output.setText(main_input);
                }
                });

            b_del.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    main_input = "";
                    output.setText(main_input);
                }
                });

            b_pt.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    main_input = main_input + ".";
                    output.setText(main_input);
                }
                });
            
            btn_actionlistener btn_act = new btn_actionlistener();
            b_0.addActionListener(btn_act);
            b_1.addActionListener(btn_act);
            b_2.addActionListener(btn_act);
            b_3.addActionListener(btn_act);
            b_4.addActionListener(btn_act);
            b_5.addActionListener(btn_act);
            b_6.addActionListener(btn_act);
            b_7.addActionListener(btn_act);
            b_8.addActionListener(btn_act);
            b_9.addActionListener(btn_act);
            b_plus.addActionListener(btn_act);
            b_minus.addActionListener(btn_act);
            b_mul.addActionListener(btn_act);
            b_div.addActionListener(btn_act);
            b_pw.addActionListener(btn_act);
            k_a.addActionListener(btn_act);
            k_z.addActionListener(btn_act);
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            main_input = main_input + s;
            output.setText(main_input);
            
        }

    
    }
