
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator_Final;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

/**
 *
 * @author Rahul
 */
public class Calculator_Cal extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double result;
    String operations;
    private Object math;
   
    /**
     * Creates new form Calculator_Cal
     */
    public Calculator_Cal() {
        initComponents();
        jbtnON.setEnabled(false);
    }
    
     
    public void enable(){
        jtxtDisplay.setEnabled(true);
        
        jbtnON.setEnabled(false);
        jbtnOFF.setEnabled(true);
        
        jbtnRadian.setEnabled(true);
        jbtnDegree.setEnabled(true);
        jbtnBackspace.setEnabled(true);
        jbtnClear.setEnabled(true);
        jbtnRoot.setEnabled(true);
        jbtnAddition.setEnabled(true);
        jbtnSubtraction.setEnabled(true);
        jbtn9.setEnabled(true);
        jbtn8.setEnabled(true);
        jbtn7.setEnabled(true);
        jbtn6.setEnabled(true);
        jbtn5.setEnabled(true);
        jbtn4.setEnabled(true);
        jbtn3.setEnabled(true);
        jbtn2.setEnabled(true);
        jbtn1.setEnabled(true);
        jbtn0.setEnabled(true);
        jbtnDot.setEnabled(true);
        jbtnPlusMinus.setEnabled(true);
        jbtnEquals.setEnabled(true);
        jbtnDivision.setEnabled(true);
        jbtnMultiplication.setEnabled(true);
        jbtnLog.setEnabled(true);
        jbtnSin.setEnabled(true);
        jbtnSinh.setEnabled(true);
        jbtnSinInverse.setEnabled(true);
        jbtnCos.setEnabled(true);
        jbtnCosh.setEnabled(true);
        jbtnCosInverse.setEnabled(true);
        jbtnTan.setEnabled(true);
        jbtnTanh.setEnabled(true);
        jbtnTanInverse.setEnabled(true);
        jbtnDivisionByOne.setEnabled(true);
        jbtnPi.setEnabled(true);
        jbtnFactorial.setEnabled(true);
        jbtnMod.setEnabled(true);
        jbtnXY.setEnabled(true);
        jbtnXY2.setEnabled(true);
        jbtnXY3.setEnabled(true);
        jbtnCubeRoot.setEnabled(true);
        jbtnRound.setEnabled(true);
        jbtnEXP.setEnabled(true);
        jbtnLnx.setEnabled(true);
        jbtnBinary.setEnabled(true);
        jbtnOctal.setEnabled(true);
        jbtnHexadecimal.setEnabled(true);
        jbtnPercent.setEnabled(true);
        jCDistance.setEnabled(true);
        jtxtEnter1.setEnabled(true);
        jtxtEnter2.setEnabled(true);
        jlblDisplay1.setEnabled(true);
        jlblDisplay2.setEnabled(true);
        jlblDisplay3.setEnabled(true);
        jlblDisplay1.setEnabled(true);
        jbtnReset.setEnabled(true);
        jbtnConverter.setEnabled(true);
        jlblResult.setEnabled(true);
        
    }
    
    public void disable(){
        jtxtDisplay.setEnabled(false);
        
        jbtnON.setEnabled(true);
        jbtnOFF.setEnabled(false);
        
         jbtnRadian.setEnabled(false);
        jbtnDegree.setEnabled(false);
        jbtnBackspace.setEnabled(false);
        jbtnClear.setEnabled(false);
        jbtnRoot.setEnabled(false);
        jbtnAddition.setEnabled(false);
        jbtnSubtraction.setEnabled(false);
        jbtn9.setEnabled(false);
        jbtn8.setEnabled(false);
        jbtn7.setEnabled(false);
        jbtn6.setEnabled(false);
        jbtn5.setEnabled(false);
        jbtn4.setEnabled(false);
        jbtn3.setEnabled(false);
        jbtn2.setEnabled(false);
        jbtn1.setEnabled(false);
        jbtn0.setEnabled(false);
        jbtnDot.setEnabled(false);
        jbtnPlusMinus.setEnabled(false);
        jbtnEquals.setEnabled(false);
        jbtnDivision.setEnabled(false);
        jbtnMultiplication.setEnabled(false);
        jbtnLog.setEnabled(false);
        jbtnSin.setEnabled(false);
         jbtnSinh.setEnabled(false);
        jbtnSinInverse.setEnabled(false);
        jbtnCos.setEnabled(false);
        jbtnCosh.setEnabled(false);
        jbtnCosInverse.setEnabled(false);
        jbtnTan.setEnabled(false);
        jbtnTanh.setEnabled(false);
        jbtnTanInverse.setEnabled(false);
        jbtnDivisionByOne.setEnabled(false);
        jbtnPi.setEnabled(false);
        jbtnFactorial.setEnabled(false);
        jbtnMod.setEnabled(false);
        jbtnXY.setEnabled(false);
        jbtnXY2.setEnabled(false);
        jbtnXY3.setEnabled(false);
        jbtnCubeRoot.setEnabled(false);
        jbtnRound.setEnabled(false);
        jbtnEXP.setEnabled(false);
        jbtnLnx.setEnabled(false);
        jbtnBinary.setEnabled(false);
        jbtnOctal.setEnabled(false);
        jbtnHexadecimal.setEnabled(false);
        jbtnPercent.setEnabled(false);
        jCDistance.setEnabled(false);
        jtxtEnter1.setEnabled(false);
        jtxtEnter2.setEnabled(false);
        jlblDisplay1.setEnabled(false);
        jlblDisplay2.setEnabled(false);
        jlblDisplay3.setEnabled(false);
        jlblDisplay1.setEnabled(false);
        jbtnReset.setEnabled(false);
        jbtnConverter.setEnabled(false);
        jlblResult.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jtxtDisplay = new javax.swing.JTextField();
        jbtnBackspace = new javax.swing.JButton();
        jbtnAddition = new javax.swing.JButton();
        jbtnRoot = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnSubtraction = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnMultiplication = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnDivision = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnPlusMinus = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnSinh = new javax.swing.JButton();
        jbtnPi = new javax.swing.JButton();
        jbtnCos = new javax.swing.JButton();
        jbtnCosh = new javax.swing.JButton();
        jbtnXY = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtnTanh = new javax.swing.JButton();
        jbtnXY2 = new javax.swing.JButton();
        jbtnCubeRoot = new javax.swing.JButton();
        jbtnRound = new javax.swing.JButton();
        jbtnXY3 = new javax.swing.JButton();
        jbtnBinary = new javax.swing.JButton();
        jbtnHexadecimal = new javax.swing.JButton();
        jbtnMod = new javax.swing.JButton();
        jbtnLnx = new javax.swing.JButton();
        jbtnOctal = new javax.swing.JButton();
        jCDistance = new javax.swing.JComboBox<>();
        jbtnConverter = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jlblDisplay1 = new javax.swing.JTextField();
        jlblDisplay3 = new javax.swing.JTextField();
        jlblDisplay2 = new javax.swing.JTextField();
        jlblResult = new javax.swing.JTextField();
        jtxtEnter1 = new javax.swing.JTextField();
        jtxtEnter2 = new javax.swing.JTextField();
        jbtnDivisionByOne = new javax.swing.JButton();
        jbtnFactorial = new javax.swing.JButton();
        jbtnCosInverse = new javax.swing.JButton();
        jbtnSinInverse = new javax.swing.JButton();
        jbtnTanInverse = new javax.swing.JButton();
        jbtnEXP = new javax.swing.JButton();
        jbtnDegree = new javax.swing.JButton();
        jbtnRadian = new javax.swing.JButton();
        jbtnPercent = new javax.swing.JButton();
        jbtnON = new javax.swing.JRadioButton();
        jbtnOFF = new javax.swing.JRadioButton();
        jbtnSinh1 = new javax.swing.JButton();
        jCDistance1 = new javax.swing.JComboBox<>();
        jbtnConverter1 = new javax.swing.JButton();
        jlblResult1 = new javax.swing.JTextField();
        jtxtEnter3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setBackground(new java.awt.Color(0, 0, 0));
        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jtxtDisplay.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jbtnBackspace.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnBackspace.setForeground(new java.awt.Color(153, 51, 0));
        jbtnBackspace.setText("←");
        jbtnBackspace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jbtnAddition.setBackground(new java.awt.Color(245, 163, 13));
        jbtnAddition.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnAddition.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAddition.setText("+");
        jbtnAddition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jbtnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdditionActionPerformed(evt);
            }
        });

        jbtnRoot.setBackground(new java.awt.Color(245, 163, 13));
        jbtnRoot.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnRoot.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRoot.setText("√");
        jbtnRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jbtnRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRootActionPerformed(evt);
            }
        });

        jbtnClear.setBackground(new java.awt.Color(255, 255, 255));
        jbtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(255, 51, 0));
        jbtnClear.setText("C");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(0, 153, 153));
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(255, 255, 255));
        jbtn7.setText("7");
        jbtn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(0, 153, 153));
        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(255, 255, 255));
        jbtn8.setText("8");
        jbtn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(0, 153, 153));
        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(255, 255, 255));
        jbtn9.setText("9");
        jbtn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnSubtraction.setBackground(new java.awt.Color(245, 163, 13));
        jbtnSubtraction.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnSubtraction.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSubtraction.setText("-");
        jbtnSubtraction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jbtnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubtractionActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(0, 153, 153));
        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(255, 255, 255));
        jbtn4.setText("4");
        jbtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(0, 153, 153));
        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(255, 255, 255));
        jbtn5.setText("5");
        jbtn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(0, 153, 153));
        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(255, 255, 255));
        jbtn6.setText("6");
        jbtn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtnMultiplication.setBackground(new java.awt.Color(245, 163, 13));
        jbtnMultiplication.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnMultiplication.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMultiplication.setText("*");
        jbtnMultiplication.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jbtnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplicationActionPerformed(evt);
            }
        });

        jbtn1.setBackground(new java.awt.Color(0, 153, 153));
        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn1.setText("1");
        jbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(0, 153, 153));
        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(255, 255, 255));
        jbtn2.setText("2");
        jbtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(0, 153, 153));
        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(255, 255, 255));
        jbtn3.setText("3");
        jbtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnDivision.setBackground(new java.awt.Color(245, 163, 13));
        jbtnDivision.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnDivision.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDivision.setText("/");
        jbtnDivision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivisionActionPerformed(evt);
            }
        });

        jbtn0.setBackground(new java.awt.Color(0, 153, 153));
        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(255, 255, 255));
        jbtn0.setText("0");
        jbtn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 69, 69), 2));
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnDot.setBackground(new java.awt.Color(245, 163, 13));
        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnDot.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDot.setText(".");
        jbtnDot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtnPlusMinus.setBackground(new java.awt.Color(245, 163, 13));
        jbtnPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnPlusMinus.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPlusMinus.setText("±");
        jbtnPlusMinus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jbtnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusMinusActionPerformed(evt);
            }
        });

        jbtnEquals.setBackground(new java.awt.Color(255, 0, 51));
        jbtnEquals.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnEquals.setText("=");
        jbtnEquals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 3));
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });

        jbtnSin.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnSin.setForeground(new java.awt.Color(240, 231, 231));
        jbtnSin.setText("Sin");
        jbtnSin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtnLog.setBackground(new java.awt.Color(0, 153, 153));
        jbtnLog.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnLog.setForeground(new java.awt.Color(240, 231, 231));
        jbtnLog.setText("Log");
        jbtnLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });

        jbtnSinh.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSinh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnSinh.setForeground(new java.awt.Color(240, 231, 231));
        jbtnSinh.setText("Sinh");
        jbtnSinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinhActionPerformed(evt);
            }
        });

        jbtnPi.setBackground(new java.awt.Color(0, 153, 153));
        jbtnPi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnPi.setForeground(new java.awt.Color(240, 231, 231));
        jbtnPi.setText("π");
        jbtnPi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPiActionPerformed(evt);
            }
        });

        jbtnCos.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnCos.setForeground(new java.awt.Color(240, 231, 231));
        jbtnCos.setText("Cos");
        jbtnCos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosActionPerformed(evt);
            }
        });

        jbtnCosh.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCosh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnCosh.setForeground(new java.awt.Color(240, 231, 231));
        jbtnCosh.setText("Cosh");
        jbtnCosh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnCosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCoshActionPerformed(evt);
            }
        });

        jbtnXY.setBackground(new java.awt.Color(0, 153, 153));
        jbtnXY.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnXY.setForeground(new java.awt.Color(240, 231, 231));
        jbtnXY.setText("x^y");
        jbtnXY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXYActionPerformed(evt);
            }
        });

        jbtnTan.setBackground(new java.awt.Color(0, 153, 153));
        jbtnTan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnTan.setForeground(new java.awt.Color(240, 231, 231));
        jbtnTan.setText("Tan");
        jbtnTan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });

        jbtnTanh.setBackground(new java.awt.Color(0, 153, 153));
        jbtnTanh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnTanh.setForeground(new java.awt.Color(240, 231, 231));
        jbtnTanh.setText("Tanh");
        jbtnTanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnTanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanhActionPerformed(evt);
            }
        });

        jbtnXY2.setBackground(new java.awt.Color(0, 153, 153));
        jbtnXY2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnXY2.setForeground(new java.awt.Color(240, 231, 231));
        jbtnXY2.setText("x^2");
        jbtnXY2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnXY2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY2ActionPerformed(evt);
            }
        });

        jbtnCubeRoot.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCubeRoot.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnCubeRoot.setForeground(new java.awt.Color(240, 231, 231));
        jbtnCubeRoot.setText("Cbr");
        jbtnCubeRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnCubeRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCubeRootActionPerformed(evt);
            }
        });

        jbtnRound.setBackground(new java.awt.Color(0, 153, 153));
        jbtnRound.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnRound.setForeground(new java.awt.Color(240, 231, 231));
        jbtnRound.setText("Round");
        jbtnRound.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRoundActionPerformed(evt);
            }
        });

        jbtnXY3.setBackground(new java.awt.Color(0, 153, 153));
        jbtnXY3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnXY3.setForeground(new java.awt.Color(240, 231, 231));
        jbtnXY3.setText("x^3");
        jbtnXY3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnXY3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXY3ActionPerformed(evt);
            }
        });

        jbtnBinary.setBackground(new java.awt.Color(0, 153, 153));
        jbtnBinary.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnBinary.setForeground(new java.awt.Color(240, 231, 231));
        jbtnBinary.setText("Bin");
        jbtnBinary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBinaryActionPerformed(evt);
            }
        });

        jbtnHexadecimal.setBackground(new java.awt.Color(0, 153, 153));
        jbtnHexadecimal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnHexadecimal.setForeground(new java.awt.Color(240, 231, 231));
        jbtnHexadecimal.setText("Hex");
        jbtnHexadecimal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHexadecimalActionPerformed(evt);
            }
        });

        jbtnMod.setBackground(new java.awt.Color(0, 153, 153));
        jbtnMod.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnMod.setForeground(new java.awt.Color(240, 231, 231));
        jbtnMod.setText("Mod");
        jbtnMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModActionPerformed(evt);
            }
        });

        jbtnLnx.setBackground(new java.awt.Color(0, 153, 153));
        jbtnLnx.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnLnx.setForeground(new java.awt.Color(240, 231, 231));
        jbtnLnx.setText("lnx");
        jbtnLnx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnLnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLnxActionPerformed(evt);
            }
        });

        jbtnOctal.setBackground(new java.awt.Color(0, 153, 153));
        jbtnOctal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnOctal.setForeground(new java.awt.Color(240, 231, 231));
        jbtnOctal.setText("Octal");
        jbtnOctal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOctalActionPerformed(evt);
            }
        });

        jCDistance.setBackground(new java.awt.Color(0, 153, 102));
        jCDistance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCDistance.setForeground(new java.awt.Color(204, 204, 204));
        jCDistance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Distance", "Speed", "Time", "Area(Rectangle)", "Perimeter(Rectangle)" }));
        jCDistance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jCDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDistanceActionPerformed(evt);
            }
        });

        jbtnConverter.setBackground(new java.awt.Color(153, 153, 0));
        jbtnConverter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnConverter.setForeground(new java.awt.Color(0, 153, 153));
        jbtnConverter.setText("Convert");
        jbtnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConverterActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(new java.awt.Color(153, 153, 0));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 153, 153));
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jlblDisplay1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblDisplay1ActionPerformed(evt);
            }
        });

        jlblDisplay3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblDisplay3ActionPerformed(evt);
            }
        });

        jlblDisplay2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jlblResult.setBackground(new java.awt.Color(0, 0, 0));
        jlblResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblResult.setForeground(new java.awt.Color(255, 255, 255));
        jlblResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jlblResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblResultActionPerformed(evt);
            }
        });

        jtxtEnter1.setBackground(new java.awt.Color(0, 0, 0));
        jtxtEnter1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jtxtEnter1.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEnter1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtEnter1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jtxtEnter2.setBackground(new java.awt.Color(0, 0, 0));
        jtxtEnter2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jtxtEnter2.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEnter2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtEnter2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jbtnDivisionByOne.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDivisionByOne.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnDivisionByOne.setForeground(new java.awt.Color(240, 231, 231));
        jbtnDivisionByOne.setText("1/x");
        jbtnDivisionByOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnDivisionByOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivisionByOneActionPerformed(evt);
            }
        });

        jbtnFactorial.setBackground(new java.awt.Color(0, 153, 153));
        jbtnFactorial.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnFactorial.setForeground(new java.awt.Color(240, 231, 231));
        jbtnFactorial.setText("n!");
        jbtnFactorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFactorialActionPerformed(evt);
            }
        });

        jbtnCosInverse.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCosInverse.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnCosInverse.setForeground(new java.awt.Color(240, 231, 231));
        jbtnCosInverse.setText("Cos^-1");
        jbtnCosInverse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnCosInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosInverseActionPerformed(evt);
            }
        });

        jbtnSinInverse.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSinInverse.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnSinInverse.setForeground(new java.awt.Color(240, 231, 231));
        jbtnSinInverse.setText("Sin^-1");
        jbtnSinInverse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnSinInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinInverseActionPerformed(evt);
            }
        });

        jbtnTanInverse.setBackground(new java.awt.Color(0, 153, 153));
        jbtnTanInverse.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnTanInverse.setForeground(new java.awt.Color(240, 231, 231));
        jbtnTanInverse.setText("Tan^-1");
        jbtnTanInverse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnTanInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanInverseActionPerformed(evt);
            }
        });

        jbtnEXP.setBackground(new java.awt.Color(0, 153, 153));
        jbtnEXP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnEXP.setForeground(new java.awt.Color(240, 231, 231));
        jbtnEXP.setText("EXP");
        jbtnEXP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnEXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEXPActionPerformed(evt);
            }
        });

        jbtnDegree.setBackground(new java.awt.Color(255, 102, 102));
        jbtnDegree.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnDegree.setText("DRG");
        jbtnDegree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
        jbtnDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDegreeActionPerformed(evt);
            }
        });

        jbtnRadian.setBackground(new java.awt.Color(255, 102, 102));
        jbtnRadian.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnRadian.setText("RND");
        jbtnRadian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
        jbtnRadian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRadianActionPerformed(evt);
            }
        });

        jbtnPercent.setBackground(new java.awt.Color(0, 153, 153));
        jbtnPercent.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnPercent.setForeground(new java.awt.Color(240, 231, 231));
        jbtnPercent.setText("%");
        jbtnPercent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPercentActionPerformed(evt);
            }
        });

        jbtnON.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(jbtnON);
        jbtnON.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnON.setForeground(new java.awt.Color(255, 255, 255));
        jbtnON.setText("ON");
        jbtnON.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnONActionPerformed(evt);
            }
        });

        jbtnOFF.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(jbtnOFF);
        jbtnOFF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnOFF.setForeground(new java.awt.Color(255, 255, 255));
        jbtnOFF.setText("OFF");
        jbtnOFF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOFFActionPerformed(evt);
            }
        });

        jbtnSinh1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnSinh1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnSinh1.setForeground(new java.awt.Color(240, 231, 231));
        jbtnSinh1.setText("Exit");
        jbtnSinh1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jbtnSinh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinh1ActionPerformed(evt);
            }
        });

        jCDistance1.setBackground(new java.awt.Color(0, 153, 102));
        jCDistance1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jCDistance1.setForeground(new java.awt.Color(204, 204, 204));
        jCDistance1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Area(Circle)", "Perimeter(Circle)", "Area(Square)", "Perimeter(Square)", "Meter To Kilometer", "KiloMeter To Meter", " ", " ", " ", " " }));
        jCDistance1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jCDistance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDistance1ActionPerformed(evt);
            }
        });

        jbtnConverter1.setBackground(new java.awt.Color(153, 153, 0));
        jbtnConverter1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnConverter1.setForeground(new java.awt.Color(0, 153, 153));
        jbtnConverter1.setText("Convert");
        jbtnConverter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConverter1ActionPerformed(evt);
            }
        });

        jlblResult1.setBackground(new java.awt.Color(0, 0, 0));
        jlblResult1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlblResult1.setForeground(new java.awt.Color(255, 255, 255));
        jlblResult1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtxtEnter3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtEnter3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtEnter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEnter3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standerd");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Unit Converter");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnOFF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addComponent(jbtnRadian, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbtnDivisionByOne, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnSinInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jbtnSinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnXY2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnXY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnTanInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnLnx, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnEXP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCosInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnConverter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCDistance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtxtEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jtxtEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbtnConverter1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jlblResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCDistance1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jtxtEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(15, 15, 15))
                                    .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnOFF))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnRadian, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnSinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDivisionByOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSinInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblDisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtEnter2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCDistance1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnConverter1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblResult1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCosh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCosInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnXY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTanh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTanInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnXY2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnRound, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLnx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnXY3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(true);
       this.setSize(630, 480);
       jtxtDisplay.setSize(600, 55);
    }                                          

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
       this.setResizable(true);
       this.setSize(265, 480);
    }                                    

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(true);
       this.setSize(265, 480);
       jtxtDisplay.setSize(225, 45);
    }                                          

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        String bsp = null;
        
        if(jtxtDisplay.getText().length() > 0)
        {
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
            bsp = strB.toString();
            jtxtDisplay.setText(bsp);
            
        }
    }                                             

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn7 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn4 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn1 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jtxtDisplay.setText("");
    }                                         

    private void jbtnRootActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn0 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn8 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.log(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn9 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn5 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn6 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn2 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String iNum = jtxtDisplay.getText() + jbtn3 .getText();
        jtxtDisplay.setText(iNum);
    }                                     

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(!jtxtDisplay.getText().contains("."))
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
        }
        
    }                                       

    private void jbtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops *(-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                             

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sin(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cos(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnSinhActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sinh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnCoshActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cosh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tan(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnPiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        double ops ;
        ops = Math.PI;
        jtxtDisplay.setText(String.valueOf(ops));
        
    }                                      

    private void jbtnRoundActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.round(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jbtnXYActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.pow(ops,ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                      

    private void jbtnXY2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnXY3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = (ops * ops * ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnCubeRootActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cbrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                            

    private void jbtnBinaryActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int a = Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a,2));
    }                                          

    private void jbtnHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        int a = Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a,16));
    }                                               

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) 
                || (c == KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
        }
    }                                    

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if (operations =="+")
        {
            result = firstnum +secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="-")
            {
            result = firstnum -secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="*")
            {
            result = firstnum *secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="/")
            {
            result = firstnum /secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="%")
            {
            result = firstnum %secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        else if(operations =="^")
            {
            result = Math.pow(firstnum,secondnum);
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);
        }
        
    }                                          

    private void jbtnAdditionActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations =("+");
    }                                            

    private void jbtnSubtractionActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations =("-");
    }                                               

    private void jbtnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations =("*");
    }                                                  

    private void jbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations =("/");
    }                                            

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operations =("%");
    }                                       

    private void jbtnLnxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.log10(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnOctalActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int a = Integer.parseInt(jtxtDisplay.getText());
        jtxtDisplay.setText(Integer.toString(a,8));
    }                                         

    private void jCDistanceActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        this.setResizable(true);
       this.setSize(1015, 480);
       jtxtDisplay.setSize(600, 55);
    }                                          

    private void jbtnConverterActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        double dst1 = Double.parseDouble(jtxtEnter1.getText());
        double dst2 = Double.parseDouble(jtxtEnter2.getText());
        double dst3;
        if((jtxtEnter1.getText().equals("")) || (jtxtEnter2.getText().equals("")))
                {
                    JOptionPane.showMessageDialog(null,"You must enter value",
                            "DST System",JOptionPane.INFORMATION_MESSAGE);
                }
        if(jCDistance.getSelectedItem().equals("Distance"))
        {
            jlblDisplay1.setText("Distance =");
            jlblDisplay2.setText("Speed X");
            jlblDisplay3.setText("Time");
            dst3 = dst1 * dst2;
            String value = String.format("%.2f", dst3);
            jlblResult.setText(value);
        }
        if(jCDistance.getSelectedItem().equals("Speed"))
        {
            jlblDisplay1.setText("Speed =");
            jlblDisplay2.setText("Distance /");
            jlblDisplay3.setText("Time");
            dst3 = dst1 * dst2;
            String value = String.format("%.2f", dst3);
            jlblResult.setText(value + "sqcm.");
        }
        if(jCDistance.getSelectedItem().equals("Time"))
        {
            jlblDisplay1.setText("Time =");
            jlblDisplay2.setText("Distance /");
            jlblDisplay3.setText("Speed");
            dst3 = dst1 * dst2;
            String value = String.format("%.2f", dst3);
            jlblResult.setText(value);
        }
         if(jCDistance.getSelectedItem().equals("Area(Rectangle)"))
        {
           jlblDisplay1.setText("Area =");
            jlblDisplay2.setText("length *");
            jlblDisplay3.setText("breadth");
            dst3 = dst1 * dst2;
            String value = String.format("%.2f", dst3);
            jlblResult.setText(value + "sqcm.");
        }
        if(jCDistance.getSelectedItem().equals("Perimeter(Rectangle)"))
        {
           
            jlblDisplay1.setText("Perimeter =");
            jlblDisplay2.setText("2*length +");
            jlblDisplay3.setText("2*breadth");
            dst3 = (2*(dst1 + dst2));
            String value = String.format("%.2f", dst3);
            jlblResult.setText(value + "cm");
        }   
        
    }                                             

    private void jlblDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jlblResult.setText(null);
        jlblResult1.setText(null);
        jlblDisplay1.setText(null);
        jlblDisplay2.setText(null);
        jlblDisplay3.setText(null);
        jtxtEnter1.setText(null);
        jtxtEnter2.setText(null);
        jtxtEnter3.setText(null);
        jCDistance.getSelectedItem().equals("Select an option");
        jCDistance1.getSelectedItem().equals("Select an option");
    }                                         

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jbtnTanhActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tanh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jbtnDivisionByOneActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.pow(ops,-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                                 

    private void jbtnFactorialActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));   
    int i,fact=1;  
    //It is the number to calculate factorial    
    for(i=1;i<=ops;i++){    
        fact=fact*i;    
    }    
        jtxtDisplay.setText(String.valueOf(fact));
    }                                             

    private void jbtnCosInverseActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.cos(ops);
        double ops1 = Math.pow(ops,-1);
        jtxtDisplay.setText(String.valueOf(ops1));
    }                                              

    private void jbtnSinInverseActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.sin(ops);
        double ops1 = Math.pow(ops,-1);
        jtxtDisplay.setText(String.valueOf(ops1));
    }                                              

    private void jbtnTanInverseActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.tan(ops);
        double ops1 = Math.pow(ops,-1);
        jtxtDisplay.setText(String.valueOf(ops1));
    }                                              

    private void jbtnEXPActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.exp(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                       

    private void jbtnDegreeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.toDegrees(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                          

    private void jbtnRadianActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = Math.toRadians(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                          

    private void jbtnPercentActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops/100;
        jtxtDisplay.setText(String.valueOf(ops));
    }                                           

    private void jbtnONActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        enable();
    }                                      

    private void jbtnOFFActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        disable();
    }                                       

    private void jbtnSinh1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        System.exit(0);
    }                                         

    private void jCDistance1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jbtnConverter1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        double dst4 = Double.parseDouble(jtxtEnter3.getText());
        
        if((jtxtEnter3.getText().equals("")) )
                {
                    JOptionPane.showMessageDialog(null,"You must enter value",
                            "DST System",JOptionPane.INFORMATION_MESSAGE);
                }
        if(jCDistance1.getSelectedItem().equals("Area(Circle)"))
        {
            double pi=3.14;
            double add=Double.parseDouble(jtxtEnter3.getText());
            double sumUp;
            sumUp=pi*add;
            dst4 = sumUp*add ;
            String value = String.format("%.2f", dst4 );
            jlblResult1.setText(value+ "sqcm.");
        }
        if(jCDistance1.getSelectedItem().equals("Perimeter(Circle)"))
        {
            double pi=Math.PI;
            double add=Double.parseDouble(jtxtEnter3.getText());
            double sumUp;
            sumUp=pi*add;
            dst4 = 2*sumUp ;
            String value = String.format("%.2f", dst4 );
            jlblResult1.setText(value );
        }
        if(jCDistance1.getSelectedItem().equals("Area(Square)"))
        {
            double num=Double.parseDouble(jtxtEnter3.getText());
            dst4 = num*num ;
            String value = String.format("%.2f", dst4 );
            jlblResult1.setText(value + "sqcm");
        }
        if(jCDistance1.getSelectedItem().equals("Perimeter(Square)"))
        {
            
            double num=Double.parseDouble(jtxtEnter3.getText());
            dst4 = 4*num ;
            String value = String.format("%.2f", dst4 );
            jlblResult1.setText(value + "cm");
        }
        if(jCDistance1.getSelectedItem().equals("Meter To Kilometer"))
        {
            double add=Double.parseDouble(jtxtEnter3.getText());
            dst4 =add/1000  ;
            String value = String.format("%.2f", dst4);
            jlblResult1.setText(value + "m.");
        }
        
        if(jCDistance1.getSelectedItem().equals("KiloMeter To Meter"))
        {
            double add=Double.parseDouble(jtxtEnter3.getText());
            dst4 =add*1000  ;
            String value = String.format("%.2f", dst4);
            jlblResult1.setText(value + "km.");
        }
        
    }                                              

    private void jtxtEnter3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jlblDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jlblResultActionPerformed(java.awt.event.ActionEvent evt) {                                           
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator_Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> jCDistance;
    private javax.swing.JComboBox<String> jCDistance1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAddition;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnBinary;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnConverter;
    private javax.swing.JButton jbtnConverter1;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnCosInverse;
    private javax.swing.JButton jbtnCosh;
    private javax.swing.JButton jbtnCubeRoot;
    private javax.swing.JButton jbtnDegree;
    private javax.swing.JButton jbtnDivision;
    private javax.swing.JButton jbtnDivisionByOne;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEXP;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnFactorial;
    private javax.swing.JButton jbtnHexadecimal;
    private javax.swing.JButton jbtnLnx;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMod;
    private javax.swing.JButton jbtnMultiplication;
    private javax.swing.JRadioButton jbtnOFF;
    private javax.swing.JRadioButton jbtnON;
    private javax.swing.JButton jbtnOctal;
    private javax.swing.JButton jbtnPercent;
    private javax.swing.JButton jbtnPi;
    private javax.swing.JButton jbtnPlusMinus;
    private javax.swing.JButton jbtnRadian;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnRoot;
    private javax.swing.JButton jbtnRound;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSinInverse;
    private javax.swing.JButton jbtnSinh;
    private javax.swing.JButton jbtnSinh1;
    private javax.swing.JButton jbtnSubtraction;
    private javax.swing.JButton jbtnTan;
    private javax.swing.JButton jbtnTanInverse;
    private javax.swing.JButton jbtnTanh;
    private javax.swing.JButton jbtnXY;
    private javax.swing.JButton jbtnXY2;
    private javax.swing.JButton jbtnXY3;
    private javax.swing.JTextField jlblDisplay1;
    private javax.swing.JTextField jlblDisplay2;
    private javax.swing.JTextField jlblDisplay3;
    private javax.swing.JTextField jlblResult;
    private javax.swing.JTextField jlblResult1;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtEnter1;
    private javax.swing.JTextField jtxtEnter2;
    private javax.swing.JTextField jtxtEnter3;
    // End of variables declaration                   
}
