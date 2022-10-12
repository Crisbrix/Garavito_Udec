package garavito_udec;

import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

public class Garavito_UdecF extends javax.swing.JFrame {
    //define variables
    int salir;
    int bot = 1;
    int matriz[][] = new int [3][3];
    int control;
    int countx = 0;
    int counto = 0;
    int count = 0;
    int counte = 0;
    int Ng = 10;
    int estatus = 1;
    
            
    public Garavito_UdecF() {
        initComponents();
        text();
        
        name.setText("<html><fond text-align 'center'><h1><font color='black'>Triqui</h1>");
        
        while(estatus == 1){
            start();
            
        }
    }
    //Start of programm
    
    private void start(){
        bot = JOptionPane.showConfirmDialog(null, "¿Quieres jugar contra el pc?");
        
        if (bot == 2){
            salir();
        }
        
        try
        {
            Ng = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de partidas que deseean jugar: "));
            do
            { 
                estatus = 0;
            } 
            while(Ng<=0);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "No es un valor valido");
        estatus = 1;
        }
        
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
        textj = new javax.swing.JTextField();
        Em = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vJugar.setBackground(new java.awt.Color(51, 51, 51));
        vJugar.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setText("Jugador 1");

        jLabel2.setText("Jugador 2");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Empate");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("N° jugadas");

        P2.setEditable(false);
        P2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        P1.setEditable(false);
        P1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        textj.setEditable(false);

        Em.setEditable(false);
        Em.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vJugar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Em, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vJugar)
                                    .addComponent(jButton1))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrar() {
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
    
    private void borrarC(){
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
    
    private void contx() {
        countx = countx + 1;
        String x = Integer.toString(countx);
        P1.setText(x);
    }

    private void conto() {
        counto = counto + 1;
        String o = Integer.toString(counto);
        P2.setText(o);
    }
    
    private void linea0 (){
        if (matriz[0][0]+ matriz[0][1]+ matriz[0][2] == 252 ){
            JOptionPane.showMessageDialog(rootPane, "Gano jugador 1");
            count ++;
            contx();
            borrar();
            NumberGames();
        }
        
        if (matriz[0][0]+matriz[0][1]+matriz[0][1] == 720){
            JOptionPane.showMessageDialog(rootPane, "Gano jugador 2");
            count ++;
            conto();
            borrar();
            NumberGames();
        }
    }
    
    private void linea1 (){
        if (matriz[1][0]+ matriz[1][1]+ matriz[1][2] == 258){
            JOptionPane.showMessageDialog(rootPane, "Gano jugador 1");
            count ++;
            contx();
            borrar();
            NumberGames();
        }
        
        if (matriz[1][0]+matriz[1][1]+matriz[1][1] == 720){
            JOptionPane.showMessageDialog(rootPane, "Gano jugador 2");
            count ++;
            conto();
            borrar();
            NumberGames();
        }
    }
    
    private void linea2 (){
        if (matriz[2][0]+ matriz[2][1]+ matriz[2][2] == 258){
            JOptionPane.showMessageDialog(rootPane, "Gano jugador 1");
            count ++;
            contx();
            borrar();
            NumberGames();
        }
        
        if (matriz[2][0]+matriz[2][1]+matriz[2][1] == 720){
            JOptionPane.showMessageDialog(rootPane, "Gano jugador 2");
            count ++;
            conto();
            borrar();
            NumberGames();
        }
    }
    
    private void linea3() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][0];

            if (acu == 1) {
                JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
                count ++;
                contx();
                borrar();
                NumberGames();
            }
            if (acu == 2) {
                JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
                count ++;
                conto();
                borrar();
                NumberGames();
            }
        }
    }
    
    private void linea4() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][1];

            if (acu == 1) {
                JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
                count ++;
                contx();
                borrar();
                NumberGames();
            }
            if (acu == 2) {
                JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
                count ++;
                conto();
                borrar();
                NumberGames();
            }
        }
    }

    private void linea5() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][2];

            if (acu == 1) {
                JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
                count ++;
                contx();
                borrar();
                NumberGames();
            }
            if (acu == 2) {
                JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
                count ++;
                conto();
                borrar();
                NumberGames();
            }
        }
    }
    
    private void lineax() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {

            acu = acu + matriz[x][x];

            if (acu == 1) {
                JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
                count ++;
                contx();
                borrar();
                NumberGames();
            }
            if (acu == 2) {
                JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
                count ++;
                conto();
                borrar();
                NumberGames();
            }
        }
    }
    
    private void lineaxb() {
        int acu = 0;
        int cont = 2;
        for (int i = 0; i <= 2; i++) {

            acu = acu + matriz[cont][i];
            cont --;

            if (acu == 252) {
                JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
                count ++;
                contx();
                borrar();
                NumberGames();
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
                count ++;
                conto();
                borrar();
                NumberGames();
            }
        }
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vJugarActionPerformed
        start();
    }//GEN-LAST:event_vJugarActionPerformed

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
        empatejuego();
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
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
        
        linea0();
        linea3();
        lineax();
        NumberGames();
    }//GEN-LAST:event_b9ActionPerformed
    
    private void text(){
        String x = Integer.toString(Ng);
        textj.setText(x);
        System.out.println(Ng);
    }
    
    private void salir(){
        salir = JOptionPane.showConfirmDialog(null,"¿Quieres salir del juego?");
        if(salir == 0){
            exit(0);
        } 
        
    }
    
    private void empatejuego() {
        int acu = 0;
        for (int j = 0; j <= 2; j++) {
            for (int k = 0; k <= 2; k++) {
                acu = acu + matriz[j][k];
            }
        }
        if (acu == 1380 || acu == 1536) {

            JOptionPane.showMessageDialog(rootPane, "¡Empate!");
            counte ++;
            Ng ++;
            String e = Integer.toString(counte);
            Em.setText(e);
            borrar();
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
    private javax.swing.JLabel name;
    private javax.swing.JTextField textj;
    private javax.swing.JButton vJugar;
    // End of variables declaration//GEN-END:variables
}