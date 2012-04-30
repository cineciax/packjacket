/*
 * PackJacket - GUI frontend to IzPack to make Java-based installers
 * Copyright (C) 2008 - 2009  Amandeep Grewal, Manodasan Wignarajah
 *
 * PackJacket is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PackJacket is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PackJacket.  If not, see <http://www.gnu.org/licenses/>.
 */
package packjacket.gui;

import packjacket.xml.OperatingSystem;

/**
 * Panel for entering OS data
 * @author Amandeep Grewal
 */
public class OSPanel extends javax.swing.JPanel {

    /** Creates new form OSPanel */
    public OSPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        family = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        vers = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        arch = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(213, 213, 213), 1, true), "Operating System", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel4.setText("Family");

        family.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Windows", "Mac", "Unix" }));
        family.setToolTipText("Make the pack targeted to a specific operating system");

        jLabel18.setText("Name");

        name.setText("All");

        jLabel19.setText("Version");

        vers.setText("All");

        jLabel20.setText("Architecture");

        arch.setText("All");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arch)
                    .addComponent(vers)
                    .addComponent(name)
                    .addComponent(family, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(family, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(vers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(arch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Gets the OS object from the user entered data
     * @return the OS object representing user data
     */
    public OperatingSystem getOS() {
        OperatingSystem os = new OperatingSystem();
        os.family = family.getSelectedItem().toString();
        os.name = name.getText().trim();
        os.arch = arch.getText().trim();
        os.vers = vers.getText().trim();

        return os;
    }

    /**
     * Sets the UI data from a OS object
     * @param os os object to use to set UI values
     */
    public void setOS(OperatingSystem os) {
        family.setSelectedItem(os.family);
        name.setText(os.name);
        arch.setText(os.arch);
        vers.setText(os.vers);
    }

    /**
     * Gets any erros in the UI values
     * @return error
     */
    public String getError() {
        StringBuffer error = new StringBuffer();
        if (name.getText().trim().equals("")) {
            error.append("You have not specified a operating system name.\n");
        }
        if (vers.getText().trim().equals("")) {
            error.append("You have not specified a operating system version.\n");
        }
        if (arch.getText().trim().equals("")) {
            error.append("You have not specified a operating system architechture.\n");
        }
        return error.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arch;
    private javax.swing.JComboBox family;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JTextField vers;
    // End of variables declaration//GEN-END:variables
}