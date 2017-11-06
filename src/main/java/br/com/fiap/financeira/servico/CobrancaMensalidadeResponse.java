/**
 * CobrancaMensalidadeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.financeira.servico;

public class CobrancaMensalidadeResponse  implements java.io.Serializable {
    private br.com.fiap.financeira.servico.CobrancaMensalidadeResponsePojo resultadoCobranca;

    public CobrancaMensalidadeResponse() {
    }

    public CobrancaMensalidadeResponse(
           br.com.fiap.financeira.servico.CobrancaMensalidadeResponsePojo resultadoCobranca) {
           this.resultadoCobranca = resultadoCobranca;
    }


    /**
     * Gets the resultadoCobranca value for this CobrancaMensalidadeResponse.
     * 
     * @return resultadoCobranca
     */
    public br.com.fiap.financeira.servico.CobrancaMensalidadeResponsePojo getResultadoCobranca() {
        return resultadoCobranca;
    }


    /**
     * Sets the resultadoCobranca value for this CobrancaMensalidadeResponse.
     * 
     * @param resultadoCobranca
     */
    public void setResultadoCobranca(br.com.fiap.financeira.servico.CobrancaMensalidadeResponsePojo resultadoCobranca) {
        this.resultadoCobranca = resultadoCobranca;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CobrancaMensalidadeResponse)) return false;
        CobrancaMensalidadeResponse other = (CobrancaMensalidadeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadoCobranca==null && other.getResultadoCobranca()==null) || 
             (this.resultadoCobranca!=null &&
              this.resultadoCobranca.equals(other.getResultadoCobranca())));
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
        if (getResultadoCobranca() != null) {
            _hashCode += getResultadoCobranca().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CobrancaMensalidadeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servico.financeira.fiap.com.br/", "cobrancaMensalidadeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoCobranca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoCobranca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico.financeira.fiap.com.br/", "cobrancaMensalidadeResponsePojo"));
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
