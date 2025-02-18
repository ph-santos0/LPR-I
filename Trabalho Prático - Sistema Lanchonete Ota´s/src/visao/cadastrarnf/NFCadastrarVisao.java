/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.cadastrarnf;

import controller.FormaPagamentoController;
import controller.ItemNFCompraController;
import controller.NFCompraController;
import controller.NFCompraPagamentoController;
import controller.ProdutoController;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.FormaPagamento;
import model.ItemNFCompra;
import model.NFCompra;
import model.NFCompraPagamento;
import model.Produto;
import visao.usuario.TelaMenu;

/**
 *
 * @author joaop
 */
public class NFCadastrarVisao extends javax.swing.JFrame {

    private List<ItemNFCompra> itensNFCompra;
    private Double valorTotal;
    private int quantidadeItens;

    public NFCadastrarVisao() {
        initComponents();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tableCadastrarNF.getColumnCount(); i++) {
            tableCadastrarNF.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        setTitle("Lanchonete Ota's - Cadastrar NF");
        setLocationRelativeTo(null);
        this.atualizarTela();

        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_');
            txtDataEmissao.setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
            mask.setPlaceholderCharacter('_'); // Define o caractere de preenchimento
            txtCNPJFornecedor.setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public NFCadastrarVisao(List<ItemNFCompra> itensNFCompra) {
        initComponents();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < tableCadastrarNF.getColumnCount(); i++) {
            tableCadastrarNF.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        setTitle("Lanchonete Ota's - Cadastrar NF");
        setLocationRelativeTo(null);
        this.itensNFCompra = itensNFCompra;
        this.atualizarTela();

        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_');
            txtDataEmissao.setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
            mask.setPlaceholderCharacter('_'); // Define o caractere de preenchimento
            txtCNPJFornecedor.setFormatterFactory(new DefaultFormatterFactory(mask));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private void atualizarTela() {
        preencherTabela();
    }

    private void limparTela() {
        DefaultTableModel model = (DefaultTableModel) tableCadastrarNF.getModel();
        model.setNumRows(0);
        txtCodigoProduto.setText("");
        txtDataEmissao.setText("");
        cbStatusAtual.setSelectedIndex(0);
        cbFormaPagamento.setSelectedIndex(0);
        valorTotal = 0.0;
        itensNFCompra.clear();
        infoValorTotal.setText(formatarValor(valorTotal));
    }

    private void preencherTabela() {
        valorTotal = 0.0;
        quantidadeItens = 0;
        DefaultTableModel model = (DefaultTableModel) tableCadastrarNF.getModel();
        model.setNumRows(0);
        try {
            if (!itensNFCompra.isEmpty() && itensNFCompra != null) {
                for (ItemNFCompra itemNFCompra : itensNFCompra) {
                    System.out.println(itemNFCompra);
                    Object[] obj = {
                        itemNFCompra.getCodigo_produto(),
                        itemNFCompra.getProduto().getNome(),
                        itemNFCompra.getProduto().getValor(),
                        itemNFCompra.getQuantidade(),
                        itemNFCompra.getValor_total()
                    };
                    valorTotal += itemNFCompra.getValor_total();
                    quantidadeItens += itemNFCompra.getQuantidade();
                    model.addRow(obj);
                }
            } else {
                System.out.println("teste");
                tableCadastrarNF.setVisible(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        infoValorTotal.setText(formatarValor(valorTotal));
        txtQuantidadeTotalItens.setText(Integer.toString(quantidadeItens));
    }

    private String formatarValor(Double valor) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatoMoeda.format(valor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaprodutonfcadastro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        formapagamento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numnf = new javax.swing.JTextField();
        valortotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        qtdeitens = new javax.swing.JTextField();
        statusatual = new javax.swing.JComboBox<>();
        BtnSalvar = new javax.swing.JButton();
        btnvoltarcadastrarnf = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inserircodproduto = new javax.swing.JTextField();
        btnbuscadeproduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        cbStatusAtual = new javax.swing.JComboBox<>();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCadastrarNF = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtQuantidadeTotalItens = new javax.swing.JTextField();
        infoValorTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCodigoNF = new javax.swing.JTextField();
        txtDataEmissao = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCNPJFornecedor = new javax.swing.JFormattedTextField();

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("Lanchonete Ota's- Cadastrar NF");
        titulo.setToolTipText("");

        jLabel3.setText("Data de Emissão:");

        data.setText("data");
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        jLabel4.setText("Status atual:");

        tabelaprodutonfcadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço Unidade", "Quantidade", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabelaprodutonfcadastro);

        jLabel6.setText("Forma de Pagamento:");

        formapagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIN", "CC", "CD", "PIX", "BLT" }));
        formapagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formapagamentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Qtde. Total de Itens:");

        jLabel7.setText("Total R$:");

        numnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numnfActionPerformed(evt);
            }
        });

        jLabel8.setText("Nº NF:");

        qtdeitens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdeitensActionPerformed(evt);
            }
        });

