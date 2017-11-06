
package br.com.fiap.financeira.servico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cobrancaMensalidadeResponsePojo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cobrancaMensalidadeResponsePojo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cobrancaMensalidadeResponsePojo", propOrder = {
    "resultado"
})
public class CobrancaMensalidadeResponsePojo {

    protected boolean resultado;

    /**
     * Obtém o valor da propriedade resultado.
     * 
     */
    public boolean isResultado() {
        return resultado;
    }

    /**
     * Define o valor da propriedade resultado.
     * 
     */
    public void setResultado(boolean value) {
        this.resultado = value;
    }

}
