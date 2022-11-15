package garavito_udec.Controllers;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Questions extends javax.swing.JFrame {
    //declaration of variables
        int i = 1;
        public static int Ng2;
        int Ng1;
        int Ng;
        
        int numero = (int)(Math.random() * 10 - 1);
        
    public Questions() {
        initComponents();
        panelPrincipal(i);
        configurationPanel();
        numberR();
    }
    
    private void configurationPanel(){
        getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        
        
        Garavito_UdecF v2 = new Garavito_UdecF();
        v2.setVisible(false);
        Ng1 = v2.Ng;
        Ng2 = Ng1;
        labelNg1.setText(""+Ng2);
        System.out.println("A-"+Ng2);
        Ng2--;
        
    } 
    
    private void numberR(){
       switch(numero){
           case 1:
               question1();
           break;
           case 2:
               question2();
           break;
           case 3:
               question3();
           break;
           case 4:
               question4();
           break;
           case 5:
               question5();
           break;
           case 6:
               question6();
           break;
           case 7:
               question7();
           break;
           case 8:
               question8();
           break;
           case 9:
               question9();
           break;
           case 10:
               question10();
           break;
       }
    }
    
    private void panelPrincipal(int i){
        //text principal
        Question.setText("<html><h1>Pregunta "+i+"</h1>");
        i ++;
    }
        
    private void question1(){
        //question    
        questions.setText("<html><p>Cuatro gatos en un cuarto, "
                + "cada gato en un rincón, cada gato ve tres gatos, "
                + "adivina cuántos gatos son.</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        
        //add text for radio button
        radio1.setText("Tres Gatos");
        radio2.setText("Cuatro Gatos");//Correcta
        radio3.setText("Dos Gatos");
        radio4.setText("Nueve Gatos");
    }
    private void question2(){
        //question    
        questions.setText("<html><p>¿El hermano de mi padre "
                + "que parentezco tiene conmigo?</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("Abuelo");
        radio2.setText("Cuñado");
        radio3.setText("Hermano");
        radio4.setText("Tio");//Correct
        
        
    }
    private void question3(){
        //question    
        questions.setText("<html><p>Hay 2 padres y 2 hijos, pero solo hay 3 "
                + "personas ¿Cómo es? </p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("El hijo, el tío y el abuelo");
        radio2.setText("El padre, el cuñado el abuelo");
        radio3.setText("El abuelo, el padre y el hijo");//C
        radio4.setText("El Tío, el abuelo y el hijo");
    }
    private void question4(){
        //question    
        questions.setText("<html><p>¿Qué pesa más, un kilo de hierro "
                + "o un kilo de paja?</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("Un Kilo de hierro");
        radio2.setText("Un kilo de paja");
        radio3.setText("Ambas pesan lo mismo");//C
        radio4.setText("Ninguna de las anteriores");
    }
    private void question5(){
        //question    
        questions.setText("<html><p>Tengo mas de 3 lados y menos de 5 lados. "
                + "Tengo todos mis lados iguales. ¿quien soy?</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("Rombo");//C
        radio2.setText("Dodecaedro");
        radio3.setText("Triangulo");
        radio4.setText("Circulo");
    }
    private void question6(){
        //question    
        questions.setText("<html><p>No soy triangular, "
                + "no soy rectangular, no soy el cuadrado. "
                + "Mi lado es una línea curva. ¿quien soy?</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("Dodecaedro");
        radio2.setText("Rombo");
        radio3.setText("Triangulo");
        radio4.setText("Circulo");//C
    
    }
    private void question7(){
        //question    
        questions.setText("<html><p>No tengo 4 lados, no tengo 5 lados. "
                + "Tengo la mitad de 6 lados.¿Quién soy?</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("Dodecaedro");
        radio2.setText("Circulo");
        radio3.setText("Triangulo");//C
        radio4.setText("Rombo");
    }
    private void question8(){
        //question    
        questions.setText("<html><p>Adivina, adivina una figura es, dos "
                + "lados más largos y dos cortos también, se parece al cuadrado, "
                + "pero se alarga de un lado a la vez.</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("Dodecaedro");
        radio2.setText("Circulo");
        radio3.setText("Rectangulo");//C
        radio4.setText("Triangulo");
    }
    private void question9(){
        //question    
        questions.setText("<html><p>Son las doce de la mañana, hora de mis "
                + "pastillas. Me tengo que tomar 4 pastillas, una cada hora. "
                + "¿A qué hora me tomaré la última?</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("A las 3 de la tarde");//C
        radio2.setText("A las 4 de la tarde");
        radio3.setText("A las 5 de la tarde");
        radio4.setText("A las 6 de la tarde");
    }
    private void question10(){
        //question    
        questions.setText("<html><p>Corren más que los minutos pero... "
                + "nunca llegan los primeros!!! ¿qué son?</p>");
        //add buttons radios for group
        Group1.add(radio1);
        Group1.add(radio2);
        Group1.add(radio3);
        Group1.add(radio4);
        //add text for radio button
        radio1.setText("Los Dias");
        radio2.setText("Las Horas");
        radio3.setText("Los Minutos");
        radio4.setText("Los segundos");//c
    }
    
    private void backHome(){
        //enable Garavito_UdecF panel visibility
        Garavito_UdecF v1 = new Garavito_UdecF();
        v1.setVisible(true);
        this.setVisible(false);
    }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group1 = new javax.swing.ButtonGroup();
        textP = new javax.swing.JPanel();
        Question = new javax.swing.JLabel();
        questions1 = new javax.swing.JPanel();
        questions = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radio2 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        labelNg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textP.setBackground(new java.awt.Color(51, 51, 51));

        Question.setBackground(new java.awt.Color(255, 255, 255));
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setToolTipText("");

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

        questions1.setBackground(new java.awt.Color(51, 51, 51));
        questions1.setForeground(new java.awt.Color(255, 255, 255));

        questions.setForeground(new java.awt.Color(255, 255, 255));

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
                .addGap(32, 32, 32)
                .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        radio2.setBackground(new java.awt.Color(51, 51, 51));
        radio2.setForeground(new java.awt.Color(255, 255, 255));

        radio4.setBackground(new java.awt.Color(51, 51, 51));
        radio4.setForeground(new java.awt.Color(255, 255, 255));

        radio3.setBackground(new java.awt.Color(51, 51, 51));
        radio3.setForeground(new java.awt.Color(255, 255, 255));

        radio1.setBackground(new java.awt.Color(51, 51, 51));
        radio1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radio1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        labelNg1.setForeground(new java.awt.Color(255, 255, 255));
        labelNg1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNg1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNg1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (numero){
            case 1:
                question1();
             
             if (radio2.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
             break;
             
            case 2:
                question2();
             
             if (radio4.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 3:
                question3();
             
             if (radio3.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 4:
                question4();
             
             if (radio3.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 5:
                question5();
             
             if (radio1.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 6:
                question6();
             
             if (radio4.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 7:
                question7();
             
             if (radio3.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 8:
                question8();
             
             if (radio3.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 9:
                question9();
             
             if (radio1.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
            case 10:
                question10();
             
             if (radio4.isSelected()==true){
                 JOptionPane.showMessageDialog(rootPane,"¡Correcto!");
                 backHome();
             }else{
                 JOptionPane.showMessageDialog(rootPane,"Incorrecto");
             }
            break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group1;
    private javax.swing.JLabel Question;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNg1;
    private javax.swing.JLabel questions;
    private javax.swing.JPanel questions1;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JPanel textP;
    // End of variables declaration//GEN-END:variables
}