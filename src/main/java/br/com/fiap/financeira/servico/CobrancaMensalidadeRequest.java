
package br.com.fiap.financeira.servico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cobrancaMensalidadeRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cobrancaMensalidadeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cobranca" type="{http://servico.financeira.fiap.com.br/}cobrancaMensalidadeRequestPojo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cobrancaMensalidadeRequest", propOrder = {
    "cobranca"
})
public class CobrancaMensalidadeRequest {

    protected CobrancaMensalidadeRequestPojo cobranca;

    /**
     * Obtém o valor da propriedade cobranca.
     * 
     * @return
     *     possible object is
     *     {@link CobrancaMensalidadeRequestPojo }
     *     
     */
    public CobrancaMensalidadeRequestPojo getCobranca() {
        return cobranca;
    }

    /**
     * Define o valor da propriedade cobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link CobrancaMensalidadeRequestPojo }
     *     
     */
    public void setCobranca(CobrancaMensalidadeRequestPojo value) {
        this.cobranca = value;
    }

}
