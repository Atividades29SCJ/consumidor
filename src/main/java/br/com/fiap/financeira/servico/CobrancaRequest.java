
package br.com.fiap.financeira.servico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cobrancaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cobrancaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cobranca" type="{http://servico.financeira.fiap.com.br/}cobrancaRequestPojo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cobrancaRequest", propOrder = {
    "cobranca"
})
public class CobrancaRequest {

    protected CobrancaRequestPojo cobranca;

    /**
     * Obtém o valor da propriedade cobranca.
     * 
     * @return
     *     possible object is
     *     {@link CobrancaRequestPojo }
     *     
     */
    public CobrancaRequestPojo getCobranca() {
        return cobranca;
    }

    /**
     * Define o valor da propriedade cobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link CobrancaRequestPojo }
     *     
     */
    public void setCobranca(CobrancaRequestPojo value) {
        this.cobranca = value;
    }

}
