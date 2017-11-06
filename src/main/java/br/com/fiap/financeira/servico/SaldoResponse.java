
package br.com.fiap.financeira.servico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de saldoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="saldoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saldo" type="{http://servico.financeira.fiap.com.br/}saldoResponsePojo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saldoResponse", propOrder = {
    "saldo"
})
public class SaldoResponse {

    protected SaldoResponsePojo saldo;

    /**
     * Obtém o valor da propriedade saldo.
     * 
     * @return
     *     possible object is
     *     {@link SaldoResponsePojo }
     *     
     */
    public SaldoResponsePojo getSaldo() {
        return saldo;
    }

    /**
     * Define o valor da propriedade saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link SaldoResponsePojo }
     *     
     */
    public void setSaldo(SaldoResponsePojo value) {
        this.saldo = value;
    }

}
