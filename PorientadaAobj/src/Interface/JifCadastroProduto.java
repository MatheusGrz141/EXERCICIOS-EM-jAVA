/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author matheus
 */
public class JifCadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form JifCadastro
     */
    public JifCadastroProduto() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextIDProduto = new javax.swing.JTextField();
        jTextNomeProduto = new javax.swing.JTextField();
        jTextFabricanteProduto = new javax.swing.JTextField();
        jTextPreçoDeCustoDoProduto = new javax.swing.JTextField();
        jTextFieldPreçoDeVendaDoProduto = new javax.swing.JTextField();
        jTextFieldQuantidadeDoProduto = new javax.swing.JTextField();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonSairProduto = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produto");

        jLabel1.setText("ID Produto");

        jLabel2.setText("Nome");

        jLabel3.setText("Fabricante");

        jLabel4.setText("Preço de Custo");

        jLabel5.setText("Preço de Venda");

        jLabel6.setText("Quantidade");

        jButtonCadastrarProduto.setText("Cadastrar");
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });

        jButtonSairProduto.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSairProduto.setText("Sair");
        jButtonSairProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairProdutoActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldQuantidadeDoProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFabricanteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPreçoDeCustoDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPreçoDeVendaDoProduto)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNomeProduto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSairProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCadastrarProduto)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButtonNovo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFabricanteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPreçoDeCustoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldQuantidadeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPreçoDeVendaDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSairProduto)
                    .addComponent(jButtonCadastrarProduto))
                .addGap(23, 23, 23))
        );

        setBounds(300, 20, 559, 230);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairProdutoActionPerformed
        JFprincipal.cadastro = false;
        dispose();
    }//GEN-LAST:event_jButtonSairProdutoActionPerformed

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        JFprincipal.produto.setId(jTextIDProduto.getText());
        JFprincipal.produto.setNome(jTextNomeProduto.getText());
        JFprincipal.produto.setPreco_custo(jTextPreçoDeCustoDoProduto.getText());
        JFprincipal.produto.setPreco_venda(jTextFieldPreçoDeVendaDoProduto.getText());
        JFprincipal.produto.setQuantidade(jTextFieldQuantidadeDoProduto.getText());
       // JFprincipal.produto.setFabricante(jTextFabricanteProduto.getText());
        JFprincipal.cadastro = false;
        dispose();
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSairProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFabricanteProduto;
    private javax.swing.JTextField jTextFieldPreçoDeVendaDoProduto;
    private javax.swing.JTextField jTextFieldQuantidadeDoProduto;
    private javax.swing.JTextField jTextIDProduto;
    private javax.swing.JTextField jTextNomeProduto;
    private javax.swing.JTextField jTextPreçoDeCustoDoProduto;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}