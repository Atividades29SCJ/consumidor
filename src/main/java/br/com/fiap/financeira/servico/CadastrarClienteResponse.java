
package br.com.fiap.financeira.servico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarClienteResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarClienteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuario" type="{http://servico.financeira.fiap.com.br/}cadastroClienteResponsePojo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarClienteResponse", propOrder = {
    "usuario"
})
public class CadastrarClienteResponse {

    protected CadastroClienteResponsePojo usuario;

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link CadastroClienteResponsePojo }
     *     
     */
    public CadastroClienteResponsePojo getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link CadastroClienteResponsePojo }
     *     
     */
    public void setUsuario(CadastroClienteResponsePojo value) {
        this.usuario = value;
    }

}
