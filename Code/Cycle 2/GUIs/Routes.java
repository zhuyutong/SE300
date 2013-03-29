
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Craig
 */
public class Routes extends javax.swing.JFrame {

    /**
     * Creates new form Routes
     */
    private String routeNumber;
    private String originAirport;
    private String destinationAirport;
    private String departText;
    private int departTime;
    private String arrivalText;
    private int arrivalTime;
    private String airline;
    private String costString;
    private double cost;
    
    
    
    
    public Routes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        routePanel = new javax.swing.JPanel();
        intructionsLabel = new javax.swing.JLabel();
        routeNumberText = new javax.swing.JTextField();
        routeNumberLabel = new javax.swing.JLabel();
        originLabel = new javax.swing.JLabel();
        originText = new javax.swing.JTextField();
        destinationLabel = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        destinationText = new javax.swing.JTextField();
        departTimeText = new javax.swing.JTextField();
        arrivalLabel = new javax.swing.JLabel();
        arrivalTimeText = new javax.swing.JTextField();
        airlineLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        costText = new javax.swing.JTextField();
        acceptButton = new javax.swing.JButton();
        originValidationLabel = new javax.swing.JLabel();
        destinationValidationLabel = new javax.swing.JLabel();
        departValidationLabel = new javax.swing.JLabel();
        arrivalValidationLabel = new javax.swing.JLabel();
        costValidationLabel = new javax.swing.JLabel();
        airlineComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 250));
        setResizable(false);

        intructionsLabel.setText("Please Input The Route Information");

        routeNumberText.setEditable(false);
        routeNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeNumberTextActionPerformed(evt);
            }
        });

        routeNumberLabel.setText("Route #");

        originLabel.setText("Origin");

        originText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originTextActionPerformed(evt);
            }
        });

        destinationLabel.setText("Destination");

        departLabel.setText("Depart Time");

        arrivalLabel.setText("Arrival Time");

        airlineLabel.setText("Airline");

        costLabel.setText("Cost");

        acceptButton.setText("Accept");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        originValidationLabel.setText("           ");

        destinationValidationLabel.setText("            ");

        departValidationLabel.setText("            ");

        arrivalValidationLabel.setText("           ");

        costValidationLabel.setText("           ");

        airlineComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout routePanelLayout = new javax.swing.GroupLayout(routePanel);
        routePanel.setLayout(routePanelLayout);
        routePanelLayout.setHorizontalGroup(
            routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(intructionsLabel)
                .addGap(239, 239, 239))
            .addGroup(routePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(routeNumberLabel)
                    .addComponent(routeNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originLabel)
                    .addComponent(originText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destinationLabel)
                    .addComponent(destinationText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acceptButton)
                    .addGroup(routePanelLayout.createSequentialGroup()
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(departTimeText))
                        .addGap(35, 35, 35)
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arrivalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arrivalTimeText))
                        .addGap(35, 35, 35)
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airlineLabel)
                            .addComponent(airlineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costLabel)
                            .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(routePanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(originValidationLabel)
                .addGap(57, 57, 57)
                .addComponent(destinationValidationLabel)
                .addGap(62, 62, 62)
                .addComponent(departValidationLabel)
                .addGap(58, 58, 58)
                .addComponent(arrivalValidationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(costValidationLabel)
                .addGap(35, 35, 35))
        );
        routePanelLayout.setVerticalGroup(
            routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routePanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(intructionsLabel)
                .addGap(18, 18, 18)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeNumberLabel)
                    .addComponent(originLabel)
                    .addComponent(destinationLabel)
                    .addComponent(departLabel)
                    .addComponent(arrivalLabel)
                    .addComponent(airlineLabel)
                    .addComponent(costLabel))
                .addGap(18, 18, 18)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(originText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originValidationLabel)
                    .addComponent(destinationValidationLabel)
                    .addComponent(departValidationLabel)
                    .addComponent(arrivalValidationLabel)
                    .addComponent(costValidationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(acceptButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(routePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(routePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void routeNumberTextActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void originTextActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
 this.originAirport = originText.getText();
       
        Pattern p = Pattern.compile("[A-Z]{3}");
       
        Matcher m = p.matcher(originAirport);
        
        int i = 0;
        
        while(m.find()){
            i++;
        }
        if(i==0){
        originValidationLabel.setText("Invalid");
        
        } 
        
        else{
            originValidationLabel.setText("     ");
        }
        
       this.destinationAirport = destinationText.getText();
       
        Matcher n = p.matcher(destinationAirport);
        
        int j = 0;
        
        while(n.find()){
            j++;
        }
        if(j==0){
        destinationValidationLabel.setText("Invalid");
        } 
        
        else{
            destinationValidationLabel.setText("     ");
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
            java.util.logging.Logger.getLogger(Routes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Routes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Routes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Routes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Routes stuff = new Routes();
                stuff.setVisible(true);
            }
        });
       
    }
    public void setRouteNumber(String routeNumber){
        routeNumber = this.routeNumber;
        
        routeNumberText.setText(routeNumber);
    }
    public String getRouteNumber(){
        
        return routeNumber;
    }
    public String getOrigin(){
        this.originAirport = originText.getText();
       
        Pattern p = Pattern.compile("[A-Z]{3}");
       
        Matcher m = p.matcher(originAirport);
        
        int i = 0;
        
        while(m.find()){
            i++;
        }
        if(i==1){
        
            return originAirport;
        }
        else{
           originValidationLabel.setText("Invalid");
           
           return null;
        }
    }
    public String getDestination(){
        this.destinationAirport = destinationText.getText();
       
        Pattern p = Pattern.compile("[A-Z]{3}");
       
        Matcher m = p.matcher(destinationAirport);
        
        int i = 0;
        
        while(m.find()){
            i++;
        }
        if(i==1){
        
            return destinationAirport;
        }
        else{
           destinationValidationLabel.setText("Invalid");
           
           return null;
        }
    }
    public int getDepartTime(){
       this.departText = departTimeText.getText();
       
       this.departTime = Integer.parseInt(departText);
       
       
       return departTime;
    }
    public int getArrivalTime(){
       this.arrivalText = arrivalTimeText.getText();
       
       this.arrivalTime = Integer.parseInt(arrivalText);
       
        return arrivalTime;
    }
    public String getAirline(){
        this.airline = airlineComboBox.getSelectedItem().toString();
        
        return airline;
    }
    public double getCost(){
        this.costString = costText.getText();
        
        this.cost = Double.parseDouble(costString);
        
        return cost;
    }
   
    // Variables declaration - do not modify                     
    private javax.swing.JButton acceptButton;
    private javax.swing.JComboBox airlineComboBox;
    private javax.swing.JLabel airlineLabel;
    private javax.swing.JLabel arrivalLabel;
    private javax.swing.JTextField arrivalTimeText;
    private javax.swing.JLabel arrivalValidationLabel;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField costText;
    private javax.swing.JLabel costValidationLabel;
    private javax.swing.JLabel departLabel;
    private javax.swing.JTextField departTimeText;
    private javax.swing.JLabel departValidationLabel;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JTextField destinationText;
    private javax.swing.JLabel destinationValidationLabel;
    private javax.swing.JLabel intructionsLabel;
    private javax.swing.JLabel originLabel;
    private javax.swing.JTextField originText;
    private javax.swing.JLabel originValidationLabel;
    private javax.swing.JLabel routeNumberLabel;
    private javax.swing.JTextField routeNumberText;
    private javax.swing.JPanel routePanel;
    // End of variables declaration                   
}

