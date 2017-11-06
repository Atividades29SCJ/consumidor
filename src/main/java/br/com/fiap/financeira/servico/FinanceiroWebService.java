/**
 * FinanceiroWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.financeira.servico;

public interface FinanceiroWebService extends java.rmi.Remote {
    public br.com.fiap.financeira.servico.CobrancaResponse cobranca(br.com.fiap.financeira.servico.CobrancaRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault;
    public br.com.fiap.financeira.servico.SaldoResponse saldo(br.com.fiap.financeira.servico.SaldoRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault;
    public br.com.fiap.financeira.servico.CadastrarClienteResponse cadastrarCliente(br.com.fiap.financeira.servico.CadastrarClienteRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault;
    public br.com.fiap.financeira.servico.CobrancaMensalidadeResponse cobrancaMensalidade(br.com.fiap.financeira.servico.CobrancaMensalidadeRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault;
    public br.com.fiap.financeira.servico.CadastroClienteResponsePojo[] listarCliente(br.com.fiap.financeira.servico.ListarClienteRequest parameters) throws java.rmi.RemoteException, br.com.fiap.financeira.servico.FinanceiraFault;
}
