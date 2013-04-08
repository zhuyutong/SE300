import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muraad Khan
 */
public class Open_Close_Box extends javax.swing.JFrame {

	//checking for invalid input

	/**
	 * Creates new form Open_Close_Box
	 */
	Director d;

	public Open_Close_Box(Director d) {
		this.d=d;
		initComponents();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Open_Airport_Ok = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        openPanel = new javax.swing.JPanel();
        Combo_AirportOpen = new javax.swing.JComboBox();
        From_lbl = new javax.swing.JLabel();
        Until_lbl = new javax.swing.JLabel();
        openBeginField = new javax.swing.JTextField();
        openEndField = new javax.swing.JTextField();
        airportLabel = new javax.swing.JLabel();
        endValid = new javax.swing.JLabel();
        beginValid = new javax.swing.JLabel();
        closePanel = new javax.swing.JPanel();
        airportCloseLabel = new javax.swing.JLabel();
        Until_lbl1 = new javax.swing.JLabel();
        From_lbl1 = new javax.swing.JLabel();
        Combo_AirportClose = new javax.swing.JComboBox();
        closeEndField = new javax.swing.JTextField();
        closeBeginField = new javax.swing.JTextField();
        beginClose = new javax.swing.JLabel();
        closeEnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Open_Airport_Ok.setText("OK");
        Open_Airport_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_Airport_OkActionPerformed(evt);
            }
        });

        openPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Open an Airport"));

        Combo_AirportOpen.setModel(new javax.swing.DefaultComboBoxModel(d.getAirports().toArray()));

        From_lbl.setText("End:");

        Until_lbl.setText("Begin:");

        airportLabel.setText("Airport:");

        endValid.setText("        ");

        beginValid.setText("         ");

        javax.swing.GroupLayout openPanelLayout = new javax.swing.GroupLayout(openPanel);
        openPanel.setLayout(openPanelLayout);
        openPanelLayout.setHorizontalGroup(
            openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(openPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Until_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(From_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(airportLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Combo_AirportOpen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(openBeginField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(openEndField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(beginValid)
                    .addComponent(endValid))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        openPanelLayout.setVerticalGroup(
            openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(openPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_AirportOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airportLabel))
                .addGap(18, 18, 18)
                .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openBeginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Until_lbl)
                    .addComponent(beginValid))
                .addGap(18, 18, 18)
                .addGroup(openPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openEndField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(From_lbl)
                    .addComponent(endValid))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Open", openPanel);
        openPanel.getAccessibleContext().setAccessibleName("Open Airport");
        openPanel.getAccessibleContext().setAccessibleDescription("Open an Airport");

        closePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Close an Airport"));

        airportCloseLabel.setText("Airport:");

        Until_lbl1.setText("Begin:");

        From_lbl1.setText("End:");

        Combo_AirportClose.setModel(new javax.swing.DefaultComboBoxModel(d.getAirports().toArray()));

        beginClose.setText("           ");

        closeEnd.setText("          ");

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Until_lbl1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(From_lbl1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(airportCloseLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Combo_AirportClose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(closeBeginField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(closeEndField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beginClose)
                    .addComponent(closeEnd))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        closePanelLayout.setVerticalGroup(
            closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_AirportClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airportCloseLabel))
                .addGap(18, 18, 18)
                .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBeginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Until_lbl1)
                    .addComponent(beginClose))
                .addGap(18, 18, 18)
                .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeEndField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(From_lbl1)
                    .addComponent(closeEnd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Close", closePanel);
        closePanel.getAccessibleContext().setAccessibleName("Close an airport");
        closePanel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Open_Airport_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Open_Airport_Ok)
                .addContainerGap())
        );

        tabbedPane.getAccessibleContext().setAccessibleName("Open an airport");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Open_Airport_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_Airport_OkActionPerformed
        
    	boolean begin=false;
    	boolean end=false;
    	int s = tabbedPane.getSelectedIndex();
    	
    	
    	if(s==1){
    		
    		Pattern q = Pattern.compile("[0-9]{4}");      
            Matcher o = q.matcher(closeBeginField.getText());
            
            
                
            if(o.matches()){
 
            int closeBegin = Integer.parseInt(closeBeginField.getText());
                
                if(0000 < closeBegin && closeBegin < 2400){
                    
                    begin = true; 
                       beginClose.setText("Valid");            
                }
                
           }
            else{
                beginClose.setText("Invalid");
            }
            
             o = q.matcher(closeEndField.getText());
             
             if(o.matches()){
            	 
            	 int close = Integer.parseInt(closeEndField.getText());
                 
                 if(0000 < close && close < 2400){
                     
                     end = true; 
                     closeEnd.setText("Valid");
                                    
                 }
                 
            }
             else{
                 closeEnd.setText("Invalid");
             }
            	 
             }
    	
    	if(begin&&end){
             
    		
    		Airport a = (Airport) Combo_AirportOpen.getSelectedItem();
    		for(int i=0;i<d.getAllRoutes().size();i++){
    			
    			if(d.getAllRoutes().get(i).toString().matches(a.toString())){
    				
    				d.editAirport(a);
    				break;
    				
    			}
    			
    		}
    		
    	}
    	
    	
    	
    }//GEN-LAST:event_Open_Airport_OkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_AirportOpen;
    private javax.swing.JComboBox Combo_AirportClose;
    private javax.swing.JLabel From_lbl;
    private javax.swing.JLabel From_lbl1;
    private javax.swing.JButton Open_Airport_Ok;
    private javax.swing.JLabel Until_lbl;
    private javax.swing.JLabel Until_lbl1;
    private javax.swing.JLabel airportCloseLabel;
    private javax.swing.JLabel airportLabel;
    private javax.swing.JLabel beginClose;
    private javax.swing.JLabel beginValid;
    private javax.swing.JTextField closeBeginField;
    private javax.swing.JLabel closeEnd;
    private javax.swing.JTextField closeEndField;
    private javax.swing.JPanel closePanel;
    private javax.swing.JLabel endValid;
    private javax.swing.JTextField openBeginField;
    private javax.swing.JTextField openEndField;
    private javax.swing.JPanel openPanel;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
