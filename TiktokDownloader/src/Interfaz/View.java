package Interfaz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.SwingUtilities;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("TikTok Downloader");
        
    setIconImage(new javax.swing.ImageIcon(
    getClass().getResource("/resources/icono.png")
    ).getImage());
                // Colores dark
        java.awt.Color fondo = new java.awt.Color(18, 18, 18);
        java.awt.Color acento = new java.awt.Color(254, 44, 85);
        java.awt.Color texto = new java.awt.Color(255, 255, 255);

        // Fondo ventana
        getContentPane().setBackground(fondo);

        // TextField
        txtlink.setBackground(new java.awt.Color(45, 45, 45));
        txtlink.setForeground(texto);
        txtlink.setCaretColor(texto);
        txtlink.setBorder(javax.swing.BorderFactory.createLineBorder(acento, 1));

        // Botón
        bndescargar.setBackground(acento);
        bndescargar.setForeground(texto);
        bndescargar.setFocusPainted(false);
        bndescargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Label status
        labelestatus.setForeground(texto);
    
        progressBar.setForeground(acento);
        progressBar.setBackground(new java.awt.Color(45, 45, 45));
        progressBar.setBorderPainted(false);
        progressBar.setValue(0);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtlink = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelestatus = new javax.swing.JLabel();
        bndescargar = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtlink.setBackground(new java.awt.Color(204, 204, 204));
        txtlink.setForeground(new java.awt.Color(204, 204, 204));
        txtlink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtlink.setToolTipText("");
        txtlink.setBorder(null);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pega el link del video");

        labelestatus.setForeground(new java.awt.Color(204, 204, 204));
        labelestatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bndescargar.setText("Descargar");
        bndescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bndescargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlink, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bndescargar)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(bndescargar)
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(labelestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bndescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bndescargarActionPerformed
String url = txtlink.getText().trim();

if (url.contains("?")) {
    url = url.substring(0, url.indexOf("?"));
}

if (url.isEmpty()) {
    labelestatus.setText("⚠ Pega una URL primero.");
    return;
}

bndescargar.setEnabled(false);
labelestatus.setText("⏳ Obteniendo link de descarga...");

final String urlFinal = url;

new Thread(() -> {
    try {
        // 1. Llamar a la API de tikwm.com
        java.net.URL apiUrl = new java.net.URL("https://www.tikwm.com/api/?url=" + urlFinal);
        java.net.HttpURLConnection con = (java.net.HttpURLConnection) apiUrl.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        // 2. Leer respuesta
        java.io.BufferedReader br = new java.io.BufferedReader(
            new java.io.InputStreamReader(con.getInputStream())
        );
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            response.append(line);
        }
        br.close();

        String json = response.toString();

        // 3. Extraer el link de descarga
        if (json.contains("\"play\":\"")) {
            String downloadUrl = json.split("\"play\":\"")[1].split("\"")[0];
            downloadUrl = downloadUrl.replace("\\/", "/");

            // 4. Descargar el archivo
            SwingUtilities.invokeLater(() -> labelestatus.setText("⏳ Descargando video..."));
            SwingUtilities.invokeLater(() -> {
            labelestatus.setText("⏳ Descargando video...");
            progressBar.setIndeterminate(true);
        });
            java.net.URL fileUrl = new java.net.URL(downloadUrl);
            java.net.HttpURLConnection fileCon = (java.net.HttpURLConnection) fileUrl.openConnection();
            fileCon.setRequestProperty("User-Agent", "Mozilla/5.0");
            java.io.InputStream in = fileCon.getInputStream();
java.io.File carpeta = new java.io.File("C:\\Users\\PC\\Videos\\lol");
carpeta.mkdirs();
String videoId = urlFinal.substring(urlFinal.lastIndexOf("/") + 1);
String destino = "C:\\Users\\PC\\Videos\\lol\\" + videoId + ".mp4";
java.nio.file.Files.copy(in, java.nio.file.Paths.get(destino),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            in.close();

            SwingUtilities.invokeLater(() -> {
                labelestatus.setText("✅ ¡Descargado en el Escritorio!");
                progressBar.setIndeterminate(false);
                progressBar.setValue(100);
                txtlink.setText("");
                bndescargar.setEnabled(true);
            });

        } else {
            SwingUtilities.invokeLater(() -> {
                labelestatus.setText("❌ No se pudo obtener el link.");
            progressBar.setIndeterminate(false);
            progressBar.setValue(0);    
                bndescargar.setEnabled(true);
            });
        }

    } catch (Exception ex) {
        SwingUtilities.invokeLater(() -> {
            labelestatus.setText("❌ Error: " + ex.getMessage());
            bndescargar.setEnabled(true);
        });
    }
}).start();

    }//GEN-LAST:event_bndescargarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bndescargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelestatus;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField txtlink;
    // End of variables declaration//GEN-END:variables
}
