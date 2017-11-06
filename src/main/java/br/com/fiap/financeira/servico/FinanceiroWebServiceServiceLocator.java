/**
 * FinanceiroWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.financeira.servico;

public class FinanceiroWebServiceServiceLocator extends org.apache.axis.client.Service implements br.com.fiap.financeira.servico.FinanceiroWebServiceService {

    public FinanceiroWebServiceServiceLocator() {
    }


    public FinanceiroWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FinanceiroWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FinanceiroWebServicePort
    private java.lang.String FinanceiroWebServicePort_address = "http://35.199.2.236:8080/InstituicaoFinanceira-1.0.0/FinanceiroWebService";

    public java.lang.String getFinanceiroWebServicePortAddress() {
        return FinanceiroWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FinanceiroWebServicePortWSDDServiceName = "FinanceiroWebServicePort";

    public java.lang.String getFinanceiroWebServicePortWSDDServiceName() {
        return FinanceiroWebServicePortWSDDServiceName;
    }

    public void setFinanceiroWebServicePortWSDDServiceName(java.lang.String name) {
        FinanceiroWebServicePortWSDDServiceName = name;
    }

    public br.com.fiap.financeira.servico.FinanceiroWebService getFinanceiroWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FinanceiroWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFinanceiroWebServicePort(endpoint);
    }

    public br.com.fiap.financeira.servico.FinanceiroWebService getFinanceiroWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.fiap.financeira.servico.FinanceiroWebServiceServiceSoapBindingStub _stub = new br.com.fiap.financeira.servico.FinanceiroWebServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFinanceiroWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFinanceiroWebServicePortEndpointAddress(java.lang.String address) {
        FinanceiroWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.fiap.financeira.servico.FinanceiroWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.fiap.financeira.servico.FinanceiroWebServiceServiceSoapBindingStub _stub = new br.com.fiap.financeira.servico.FinanceiroWebServiceServiceSoapBindingStub(new java.net.URL(FinanceiroWebServicePort_address), this);
                _stub.setPortName(getFinanceiroWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FinanceiroWebServicePort".equals(inputPortName)) {
            return getFinanceiroWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servico.financeira.fiap.com.br/", "FinanceiroWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servico.financeira.fiap.com.br/", "FinanceiroWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FinanceiroWebServicePort".equals(portName)) {
            setFinanceiroWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
