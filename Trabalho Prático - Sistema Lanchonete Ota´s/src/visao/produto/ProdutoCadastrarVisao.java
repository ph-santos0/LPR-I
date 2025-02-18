package visao.produto;

import controller.ProdutoController;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Funcionario;
import model.Produto;
import session.SessaoUsuario;
import visao.usuario.TelaMenu;

/**
 *
 * @author wfabi0
 */
public class ProdutoCadastrarVisao extends javax.swing.JFrame {

    private Produto produto = null;

    public ProdutoCadastrarVisao() {
        initComponents();
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//        }
        setTitle("Lanchonete Ota's - Cadastro de Produto");
        setLocationRelativeTo(null);
        this.produto = null;
    }

    public ProdutoCadastrarVisao(Produto produto) {
        initComponents();
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//        }
        setTitle("Lanchonete Ota's - Edição de Produto");
        setLocationRelativeTo(null);
        this.produto = produto;
        preencherCampos();
    }

    private void preencherCampos() {
        txtProdutoCodigo.setText(Integer.toString(produto.getCodigo()));
        txtProdutoNome.setText(produto.getNome());
        txtProdutoValor.setText(Double.toString(produto.getValor()));
        txtProdutoImposto.setText(Double.toString(produto.getImposto()));
        txtProdutoEstoque.setText(Integer.toString(produto.getEstoque()));
        txtProdutoUnidade.setText(produto.getUnidade());
        btnCadastrar.setLabel("Editar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtProdutoCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProdutoValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProdutoEstoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProdutoImposto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProdutoUnidade = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Código:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Valor:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estoque:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Imposto:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Unidade:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoCodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoValor, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoImposto, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdutoUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProdutoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProdutoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProdutoImposto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProdutoUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (btnCadastrar.getText() == "Editar") {
            if (this.produto != null) {
                this.setVisible(false);
                return;
            }
        }
        this.setVisible(false);
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (this.produto == null) {
            try {
                if (txtProdutoCodigo.getText().length() == 0
                        || txtProdutoNome.getText().length() == 0
                        || txtProdutoEstoque.getText().length() == 0
                        || txtProdutoValor.getText().length() == 0
                        || txtProdutoImposto.getText().length() == 0
                        || txtProdutoUnidade.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Você precisa preencher todos os campos.");
                    return;
                }
                if (txtProdutoCodigo.getText().length() == 0
                        || txtProdutoNome.getText().length() == 0
                        || txtProdutoEstoque.getText().length() == 0
                        || txtProdutoValor.getText().length() == 0
                        || txtProdutoImposto.getText().length() == 0
                        || txtProdutoUnidade.getText().length() == 0) {
                    JOptionPane.showMessageDialog(this, "Você precisa preencher todos os campos.");
                    return;
                }
                Produto produto = new Produto();
                produto.setCodigo(Integer.parseInt(txtProdutoCodigo.getText()));
                produto.setNome(txtProdutoNome.getText());
                produto.setEstoque(Integer.parseInt(txtProdutoEstoque.getText()));
                produto.setValor(Double.parseDouble(txtProdutoValor.getText().replaceAll(",", ".")));
                produto.setImposto(Double.parseDouble(txtProdutoImposto.getText()));
                produto.setUnidade(txtProdutoUnidade.getText());
                ProdutoController produtoController = new ProdutoController();
                produtoController.inserir(produto);
                limparCampo();
                JOptionPane.showMessageDialog(null, "Produto cadastrado:\n" + produto);
                JOptionPane.showMessageDialog(this, "Produto cadastrado:\n" + produto);
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto, tente novamente.");
            }
        } else {
            try {
                if (txtProdutoCodigo.getText().length() == 0
                        || txtProdutoNome.getText().length() == 0
                        || txtProdutoEstoque.getText().length() == 0
                        || txtProdutoValor.getText().length() == 0
                        || txtProdutoImposto.getText().length() == 0
                        || txtProdutoUnidade.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Você precisa preencher todos os campos.");
                    return;
                }
                if (txtProdutoCodigo.getText().length() == 0
                        || txtProdutoNome.getText().length() == 0
                        || txtProdutoEstoque.getText().length() == 0
                        || txtProdutoValor.getText().length() == 0
                        || txtProdutoImposto.getText().length() == 0
                        || txtProdutoUnidade.getText().length() == 0) {
                    JOptionPane.showMessageDialog(this, "Você precisa preencher todos os campos.");
                    return;
                }
                produto.setCodigo(Integer.parseInt(txtProdutoCodigo.getText()));
                produto.setNome(txtProdutoNome.getText());
                produto.setEstoque(Integer.parseInt(txtProdutoEstoque.getText()));
                produto.setValor(Double.parseDouble(txtProdutoValor.getText().replaceAll(",", ".")));
                produto.setImposto(Double.parseDouble(txtProdutoImposto.getText()));
                produto.setUnidade(txtProdutoUnidade.getText());
                ProdutoController produtoController = new ProdutoController();
                produtoController.editar(produto);
                limparCampo();
                JOptionPane.showMessageDialog(this, "Produto editado:\n" + produto);
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto, tente novamente.");
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoCadastrarVisao().setVisible(true);
            }
        });
    }

    private void limparCampo() {
        txtProdutoCodigo.setText("");
        txtProdutoNome.setText("");
        txtProdutoEstoque.setText("");
        txtProdutoValor.setText("");
        txtProdutoImposto.setText("");
        txtProdutoUnidade.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtProdutoCodigo;
    private javax.swing.JTextField txtProdutoEstoque;
    private javax.swing.JTextField txtProdutoImposto;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoUnidade;
    private javax.swing.JTextField txtProdutoValor;
    // End of variables declaration//GEN-END:variables
}
