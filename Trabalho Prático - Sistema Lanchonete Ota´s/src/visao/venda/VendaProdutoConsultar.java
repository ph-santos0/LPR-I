package visao.venda;

import controller.ProdutoController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ItemNFVenda;
import model.Produto;

/**
 *
 * @author 0077110
 */
public class VendaProdutoConsultar extends javax.swing.JFrame {

    private List<ItemNFVenda> itensNFVenda;
    private TelaVenda telaVenda;

    public VendaProdutoConsultar() {
        initComponents();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tableProdutoLista.getColumnCount(); i++) {
            tableProdutoLista.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        selecionarQuantidade.setValue(1);
    }

    public VendaProdutoConsultar(TelaVenda telaVenda) {
        initComponents();
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tableProdutoLista.getColumnCount(); i++) {
            tableProdutoLista.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        setTitle("Lanchonete Ota's - Consulta de Produto");
        setLocationRelativeTo(null);
        this.telaVenda = telaVenda;
        selecionarQuantidade.setValue(1);
    }

    public VendaProdutoConsultar(TelaVenda telaVenda, List<ItemNFVenda> itensNFVenda) {
        initComponents();
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tableProdutoLista.getColumnCount(); i++) {
            tableProdutoLista.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        setTitle("Lanchonete Ota's - Consulta de Produto");
        setLocationRelativeTo(null);
        this.itensNFVenda = itensNFVenda;
        this.telaVenda = telaVenda;
        selecionarQuantidade.setValue(1);
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
        btnVoltarVenda = new javax.swing.JButton();
        selecionarQuantidade = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Código:");

        txtProdutoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoCodigoActionPerformed(evt);
            }
        });
        txtProdutoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdutoCodigoKeyPressed(evt);
            }
        });

        txtProdutoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdutoNomeKeyPressed(evt);
            }
        });

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
        tableProdutoLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoListaMouseClicked(evt);
            }
        });
        tableProdutoLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableProdutoListaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableProdutoLista);

        btnVoltarVenda.setText("Voltar");
        btnVoltarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarVendaActionPerformed(evt);
            }
        });

        selecionarQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                selecionarQuantidadeStateChanged(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(selecionarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltarVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProdutoNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProdutoCodigo))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProdutoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProdutoNome)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selecionarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnVoltarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        try {
            Integer codigo = (Integer) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 0);
            String nome = (String) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 1);
            Double valor = (Double) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 2);
            Integer estoque = (Integer) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 3);
            Double imposto = (Double) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 4);
            String unidade = (String) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 5);
            Integer quantidade = (Integer) selecionarQuantidade.getValue();
            Produto produto = new Produto();
            produto.setCodigo(codigo);
            produto.setNome(nome);
            produto.setValor(valor);
            produto.setEstoque(estoque);
            produto.setImposto(imposto);
            produto.setUnidade(unidade);
            ItemNFVenda itemNFVenda = new ItemNFVenda();
            itemNFVenda.setCodigo(1);
            itemNFVenda.setCodigo_nf(0);
            itemNFVenda.setCodigo_produto(produto.getCodigo());
            itemNFVenda.setQuantidade(quantidade);
            itemNFVenda.setValor_uni(produto.getValor());
            itemNFVenda.setValor_total(produto.getValor() * itemNFVenda.getQuantidade());
            itemNFVenda.setProduto(produto);
            itensNFVenda.add(itemNFVenda);
            this.telaVenda.setItensNFVenda(itensNFVenda);
            this.setVisible(false);
            System.out.println("Clicou");
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_tableProdutoListaMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void txtProdutoCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoCodigoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
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
        }
    }//GEN-LAST:event_txtProdutoCodigoKeyPressed

    private void txtProdutoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoNomeKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
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
        }
    }//GEN-LAST:event_txtProdutoNomeKeyPressed

    private void btnVoltarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarVendaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarVendaActionPerformed

    private void selecionarQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_selecionarQuantidadeStateChanged
        // TODO add your handling code here:
        try {
            int quantidadeVoltar = Integer.parseInt(selecionarQuantidade.getPreviousValue().toString());
            int quantidade = Integer.parseInt(selecionarQuantidade.getValue().toString());
            if (quantidadeVoltar < 1 || quantidade < 1) {
                selecionarQuantidade.setValue(1);
            }
        } catch (Exception e) {
            selecionarQuantidade.setValue(1);
            System.out.println(e);
        }
    }//GEN-LAST:event_selecionarQuantidadeStateChanged

    private void tableProdutoListaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProdutoListaKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            try {
                Integer codigo = (Integer) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 0);
                String nome = (String) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 1);
                Double valor = (Double) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 2);
                Integer estoque = (Integer) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 3);
                Double imposto = (Double) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 4);
                String unidade = (String) tableProdutoLista.getModel().getValueAt(tableProdutoLista.getSelectedRow(), 5);
                Integer quantidade = (Integer) selecionarQuantidade.getValue();
                Produto produto = new Produto();
                produto.setCodigo(codigo);
                produto.setNome(nome);
                produto.setValor(valor);
                produto.setEstoque(estoque);
                produto.setImposto(imposto);
                produto.setUnidade(unidade);
                ItemNFVenda itemNFVenda = new ItemNFVenda();
                itemNFVenda.setCodigo(1);
                itemNFVenda.setCodigo_nf(0);
                itemNFVenda.setCodigo_produto(produto.getCodigo());
                itemNFVenda.setQuantidade(quantidade);
                itemNFVenda.setValor_uni(produto.getValor());
                itemNFVenda.setValor_total(produto.getValor() * itemNFVenda.getQuantidade());
                itemNFVenda.setProduto(produto);
                itensNFVenda.add(itemNFVenda);
                this.telaVenda.setItensNFVenda(itensNFVenda);
                this.setVisible(false);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_tableProdutoListaKeyPressed

    private void txtProdutoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoCodigoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaProdutoConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltarVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner selecionarQuantidade;
    private javax.swing.JTable tableProdutoLista;
    private javax.swing.JTextField txtProdutoCodigo;
    private javax.swing.JTextField txtProdutoNome;
    // End of variables declaration//GEN-END:variables
}
