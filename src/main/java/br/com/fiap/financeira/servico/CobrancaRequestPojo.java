/**
 * CobrancaRequestPojo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.financeira.servico;

public class CobrancaRequestPojo  implements java.io.Serializable {
    private java.lang.String cpfCnpj;

    private double valor;

    public CobrancaRequestPojo() {
    }

    public CobrancaRequestPojo(
           java.lang.String cpfCnpj,
           double valor) {
           this.cpfCnpj = cpfCnpj;
           this.valor = valor;
    }


    /**
     * Gets the cpfCnpj value for this CobrancaRequestPojo.
     * 
     * @return cpfCnpj
     */
    public java.lang.String getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this CobrancaRequestPojo.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(java.lang.String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the valor value for this CobrancaRequestPojo.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this CobrancaRequestPojo.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CobrancaRequestPojo)) return false;
        CobrancaRequestPojo other = (CobrancaRequestPojo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            this.valor == other.getValor();
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
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        _hashCode += new Double(getValor()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CobrancaRequestPojo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servico.financeira.fiap.com.br/", "cobrancaRequestPojo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
