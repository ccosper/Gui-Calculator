
import org.w3c.dom.Text;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ccosp
 */
public class Face extends javax.swing.JFrame {

    /**
     * Creates new form Face
     */
    public Face() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        button1 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        button8 = new java.awt.Button();
        textArea2 = new java.awt.TextArea();
        ADD = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();
        button17 = new java.awt.Button();
        button18 = new java.awt.Button();
        button7 = new java.awt.Button();
        button19 = new java.awt.Button();
        button20 = new java.awt.Button();
        textArea1 = new java.awt.TextArea();
        button22 = new java.awt.Button();
        button21 = new java.awt.Button();

        button1.setLabel("button1");

        jButton1.setText("jButton1");

        button8.setLabel("button8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ADD.setBackground(new java.awt.Color(51, 255, 102));
        ADD.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ADD.setLabel("+");
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
        });
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(51, 255, 102));
        button2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button2.setLabel("/");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 255, 102));
        button3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button3.setLabel("*");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 204, 102));
        button4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button4.setLabel("-");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
        });

        button5.setBackground(new java.awt.Color(0, 153, 102));
        button5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button5.setLabel("Enter =");
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
        });

        button6.setBackground(new java.awt.Color(102, 255, 102));
        button6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button6.setLabel("Sqr");

        button10.setBackground(new java.awt.Color(0, 255, 102));
        button10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button10.setLabel("4");
        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button10MouseClicked(evt);
            }
        });

        button11.setBackground(new java.awt.Color(0, 153, 102));
        button11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button11.setLabel("1");
        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button11MouseClicked(evt);
            }
        });
        button11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button11KeyPressed(evt);
            }
        });

        button12.setBackground(new java.awt.Color(102, 255, 102));
        button12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button12.setLabel("8");
        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button12MouseClicked(evt);
            }
        });
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button13.setBackground(new java.awt.Color(0, 255, 102));
        button13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button13.setLabel("5");
        button13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button13MouseClicked(evt);
            }
        });

        button14.setBackground(new java.awt.Color(0, 153, 102));
        button14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button14.setLabel("2");
        button14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button14MouseClicked(evt);
            }
        });

        button15.setBackground(new java.awt.Color(102, 255, 102));
        button15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button15.setLabel("9");
        button15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button15MouseClicked(evt);
            }
        });
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        button16.setBackground(new java.awt.Color(0, 255, 102));
        button16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button16.setLabel("6");
        button16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button16MouseClicked(evt);
            }
        });
        button16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button16KeyPressed(evt);
            }
        });

        button17.setBackground(new java.awt.Color(0, 153, 102));
        button17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button17.setLabel("3");
        button17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button17MouseClicked(evt);
            }
        });

        button18.setBackground(new java.awt.Color(0, 102, 102));
        button18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button18.setLabel("0");
        button18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button18MouseClicked(evt);
            }
        });
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(102, 255, 102));
        button7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button7.setLabel("7");
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
        });

        button19.setActionCommand("button19");
        button19.setBackground(new java.awt.Color(0, 102, 102));
        button19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button19.setLabel("Delete <");
        button19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button19MouseClicked(evt);
            }
        });

        button20.setActionCommand("button20");
        button20.setBackground(new java.awt.Color(0, 102, 102));
        button20.setLabel("Clear");
        button20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button20MouseEntered(evt);
            }
        });

        textArea1.setBackground(new java.awt.Color(153, 255, 153));
        textArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textArea1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textArea1InputMethodTextChanged(evt);
            }
        });
        textArea1.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textArea1TextValueChanged(evt);
            }
        });

        button22.setActionCommand("button22");
        button22.setBackground(new java.awt.Color(0, 102, 102));
        button22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button22.setLabel("(");
        button22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button22MouseClicked(evt);
            }
        });

        button21.setBackground(new java.awt.Color(0, 102, 102));
        button21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button21.setLabel(")");
        button21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(button18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button14, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button17, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(button16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(button16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(button17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        button19.getAccessibleContext().setAccessibleName("button19");
        button20.getAccessibleContext().setAccessibleName("button20");
        button22.getAccessibleContext().setAccessibleName("button22");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
      int zero = 0;
      String str = "0";
      textArea1.append(str);
    }//GEN-LAST:event_button18ActionPerformed

    private void button18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button18MouseClicked
      int zero = 0;
      String str = "0";
      textArea1.append(str);
    }//GEN-LAST:event_button18MouseClicked

    private void textArea1TextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textArea1TextValueChanged
        System.out.println("This is a test");
    }//GEN-LAST:event_textArea1TextValueChanged

    private void textArea1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textArea1InputMethodTextChanged
       
    }//GEN-LAST:event_textArea1InputMethodTextChanged

    private void button11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button11MouseClicked
      int one = 1 ;
      String str = "1";
      textArea1.append(str);
    }//GEN-LAST:event_button11MouseClicked

    private void button11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button11KeyPressed
      int one = 1 ;
      String str = "1";
      textArea1.append(str);
    }//GEN-LAST:event_button11KeyPressed

    private void button14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button14MouseClicked
      int two = 2 ;
      String str = "2";
      textArea1.append(str);// TODO add your handling code here:
    }//GEN-LAST:event_button14MouseClicked

    private void button17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button17MouseClicked
      int three = 3;
      String str = "3";
      textArea1.append(str);
    }//GEN-LAST:event_button17MouseClicked

    private void button10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button10MouseClicked
      int four = 4;
      String str = "4";
      textArea1.append(str);
    }//GEN-LAST:event_button10MouseClicked

    private void button13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button13MouseClicked
      int five = 5;
      String str = "5";
      textArea1.append(str);
    }//GEN-LAST:event_button13MouseClicked

    private void button16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button16KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button16KeyPressed

    private void button16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button16MouseClicked
      int six = 6; 
      String str = "6";
      textArea1.append(str);
    }//GEN-LAST:event_button16MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
      int seven = 7;
      String str = "7";
      textArea1.append(str);
    }//GEN-LAST:event_button7MouseClicked

    private void button12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button12MouseClicked
      int eight = 8 ; 
      String str = "8";
      textArea1.append(str);
    }//GEN-LAST:event_button12MouseClicked

    private void button15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button15MouseClicked
      int nine = 9;
      String str = "1";
      textArea1.append(str);
    }//GEN-LAST:event_button15MouseClicked

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
     
      String str = "+";
      textArea1.append(str); 
    }//GEN-LAST:event_ADDMouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
      String str = "/";
      textArea1.append(str);
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        String str = "*";
      textArea1.append(str);
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
        String str = "-";
      textArea1.append(str);
    }//GEN-LAST:event_button4MouseClicked

    private void button19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button19MouseClicked
        String string = textArea1.getText();
        StringBuffer opr = new StringBuffer(string);
        if(opr.length()>0){
            opr.deleteCharAt(opr.length()-1);
            textArea1.setText(opr.toString()); 
        }        
    }//GEN-LAST:event_button19MouseClicked

    private void button20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button20MouseEntered

    }//GEN-LAST:event_button20MouseEntered

    private void button20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button20MouseClicked
        textArea1.setText(""); 
    }//GEN-LAST:event_button20MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        Calculate cal = new Calculate(textArea1.getText().toString());
        textArea2.setText(String.valueOf(cal.enter()));
    }//GEN-LAST:event_button5MouseClicked

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button12ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button15ActionPerformed

    private void button22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button22MouseClicked
         String str = "(";
      textArea1.append(str);
    }//GEN-LAST:event_button22MouseClicked

    private void button21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button21MouseClicked
         String str = ")";
      textArea1.append(str);
    }//GEN-LAST:event_button21MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Face().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ADD;
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button17;
    private java.awt.Button button18;
    private java.awt.Button button19;
    private java.awt.Button button2;
    private java.awt.Button button20;
    private java.awt.Button button21;
    private java.awt.Button button22;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JScrollBar jScrollBar1;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
