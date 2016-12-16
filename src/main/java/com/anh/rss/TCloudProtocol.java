//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2016.12.16 時間 04:42:53 PM JST 
//


package com.anh.rss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tCloudProtocolのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="tCloudProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml-rpc"/>
 *     &lt;enumeration value="http-post"/>
 *     &lt;enumeration value="soap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tCloudProtocol")
@XmlEnum
public enum TCloudProtocol {

    @XmlEnumValue("xml-rpc")
    XML_RPC("xml-rpc"),
    @XmlEnumValue("http-post")
    HTTP_POST("http-post"),
    @XmlEnumValue("soap")
    SOAP("soap");
    private final String value;

    TCloudProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TCloudProtocol fromValue(String v) {
        for (TCloudProtocol c: TCloudProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