        statusatual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finalizado", "Pendente", "Cancelada" }));
        statusatual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusatualActionPerformed(evt);
            }
        });

        BtnSalvar.setText("Salvar");

        btnvoltarcadastrarnf.setText("Voltar");
        btnvoltarcadastrarnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarcadastrarnfActionPerformed(evt);
            }
        });

        jLabel5.setText("Insira o código do Produto");

        inserircodproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserircodprodutoActionPerformed(evt);
            }
        });

        btnbuscadeproduto.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inserircodproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscadeproduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(formapagamento, 0, 184, Short.MAX_VALUE)
                            .addComponent(statusatual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(data)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnvoltarcadastrarnf)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(qtdeitens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(numnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(38, 38, 38)
                            .addComponent(BtnSalvar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formapagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inserircodproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscadeproduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(qtdeitens, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(BtnSalvar)
                    .addComponent(btnvoltarcadastrarnf))
                .addGap(43, 43, 43))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lanchonete Ota's- Cadastrar NF");

        jLabel9.setText("Data de Emissão:");

        jLabel10.setText("Status atual:");

        jLabel11.setText("Forma de Pagamento:");

        jLabel12.setText("Insira o código do Produto:");

        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyPressed(evt);
            }
        });

        cbStatusAtual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendente", "Finalizado", "Cancelado" }));
        cbStatusAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusAtualActionPerformed(evt);
            }
        });

        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIX", "CC", "CD", "BLT", "DIN" }));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableCadastrarNF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço Unidade", "Quantidade", "Total"
            }
        ));
        jScrollPane3.setViewportView(tableCadastrarNF);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel13.setText("Qtde. Total de Itens:");

        txtQuantidadeTotalItens.setEditable(false);

        infoValorTotal.setEditable(false);

        jLabel14.setText("Total:");

        jLabel15.setText("Nº NF:");

        txtCodigoNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoNFActionPerformed(evt);
            }
        });

        txtDataEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDataEmissao.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtDataEmissaoInputMethodTextChanged(evt);
            }
        });

        jLabel17.setText("CNPJ Fornecedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtQuantidadeTotalItens, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnVoltar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(infoValorTotal)))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel15))
                                                .addGap(18, 18, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(26, 26, 26)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCNPJFornecedor)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCodigoNF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(cbFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbStatusAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtCodigoNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatusAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtQuantidadeTotalItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnSalvar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void formapagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formapagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formapagamentoActionPerformed

    private void numnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numnfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numnfActionPerformed

    private void qtdeitensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdeitensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdeitensActionPerformed

    private void statusatualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusatualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusatualActionPerformed

    private void btnvoltarcadastrarnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarcadastrarnfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvoltarcadastrarnfActionPerformed

    private void inserircodprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserircodprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserircodprodutoActionPerformed

    private void cbStatusAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusAtualActionPerformed

    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (itensNFCompra == null) {
            itensNFCompra = new ArrayList<>();
        }
        NFVendaProdutoConsultar nfVendaProdutoConsultar = new NFVendaProdutoConsultar(this, itensNFCompra);
        nfVendaProdutoConsultar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:]
        try {
            if (txtCodigoNF.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Você precisa inserir o código da NF.");
                return;
            }
            String dataString = txtDataEmissao.getText().trim();
            System.out.println(dataString);
            if (dataString.length() == 0) {
                JOptionPane.showMessageDialog(this, "Você precisa inserir uma data.");
                return;
            }
            String cnpjFormatado = txtCNPJFornecedor.getText().replaceAll("\\D", "");
            String regexCNPJ = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$";
            if (!Pattern.matches(regexCNPJ, txtCNPJFornecedor.getText())) {
                JOptionPane.showMessageDialog(this, "Você não inseriu um CNPJ válido.");
                return;
            }

            if (txtDataEmissao.getText().length() == 0 || tableCadastrarNF.getModel().getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Você precisa inserir dados na sua nota fiscal.");
                return;
            }

            String pagamento = (String) cbFormaPagamento.getSelectedItem();
            FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
            FormaPagamento formaPagamento = null;
            switch (pagamento) {
                case "DIN": {
                    formaPagamento = formaPagamentoController.procurarPorNome("Dinheiro");
                    break;
                }
                case "CC": {
                    formaPagamento = formaPagamentoController.procurarPorNome("Cartão de Crédito");
                    break;
                }
                case "CD": {
                    formaPagamento = formaPagamentoController.procurarPorNome("Cartão de Débito");
                    break;
                }
                case "PIX": {
                    formaPagamento = formaPagamentoController.procurarPorNome("Pix");
                    break;
                }
                case "BLT": {
                    formaPagamento = formaPagamentoController.procurarPorNome("Boleto");
                    break;
                }
            }

            if (formaPagamento == null) {
                JOptionPane.showMessageDialog(this, "Um erro ocorreu, tente novamente.");
                return;
            }

            NFCompraController nfCompraController = new NFCompraController();
            NFCompra nfCompra = new NFCompra();

            NFCompraPagamentoController nfCompraPagamentoController = new NFCompraPagamentoController();
            NFCompraPagamento nfCompraPagamento = new NFCompraPagamento();

            ItemNFCompraController itemNFCompraController = new ItemNFCompraController();

            nfCompra.setCNPJFornecedor(cnpjFormatado);

            String regexData = "^\\d{2}/\\d{2}/\\d{4}$";
            if (!dataString.isEmpty() && dataString.length() == 10) {
                if (dataString.matches(regexData)) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date dataEmissaoUtil = sdf.parse(dataString);
                    Date dataEmissaoSQL = new Date(dataEmissaoUtil.getTime());
                    nfCompra.setDataEmissao(dataEmissaoSQL);
                } else {
                    JOptionPane.showMessageDialog(this, "Você não inseriu uma data correta.");
                    return;
                }
            }
            nfCompra.setCodigo(Integer.parseInt(txtCodigoNF.getText()));
            nfCompra.setValor(valorTotal);

            System.out.println(nfCompra);

            nfCompraController.inserir(nfCompra);

            nfCompraPagamento.setCodigo_nf(nfCompra.getCodigo());
            nfCompraPagamento.setCodigo_pagamento(formaPagamento.getTipo());
            nfCompraPagamento = nfCompraPagamentoController.inserir(nfCompraPagamento);

            for (ItemNFCompra itemNFCompra : itensNFCompra) {
                itemNFCompra.setCodigo_nf(nfCompra.getCodigo());
                itemNFCompra = itemNFCompraController.inserir(itemNFCompra);
            }

            System.out.println(nfCompra);
            System.out.println(nfCompraPagamento);
            JOptionPane.showMessageDialog(this, "Nota Fiscal cadastrada com sucesso.");
            limparTela();
        } catch (Exception e) {
            System.out.println("Um erro ocorreu ao cadastrar sua nota fisical.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtCodigoNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoNFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoNFActionPerformed

    private void txtDataEmissaoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtDataEmissaoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataEmissaoInputMethodTextChanged

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            if (txtCodigoProduto.getText().isEmpty()) {
                return;
            }
            if (itensNFCompra == null) {
                itensNFCompra = new ArrayList<>();
            }
            try {
                int codigo = Integer.parseInt(txtCodigoProduto.getText());
                ProdutoController produtoController = new ProdutoController();
                List<Produto> produtos = produtoController.consultarPorCodigo(codigo);
                if (produtos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Produto não encontrado no sistema.");
                    return;
                }
                Produto produto = produtos.get(0);
                ItemNFCompra itemNFCompra = new ItemNFCompra();
                itemNFCompra.setCodigo(1);
                itemNFCompra.setCodigo_nf(0);
                itemNFCompra.setCodigo_produto(produto.getCodigo());
                itemNFCompra.setQuantidade(1);
                itemNFCompra.setValor_uni(produto.getValor());
                itemNFCompra.setValor_total(produto.getValor() * itemNFCompra.getQuantidade());
                itemNFCompra.setProduto(produto);
                itensNFCompra.add(itemNFCompra);
                atualizarTela();
                return;
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                ProdutoController produtoController = new ProdutoController();
                Produto produto = produtoController.consultarPorNome(txtCodigoProduto.getText()).get(0);
                ItemNFCompra itemNFCompra = new ItemNFCompra();
                itemNFCompra.setCodigo(1);
                itemNFCompra.setCodigo_nf(0);
                itemNFCompra.setCodigo_produto(produto.getCodigo());
                itemNFCompra.setQuantidade(1);
                itemNFCompra.setValor_uni(produto.getValor());
                itemNFCompra.setValor_total(produto.getValor() * itemNFCompra.getQuantidade());
                itemNFCompra.setProduto(produto);
                itensNFCompra.add(itemNFCompra);
                atualizarTela();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_txtCodigoProdutoKeyPressed

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
            java.util.logging.Logger.getLogger(NFCadastrarVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NFCadastrarVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NFCadastrarVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NFCadastrarVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NFCadastrarVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnbuscadeproduto;
    private javax.swing.JButton btnvoltarcadastrarnf;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JComboBox<String> cbStatusAtual;
    private javax.swing.JTextField data;
    private javax.swing.JComboBox<String> formapagamento;
    private javax.swing.JTextField infoValorTotal;
    private javax.swing.JTextField inserircodproduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numnf;
    private javax.swing.JTextField qtdeitens;
    private javax.swing.JComboBox<String> statusatual;
    private javax.swing.JTable tabelaprodutonfcadastro;
    private javax.swing.JTable tableCadastrarNF;
    private javax.swing.JLabel titulo;
    private javax.swing.JFormattedTextField txtCNPJFornecedor;
    private javax.swing.JTextField txtCodigoNF;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JFormattedTextField txtDataEmissao;
    private javax.swing.JTextField txtQuantidadeTotalItens;
    private javax.swing.JTextField valortotal;
    // End of variables declaration//GEN-END:variables

    public List<ItemNFCompra> getItensNFCompra() {
        return itensNFCompra;
    }

    public void setItensNFCompra(List<ItemNFCompra> itensNFCompra) {
        this.itensNFCompra = itensNFCompra;
        this.atualizarTela();
    }

    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(javax.swing.JTable jTable1) {
        this.jTable1 = jTable1;
    }
}
