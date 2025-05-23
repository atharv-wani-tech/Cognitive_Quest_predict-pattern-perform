/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cognitive_Quest_predict_pattern_perform;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asd
 */
public class SPS extends javax.swing.JFrame {

    int userScore = 0;
    int computerScore = 0;
    int roundCount = 0;
    final int totalRounds = 20;
    int remaining_attempt = 19-roundCount;
    
    
    private JFrame frame;
    public SPS() {
        initComponents();
        progressBar.setMaximum(totalRounds);
        progressBar.setValue(0);
        
        setDefaultCloseOperation(frame.DO_NOTHING_ON_CLOSE);
    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit Cognitive Quest","Warning - Cognitive Quest",
            JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
        }
    });
        
        
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPaper = new javax.swing.JButton();
        btnRock = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnScissors = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        txtComputerChoice = new javax.swing.JTextField();
        txtUserChoice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        lblComputerScore = new javax.swing.JLabel();
        lblUserScore = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        playagainBUTTON = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        remainAttempt = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Welcome to Rock Paper Scissors");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(450, 600));
        setName("Rock Paper Scissor"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        btnPaper.setBackground(new java.awt.Color(255, 153, 255));
        btnPaper.setText("PAPER");
        btnPaper.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 255)), javax.swing.BorderFactory.createEtchedBorder()));
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaper);
        btnPaper.setBounds(170, 350, 90, 50);

        btnRock.setBackground(new java.awt.Color(255, 153, 255));
        btnRock.setText("ROCK");
        btnRock.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 255)), javax.swing.BorderFactory.createEtchedBorder()));
        btnRock.setDoubleBuffered(true);
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });
        getContentPane().add(btnRock);
        btnRock.setBounds(60, 350, 90, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Your Choice");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 70, 100, 20);

        btnScissors.setBackground(new java.awt.Color(255, 153, 255));
        btnScissors.setText("SCISSOR");
        btnScissors.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 255)), javax.swing.BorderFactory.createEtchedBorder()));
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });
        getContentPane().add(btnScissors);
        btnScissors.setBounds(280, 350, 90, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Computer Choice");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 70, 130, 20);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROCK PAPER SCISSORS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Your Score");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 210, 100, 20);
        getContentPane().add(progressBar);
        progressBar.setBounds(80, 470, 331, 14);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Computer Score");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 210, 130, 20);

        txtComputerChoice.setEditable(false);
        txtComputerChoice.setBackground(new java.awt.Color(255, 255, 255));
        txtComputerChoice.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        txtComputerChoice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtComputerChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComputerChoiceActionPerformed(evt);
            }
        });
        getContentPane().add(txtComputerChoice);
        txtComputerChoice.setBounds(260, 100, 150, 56);

        txtUserChoice.setEditable(false);
        txtUserChoice.setBackground(new java.awt.Color(255, 255, 255));
        txtUserChoice.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        txtUserChoice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserChoiceActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserChoice);
        txtUserChoice.setBounds(40, 100, 160, 56);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Progress");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 460, 130, 30);

        txtResult.setEditable(false);
        txtResult.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResult.setText("Select your Choice Below");
        txtResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtResult);
        txtResult.setBounds(20, 170, 400, 30);

        lblComputerScore.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblComputerScore.setForeground(new java.awt.Color(150, 0, 0));
        lblComputerScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComputerScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblComputerScore);
        lblComputerScore.setBounds(260, 230, 150, 60);

        lblUserScore.setBackground(new java.awt.Color(0, 0, 150));
        lblUserScore.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblUserScore.setForeground(new java.awt.Color(0, 0, 150));
        lblUserScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblUserScore);
        lblUserScore.setBounds(40, 230, 160, 60);

        homeButton.setBackground(new java.awt.Color(153, 255, 153));
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton);
        homeButton.setBounds(40, 510, 140, 40);

        playagainBUTTON.setBackground(new java.awt.Color(255, 255, 153));
        playagainBUTTON.setText("PLAY AGAIN");
        playagainBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainBUTTONActionPerformed(evt);
            }
        });
        getContentPane().add(playagainBUTTON);
        playagainBUTTON.setBounds(270, 510, 140, 40);

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel9.setText("Select your Choice");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 300, 230, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Remaining Attempts");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 430, 160, 30);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 310, 340, 110);

        remainAttempt.setBackground(new java.awt.Color(153, 153, 255));
        remainAttempt.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        remainAttempt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remainAttempt.setText("20");
        remainAttempt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(remainAttempt);
        remainAttempt.setBounds(180, 430, 50, 30);

        jRadioButton1.setSelected(true);
        jRadioButton1.setFocusable(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(380, 20, 19, 20);

        jRadioButton2.setSelected(true);
        jRadioButton2.setFocusable(false);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(400, 20, 19, 20);

        jRadioButton3.setSelected(true);
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(40, 20, 19, 20);

        jRadioButton4.setSelected(true);
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(20, 20, 19, 20);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cognitive_Quest_predict_pattern_perform/rps.png"))); // NOI18N
        jLabel8.setText("Stone ");
        jLabel8.setToolTipText("");
        jLabel8.setAlignmentY(0.0F);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setMaximumSize(new java.awt.Dimension(450, 600));
        jLabel8.setMinimumSize(new java.awt.Dimension(450, 600));
        jLabel8.setPreferredSize(new java.awt.Dimension(450, 600));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 460, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtComputerChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComputerChoiceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtComputerChoiceActionPerformed

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        // TODO add your handling code here:
        playRound("Scissors");
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        // TODO add your handling code here:
        playRound("Paper");
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        // TODO add your handling code here:
        playRound("Rock");
    }//GEN-LAST:event_btnRockActionPerformed

    private void txtUserChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserChoiceActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        OptionPage op = new OptionPage();
        op.show();
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void playagainBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playagainBUTTONActionPerformed
        // TODO add your handling code here:
        userScore = 0;
        computerScore = 0;
        roundCount = 0;
        remaining_attempt = 19-roundCount;
        remainAttempt.setText("20");
        txtUserChoice.setText("");
        txtComputerChoice.setText("");
        lblUserScore.setText("");
        lblComputerScore.setText("");
        txtResult.setText("Select your Choice");
        progressBar.setMaximum(totalRounds);
        progressBar.setValue(0);
    }//GEN-LAST:event_playagainBUTTONActionPerformed

   
    
    public void playRound(String userChoice) {
    if (roundCount >= totalRounds) {
        JOptionPane.showMessageDialog(this, "Game over! Final result:\n" +
                "You: " + userScore + " | Computer: " + computerScore + "\n" +
                (userScore > computerScore ? "You win!" :
                 userScore < computerScore ? "Computer wins!" : "It's a draw!"),"Rock Paper Scissors",JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String[] options = {"Rock", "Paper", "Scissors"};
    String computerChoice = options[(int) (Math.random() * 3)];
    
    txtUserChoice.setText(userChoice);
    txtComputerChoice.setText(computerChoice);

    String result;
    if (userChoice.equals(computerChoice)) {
        result = "Draw";
    } else if (
            (userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
        userScore++;
        result = "You win this round!";
    } else {
        computerScore++;
        result = "Computer wins this round!";
    }

    txtResult.setText(result);
    lblUserScore.setText("" + userScore);
    lblComputerScore.setText("" + computerScore);
    remainAttempt.setText("" + remaining_attempt);

    
    roundCount++;
    remaining_attempt = 19-roundCount;
    progressBar.setValue(roundCount);

    if (roundCount == totalRounds) {
        JOptionPane.showMessageDialog(this, "Game over!\nFinal Score:\nYou: " +
                userScore + " | Computer: " + computerScore + "\n" +
                (userScore > computerScore ? "🎉 You Win!" :
                 userScore < computerScore ? "😢 Computer Wins!" : "🤝 It's a Draw!"),"Rock Paper Scissors",JOptionPane.INFORMATION_MESSAGE);
    }
}

    


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
            java.util.logging.Logger.getLogger(SPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel lblComputerScore;
    private javax.swing.JLabel lblUserScore;
    private javax.swing.JButton playagainBUTTON;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel remainAttempt;
    private javax.swing.JTextField txtComputerChoice;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtUserChoice;
    // End of variables declaration//GEN-END:variables
}

