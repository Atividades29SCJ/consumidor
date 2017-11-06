/**
 * CobrancaMensalidadeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.financeira.servico;

public class CobrancaMensalidadeRequest  implements java.io.Serializable {
    private br.com.fiap.financeira.servico.CobrancaMensalidadeRequestPojo cobranca;

    public CobrancaMensalidadeRequest() {
    }

    public CobrancaMensalidadeRequest(
           br.com.fiap.financeira.servico.CobrancaMensalidadeRequestPojo cobranca) {
           this.cobranca = cobranca;
    }


    /**
     * Gets the cobranca value for this CobrancaMensalidadeRequest.
     * 
     * @return cobranca
     */
    public br.com.fiap.financeira.servico.CobrancaMensalidadeRequestPojo getCobranca() {
        return cobranca;
    }


    /**
     * Sets the cobranca value for this CobrancaMensalidadeRequest.
     * 
     * @param cobranca
     */
    public void setCobranca(br.com.fiap.financeira.servico.CobrancaMensalidadeRequestPojo cobranca) {
        this.cobranca = cobranca;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CobrancaMensalidadeRequest)) return false;
        CobrancaMensalidadeRequest other = (CobrancaMensalidadeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cobranca==null && other.getCobranca()==null) || 
             (this.cobranca!=null &&
              this.cobranca.equals(other.getCobranca())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCobranca() != null) {
            _hashCode += getCobranca().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CobrancaMensalidadeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servico.financeira.fiap.com.br/", "cobrancaMensalidadeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cobranca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cobranca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico.financeira.fiap.com.br/", "cobrancaMensalidadeRequestPojo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
