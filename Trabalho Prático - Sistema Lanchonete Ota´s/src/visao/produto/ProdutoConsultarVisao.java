package visao.produto;

import controller.ProdutoController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import model.Produto;
import session.SessaoUsuario;
import visao.usuario.TelaMenu;

/**
 *
 * @author 0077110
 */
public class ProdutoConsultarVisao extends javax.swing.JFrame {

    public ProdutoConsultarVisao() {
        initComponents();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tableProdutoLista.getColumnCount(); i++) {
            tableProdutoLista.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//        }
        setTitle("Lanchonete Ota's - Consulta de Produto");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtProdutoCodigo = new javax.swing.JTextField();
        txtProdutoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutoLista = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Código:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome:");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableProdutoLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Estoque", "Imposto", "Unidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProdutoLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProdutoLista.setShowGrid(false);
        tableProdutoLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProdutoLista);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoCodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProdutoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProdutoNome)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (txtProdutoCodigo.getText().length() == 0 && txtProdutoNome.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Você precisa inserir um código ou um nome do produto.");
                return;
            }
            if (txtProdutoCodigo.getText().length() > 0) {
                ProdutoController produtoController = new ProdutoController();
                List<Produto> produtos = produtoController.consultarPorCodigo(Integer.parseInt(txtProdutoCodigo.getText()));
                DefaultTableModel model = (DefaultTableModel) tableProdutoLista.getModel();
                model.setNumRows(0);
                for (Produto produto : produtos) {
                    model.addRow(produto.getDadosModel());
                }
            } else if (txtProdutoNome.getText().length() > 0) {
                ProdutoController produtoController = new ProdutoController();
                List<Produto> produtos = produtoController.consultarPorNome(txtProdutoNome.getText());
                DefaultTableModel model = (DefaultTableModel) tableProdutoLista.getModel();
                model.setNumRows(0);
                for (Produto produto : produtos) {
                    model.addRow(produto.getDadosModel());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Um erro ocorreu, tente novamente.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableProdutoListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoListaMouseClicked

        Funcionario funcionario = (Funcionario) SessaoUsuario.getAtributo("session");
        if (funcionario == null || !funcionario.getCargo().equals("admin")) {
            return;
        }

        try {
            Integer codigo = (Integer) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 0);
            String nome = (String) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 1);
            Double valor = (Double) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 2);
            Integer estoque = (Integer) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 3);
            Double imposto = (Double) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 4);
            String unidade = (String) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 5);
            Produto produto = new Produto();
            produto.setCodigo(codigo);
            produto.setNome(nome);
            produto.setValor(valor);
            produto.setEstoque(estoque);
            produto.setImposto(imposto);
            produto.setUnidade(unidade);
            ProdutoCadastrarVisao cadastrarVisao = new ProdutoCadastrarVisao(produto);
            cadastrarVisao.setVisible(true);
            tableProdutoLista.clearSelection();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_tableProdutoListaMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoConsultarVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProdutoLista;
    private javax.swing.JTextField txtProdutoCodigo;
    private javax.swing.JTextField txtProdutoNome;
    // End of variables declaration//GEN-END:variables
}
