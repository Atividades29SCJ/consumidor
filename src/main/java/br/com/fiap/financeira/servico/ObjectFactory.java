
package br.com.fiap.financeira.servico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.financeira.servico package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CadastrarClienteRequest_QNAME = new QName("http://servico.financeira.fiap.com.br/", "cadastrarClienteRequest");
    private final static QName _CadastrarClienteResponse_QNAME = new QName("http://servico.financeira.fiap.com.br/", "cadastrarClienteResponse");
    private final static QName _CobrancaMensalidadeRequest_QNAME = new QName("http://servico.financeira.fiap.com.br/", "cobrancaMensalidadeRequest");
    private final static QName _CobrancaMensalidadeResponse_QNAME = new QName("http://servico.financeira.fiap.com.br/", "cobrancaMensalidadeResponse");
    private final static QName _CobrancaRequest_QNAME = new QName("http://servico.financeira.fiap.com.br/", "cobrancaRequest");
    private final static QName _CobrancaResponse_QNAME = new QName("http://servico.financeira.fiap.com.br/", "cobrancaResponse");
    private final static QName _ListarClienteRequest_QNAME = new QName("http://servico.financeira.fiap.com.br/", "listarClienteRequest");
    private final static QName _ListarClienteResponse_QNAME = new QName("http://servico.financeira.fiap.com.br/", "listarClienteResponse");
    private final static QName _SaldoRequest_QNAME = new QName("http://servico.financeira.fiap.com.br/", "saldoRequest");
    private final static QName _SaldoResponse_QNAME = new QName("http://servico.financeira.fiap.com.br/", "saldoResponse");
    private final static QName _FinanceiraFaultException_QNAME = new QName("http://servico.financeira.fiap.com.br/", "FinanceiraFaultException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.financeira.servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CadastrarClienteRequest }
     * 
     */
    public CadastrarClienteRequest createCadastrarClienteRequest() {
        return new CadastrarClienteRequest();
    }

    /**
     * Create an instance of {@link CadastrarClienteResponse }
     * 
     */
    public CadastrarClienteResponse createCadastrarClienteResponse() {
        return new CadastrarClienteResponse();
    }

    /**
     * Create an instance of {@link CobrancaMensalidadeRequest }
     * 
     */
    public CobrancaMensalidadeRequest createCobrancaMensalidadeRequest() {
        return new CobrancaMensalidadeRequest();
    }

    /**
     * Create an instance of {@link CobrancaMensalidadeResponse }
     * 
     */
    public CobrancaMensalidadeResponse createCobrancaMensalidadeResponse() {
        return new CobrancaMensalidadeResponse();
    }

    /**
     * Create an instance of {@link CobrancaRequest }
     * 
     */
    public CobrancaRequest createCobrancaRequest() {
        return new CobrancaRequest();
    }

    /**
     * Create an instance of {@link CobrancaResponse }
     * 
     */
    public CobrancaResponse createCobrancaResponse() {
        return new CobrancaResponse();
    }

    /**
     * Create an instance of {@link ListarClienteRequest }
     * 
     */
    public ListarClienteRequest createListarClienteRequest() {
        return new ListarClienteRequest();
    }

    /**
     * Create an instance of {@link ListarClienteResponse }
     * 
     */
    public ListarClienteResponse createListarClienteResponse() {
        return new ListarClienteResponse();
    }

    /**
     * Create an instance of {@link SaldoRequest }
     * 
     */
    public SaldoRequest createSaldoRequest() {
        return new SaldoRequest();
    }

    /**
     * Create an instance of {@link SaldoResponse }
     * 
     */
    public SaldoResponse createSaldoResponse() {
        return new SaldoResponse();
    }

    /**
     * Create an instance of {@link FinanceiraFault }
     * 
     */
    public FinanceiraFault createFinanceiraFault() {
        return new FinanceiraFault();
    }

    /**
     * Create an instance of {@link CobrancaRequestPojo }
     * 
     */
    public CobrancaRequestPojo createCobrancaRequestPojo() {
        return new CobrancaRequestPojo();
    }

    /**
     * Create an instance of {@link CobrancaResponsePojo }
     * 
     */
    public CobrancaResponsePojo createCobrancaResponsePojo() {
        return new CobrancaResponsePojo();
    }

    /**
     * Create an instance of {@link SaldoResponsePojo }
     * 
     */
    public SaldoResponsePojo createSaldoResponsePojo() {
        return new SaldoResponsePojo();
    }

    /**
     * Create an instance of {@link CadastroClienteRequestPojo }
     * 
     */
    public CadastroClienteRequestPojo createCadastroClienteRequestPojo() {
        return new CadastroClienteRequestPojo();
    }

    /**
     * Create an instance of {@link CadastroClienteResponsePojo }
     * 
     */
    public CadastroClienteResponsePojo createCadastroClienteResponsePojo() {
        return new CadastroClienteResponsePojo();
    }

    /**
     * Create an instance of {@link CobrancaMensalidadeRequestPojo }
     * 
     */
    public CobrancaMensalidadeRequestPojo createCobrancaMensalidadeRequestPojo() {
        return new CobrancaMensalidadeRequestPojo();
    }

    /**
     * Create an instance of {@link CobrancaMensalidadeResponsePojo }
     * 
     */
    public CobrancaMensalidadeResponsePojo createCobrancaMensalidadeResponsePojo() {
        return new CobrancaMensalidadeResponsePojo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarClienteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarClienteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "cadastrarClienteRequest")
    public JAXBElement<CadastrarClienteRequest> createCadastrarClienteRequest(CadastrarClienteRequest value) {
        return new JAXBElement<CadastrarClienteRequest>(_CadastrarClienteRequest_QNAME, CadastrarClienteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "cadastrarClienteResponse")
    public JAXBElement<CadastrarClienteResponse> createCadastrarClienteResponse(CadastrarClienteResponse value) {
        return new JAXBElement<CadastrarClienteResponse>(_CadastrarClienteResponse_QNAME, CadastrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobrancaMensalidadeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CobrancaMensalidadeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "cobrancaMensalidadeRequest")
    public JAXBElement<CobrancaMensalidadeRequest> createCobrancaMensalidadeRequest(CobrancaMensalidadeRequest value) {
        return new JAXBElement<CobrancaMensalidadeRequest>(_CobrancaMensalidadeRequest_QNAME, CobrancaMensalidadeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobrancaMensalidadeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CobrancaMensalidadeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "cobrancaMensalidadeResponse")
    public JAXBElement<CobrancaMensalidadeResponse> createCobrancaMensalidadeResponse(CobrancaMensalidadeResponse value) {
        return new JAXBElement<CobrancaMensalidadeResponse>(_CobrancaMensalidadeResponse_QNAME, CobrancaMensalidadeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobrancaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CobrancaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "cobrancaRequest")
    public JAXBElement<CobrancaRequest> createCobrancaRequest(CobrancaRequest value) {
        return new JAXBElement<CobrancaRequest>(_CobrancaRequest_QNAME, CobrancaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobrancaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CobrancaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "cobrancaResponse")
    public JAXBElement<CobrancaResponse> createCobrancaResponse(CobrancaResponse value) {
        return new JAXBElement<CobrancaResponse>(_CobrancaResponse_QNAME, CobrancaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarClienteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "listarClienteRequest")
    public JAXBElement<ListarClienteRequest> createListarClienteRequest(ListarClienteRequest value) {
        return new JAXBElement<ListarClienteRequest>(_ListarClienteRequest_QNAME, ListarClienteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "listarClienteResponse")
    public JAXBElement<ListarClienteResponse> createListarClienteResponse(ListarClienteResponse value) {
        return new JAXBElement<ListarClienteResponse>(_ListarClienteResponse_QNAME, ListarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaldoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "saldoRequest")
    public JAXBElement<SaldoRequest> createSaldoRequest(SaldoRequest value) {
        return new JAXBElement<SaldoRequest>(_SaldoRequest_QNAME, SaldoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "saldoResponse")
    public JAXBElement<SaldoResponse> createSaldoResponse(SaldoResponse value) {
        return new JAXBElement<SaldoResponse>(_SaldoResponse_QNAME, SaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinanceiraFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinanceiraFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.financeira.fiap.com.br/", name = "FinanceiraFaultException")
    public JAXBElement<FinanceiraFault> createFinanceiraFaultException(FinanceiraFault value) {
        return new JAXBElement<FinanceiraFault>(_FinanceiraFaultException_QNAME, FinanceiraFault.class, null, value);
    }

}
