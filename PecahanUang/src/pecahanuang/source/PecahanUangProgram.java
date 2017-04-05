
package pecahanuang.source;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Agung Nugraha
 */
public class PecahanUangProgram extends javax.swing.JFrame {

    ImageIcon imageicon;
    public PecahanUangProgram() {
        initComponents();
        imageicon = new ImageIcon("/pecahanuang/Gambar/money.png");
        setIconImage(imageicon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new pecahanuang.backgrounds.background();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Cetak = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        SeratusRibu = new javax.swing.JLabel();
        DuaPuluhRibu = new javax.swing.JLabel();
        LimaPuluhRibu = new javax.swing.JLabel();
        SepuluhRibu = new javax.swing.JLabel();
        LimaRibu = new javax.swing.JLabel();
        Seribu = new javax.swing.JLabel();
        DuaRibu = new javax.swing.JLabel();
        LimaRatus = new javax.swing.JLabel();
        Infaq = new javax.swing.JLabel();
        Seratus = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penghitung Pecahan Uang App");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAM PENGHITUNG NILAI PECAHAN ");

        jLabel2.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MATEMATIKA DISKRIT");

        jLabel3.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Masukkan Jumlah Uang Rp");

        txtuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pecahan Uang Rp 100.000  :");

        jLabel5.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pecahan Uang Rp   20.000  :");

        jLabel6.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pecahan Uang Rp   50.000  :");

        jLabel7.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pecahan Uang Rp   10.000  :");

        jLabel8.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pecahan Uang Rp     5.000  :");

        jLabel9.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pecahan Uang Rp     2.000  :");

        jLabel10.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pecahan Uang Rp     1.000  :");

        jLabel11.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pecahan Uang Rp        500  :");

        jLabel12.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pecahan Uang Rp        100  :");

        Cetak.setText("Cetak");
        Cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Infaq  : Rp ");

        SeratusRibu.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        SeratusRibu.setForeground(new java.awt.Color(255, 255, 255));
        SeratusRibu.setText(" 0");

        DuaPuluhRibu.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        DuaPuluhRibu.setForeground(new java.awt.Color(255, 255, 255));
        DuaPuluhRibu.setText(" 0");

        LimaPuluhRibu.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        LimaPuluhRibu.setForeground(new java.awt.Color(255, 255, 255));
        LimaPuluhRibu.setText(" 0");

        SepuluhRibu.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        SepuluhRibu.setForeground(new java.awt.Color(255, 255, 255));
        SepuluhRibu.setText(" 0");

        LimaRibu.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        LimaRibu.setForeground(new java.awt.Color(255, 255, 255));
        LimaRibu.setText(" 0");

        Seribu.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        Seribu.setForeground(new java.awt.Color(255, 255, 255));
        Seribu.setText(" 0");

        DuaRibu.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        DuaRibu.setForeground(new java.awt.Color(255, 255, 255));
        DuaRibu.setText(" 0");

        LimaRatus.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        LimaRatus.setForeground(new java.awt.Color(255, 255, 255));
        LimaRatus.setText(" 0");

        Infaq.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        Infaq.setForeground(new java.awt.Color(255, 255, 255));
        Infaq.setText(" 0,-");

        Seratus.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        Seratus.setForeground(new java.awt.Color(255, 255, 255));
        Seratus.setText(" 0");

        jLabel14.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("UANG RUPIAH");

        jLabel15.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("DOSEN");

        jLabel16.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("H. Dadi Rosadi, S.Si., M.Kom.");

        jLabel17.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Agung Nugraha (10115302)");

        jLabel18.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("KELOMPOK");

        jLabel19.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Rifki Aufar Riyadhi (10115316)");

        jLabel20.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Rizki Rian Anandita (10115324)");

        jLabel21.setFont(new java.awt.Font("Vincent", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("UNIVERSITAS KOMPUTER INDONESIA");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(106, 106, 106))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtuang, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(background1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(background1Layout.createSequentialGroup()
                                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(26, 26, 26)
                                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LimaRatus)
                                            .addComponent(Seribu)
                                            .addComponent(LimaRibu)
                                            .addComponent(SepuluhRibu)
                                            .addComponent(DuaPuluhRibu)
                                            .addComponent(LimaPuluhRibu)
                                            .addComponent(DuaRibu)
                                            .addComponent(Seratus)
                                            .addComponent(SeratusRibu))))))
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(34, 34, 34))
                                    .addGroup(background1Layout.createSequentialGroup()
                                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(background1Layout.createSequentialGroup()
                                                .addComponent(Cetak)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Infaq))
                                            .addComponent(jLabel15)
                                            .addGroup(background1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel16))
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel17))
                                        .addGap(0, 13, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addGap(71, 71, 71))))))
            .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                    .addContainerGap(282, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(244, 244, 244)))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cetak)
                    .addComponent(jLabel13)
                    .addComponent(Infaq))
                .addGap(18, 18, 18)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SeratusRibu)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LimaPuluhRibu)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DuaPuluhRibu)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SepuluhRibu)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(LimaRibu)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DuaRibu)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Seribu)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(LimaRatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Seratus)
                    .addComponent(jLabel21))
                .addGap(25, 25, 25))
            .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(background1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel14)
                    .addContainerGap(302, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuangActionPerformed

    private void CetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakActionPerformed
        String a = txtuang.getText();
        
      
        int JumlahUang = 0,P100ribu,P50ribu,P20ribu,P10ribu,
            P5ribu,P2ribu,Pseribu,P5ratus,Pseratus,sisa;
       
        if(a.isEmpty()){
            JOptionPane.showMessageDialog(null, "Maaf Anda Belum Menginputkan Jumlah Uang");
        }else
        {
                try{
                    JumlahUang  = Integer.parseInt(a);
                }catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Maaf Nominal Uang Terlalu Banyak atau\nNominal Uang Tidak Boleh Desimal atau\nTidak Boleh Menginputkan Huruf ");
                }
                
            if(JumlahUang < 0)
            {
                JOptionPane.showMessageDialog(null, "Maaf Nominal Uang Tidak Boleh Negatif ");
            }
            else
            {

                //menghitung pecahan uang 100.000
                P100ribu = JumlahUang/100000;
                    SeratusRibu.setText(" "+P100ribu);
                sisa = JumlahUang %= 100000;

                //menghitung pecahan uang 50.000
                P50ribu= sisa/50000;
                    LimaPuluhRibu.setText(" "+P50ribu);
                sisa= JumlahUang %= 50000;

                //menghitung pecahan uang 20.000
                P20ribu = sisa/20000;
                    DuaPuluhRibu.setText(" "+P20ribu);
                sisa= JumlahUang %= 20000;

                //menghitung pecahan uang 10.000
                P10ribu= sisa/10000;
                    SepuluhRibu.setText(" "+P10ribu);
                sisa= JumlahUang %= 10000;

                //menghitung pecahan uang 5.000
                P5ribu= sisa/5000;
                    LimaRibu.setText(" "+P5ribu);
                sisa= JumlahUang %= 5000;

                //menghitung pecahan uang 2.000
                P2ribu = sisa/2000;
                    DuaRibu.setText(" "+P2ribu);
                sisa= JumlahUang %= 2000;

                //menghitung pecahan uang 1.000
                Pseribu= sisa/1000;
                    Seribu.setText(" "+Pseribu);
                sisa= JumlahUang %= 1000;

                //menghitung pecahan uang 500
                P5ratus = sisa/500;
                    LimaRatus.setText(" "+P5ratus);
                sisa = JumlahUang %= 500;

                //menghitung pecahan uang 100 dan Infaq
                Pseratus= sisa/100;
                    Seratus.setText(" "+Pseratus);
                sisa = JumlahUang %= 100;
                    Infaq.setText(" "+sisa+",-");

            }

        }
    }//GEN-LAST:event_CetakActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PecahanUangProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cetak;
    private javax.swing.JLabel DuaPuluhRibu;
    private javax.swing.JLabel DuaRibu;
    private javax.swing.JLabel Infaq;
    private javax.swing.JLabel LimaPuluhRibu;
    private javax.swing.JLabel LimaRatus;
    private javax.swing.JLabel LimaRibu;
    private javax.swing.JLabel SepuluhRibu;
    private javax.swing.JLabel Seratus;
    private javax.swing.JLabel SeratusRibu;
    private javax.swing.JLabel Seribu;
    private pecahanuang.backgrounds.background background1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtuang;
    // End of variables declaration//GEN-END:variables
}
