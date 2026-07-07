/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author A
 */
import java.util.List;
public class profile extends javax.swing.JFrame {
    private Freelancer freelancer;
    private Client client;
    private String userRole = "";
    private final java.awt.Color lightNudeBeige = new java.awt.Color(242, 230, 218);
    private final java.awt.Color coffeeBrown = new java.awt.Color(54, 43, 36);
    private final java.awt.Color terracottaBtn = new java.awt.Color(184, 115, 81);
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(profile.class.getName());

    /**
     * Creates new form profile
     */
    public profile(Freelancer freelancer) {
    initComponents();

    this.freelancer = freelancer;
    this.userRole = "Freelancer";

    setupCommonUI();
    loadFreelancerData();
}

    public profile(Client client) {
    initComponents();

    this.client = client;
    this.userRole = "Client";

    setupCommonUI();
    loadClientData();
}   
    
    private void setupCommonUI() {
    // Background
    this.getContentPane().setBackground(lightNudeBeige);
    this.setLocationRelativeTo(null);
    this.setSize(600, 500);

    // Title
    jLabel1.setText("PROFILE");
    jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));
    jLabel1.setForeground(coffeeBrown);

    // Labels
    lbl_name.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
    lbl_name.setForeground(coffeeBrown);

    lbl_email.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
    lbl_email.setForeground(coffeeBrown);

    lbl_skills.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
    lbl_skills.setForeground(coffeeBrown);

    lbl_jobs.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
    lbl_jobs.setForeground(coffeeBrown);

    // Text Fields styling
    jTextField1.setBackground(java.awt.Color.WHITE);
    jTextField1.setForeground(coffeeBrown);
    jTextField1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
    jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(terracottaBtn, 1));

    jTextField2.setBackground(java.awt.Color.WHITE);
    jTextField2.setForeground(coffeeBrown);
    jTextField2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
    jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(terracottaBtn, 1));

    txt_skill.setBackground(java.awt.Color.WHITE);
    txt_skill.setForeground(coffeeBrown);
    txt_skill.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
    txt_skill.setBorder(javax.swing.BorderFactory.createLineBorder(terracottaBtn, 1));

    // Text Area styling
    jTextArea2.setBackground(java.awt.Color.WHITE);
    jTextArea2.setForeground(coffeeBrown);
    jTextArea2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 12));
    jTextArea2.setEditable(false);
    jTextArea2.setLineWrap(true);
    jTextArea2.setWrapStyleWord(true);
    jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(terracottaBtn, 2));
    jScrollPane2.getViewport().setBackground(java.awt.Color.WHITE);

    // Buttons
    btn_update.setBackground(terracottaBtn);
    btn_update.setForeground(java.awt.Color.WHITE);
    btn_update.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
    btn_update.setFocusPainted(false);
    btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    btn_back.setBackground(coffeeBrown);
    btn_back.setForeground(java.awt.Color.WHITE);
    btn_back.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
    btn_back.setFocusPainted(false);
    btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    // Make window bigger so nothing gets cut off
this.setSize(700, 600);

// Make title fit fully
jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

// Make stats area taller so more data shows without scrolling
jScrollPane2.setPreferredSize(new java.awt.Dimension(280, 200));
// Add this in setupCommonUI() for neat column alignment
jTextArea2.setFont(new java.awt.Font("Courier New", java.awt.Font.PLAIN, 12));

