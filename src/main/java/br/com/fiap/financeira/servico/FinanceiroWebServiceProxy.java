package br.com.fiap.financeira.servico;

public class FinanceiroWebServiceProxy implements br.com.fiap.financeira.servico.FinanceiroWebService {
  private String _endpoint = null;
  private br.com.fiap.financeira.servico.FinanceiroWebService financeiroWebService = null;
  
  public FinanceiroWebServiceProxy() {
    _initFinanceiroWebServiceProxy();
  }
  
  public FinanceiroWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFinanceiroWebServiceProxy();
  }
  
  private void _initFinanceiroWebServiceProxy() {
    try {
      financeiroWebService = (new br.com.fiap.financeira.servico.FinanceiroWebServiceServiceLocator()).getFinanceiroWebServicePort();
      if (financeiroWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)financeiroWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)financeiroWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (financeiroWebService != null)
      ((javax.xml.rpc.Stub)financeiroWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.financeira.servico.FinanceiroWebService getFinanceiroWebService() {
    if (financeiroWebService == null)
      _initFinanceiroWebServiceProxy();
    return financeiroWebService;
  }
  
  public br.com.fiap.financeira.servico.CobrancaResponse cobranca(br.com.fiap.financeira.servico.CobrancaRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault{
    if (financeiroWebService == null)
      _initFinanceiroWebServiceProxy();
    return financeiroWebService.cobranca(parameters);
  }
  
  public br.com.fiap.financeira.servico.SaldoResponse saldo(br.com.fiap.financeira.servico.SaldoRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault{
    if (financeiroWebService == null)
      _initFinanceiroWebServiceProxy();
    return financeiroWebService.saldo(parameters);
  }
  
  public br.com.fiap.financeira.servico.CadastrarClienteResponse cadastrarCliente(br.com.fiap.financeira.servico.CadastrarClienteRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault{
    if (financeiroWebService == null)
      _initFinanceiroWebServiceProxy();
    return financeiroWebService.cadastrarCliente(parameters);
  }
  
  public br.com.fiap.financeira.servico.CobrancaMensalidadeResponse cobrancaMensalidade(br.com.fiap.financeira.servico.CobrancaMensalidadeRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault{
    if (financeiroWebService == null)
      _initFinanceiroWebServiceProxy();
    return financeiroWebService.cobrancaMensalidade(parameters);
  }
  
  public br.com.fiap.financeira.servico.CadastroClienteResponsePojo[] listarCliente(br.com.fiap.financeira.servico.ListarClienteRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault{
    if (financeiroWebService == null)
      _initFinanceiroWebServiceProxy();
    return financeiroWebService.listarCliente(parameters);
  }
  
  
}