package hospital_mangament_system;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Dashboard
 */
public class Activity_4 extends javax.swing.JFrame {

    // Normalize designation values used in DB
    private static final String DESIG_DOCTOR     = "Doctor";
    private static final String DESIG_NURSE      = "Nurse";
    private static final String DESIG_COMPOUNDER = "Compounder";
    private static final String DESIG_GUARD      = "Guard"; // corrected spelling

    static int flag = 0;

    public Activity_4() {
        initComponents();
        getContentPane().setBackground(new Color(153,153,255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnd = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnpatient = new javax.swing.JButton();
        btndoctor = new javax.swing.JButton();
        btnnurse = new javax.swing.JButton();
        btncomp = new javax.swing.JButton();
        btngaurds = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setPreferredSize(new java.awt.Dimension(1500, 854));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 854));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 6));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("WELCOME!!");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(840, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1597, 107);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton1.setText("Patient");
        jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton1StateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton2.setText("Staffs");
        jButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton2StateChanged(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton2FocusLost(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton3StateChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnd.setBackground(new java.awt.Color(0, 0, 153));
        btnd.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnd.setText("Delete Details");
        btnd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btndStateChanged(evt);
            }
        });
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(51, 51, 51)
                .addComponent(btnd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 99, 389, 800);

        btn1.setVisible(false);
        btn1.setBackground(new java.awt.Color(0, 0, 153));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 204, 102));
        btn1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn1StateChanged(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(860, 354, 390, 130);

        btn2.setVisible(false);
        btn2.setBackground(new java.awt.Color(0, 0, 153));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 204, 102));
        btn2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn2StateChanged(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(427, 354, 370, 130);

        btn3.setVisible(false);
        btn3.setBackground(new java.awt.Color(0, 0, 153));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 204, 102));
        btn3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn3StateChanged(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(850, 164, 390, 130);

        btn4.setVisible(false);
        btn4.setBackground(new java.awt.Color(0, 0, 153));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 204, 102));
        btn4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn4StateChanged(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(427, 174, 362, 124);

        btnpatient.setBackground(new java.awt.Color(0, 0, 153));
        btnpatient.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnpatient.setForeground(new java.awt.Color(255, 255, 255));
        btnpatient.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnpatientStateChanged(evt);
            }
        });
        btnpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientActionPerformed(evt);
            }
        });
        getContentPane().add(btnpatient);
        btnpatient.setBounds(399, 569, 160, 120);

        btndoctor.setBackground(new java.awt.Color(0, 0, 153));
        btndoctor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btndoctor.setForeground(new java.awt.Color(255, 255, 255));
        btndoctor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btndoctorStateChanged(evt);
            }
        });
        btndoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoctorActionPerformed(evt);
            }
        });
        getContentPane().add(btndoctor);
        btndoctor.setBounds(569, 569, 160, 120);

        btnnurse.setBackground(new java.awt.Color(0, 0, 153));
        btnnurse.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnnurse.setForeground(new java.awt.Color(255, 255, 255));
        btnnurse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnnurseStateChanged(evt);
            }
        });
        btnnurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnurseActionPerformed(evt);
            }
        });
        getContentPane().add(btnnurse);
        btnnurse.setBounds(739, 569, 170, 120);

        btncomp.setBackground(new java.awt.Color(0, 0, 153));
        btncomp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btncomp.setForeground(new java.awt.Color(255, 255, 255));
        btncomp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btncompStateChanged(evt);
            }
        });
        btncomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompActionPerformed(evt);
            }
        });
        getContentPane().add(btncomp);
        btncomp.setBounds(919, 569, 160, 120);

        btngaurds.setBackground(new java.awt.Color(0, 0, 153));
        btngaurds.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btngaurds.setForeground(new java.awt.Color(255, 255, 255));
        btngaurds.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btngaurdsStateChanged(evt);
            }
        });
        btngaurds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngaurdsActionPerformed(evt);
            }
        });
        getContentPane().add(btngaurds);
        btngaurds.setBounds(1090, 569, 160, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Patients");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(399, 536, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Doctors ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(569, 536, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Nurses ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(739, 536, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Compounders");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(919, 536, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Guards");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1090, 536, 140, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Refresh counts every time this window gets focus/activated
        updateCounts();
    }//GEN-LAST:event_formWindowActivated

    private void updateCounts() {
        // Use COUNT(*) queries; no custom execute() helper needed.
        try (Connection con = establishconnection.getConnection()) {
            // patient count (no parameter)
            int patients = scalarCountNoParam(con, "SELECT COUNT(*) FROM patient");
            btnpatient.setText(String.valueOf(patients));

            // employee counts by designation (parameterized)
            int doctors  = scalarCountWithOneStringParam(con, "SELECT COUNT(*) FROM employee WHERE designation = ?", DESIG_DOCTOR);
            int nurses   = scalarCountWithOneStringParam(con, "SELECT COUNT(*) FROM employee WHERE designation = ?", DESIG_NURSE);
            int comp     = scalarCountWithOneStringParam(con, "SELECT COUNT(*) FROM employee WHERE designation = ?", DESIG_COMPOUNDER);
            int guards   = scalarCountWithOneStringParam(con, "SELECT COUNT(*) FROM employee WHERE designation = ?", DESIG_GUARD);

            btndoctor.setText(String.valueOf(doctors));
            btnnurse.setText(String.valueOf(nurses));
            btncomp.setText(String.valueOf(comp));
            btngaurds.setText(String.valueOf(guards));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update counts: " + e.getMessage());
        }
    }

    /**
     * Runs a COUNT(*) query that has NO parameters.
     * Example: "SELECT COUNT(*) FROM patient"
     */
    private int scalarCountNoParam(Connection con, String sql) throws Exception {
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getInt(1) : 0;
        }
    }

    /**
     * Runs a COUNT(*) query with a single String parameter.
     * Example: sql = "SELECT COUNT(*) FROM employee WHERE designation = ?" , param = "Doctor"
     */
    private int scalarCountWithOneStringParam(Connection con, String sql, String param) throws Exception {
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, param); // set parameter before execute
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? rs.getInt(1) : 0;
            }
        }
    }

    private int readCount(PreparedStatement ps) throws Exception {
        try (ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getInt(1) : 0;
        }
    }

    public void activate(int f){
        if(f==1){
            btn4.setVisible(true);
            btn4.setIcon(loadIcon("11.png"));
            btn4.setText("New");

            btn3.setIcon(null);
            btn3.setVisible(true);
            btn3.setText("Patient Details");

            btn2.setIcon(null);
            btn2.setVisible(true);
            btn2.setText("Payment Details");

            btn1.setIcon(null);
            btn1.setVisible(true);
            btn1.setText("Add new payments");

            flag=1;
        } else if(f==2){
            btn4.setVisible(true);
            btn4.setIcon(loadIcon("14.png"));
            btn4.setText("Doctors");

            btn3.setIcon(loadIcon("15.png"));
            btn3.setVisible(true);
            btn3.setText("Nurses");

            btn2.setIcon(loadIcon("16.jpg"));
            btn2.setVisible(true);
            btn2.setText("Compounders");

            btn1.setIcon(loadIcon("17.png"));
            btn1.setVisible(true);
            btn1.setText("Guards");

            flag=2;
        }
    }

    private ImageIcon loadIcon(String resourcePath) {
        try {
            java.net.URL url = getClass().getResource(resourcePath);
            return (url != null) ? new ImageIcon(url) : null;
        } catch (Exception ignored) {
            return null;
        }
    }

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // no-op
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton1StateChanged
        jButton1.setBackground(new Color(240,240,240));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        activate(1);
    }//GEN-LAST:event_jButton1StateChanged

    private void jButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton2StateChanged
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(240,240,240));
        jButton3.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        activate(2);
    }//GEN-LAST:event_jButton2StateChanged

    private void jButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton3StateChanged
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(240,240,240));
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        btn4.setVisible(false);
    }//GEN-LAST:event_jButton3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        activate(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        activate(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
    }//GEN-LAST:event_jButton1FocusLost

    private void jButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusLost
    }//GEN-LAST:event_jButton2FocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    }//GEN-LAST:event_formWindowGainedFocus

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(flag==1) {
            new Activity_8().setVisible(true);
        } else if(flag==2){
            new Activity_13().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(flag==1) {
            new Activity_5().setVisible(true);
        } else if(flag==2){
            new Activity_10().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn4StateChanged
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btn4StateChanged

    private void btn3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn3StateChanged
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btn3StateChanged

    private void btn2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn2StateChanged
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btn2StateChanged

    private void btn1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn1StateChanged
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btn1StateChanged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        btnpatient.setBackground(new Color(0,0,153));
        btndoctor.setBackground(new Color(0,0,153));
        btnnurse.setBackground(new Color(0,0,153));
        btncomp.setBackground(new Color(0,0,153));
        btngaurds.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
    }//GEN-LAST:event_formMouseMoved

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        btnd.setBackground(new Color(0,0,153));
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        btn4.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(flag==1) {
            new Activity_9().setVisible(true);
        } else if(flag==2){
            new Activity_11().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(flag==1) {
            new Activity_6().setVisible(true);
        } else if(flag==2){
            new Activity_12().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientActionPerformed
        new Lists().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpatientActionPerformed

    private void btncompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompActionPerformed
        new Compounders().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncompActionPerformed

    private void btnpatientStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnpatientStateChanged
        btnpatient.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnpatientStateChanged

    private void btndoctorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btndoctorStateChanged
        btndoctor.setBackground(Color.BLACK);
    }//GEN-LAST:event_btndoctorStateChanged

    private void btnnurseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnnurseStateChanged
        btnnurse.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnnurseStateChanged

    private void btncompStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btncompStateChanged
        btncomp.setBackground(Color.BLACK);
    }//GEN-LAST:event_btncompStateChanged

    private void btngaurdsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btngaurdsStateChanged
        btngaurds.setBackground(Color.BLACK);
    }//GEN-LAST:event_btngaurdsStateChanged

    private void btndoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoctorActionPerformed
        new Doctorlist().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndoctorActionPerformed

    private void btnnurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnurseActionPerformed
        new Nurselist().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnurseActionPerformed

    private void btngaurdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngaurdsActionPerformed
        new gaurds().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btngaurdsActionPerformed

    private void btndStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btndStateChanged
        jButton1.setBackground(new Color(0,0,153));
        jButton2.setBackground(new Color(0,0,153));
        jButton3.setBackground(new Color(0,0,153));
        btn2.setBackground(new Color(0,0,153));
        btn3.setBackground(new Color(0,0,153));
        btn4.setBackground(new Color(0,0,153));
        btn1.setBackground(new Color(0,0,153));
        btnd.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btndStateChanged

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        new Delete().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Activity_4().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btncomp;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btndoctor;
    private javax.swing.JButton btngaurds;
    private javax.swing.JButton btnnurse;
    private javax.swing.JButton btnpatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    // IMPORTANT: keep setVisible behavior from JFrame
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); // your original override was empty; that hid the window
    }
} 