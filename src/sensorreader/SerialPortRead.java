
package sensorreader;
import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.io.OutputStream;
import java.io.IOException;

public class SerialPortRead extends javax.swing.JFrame {

    SerialPort serialPort1; //add serial port
    OutputStream outputStream1;
    String dataBuffer = ""; //store varialble
    public SerialPortRead() {
        initComponents();
        //create default value
        baudRate_Combox.setSelectedItem("9600");
        DataBits_Combox.setSelectedItem("8");
        stopBits_Combox.setSelectedItem("1");
        parityBits_Combox.setSelectedItem("No_PARITY");
        endLine_Combox.setSelectedItem("None");
        
        comPort_Combox.setEnabled(true);
        jProgressBar_ComStatus.setValue(0);
        jButton_Open.setEnabled(true);
        jButton_Close.setEnabled(false);
        jButton_send.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comPortSettings_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comPort_Combox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        baudRate_Combox = new javax.swing.JComboBox<>();
        DataBits_Combox = new javax.swing.JComboBox<>();
        parityBits_Combox = new javax.swing.JComboBox<>();
        stopBits_Combox = new javax.swing.JComboBox<>();
        jProgressBar_ComStatus = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jButton_Close = new javax.swing.JButton();
        jButton_Open = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        endLine_Combox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_SerialView = new javax.swing.JTextArea();
        jButton_send = new javax.swing.JButton();
        jTextField_dataToSend = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comPortSettings_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COM PORT SETTINGS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("BAUD RATE");

        comPort_Combox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comPort_ComboxPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel3.setText("COM STATUS");

        jLabel4.setText("DATA BITS");

        jLabel2.setText("COM PORT");

        jLabel5.setText("STOP BITS");

        jLabel6.setText("PARITY BITS");

        baudRate_Combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4800", "9600", "38400", "57600", "115200" }));

        DataBits_Combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8" }));

        parityBits_Combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO_PARITY", "EVEN_PARITY", "ODD_PARITY", "MARK_PARITY", "SPACE_PARITY" }));

        stopBits_Combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1.5", "2" }));

        javax.swing.GroupLayout comPortSettings_PanelLayout = new javax.swing.GroupLayout(comPortSettings_Panel);
        comPortSettings_Panel.setLayout(comPortSettings_PanelLayout);
        comPortSettings_PanelLayout.setHorizontalGroup(
            comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPortSettings_PanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stopBits_Combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parityBits_Combox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 141, Short.MAX_VALUE)
                    .addComponent(comPort_Combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(baudRate_Combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DataBits_Combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar_ComStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        comPortSettings_PanelLayout.setVerticalGroup(
            comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPortSettings_PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comPort_Combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(baudRate_Combox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DataBits_Combox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stopBits_Combox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(parityBits_Combox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(comPortSettings_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar_ComStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_Close.setText("CLOSE");
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });

        jButton_Open.setText("OPEN");
        jButton_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton_Open, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Close)
                    .addComponent(jButton_Open))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel7.setText("END LINE");

        endLine_Combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "New Line (\\n)", "Carriage Return (\\r)", "Both (\\r\\n)" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextArea_SerialView.setColumns(20);
        jTextArea_SerialView.setRows(5);
        jScrollPane1.setViewportView(jTextArea_SerialView);

        jButton_send.setText("SEND");
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextField_dataToSend, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_send)
                    .addComponent(jTextField_dataToSend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comPortSettings_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(endLine_Combox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comPortSettings_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endLine_Combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comPort_ComboxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comPort_ComboxPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        comPort_Combox.removeAllItems();
        SerialPort []portLists = SerialPort.getCommPorts();
        for(SerialPort port: portLists){
            comPort_Combox.addItem(port.getSystemPortName());
        }
    }//GEN-LAST:event_comPort_ComboxPopupMenuWillBecomeVisible

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed
        // TODO add your handling code here:
        if(serialPort1.isOpen()){
            serialPort1.closePort();

            comPort_Combox.setEnabled(true);
            jProgressBar_ComStatus.setValue(0);
            jButton_Open.setEnabled(true);
            jButton_Close.setEnabled(false);
            jButton_send.setEnabled(false);
        }
    }//GEN-LAST:event_jButton_CloseActionPerformed

    private void jButton_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpenActionPerformed
        // TODO add your handling code here:
        try{
            SerialPort []portLists = SerialPort.getCommPorts();
            serialPort1 = portLists [comPort_Combox.getSelectedIndex()];
            serialPort1.setBaudRate(Integer.parseInt(baudRate_Combox.getSelectedItem().toString()));
            serialPort1.setNumDataBits(Integer.parseInt(DataBits_Combox.getSelectedItem().toString()));
            serialPort1.setNumStopBits(Integer.parseInt(stopBits_Combox.getSelectedItem().toString()));
            serialPort1.setParity(parityBits_Combox.getSelectedIndex());
            serialPort1.openPort();
            if(serialPort1.isOpen()){
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() +" -- Success to OPEN!");
                comPort_Combox.setEnabled(false);
                jProgressBar_ComStatus.setValue(100);
                jButton_Open.setEnabled(false);
                jButton_Close.setEnabled(true);
                jButton_send.setEnabled(true);

                Serial_EventBasedReading(serialPort1);
            }
            else{
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() +" -- Failed to OPEN");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Please Choose COM PORT!","ERROR",ERROR_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e,"ERROR",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_OpenActionPerformed

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        // TODO add your handling code here:
        outputStream1 = serialPort1.getOutputStream();//send data to port
        String dataToSend = "";
        switch(endLine_Combox.getSelectedIndex()){
            case 0: dataToSend = jTextField_dataToSend.getText();//none
            break;
            case 1: dataToSend = jTextField_dataToSend.getText() + "\n";//new line
            break;
            case 2: dataToSend = jTextField_dataToSend.getText() + "\r";//carriage return
            break;
            case 3: dataToSend = jTextField_dataToSend.getText() + "\r\n";
            break;
        }
        try{
            outputStream1.write(dataToSend.getBytes());
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton_sendActionPerformed
    private void Serial_EventBasedReading(SerialPort activePort){
        activePort.addDataListener(new SerialPortDataListener(){
            @Override
            public int getListeningEvents(){return SerialPort.LISTENING_EVENT_DATA_RECEIVED;}
            @Override
            public void serialEvent(SerialPortEvent event){
                byte []newData = event.getReceivedData();
                for(int i=0; i<newData.length; i++){
                    dataBuffer += (char)newData[i];
                    jTextArea_SerialView.setText(dataBuffer);
                }
            }
        });
    
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
            java.util.logging.Logger.getLogger(SerialPortRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerialPortRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerialPortRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerialPortRead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerialPortRead().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DataBits_Combox;
    private javax.swing.JComboBox<String> baudRate_Combox;
    private javax.swing.JPanel comPortSettings_Panel;
    private javax.swing.JComboBox<String> comPort_Combox;
    private javax.swing.JComboBox<String> endLine_Combox;
    private javax.swing.JButton jButton_Close;
    private javax.swing.JButton jButton_Open;
    private javax.swing.JButton jButton_send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar_ComStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_SerialView;
    private javax.swing.JTextField jTextField_dataToSend;
    private javax.swing.JComboBox<String> parityBits_Combox;
    private javax.swing.JComboBox<String> stopBits_Combox;
    // End of variables declaration//GEN-END:variables
}
