package garavito_udec.Controllers;

    //imports
    import static java.lang.System.exit;
    import javax.swing.JOptionPane;

public class Garavito_UdecF extends javax.swing.JFrame {
    //define variables
    int exit;
    int matriz[][] = new int [3][3];
    int control;
    int countx = 0;
    int counto = 0;
    int count = 0;
    int counte = 0;
    int queG = 0;
    int Ng1 = 0;
    public static int Ng = 0;
    
    //initialize panels of amount of games and game with the pc
    public Garavito_UdecF() {
        initComponents();
        configurationPanel();
        start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        vJugar = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        P2 = new javax.swing.JTextField();
        P1 = new javax.swing.JTextField();
        Em = new javax.swing.JTextField();
        labelNg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vJugar.setBackground(new java.awt.Color(204, 204, 204));
        vJugar.setText("Volver a jugar");
        vJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vJugarActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(204, 204, 204));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 204, 204));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(204, 204, 204));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(204, 204, 204));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(204, 204, 204));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(204, 204, 204));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(204, 204, 204));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(204, 204, 204));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(204, 204, 204));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("insert text here");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jugador 1");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jugador 2");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Empate");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("N?? jugadas");

        P2.setEditable(false);
        P2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        P1.setEditable(false);
        P1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Em.setEditable(false);
        Em.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelNg.setEditable(false);
        labelNg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelNg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelNgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P1))
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Em, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelNg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vJugar)
                            .addComponent(jButton1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(58, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//settings
    private void configurationPanel(){
        this.setLocationRelativeTo(null);
        name.setText("<html><fond text-align 'center'><h1><font color='black'>Triqui</h1>");
        textNg();
    }
    //Start of program
    private void start(){
        //llama al objeto para obtener el numero de jugadas
        numberGames v1 = new numberGames();
        v1.setVisible(false);
        Ng = numberGames.Ng1;
        
        if (queG >= 1){
            Questions v3 = new Questions();
            v3.setVisible(false);
            v3.setVisible(false);
            Ng = v3.Ng2;
            System.out.println(Ng);
        }
        
        
        //retornar al numero de jugadas
        if (Ng == 0){
            v1.setVisible(true);
            this.setVisible(false);
        }
    }
    //function to restart matrix
    private void delete() {
        b1.setText("");
        b1.setEnabled(true);
        b2.setText("");
        b2.setEnabled(true);
        b3.setText("");
        b3.setEnabled(true);
        b4.setText("");
        b4.setEnabled(true);
        b5.setText("");
        b5.setEnabled(true);
        b6.setText("");
        b6.setEnabled(true);
        b7.setText("");
        b7.setEnabled(true);
        b8.setText("");
        b8.setEnabled(true);
        b9.setText("");
        b9.setEnabled(true);

        for (int x = 0; x <= 2; x++) {
            for (int i = 0; i <= 2; i++) {

                matriz[x][i] = 0;
            }
        }
    }
    //function to restart all program
    private void deleteA(){
        b1.setText("");
        b1.setEnabled(true);
        b2.setText("");
        b2.setEnabled(true);
        b3.setText("");
        b3.setEnabled(true);
        b4.setText("");
        b4.setEnabled(true);
        b5.setText("");
        b5.setEnabled(true);
        b6.setText("");
        b6.setEnabled(true);
        b7.setText("");
        b7.setEnabled(true);
        b8.setText("");
        b8.setEnabled(true);
        b9.setText("");
        b9.setEnabled(true);
        
        P1.setText(null);
        P2.setText(null);
        Em.setText(null);
        
        Ng = 0;
        
        for (int x = 0; x <= 2; x++) {
            for (int i = 0; i <= 2; i++) {
                matriz[x][i] = 0;
            }
        }
        
    }
    //fuction to count games
    private void NumberGames(){
        if (count == Ng){
            b1.setText("");
            b1.setEnabled(true);
            b2.setText("");
            b2.setEnabled(true);
            b3.setText("");
            b3.setEnabled(true);
            b4.setText("");
            b4.setEnabled(true);
            b5.setText("");
            b5.setEnabled(true);
            b6.setText("");
            b6.setEnabled(true);
            b7.setText("");
            b7.setEnabled(true);
            b8.setText("");
            b8.setEnabled(true);
            b9.setText("");
            b9.setEnabled(true);

            JOptionPane.showMessageDialog(rootPane, "El juego a terminado");
        }
    }
    //count games to player 1
    private void contx() {
        countx = countx + 1;
        String x = Integer.toString(countx);
        P1.setText(x);
    }
    //count games to player 1
    private void conto() {
        counto = counto + 1;
        String o = Integer.toString(counto);
        P2.setText(o);
    }
    //check matrix in line
    private void line0 (){
        if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 258){
            JOptionPane.showMessageDialog(rootPane, "JUGADOR 1 GANO");
            count ++;
            contx();
            delete();
            NumberGames();
            questions();
        }
        
        if (matriz[0][0]+matriz[0][1]+matriz[0][2] == 720){
            JOptionPane.showMessageDialog(rootPane, "JUGADOR 2 GANO");
            count ++;
            conto();
            delete();
            NumberGames();
            questions();
        }
    }
    
    private void line1 (){
        if (matriz[1][0]+ matriz[1][1]+ matriz[1][2] == 258){
            JOptionPane.showMessageDialog(rootPane, "JUGADOR 1 GANO");
            count ++;
            contx();
            delete();
            NumberGames();
            questions();
        }
        
        if (matriz[1][0]+matriz[1][1]+matriz[1][2] == 720){
            JOptionPane.showMessageDialog(rootPane, "JUGADOR 2 GANO");
            count ++;
            conto();
            delete();
            NumberGames();
            questions();
        }
    }
    
    private void line2 (){
        if (matriz[2][0]+ matriz[2][1]+ matriz[2][2] == 258){
            JOptionPane.showMessageDialog(rootPane, "JUGADOR 1 GANO");
            count ++;
            contx();
            delete();
            NumberGames();
            questions();
        }
        
        if (matriz[2][0]+matriz[2][1]+matriz[2][2] == 720){
            JOptionPane.showMessageDialog(rootPane, "JUGADOR 2 GANO");
            count ++;
            conto();
            delete();
            NumberGames();
            questions();
        }
    }
    
    private void line3() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][0];

            if (acu == 258) {
                JOptionPane.showMessageDialog(null, "JUGADOR 1 GANO");
                count ++;
                contx();
                delete();
                NumberGames();
                questions();
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR 2 GANO");
                count ++;
                conto();
                delete();
                NumberGames();
                questions();
            }
        }
    }
    
    private void line4() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][1];

            if (acu == 258) {
                JOptionPane.showMessageDialog(null, "JUGADOR 1 GANO");
                count ++;
                contx();
                delete();
                NumberGames();
                questions();
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR 2 GANO");
                count ++;
                conto();
                delete();
                NumberGames();
                questions();
            }
        }
    }

    private void line5() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][2];

            if (acu == 258) {
                JOptionPane.showMessageDialog(null, "JUGADOR 1 GANO");
                count ++;
                contx();
                delete();
                NumberGames();
                questions();
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR 2 GANO");
                count ++;
                conto();
                delete();
                NumberGames();
                questions();
            }
        }
    }
    //check matrix in shape for X
    private void linex() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][x];

            if (acu == 258) {
                JOptionPane.showMessageDialog(null, "JUGADOR 1 GANO");
                count ++;
                contx();
                delete();
                NumberGames();
                questions();
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR 2 GANO");
                count ++;
                conto();
                delete();
                NumberGames();
                questions();
            }
        }
    }
    //check matrix in shape for X reverse
    private void linexb() {
        int acu = 0;
        int cont = 2;
        for (int i = 0; i <= 2; i++) {

            acu = acu + matriz[cont][i];
            cont --;
            
            if (acu == 258) {
                JOptionPane.showMessageDialog(null, "JUGADOR 1 GANO");
                count ++;
                contx();
                delete();
                NumberGames();
                questions();
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR 2 GANO");
                count ++;
                conto();
                delete();
                NumberGames();
                questions();
            }
        }
    }
    
    //exit event
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit1();
    }//GEN-LAST:event_jButton1ActionPerformed
    //come back game event
    private void vJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vJugarActionPerformed
        deleteA();
        start();
    }//GEN-LAST:event_vJugarActionPerformed
    //controllers events
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if (control == 1) {
            b1.setText("X");
            matriz[0][0] = 86;
            control = 2;
            b1.setEnabled(false);
        } else {
            b1.setText("O");
            matriz[0][0] = 240;
            control = 1;
            b1.setEnabled(false);
        }
        
        line1();
        line4();
        linex();
        NumberGames();
        tieGame();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (control == 1) {
            b2.setText("X");
            matriz[0][1] = 86;
            control = 2;
            b2.setEnabled(false);
        } else {
            b2.setText("O");
            matriz[0][1] = 240;
            control = 1;
            b2.setEnabled(false);
        }
        
        line1();
        line4();
        linex();
        NumberGames();
        tieGame();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (control == 1) {
            b3.setText("X");
            matriz[0][2] = 86;
            control = 2;
            b3.setEnabled(false);
        } else {
            b3.setText("O");
            matriz[0][2] = 240;
            control = 1;
            b3.setEnabled(false);
        }
        
        line1();
        line0();
        line3();
        linex();
        line5();
        linexb();
        tieGame();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (control == 1) {
            b4.setText("X");
            matriz[1][0] = 86;
            control = 2;
            b4.setEnabled(false);
        } else {
            b4.setText("O");
            matriz[1][0] = 240;
            control = 1;
            b4.setEnabled(false);
        }
        
        line1();
        line3();
        linex();
        line5();
        tieGame();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (control == 1) {
            b5.setText("X");
            matriz[1][1] = 86;
            control = 2;
            b5.setEnabled(false);
        } else {
            b5.setText("O");
            matriz[1][1] = 240;
            control = 1;
            b5.setEnabled(false);
        }
        
        line1();
        line4();
        linex();
        linexb();
        tieGame();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (control == 1) {
            b6.setText("X");
            matriz[1][2] = 86;
            control = 2;
            b6.setEnabled(false);
        } else {
            b6.setText("O");
            matriz[1][2] = 240;
            control = 1;
            b6.setEnabled(false);
        }
        
        line1();
        line3();
        line5();
        linex();
        NumberGames();
        tieGame();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (control == 1) {
            b7.setText("X");
            matriz[2][0] = 86;
            control = 2;
            b7.setEnabled(false);
        } else {
            b7.setText("O");
            matriz[2][0] = 240;
            control = 1;
            b7.setEnabled(false);
        }
        
        line2();
        line3();
        linex();
        linexb();
        tieGame();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (control == 1) {
            b8.setText("X");
            matriz[2][1] = 86;
            control = 2;
            b8.setEnabled(false);
        } else {
            b8.setText("O");
            matriz[2][1] = 240;
            control = 1;
            b8.setEnabled(false);
        }
        
        line2();
        line4();
        linex();
        tieGame();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (control == 1) {
            b9.setText("X");
            matriz[2][2] = 86;
            control = 2;
            b9.setEnabled(false);
        } else {
            b9.setText("O");
            matriz[2][2] = 240;
            control = 1;
            b9.setEnabled(false);
        }
        
        line2();
        line3();
        line5();
        linex();
        tieGame();
    }//GEN-LAST:event_b9ActionPerformed

    private void labelNgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNgActionPerformed
        textNg();
    }//GEN-LAST:event_labelNgActionPerformed
   
    private void textNg(){
        labelNg.setText(""+Ng);
        System.out.println(Ng);
    }
    //function to exit
    private void exit1(){
        exit = JOptionPane.showConfirmDialog(null,"??Quieres salir del juego?");
        if(exit == 0){
            exit(0);
        }    
    }
    //panel from questions
    private void questions(){
        
    //enable question panel visibility
    Questions v1 = new Questions();
    v1.setVisible(true);
    this.setVisible(false);
    queG++;
    }    
    //tieGame and reset of matrix
    private void tieGame() {
        int acu = 0;
        for (int j = 0; j <= 2; j++) {
            for (int k = 0; k <= 2; k++) {
                acu = acu + matriz[j][k];
            }
        }
        if (acu == 1544 || acu == 1390) {

            JOptionPane.showMessageDialog(rootPane, "??Empate!");
            counte ++;
            Ng --;
            labelNg.setText(""+Ng);
            String e = Integer.toString(counte);
            Em.setText(e);
            delete();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Em;
    private javax.swing.JTextField P1;
    private javax.swing.JTextField P2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField labelNg;
    private javax.swing.JLabel name;
    private javax.swing.JButton vJugar;
    // End of variables declaration//GEN-END:variables
}