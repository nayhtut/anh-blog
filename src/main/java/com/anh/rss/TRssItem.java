//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2016.12.16 時間 04:42:53 PM JST 
//


package com.anh.rss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * An item may represent a "story" -- much like a story in a newspaper or magazine; if so its description is a synopsis of the story, and the link points to the full story. An item may also be complete in itself, if so, the description contains the text (entity-encoded HTML is allowed), and the link and title may be omitted.
 * 
 * <p>tRssItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="tRssItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="category" type="{}tCategory" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="enclosure" type="{}tEnclosure" minOccurs="0"/>
 *         &lt;element name="guid" type="{}tGuid" minOccurs="0"/>
 *         &lt;element name="pubDate" type="{}tRfc822FormatDate" minOccurs="0"/>
 *         &lt;element name="source" type="{}tSource" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRssItem", propOrder = {
    "title",
    "description",
    "link",
    "category",
    "comments",
    "enclosure",
    "guid",
    "pubDate",
    "source",
    "any"
})
public class TRssItem {

    protected String title;
    protected String description;
    @XmlSchemaType(name = "anyURI")
    protected String link;
    protected TCategory category;
    @XmlSchemaType(name = "anyURI")
    protected String comments;
    protected TEnclosure enclosure;
    protected TGuid guid;
    protected String pubDate;
    protected TSource source;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * titleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * titleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * descriptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * descriptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * linkプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * linkプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * categoryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TCategory }
     *     
     */
    public TCategory getCategory() {
        return category;
    }

    /**
     * categoryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TCategory }
     *     
     */
    public void setCategory(TCategory value) {
        this.category = value;
    }

    /**
     * commentsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * commentsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * enclosureプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TEnclosure }
     *     
     */
    public TEnclosure getEnclosure() {
        return enclosure;
    }

    /**
     * enclosureプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TEnclosure }
     *     
     */
    public void setEnclosure(TEnclosure value) {
        this.enclosure = value;
    }

    /**
     * guidプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TGuid }
     *     
     */
    public TGuid getGuid() {
        return guid;
    }

    /**
     * guidプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TGuid }
     *     
     */
    public void setGuid(TGuid value) {
        this.guid = value;
    }

    /**
     * pubDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * pubDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubDate(String value) {
        this.pubDate = value;
    }

    /**
     * sourceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TSource }
     *     
     */
    public TSource getSource() {
        return source;
    }

    /**
     * sourceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TSource }
     *     
     */
    public void setSource(TSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
