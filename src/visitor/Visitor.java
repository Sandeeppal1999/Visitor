/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import SS.Progress;

import SS.Progress;
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Progress Splash=new Progress();
    Splash.setVisible(true);
    try {
    for (int i = 0; i <= 100; i++) {
    Thread.sleep(39);
    Splash.load.setText(Integer.toString(i)+"%");
    Splash.loadbar.setValue(i);
    }
    Thread.sleep(500);
    Splash.setVisible(false); 
    } catch (Exception e) {
    } try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
         new Home1().setVisible(true); 
    }
    
}
