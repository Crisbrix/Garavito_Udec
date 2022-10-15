package garavito_udec;

import javax.swing.JRadioButton;

public class Preguntas extends javax.swing.JFrame {
    public Preguntas() {
        initComponents();
        int num = 1;
        
            Question.setText("<html><h1>Pregunta "+num+"</h1>");
            
            questions.setText("<html><p>¿Qué parentesco tiene conmigo el hermano de mi padre?</p>");
        
            groups();
            
            
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group1 = new javax.swing.ButtonGroup();
        textP = new javax.swing.JPanel();
        Question = new javax.swing.JLabel();
        questions1 = new javax.swing.JPanel();
        questions = new javax.swing.JLabel();
        selection = new javax.swing.JPanel();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(602, 355));

        textP.setBackground(new java.awt.Color(51, 255, 255));

        Question.setBackground(new java.awt.Color(255, 0, 0));
        Question.setForeground(new java.awt.Color(255, 0, 0));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout textPLayout = new javax.swing.GroupLayout(textP);
        textP.setLayout(textPLayout);
        textPLayout.setHorizontalGroup(
            textPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textPLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        textPLayout.setVerticalGroup(
            textPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        questions1.setBackground(new java.awt.Color(153, 153, 153));

        questions.setText(" ¿Qué parentesco tiene conmigo el hermano de mi padre?");

        javax.swing.GroupLayout questions1Layout = new javax.swing.GroupLayout(questions1);
        questions1.setLayout(questions1Layout);
        questions1Layout.setHorizontalGroup(
            questions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questions1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        questions1Layout.setVerticalGroup(
            questions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questions1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selection.setBackground(new java.awt.Color(102, 102, 102));

        radio2.setText("Hermano    ");

        radio3.setText("Abuelo       ");
        radio3.setToolTipText("");

        radio4.setText("Primo");

        radio1.setText("tio");

        javax.swing.GroupLayout selectionLayout = new javax.swing.GroupLayout(selection);
        selection.setLayout(selectionLayout);
        selectionLayout.setHorizontalGroup(
            selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio1)
                    .addGroup(selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(radio3)
                        .addComponent(radio4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(radio2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(22, 22, 22))
        );
        selectionLayout.setVerticalGroup(
            selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(radio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio4)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(questions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(textP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groups(){
        
        if(radio1.isSelected()){
            
        }
        
        if(radio1.isSelected()==true)
                {
                    this.setVisible(false);
        
                    Garavito_UdecF v1 = new Garavito_UdecF();
                    v1.setVisible(true);
                }
        
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group1;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel questions;
    private javax.swing.JPanel questions1;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JPanel selection;
    private javax.swing.JPanel textP;
    // End of variables declaration//GEN-END:variables
}
