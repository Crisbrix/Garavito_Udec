package garavito_udec;

import java.util.Random;
import javax.swing.JOptionPane;


public class Questions extends javax.swing.JFrame {
    //declaration of variables
        int i = 1;
    public Questions() {
        initComponents();
        panelPrincipal(i);
        
        
        int numero = (int)(Math.random()*10+1);

        System.out.println(numero);
         
        if (numero == 1){
             question1();
         }else
            if (numero == 2){
             question2();
         }else
            if (numero == 3){
             question3();
         }else
            if (numero == 4){
             question4();
         }else
            if (numero == 5){
             question5();
         }else
            if (numero == 6){
             question6();
         }else
            if (numero == 7){
             question7();
         }else
            if (numero == 8){
             question8();
         }else
            if (numero == 9){
             question9();
         }else
            if (numero == 10){
             question10();
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
    }
    private void question2(){
        //question    
        questions.setText("<html><p>Un señor y sus 2 hijos quieren pasar un río "
                + "en una balsa, pero la balsa solo aguanta 80kg. Él pesa 80Kg y cada "
                + "uno de sus hijos 40kg ¿Cómo pasarán?¿teniendo que llevar la balsa "
                + "otra vez de vuelta para que pasen todos? </p>");
        //add buttons radios for group
        
        
    }
    private void question3(){
        //question    
        questions.setText("<html><p>Hay 2 padres y 2 hijos, pero solo hay 3 "
                + "personas ¿Cómo es? </p>");
        //add buttons radios for group
    }
    private void question4(){
        //question    
        questions.setText("<html><p>¿Qué pesa más, un kilo de hierro "
                + "o un kilo de paja?</p>");
        //add buttons radios for group
    }
    private void question5(){
        //question    
        questions.setText("<html><p>Tengo mas de 3 lados y menos de 5 lados. "
                + "Tengo todos mis lados iguales. ¿quien soy?</p>");
        //add buttons radios for group
    }
    private void question6(){
        //question    
        questions.setText("<html><p>No soy triangular, "
                + "no soy rectangular, no soy el cuadrado. "
                + "Mi lado es una línea curva. ¿quien soy?</p>");
        //add buttons radios for group
    }
    private void question7(){
        //question    
        questions.setText("<html><p>No tengo 4 lados, no tengo 5 lados. "
                + "Tengo la mitad de 6 lados.¿Quién soy?</p>");
        //add buttons radios for group
    }
    private void question8(){
        //question    
        questions.setText("<html><p>Adivina, adivina una figura es, dos "
                + "lados más largos y dos cortos también, se parece al cuadrado, "
                + "pero se alarga de un lado a la vez.</p>");
        //add buttons radios for group
    }
    private void question9(){
        //question    
        questions.setText("<html><p>Son las doce de la mañana, hora de mis "
                + "pastillas. Me tengo que tomar 4 pastillas, una cada hora. "
                + "¿A qué hora me tomaré la última?</p>");
        //add buttons radios for group
    }
    private void question10(){
        //question    
        questions.setText("<html><p>Corren más que los minutos pero... "
                + "nunca llegan los primeros!!! ¿qué son?</p>");
        //add buttons radios for group
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textP.setBackground(new java.awt.Color(255, 0, 0));

        Question.setBackground(new java.awt.Color(255, 0, 0));
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

        questions1.setBackground(new java.awt.Color(153, 255, 255));

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

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(textP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(questions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(textP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Group1;
    private javax.swing.JLabel Question;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel questions;
    private javax.swing.JPanel questions1;
    private javax.swing.JPanel textP;
    // End of variables declaration//GEN-END:variables
}