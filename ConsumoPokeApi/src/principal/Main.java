package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    
    private ApiConsumption api = new ApiConsumption();
    public DefaultTableModel modal;
    public DefaultTableCellRenderer renderer;
    
    public Main() {
        initComponents();
        this.renderer = new DefaultTableCellRenderer();
        this.modal = (DefaultTableModel) this.tableInfoPokemon.getModel();
        this.buttonScroll();
        this.showImg("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png", "bulbasaur");
        String urlPokemon = api.GetConsumption("https://pokeapi.co/api/v2/pokemon/1/");
        ability(urlPokemon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        pokemonName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfoPokemon = new javax.swing.JTable();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        ScrollMenu = new javax.swing.JScrollPane();
        menu = new javax.swing.JPanel();
        pager = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("POKEDEX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        panel.setBackground(new java.awt.Color(255, 255, 255));

        img.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        img.setForeground(new java.awt.Color(0, 0, 0));
        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIconTextGap(10);

        pokemonName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        pokemonName.setForeground(new java.awt.Color(0, 0, 0));
        pokemonName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tableInfoPokemon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N", "Habilidad", "Url"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInfoPokemon);
        if (tableInfoPokemon.getColumnModel().getColumnCount() > 0) {
            tableInfoPokemon.getColumnModel().getColumn(0).setResizable(false);
            tableInfoPokemon.getColumnModel().getColumn(1).setResizable(false);
            tableInfoPokemon.getColumnModel().getColumn(2).setResizable(false);
        }

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icono_atras.png"))); // NOI18N
        back.setBorder(null);
        back.setBorderPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icono_siguiente.png"))); // NOI18N
        next.setBorder(null);
        next.setBorderPainted(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(pokemonName, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(pokemonName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ScrollMenu.setPreferredSize(new java.awt.Dimension(155, 409));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.Y_AXIS));
        ScrollMenu.setViewportView(menu);

        pager.setBackground(new java.awt.Color(153, 153, 153));
        pager.setPreferredSize(new java.awt.Dimension(200, 34));
        pager.setLayout(new javax.swing.BoxLayout(pager, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ScrollMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
    }//GEN-LAST:event_backActionPerformed

    
    public void buttonScroll(){
        String listName = this.api.GetConsumption("https://pokeapi.co/api/v2/pokemon/");
        
        JsonObject objetList = JsonParser.parseString(listName).getAsJsonObject();
        JsonArray arrayLsit = objetList.get("results").getAsJsonArray();
            
        for (int i = 0; i < arrayLsit.size(); i++) {
            // Convertir en Objeto el arreglo Json para extraer los key
            JsonObject nameList = arrayLsit.get(i).getAsJsonObject();
            JsonElement name = nameList.get("name");
            JsonElement url = nameList.get("url");
            
            String nameString = name.toString();
            String urlString = url.toString();
            
            // Quitar las comillas a la url si las tiene
            if (urlString.startsWith("\"") && urlString.endsWith("\"") || nameString.startsWith("\"") && nameString.endsWith("\"")) {
                urlString = urlString.substring(1, urlString.length() - 1);
                nameString = nameString.substring(1, nameString.length() - 1);
            }
            // Extraer una respuesta de la url
            String urlPokemon = api.GetConsumption(urlString);
            
            // Crear boton con los nombres extraidos de la pokeApi
            JButton pokeNameButton = new JButton(nameString);
            
            
            // Crear evento de clic para acada boton creado
            pokeNameButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {    
                    searchImg(urlPokemon);
                    ability(urlPokemon);
                }
            });
            
            System.out.println(url);
            // Agreagar boton al JPanel del scroll del JFrame
            this.menu.add(pokeNameButton);
        }
        
        this.menu.revalidate();
        this.menu.repaint();
    }
    
    public void searchImg(String urlPokemon){
        JsonObject objectPokemon = JsonParser.parseString(urlPokemon).getAsJsonObject();
        JsonElement keyPokemon = objectPokemon.get("sprites");
        String pokemonString = keyPokemon.toString();
        
        JsonObject objectName = JsonParser.parseString(urlPokemon).getAsJsonObject();
        JsonElement keyName = objectName.get("name");
        String nameString = keyName.toString();
        
        JsonObject objectOther = JsonParser.parseString(pokemonString).getAsJsonObject();
        JsonElement keyOther = objectOther.get("other");
        String otherString = keyOther.toString();
        
        JsonObject objectHome = JsonParser.parseString(otherString).getAsJsonObject();
        JsonElement keyHome = objectHome.get("home");
        String homeString = keyHome.toString();
        
        JsonObject objectImg = JsonParser.parseString(homeString).getAsJsonObject();
        JsonElement keyUrlImg = objectImg.get("front_default");
        String urlImgString = keyUrlImg.toString();
        
        
        if (urlImgString.startsWith("\"") && urlImgString.endsWith("\"") || nameString.startsWith("\"") && nameString.endsWith("\"")) {
            urlImgString = urlImgString.substring(1, urlImgString.length() - 1);
            nameString = nameString.substring(1, nameString.length() - 1);
        }
        
        this.showImg(urlImgString, nameString);
    }
    
    public void showImg(String urlImgString, String nameString){
        try {
            URL imageUrl = new URL(urlImgString);
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            int widtch = 220;
            int height = 220;
            
            Image imagenOriginal = imageIcon.getImage();
            Image newImage = imagenOriginal.getScaledInstance(widtch, height, Image.SCALE_SMOOTH);

            ImageIcon icon = new ImageIcon(newImage);

            this.img.setIcon(icon);
            this.pokemonName.setText(nameString);
            
            System.out.println("Imagen cargada y mostrada correctamente.");
        } catch (MalformedURLException e) {
            System.err.println("Error al cargar la imagen desde la URL: " + e.getMessage());
        }
        
        this.panel.revalidate();
        this.panel.repaint();
    }
    
    public void ability(String urlPokemon){
        JsonObject ability =  JsonParser.parseString(urlPokemon).getAsJsonObject();
        JsonArray arrayAbilities = ability.get("abilities").getAsJsonArray();
        
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < this.tableInfoPokemon.getColumnCount(); i++) {
            this.tableInfoPokemon.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        modal.setNumRows(0);
        for (int i = 0; i < arrayAbilities.size(); i++) {
            JsonObject obejctAbilities = arrayAbilities.get(i).getAsJsonObject();
            JsonElement keyAbilities = obejctAbilities.get("ability");
            String keyAbilitiesString = keyAbilities.toString();
            
            JsonObject obejctAbility = JsonParser.parseString(keyAbilitiesString).getAsJsonObject();
            JsonElement keyName = obejctAbility.get("name");
            JsonElement keyUrlAbility = obejctAbility.get("url");
            String keyNameString = keyName.toString();
            String keyUrlAbilityString = keyUrlAbility.toString();
            
            if (keyNameString.startsWith("\"") && keyNameString.endsWith("\"") || keyUrlAbilityString.startsWith("\"") && keyUrlAbilityString.endsWith("\"")) {
                keyNameString = keyNameString.substring(1, keyNameString.length() - 1);
                keyUrlAbilityString = keyUrlAbilityString.substring(1, keyUrlAbilityString.length() - 1);
            }
            
            Object [] listAbility = {
                                        i+1,
                                        keyNameString,
                                        keyUrlAbility,
                                    };
            this.modal.addRow(listAbility);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollMenu;
    private javax.swing.JButton back;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton next;
    private javax.swing.JPanel pager;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pokemonName;
    private javax.swing.JTable tableInfoPokemon;
    // End of variables declaration//GEN-END:variables
}