// ── ALIGNMENT FIX ──
        javax.swing.JPanel card = new javax.swing.JPanel(new java.awt.GridBagLayout());
        card.setBackground(lightNudeBeige);
        card.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Title
        gbc.gridy = 0; gbc.insets = new java.awt.Insets(0, 0, 25, 0);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card.add(jLabel1, gbc);

        // Name label
        gbc.gridy = 1; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(lbl_name, gbc);

        // Name field
        gbc.gridy = 2; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        jTextField1.setPreferredSize(new java.awt.Dimension(400, 32));
        card.add(jTextField1, gbc);

        // Email label
        gbc.gridy = 3; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(lbl_email, gbc);

        // Email field
        gbc.gridy = 4; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        jTextField2.setPreferredSize(new java.awt.Dimension(400, 32));
        card.add(jTextField2, gbc);

        // Skills label
        gbc.gridy = 5; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(lbl_skills, gbc);

        // Skills field
        gbc.gridy = 6; gbc.insets = new java.awt.Insets(0, 0, 15, 0);
        txt_skill.setPreferredSize(new java.awt.Dimension(400, 32));
        card.add(txt_skill, gbc);

        // Stats label
        gbc.gridy = 7; gbc.insets = new java.awt.Insets(0, 0, 5, 0);
        card.add(lbl_jobs, gbc);

        // Stats text area
        gbc.gridy = 8; gbc.insets = new java.awt.Insets(0, 0, 20, 0);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(400, 180));
        card.add(jScrollPane2, gbc);

        // Buttons row
        gbc.gridy = 9; gbc.insets = new java.awt.Insets(0, 0, 0, 0);
        javax.swing.JPanel btnRow = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));
        btnRow.setBackground(lightNudeBeige);
        btn_update.setPreferredSize(new java.awt.Dimension(140, 36));
        btn_back.setPreferredSize(new java.awt.Dimension(160, 36));
        btnRow.add(btn_update);
        btnRow.add(btn_back);
        card.add(btnRow, gbc);

        // Center card on frame
        javax.swing.JPanel outer = new javax.swing.JPanel(new java.awt.GridBagLayout());
        outer.setBackground(lightNudeBeige);
        outer.add(card);

        this.getContentPane().setLayout(new java.awt.BorderLayout());
        this.getContentPane().add(outer, java.awt.BorderLayout.CENTER);
        this.setSize(560, 650);
        this.setLocationRelativeTo(null);
        this.revalidate();
        this.repaint();
}
    
    
    private void loadFreelancerData() {
    if (freelancer != null) {
        jLabel1.setText("FREELANCER PROFILE");
        jTextField1.setText(freelancer.getname());
        jTextField2.setText(freelancer.getemail());
        jTextField2.setEditable(false);

        lbl_skills.setText("My Skills:");
        txt_skill.setText(String.join(", ", freelancer.getSkills()));
        btn_update.setText("Update Profile");
        lbl_jobs.setText("Stats & Jobs:");

        // COUNT STATS FROM bids.txt
        int totalBids = 0, hiredCount = 0, pendingCount = 0, counterCount = 0;
        java.io.File bidsFile = new java.io.File("bids.txt");
        if (bidsFile.exists()) {
            try (java.util.Scanner sc = new java.util.Scanner(bidsFile)) {
                while (sc.hasNextLine()) {
                    String line = sc.nextLine().trim();
                    if (line.isEmpty()) continue;
                    String[] data = line.split(",");
                    if (data.length >= 2 && data[1].trim().equalsIgnoreCase(freelancer.getemail())) {
                        totalBids++;
                        String status = data[data.length - 1].trim().toLowerCase();
                        if (status.contains("hired") || status.contains("accepted")) hiredCount++;
                        else if (status.contains("pending")) pendingCount++;
                        else if (status.contains("counter")) counterCount++;
                    }
                }
            } catch (Exception e) {
                System.out.println("Stats error: " + e.getMessage());
            }
        }

        int successRate = (totalBids > 0) ? (hiredCount * 100 / totalBids) : 0;

        // FILL TEXT AREA WITH STATS + APPLIED JOBS
        jTextArea2.setText("");
        jTextArea2.append("===== MY STATISTICS =====\n");
        jTextArea2.append("Total Bids Placed : " + totalBids + "\n");
        jTextArea2.append("Hired             : " + hiredCount + "\n");
        jTextArea2.append("Pending Bids      : " + pendingCount + "\n");
        jTextArea2.append("Counter Offers    : " + counterCount + "\n");
        jTextArea2.append("Success Rate      : " + successRate + "%\n");
        jTextArea2.append("\n===== APPLIED JOBS =====\n");

        // LOAD APPLIED JOBS FROM applied_jobs.txt
        java.io.File appliedFile = new java.io.File("applied_jobs.txt");
if (appliedFile.exists()) {
    try (java.util.Scanner scanner = new java.util.Scanner(appliedFile)) {
        boolean found = false;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;
            if (line.startsWith(freelancer.getemail())) {
                String jobInfo = line.substring(freelancer.getemail().length() + 1);

                // Extract job ID from jobInfo string
                String jobId = "";
                if (jobInfo.contains("Job ID:")) {
                    jobId = jobInfo.substring(jobInfo.indexOf("Job ID:") + 7,
                            jobInfo.contains("|") ? jobInfo.indexOf("|") : jobInfo.length()).trim();
                }

                // Look up real status from bids.txt
                String realStatus = "Applied";
                java.io.File bidsFile2 = new java.io.File("bids.txt");
                if (bidsFile2.exists() && !jobId.isEmpty()) {
                    try (java.util.Scanner bs = new java.util.Scanner(bidsFile2)) {
                        while (bs.hasNextLine()) {
                            String bidLine = bs.nextLine().trim();
                            if (bidLine.isEmpty()) continue;
                            String[] bd = bidLine.split(",");
                            if (bd.length >= 6 &&
                                bd[0].trim().equals(jobId) &&
                                bd[1].trim().equalsIgnoreCase(freelancer.getemail())) {
                                realStatus = bd[bd.length - 1].trim();
                                break;
                            }
                        }
                    } catch (Exception ex) {
                        System.out.println("Bid lookup error: " + ex.getMessage());
                    }
                }

                // Show with real status
                String displayInfo = jobInfo.replaceAll("\\| Status:.*", "").trim();
                jTextArea2.append("• " + displayInfo + " | Status: " + realStatus + "\n");
                found = true;
            }
        }
        if (!found) jTextArea2.append("No jobs applied yet.\n");
    } catch (Exception e) {
        System.out.println("Applied jobs error: " + e.getMessage());
    }
} else {
    jTextArea2.append("No jobs applied yet.\n");
}
    }
}
    
    private void loadClientData() {
    if (client != null) {
        jLabel1.setText("CLIENT PROFILE");
        jTextField1.setText(client.getName());
        jTextField2.setText(client.getemail());
        jTextField2.setEditable(false);

        lbl_skills.setText("Company:");
        txt_skill.setText(client.getCompanyName());
        btn_update.setText("Update Bio");
        lbl_jobs.setText("Stats & Jobs:");
        int totalJobs = 0;
        int openJobs = 0;
        int closedJobs = 0;
        int totalBidsReceived = 0;

        // COUNT STATS int totalJobs = 0, openJobs = 0, closedJobs = 0, totalBidsReceived = 0;

java.io.File jobsFile = new java.io.File("Jobs.txt");
if (jobsFile.exists()) {
    try (java.util.Scanner sc = new java.util.Scanner(jobsFile)) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            if (line.toLowerCase().contains(client.getName().toLowerCase().trim())) {
                totalJobs++;

                // Split by comma and check LAST part for status
                String[] parts = line.split(",");
                String lastPart = parts[parts.length - 1].trim().toLowerCase();

                if (lastPart.equals("open")) {
                    openJobs++;
                } else if (lastPart.contains("closed") || lastPart.contains("hired")) {
                    closedJobs++;
                }
            }
        }
    } catch (Exception e) {
        System.out.println("Jobs stats error: " + e.getMessage());
    }
}

