package model;

/**
 *
 * @author wfabi0
 */
public class NFCompraPagamento {
    private int codigo;
    private int codigo_nf;
    private String codigo_pagamento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_nf() {
        return codigo_nf;
    }

    public void setCodigo_nf(int codigo_nf) {
        this.codigo_nf = codigo_nf;
    }

    public String getCodigo_pagamento() {
        return codigo_pagamento;
    }

    public void setCodigo_pagamento(String codigo_pagamento) {
        this.codigo_pagamento = codigo_pagamento;
    }
    
    @Override
    public String toString() {
        return "NFCompraPagamento{" +
                "codigo=" + codigo +
                ", codigo_nf=" + codigo_nf +
                ", codigo_pagamento=" + codigo_pagamento +
                '}';
    }
}
