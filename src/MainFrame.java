/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J.E JHANG
 */
import java.awt.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.table.DefaultTableCellRenderer;

public class MainFrame extends javax.swing.JFrame {
    private BufferedImage Drawing = new BufferedImage(28, 28, BufferedImage.TYPE_INT_RGB);
    private BufferedReader PyOut1, PyOut2, PyOut3;
    private ProcessBuilder Process1, Process2, Process3;
    private Process P1,P2,P3;
    private Image Pt;
    private Graphics gr = Drawing.createGraphics();
    int crtX, crtY, oldX, oldY;
    boolean index = false;
    boolean idx = false;
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    ImageIcon loading = new ImageIcon("Loader.gif");
    String prcs = null;
    //FR fr = new FR();
      /**
     * Creates new form MainFrame
     */
    
    public MainFrame() {
        initComponents();
        LoadingLabel.setVisible(false); 
        NewJFrame jj = new NewJFrame();
        jj.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        mainpanel = new javax.swing.JPanel();
        StatementPanel = new javax.swing.JPanel();
        PictureBorder = new javax.swing.JPanel();
        PhotoPanel = new javax.swing.JPanel();
        PhotoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prcs_window = new javax.swing.JTextArea();
        Progress_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CNNPane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SGPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SFPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ProgramName = new javax.swing.JLabel();
        BackPanel = new javax.swing.JPanel();
        GenerateButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        DesignPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        DrawingBorder = new javax.swing.JPanel();
        DrawingPanel = new javax.swing.JPanel();
        StartPanel = new javax.swing.JPanel();
        StartButton = new javax.swing.JToggleButton();
        LoadingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        mainpanel.setBackground(new java.awt.Color(215, 199, 182));
        mainpanel.setForeground(new java.awt.Color(255, 255, 255));

        StatementPanel.setBackground(new java.awt.Color(255, 255, 255));
        StatementPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        PictureBorder.setBackground(new java.awt.Color(255, 255, 255));
        PictureBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detected Image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Calibri", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        PictureBorder.setForeground(new java.awt.Color(255, 102, 0));

        PhotoPanel.setBackground(new java.awt.Color(255, 255, 255));
        PhotoPanel.setLayout(null);
        PhotoPanel.add(PhotoLabel);
        PhotoLabel.setBounds(0, 0, 100, 100);

        javax.swing.GroupLayout PictureBorderLayout = new javax.swing.GroupLayout(PictureBorder);
        PictureBorder.setLayout(PictureBorderLayout);
        PictureBorderLayout.setHorizontalGroup(
            PictureBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PictureBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PhotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PictureBorderLayout.setVerticalGroup(
            PictureBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PictureBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PhotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Prcs_window.setBackground(new java.awt.Color(102, 102, 102));
        Prcs_window.setColumns(20);
        Prcs_window.setForeground(new java.awt.Color(255, 255, 255));
        Prcs_window.setRows(5);
        Prcs_window.setCaretColor(new java.awt.Color(255, 255, 255));
        Prcs_window.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Prcs_window);

        Progress_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Progress_Panel.setToolTipText("");
        Progress_Panel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("then identify it with three different ML model:");
        Progress_Panel.add(jLabel1);
        jLabel1.setBounds(0, 30, 330, 20);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("This program will receive your hand-written number");
        Progress_Panel.add(jLabel2);
        jLabel2.setBounds(0, 10, 330, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Softmax with CNN");

        javax.swing.GroupLayout CNNPaneLayout = new javax.swing.GroupLayout(CNNPane);
        CNNPane.setLayout(CNNPaneLayout);
        CNNPaneLayout.setHorizontalGroup(
            CNNPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        CNNPaneLayout.setVerticalGroup(
            CNNPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CNNPaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Progress_Panel.add(CNNPane);
        CNNPane.setBounds(220, 60, 120, 80);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sigmoid");

        javax.swing.GroupLayout SGPaneLayout = new javax.swing.GroupLayout(SGPane);
        SGPane.setLayout(SGPaneLayout);
        SGPaneLayout.setHorizontalGroup(
            SGPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SGPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        SGPaneLayout.setVerticalGroup(
            SGPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SGPaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Progress_Panel.add(SGPane);
        SGPane.setBounds(0, 60, 90, 80);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Softmax");

        javax.swing.GroupLayout SFPaneLayout = new javax.swing.GroupLayout(SFPane);
        SFPane.setLayout(SFPaneLayout);
        SFPaneLayout.setHorizontalGroup(
            SFPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        SFPaneLayout.setVerticalGroup(
            SFPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFPaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Progress_Panel.add(SFPane);
        SFPane.setBounds(110, 60, 90, 80);

        javax.swing.GroupLayout StatementPanelLayout = new javax.swing.GroupLayout(StatementPanel);
        StatementPanel.setLayout(StatementPanelLayout);
        StatementPanelLayout.setHorizontalGroup(
            StatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(StatementPanelLayout.createSequentialGroup()
                        .addComponent(PictureBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Progress_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StatementPanelLayout.setVerticalGroup(
            StatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StatementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PictureBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Progress_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        ProgramName.setFont(new java.awt.Font("가는안상수체", 0, 24)); // NOI18N
        ProgramName.setForeground(new java.awt.Color(255, 255, 255));
        ProgramName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProgramName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Title_font.png"))); // NOI18N

        BackPanel.setBackground(new java.awt.Color(215, 199, 182));

        GenerateButton.setBackground(new java.awt.Color(255, 102, 0));
        GenerateButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        GenerateButton.setForeground(new java.awt.Color(255, 255, 255));
        GenerateButton.setText("Generate image");
        GenerateButton.setBorder(null);
        GenerateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateButtonActionPerformed(evt);
            }
        });

        ResetButton.setBackground(new java.awt.Color(255, 102, 0));
        ResetButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Reset");
        ResetButton.setBorder(null);
        ResetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GenerateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(GenerateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        DesignPanel.setBackground(new java.awt.Color(215, 199, 182));
        DesignPanel.setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SmallLOGO_1.png"))); // NOI18N
        DesignPanel.add(Logo);
        Logo.setBounds(-150, 40, 350, 60);

        DrawingBorder.setBackground(new java.awt.Color(204, 204, 204));
        DrawingBorder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        DrawingPanel.setBackground(new java.awt.Color(255, 255, 255));
        DrawingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DrawingPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        DrawingPanel.setName(""); // NOI18N
        DrawingPanel.setPreferredSize(new java.awt.Dimension(28, 28));
        DrawingPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DrawingPanelMouseDragged(evt);
            }
        });
        DrawingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DrawingPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DrawingPanelMouseReleased(evt);
            }
        });
        DrawingPanel.setLayout(null);

        StartPanel.setBackground(new java.awt.Color(255, 204, 153));
        StartPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        StartButton.setBackground(new java.awt.Color(255, 204, 153));
        StartButton.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        StartButton.setForeground(new java.awt.Color(255, 102, 51));
        StartButton.setText("START");
        StartButton.setBorder(null);
        StartButton.setBorderPainted(false);
        StartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StartButton.setFocusPainted(false);
        StartButton.setOpaque(true);
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StartPanelLayout = new javax.swing.GroupLayout(StartPanel);
        StartPanel.setLayout(StartPanelLayout);
        StartPanelLayout.setHorizontalGroup(
            StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );
        StartPanelLayout.setVerticalGroup(
            StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        DrawingPanel.add(StartPanel);
        StartPanel.setBounds(30, 40, 220, 200);

        LoadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loader.gif"))); // NOI18N
        DrawingPanel.add(LoadingLabel);
        LoadingLabel.setBounds(0, 0, 280, 280);

        javax.swing.GroupLayout DrawingBorderLayout = new javax.swing.GroupLayout(DrawingBorder);
        DrawingBorder.setLayout(DrawingBorderLayout);
        DrawingBorderLayout.setHorizontalGroup(
            DrawingBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrawingBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DrawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DrawingBorderLayout.setVerticalGroup(
            DrawingBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrawingBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DrawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgramName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DrawingBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DesignPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(DrawingBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 113, Short.MAX_VALUE)
                        .addComponent(DesignPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(StatementPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void InitPainting(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 28, 28);
        g.setColor(Color.BLACK);
        g.drawImage(Drawing, 0, 0, null);
    }
    
    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        PhotoLabel.setIcon(null);
        Prcs_window.setText(null);
        SGPane.setBackground(Color.LIGHT_GRAY);
        SFPane.setBackground(Color.LIGHT_GRAY);
        CNNPane.setBackground(Color.LIGHT_GRAY);
        
        idx=true;
        InitPainting(gr);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void GenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateButtonActionPerformed
        try {
            // TODO add your handling code here:
            if (index == true && idx == true)
            {
            ImageIO.write(Drawing, "PNG", new File("C:\\AI_Project_Demo\\src\\user_drawing.png"));
            Pt=ImageIO.read(new File("C:\\AI_Project_Demo\\src\\user_drawing.png"));
            Pt = Pt.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            PhotoLabel.setIcon(new ImageIcon(Pt));
            PhotoLabel.revalidate();
            PhotoLabel.repaint();
            PhotoLabel.update(PhotoLabel.getGraphics());    
            JOptionPane.showMessageDialog(null,"Congratulation! Your image is created :)");
            LoadingLabel.setVisible(true);
            //fr.setVisible(true);
                SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() {
            try{
                Process1 = new ProcessBuilder("cmd", "/c", "python MNIST_Predict_Sigmoid.py user_drawing.png");
                //  Debug attempt ended            
                //  Debug by Jieun Jhang; Start
                Process1.directory(new File("C:\\AI_Project_Demo\\src"));
                Process1.redirectErrorStream(true); 
                SGPane.setBackground(Color.ORANGE);
                P1 = Process1.start();
                PyOut1 = new BufferedReader( new InputStreamReader(P1.getInputStream()) );
                Prcs_window.setText("[Output from sigmoid]====================================\n\n");          
                while((prcs = PyOut1.readLine()) != null ){Prcs_window.append(prcs);Prcs_window.append("\n");}
                P1.destroy();  
            
                Process2 = new ProcessBuilder("cmd", "/c", "python MNIST_Predict.py user_drawing.png");
                Process2.directory(new File("C:\\AI_Project_Demo\\src"));            
                Process2.redirectErrorStream(true);
                SFPane.setBackground(Color.ORANGE);
                P2 = Process2.start();
                PyOut2 = new BufferedReader( new InputStreamReader(P2.getInputStream()) );
                Prcs_window.append("\n\n[Output from Softmax]====================================\n\n");
                while((prcs = PyOut2.readLine()) != null ){Prcs_window.append(prcs);Prcs_window.append("\n");}
                P2.destroy();
            
                Process3 = new ProcessBuilder("cmd", "/c", "python MNIST_Predict_NN.py user_drawing.png");
                Process3.directory(new File("C:\\AI_Project_Demo\\src"));  
                Process3.redirectErrorStream(true);
                CNNPane.setBackground(Color.ORANGE);
                P3 = Process3.start();
                PyOut3 = new BufferedReader( new InputStreamReader(P3.getInputStream()) );
                Prcs_window.append("\n\n[Output from Softmax with CNN]====================================\n\n");
                while((prcs = PyOut3.readLine()) != null ){Prcs_window.append(prcs);Prcs_window.append("\n");}
                P3.destroy();
                LoadingLabel.setVisible(false);
                //fr.dispose();
            
            }catch(Exception e){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            return prcs;
            }
            };
            //  Debug by Col.Thorwald; Start
            worker.execute();
            InitPainting(gr);
            idx = false;
            }else{
                if(index==false) JOptionPane.showMessageDialog(null,"You cannot submit before start", "Submit error", JOptionPane.ERROR_MESSAGE);
                else JOptionPane.showMessageDialog(null,"Write new one after reset the canvas", "Submit error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e);
            InitPainting(gr);
        }
    }//GEN-LAST:event_GenerateButtonActionPerformed

    private void DrawingPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawingPanelMouseDragged
        // TODO add your handling code here:
        if(evt.getX()<=280 && evt.getX()>=0 && evt.getY()<=280 && evt.getY()>=0)
        {
        gr.setColor(Color.BLACK);
        crtX = evt.getX()/10;
        crtY = evt.getY()/10;
        oldX = crtX;
        oldY = crtY;
        gr.drawLine(oldX, oldY, crtX, crtY);
        repaint();
        System.out.println(crtX + " " + crtY);
        }else{
        JOptionPane.showMessageDialog(null,"Drawing should be done in drawing area","Boundary error",JOptionPane.ERROR_MESSAGE);     
        InitPainting(gr);
        }
    }//GEN-LAST:event_DrawingPanelMouseDragged

    private void DrawingPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawingPanelMousePressed
        // TODO add your handling code here:
        if(evt.getX()<=280 && evt.getX()>=0 && evt.getY()<=280 && evt.getY()>=0)
        {
        gr.setColor(Color.BLACK);
        oldX = evt.getX()/10;
        oldY = evt.getY()/10;
        gr.drawRect(oldX, oldY, 1, 1);
        repaint();
        System.out.println(oldX + " " + oldY);
        }else{
        JOptionPane.showMessageDialog(null,"Drawing should be started in drawing area","Boundary error",JOptionPane.ERROR_MESSAGE);
        InitPainting(gr);
        }
    }//GEN-LAST:event_DrawingPanelMousePressed

    private void DrawingPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawingPanelMouseReleased
        // TODO add your handling code here:
        crtX = evt.getX()/10;
        crtY = evt.getY()/10;
        repaint();
    }//GEN-LAST:event_DrawingPanelMouseReleased

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        StartPanel.setVisible(false);
        index=true;
        idx=true;
        InitPainting(gr);
    }//GEN-LAST:event_StartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private javax.swing.JPanel CNNPane;
    private javax.swing.JPanel DesignPanel;
    private javax.swing.JPanel DrawingBorder;
    private javax.swing.JPanel DrawingPanel;
    private javax.swing.JButton GenerateButton;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel PhotoLabel;
    private javax.swing.JPanel PhotoPanel;
    private javax.swing.JPanel PictureBorder;
    private javax.swing.JTextArea Prcs_window;
    private javax.swing.JLabel ProgramName;
    private javax.swing.JPanel Progress_Panel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JPanel SFPane;
    private javax.swing.JPanel SGPane;
    private javax.swing.JToggleButton StartButton;
    private javax.swing.JPanel StartPanel;
    private javax.swing.JPanel StatementPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainpanel;
    // End of variables declaration//GEN-END:variables
}