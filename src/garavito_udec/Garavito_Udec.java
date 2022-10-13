package garavito_udec;

public class Garavito_Udec {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            int v1 = 0;
            
            public void run() {
                new Garavito_UdecF().setVisible(true);
            }
           
        });
    }
}