java.io.File bidsFile = new java.io.File("bids.txt");
if (bidsFile.exists()) {
    try (java.util.Scanner sc = new java.util.Scanner(bidsFile)) {
        while (sc.hasNextLine()) {
            if (!sc.nextLine().trim().isEmpty()) totalBidsReceived++;
        }
    } catch (Exception e) {
        System.out.println("Bids error: " + e.getMessage());
    }
}


        // FILL TEXT AREA WITH STATS + POSTED JOBS
        jTextArea2.setText("");
        jTextArea2.append("===== MY STATISTICS =====\n");
        jTextArea2.append("Total Jobs Posted  : " + totalJobs + "\n");
        jTextArea2.append("Open Jobs          : " + openJobs + "\n");
        jTextArea2.append("Closed Jobs        : " + closedJobs + "\n");
        jTextArea2.append("Total Bids Received: " + totalBidsReceived + "\n");
        jTextArea2.append("\n===== POSTED JOBS =====\n");

// READ FROM FILE instead of RAM
java.io.File jobsFile2 = new java.io.File("Jobs.txt");
if (jobsFile2.exists()) {
    try (java.util.Scanner sc = new java.util.Scanner(jobsFile2)) {
        boolean found = false;
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            if (line.toLowerCase().contains(client.getName().toLowerCase().trim())) {
                String[] parts = line.split(",");
                if (parts.length >= 7) {
                    jTextArea2.append("• ID: " + parts[0].trim() +
                                      " | " + parts[1].trim() +
                                      " | Budget: " + parts[3].trim() +
                                      " | Deadline: " + parts[5].trim() +
                                      " | " + parts[6].trim() + "\n");
                }
                found = true;
            }
        }
        if (!found) jTextArea2.append("No jobs posted yet.\n");
    } catch (Exception e) {
        System.out.println("Posted jobs error: " + e.getMessage());
    }
} else {
    jTextArea2.append("No jobs posted yet.\n");
}
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txt_jobs = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        lbl_name = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        lbl_skills = new javax.swing.JLabel();
        txt_skill = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_jobs = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        lbl_title.setText("                                          FREELANCER PROFILE");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txt_jobs.setEditable(false);
        txt_jobs.addActionListener(this::txt_jobsActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_name.setText("Name");

        lbl_email.setText("Email");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        lbl_skills.setText("My Skills");

        txt_skill.addActionListener(this::txt_skillActionPerformed);

        btn_update.setText("update profile");
        btn_update.addActionListener(this::btn_updateActionPerformed);

        btn_back.setText("Back to Dashboard");
        btn_back.addActionListener(this::btn_backActionPerformed);

        jLabel1.setText("STATISTICS");

        lbl_jobs.setText("applied jobs");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_skills, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_jobs, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_skill, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_skill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_skills))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_jobs))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back)
                    .addComponent(btn_update))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if (userRole.equals("Freelancer")) {
            new freelance_dashboard(this.freelancer).setVisible(true);
        } else if (userRole.equals("Client")) {
            new Client_Dashboard(this.client).setVisible(true);
        }
        this.dispose();
    }                                        

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
      
        
        String newName = jTextField1.getText().trim();
        String newDynamic = txt_skill.getText().trim();

    // 1. Khali fields check karna
    if (newName.isEmpty() || newDynamic.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Fields cannot be empty!");
        return;
    }

    // 2. FILE ME SAVE NAHI KARNA -> Sirf objects (RAM) ko update karna hai
    if (userRole.equals("Freelancer") && freelancer != null) {
        
        freelancer.setname(newName);
        freelancer.getSkills().clear();  // Object ka naam badla
        String[] skillsArray = newDynamic.split(",");
        java.util.ArrayList<String> skillsList = new java.util.ArrayList<>();
        for (String skill : skillsArray) {
        String trimmedSkill = skill.trim();
           if (!trimmedSkill.isEmpty()) {
                freelancer.addSkill(trimmedSkill); // Aapka bana hua method use ho rha hai
           }
        }
    } else if (userRole.equals("Client") && client != null) {
        
        client.setName(newName);           // Object ka naam badla
        // Agar client ki class me bio ka variable hai toh: client.setBio(newDynamic);
        
    }
    
    FileManagement fm = new FileManagement("users.txt");

    fm.updateFreelancerProfile(freelancer);

    // 3. User ko success message dikhana
    javax.swing.JOptionPane.showMessageDialog(this, "Profile updated" + "");
        
    }                                          

    private void txt_skillActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txt_jobsActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /**java.awt.EventQueue.invokeLater(() -> new profile().setVisible(true));
        */
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_jobs;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_skills;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txt_jobs;
    private javax.swing.JTextField txt_skill;
    // End of variables declaration                   
}
