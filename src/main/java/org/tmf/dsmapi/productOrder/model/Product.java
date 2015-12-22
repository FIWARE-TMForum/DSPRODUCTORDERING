//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.04.08 à 03:12:11 PM CEST 
//


package org.tmf.dsmapi.productOrder.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * <p>Classe Java pour Product complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="place" type="{http://orange.com/api/productOrdering/tmf/v2/model/business}Reference" minOccurs="0"/>
 *         &lt;element name="productCharacteristic" type="{http://orange.com/api/productOrdering/tmf/v2/model/business}ProductCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedParty" type="{http://orange.com/api/productOrdering/tmf/v2/model/business}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productRelationship" type="{http://orange.com/api/productOrdering/tmf/v2/model/business}ProductRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.tmf.dsmapi.commons.utils.CustomJsonDateSerializer;


/**
 * <p>Classe Java pour Product complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://orange.com/api/productInventory/tmf/v2/model/business}State"/>
 *         &lt;element name="isCustomerVisible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBundle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productOffering" type="{http://orange.com/api/productInventory/tmf/v2/model/business}ProductOffering" minOccurs="0"/>
 *         &lt;element name="productSpecification" type="{http://orange.com/api/productInventory/tmf/v2/model/business}ProductSpecification" minOccurs="0"/>
 *         &lt;element name="productCharacteristic" type="{http://orange.com/api/productInventory/tmf/v2/model/business}ProductCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productRelationship" type="{http://orange.com/api/productInventory/tmf/v2/model/business}ProductRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billingAccount" type="{http://orange.com/api/productInventory/tmf/v2/model/business}BillingAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedParty" type="{http://orange.com/api/productInventory/tmf/v2/model/business}RelatedParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="realizingResource" type="{http://orange.com/api/productInventory/tmf/v2/model/business}RealizingResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="realizingService" type="{http://orange.com/api/productInventory/tmf/v2/model/business}RealizingService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productPrice" type="{http://orange.com/api/productInventory/tmf/v2/model/business}ProductPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agreement" type="{http://orange.com/api/productInventory/tmf/v2/model/business}Agreement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "id",
    "href",
    "name",
    "description",
    "status",
    "isCustomerVisible",
    "isBundle",
    "productSerialNumber",
    "startDate",
    "orderDate",
    "terminationDate",
    "place",
    "productOffering",
    "productSpecification",
    "productCharacteristic",
    "productRelationship",
    "billingAccount",
    "relatedParty",
    "realizingResource",
    "realizingService",
    "productPrice",
    "agreement"
})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Entity(name = "Product")
@Table(name = "PRODUCT")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product
    implements Serializable
{
    private Long idx;

    private final static long serialVersionUID = 11L;
    protected String id;
    protected String href;
    protected String name;
    protected String description;
    @XmlElement(required = true)
    protected State status;
    protected String isCustomerVisible;
    protected String isBundle;
    protected String productSerialNumber;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date orderDate;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date terminationDate;
    protected String place;
    protected ProductOffering productOffering;
    protected ProductSpecification productSpecification;
    protected List<ProductCharacteristic> productCharacteristic;
    protected List<ProductRelationship> productRelationship;
    protected List<BillingAccount> billingAccount;
    protected List<RelatedParty> relatedParty;
    protected List<RealizingResource> realizingResource;
    protected List<RealizingService> realizingService;
    protected List<ProductPrice> productPrice;
    protected List<Agreement> agreement;
    private Long hjid;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    
    
 
    @Column(name = "XXXX_PRODUCT_ID", scale = 0)
 
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété href.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "XXXX_PRODUCT_HREF", length = 255)
    public String getHref() {
        return href;
    }

    /**
     * Définit la valeur de la propriété href.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRODUCT_NAME_", length = 255)
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRODUCT_DESCRIPTION", length = 255)
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
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
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    @Basic
    @Column(name = "PRODUCT_STATUS", length = 255)
    @Enumerated(EnumType.STRING)
    public State getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setStatus(State value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété isCustomerVisible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRODUCT_IS_CUSTOMER_VISIBLE", length = 255)
    public String getIsCustomerVisible() {
        return isCustomerVisible;
    }

    /**
     * Définit la valeur de la propriété isCustomerVisible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCustomerVisible(String value) {
        this.isCustomerVisible = value;
    }

    /**
     * Obtient la valeur de la propriété isBundle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRODCUT_IS_BUNDLE", length = 255)
    public String getIsBundle() {
        return isBundle;
    }

    /**
     * Définit la valeur de la propriété isBundle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBundle(String value) {
        this.isBundle = value;
    }

    /**
     * Obtient la valeur de la propriété productSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRODUCT_SERIAL_NUMBER", length = 255)
    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    /**
     * Définit la valeur de la propriété productSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSerialNumber(String value) {
        this.productSerialNumber = value;
    }

    /**
     * Obtient la valeur de la propriété startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROD_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Définit la valeur de la propriété startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Obtient la valeur de la propriété orderDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROD_ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Définit la valeur de la propriété orderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(Date value) {
        this.orderDate = value;
    }

    /**
     * Obtient la valeur de la propriété terminationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROD_TERMINATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTerminationDate() {
        return terminationDate;
    }

    /**
     * Définit la valeur de la propriété terminationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationDate(Date value) {
        this.terminationDate = value;
    }

    /**
     * Obtient la valeur de la propriété place.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROD_PLACE", length = 255)
    public String getPlace() {
        return place;
    }

    /**
     * Définit la valeur de la propriété place.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Obtient la valeur de la propriété productOffering.
     * 
     * @return
     *     possible object is
     *     {@link ProductOffering }
     *     
     */
    @ManyToOne(targetEntity = ProductOffering.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_PRODUCT_OFFERING_PRODUCT_HJID")
    public ProductOffering getProductOffering() {
        return productOffering;
    }

    /**
     * Définit la valeur de la propriété productOffering.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOffering }
     *     
     */
    public void setProductOffering(ProductOffering value) {
        this.productOffering = value;
    }

    /**
     * Obtient la valeur de la propriété productSpecification.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecification }
     *     
     */
    @ManyToOne(targetEntity = ProductSpecification.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_PRODUCT_SPECIFICATION_PRODUC_0")
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Définit la valeur de la propriété productSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecification }
     *     
     */
    public void setProductSpecification(ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the productCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCharacteristic }
     * 
     * 
     */
    @OneToMany(targetEntity = ProductCharacteristic.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_PRODUCT_CHARACTERISTIC_PRODU_0")
    public List<ProductCharacteristic> getProductCharacteristic() {
        if (productCharacteristic == null) {
            productCharacteristic = new ArrayList<ProductCharacteristic>();
        }
        return this.productCharacteristic;
    }

    /**
     * 
     * 
     */
    public void setProductCharacteristic(List<ProductCharacteristic> productCharacteristic) {
        this.productCharacteristic = productCharacteristic;
    }

    /**
     * Gets the value of the productRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductRelationship }
     * 
     * 
     */
    @OneToMany(targetEntity = ProductRelationship.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_PRODUCT_RELATIONSHIP_PRODUCT_0")
    public List<ProductRelationship> getProductRelationship() {
        if (productRelationship == null) {
            productRelationship = new ArrayList<ProductRelationship>();
        }
        return this.productRelationship;
    }

    /**
     * 
     * 
     */
    public void setProductRelationship(List<ProductRelationship> productRelationship) {
        this.productRelationship = productRelationship;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingAccount }
     * 
     * 
     */
    @OneToMany(targetEntity = BillingAccount.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_BILLING_ACCOUNT_PRODUCT_ID")
    public List<BillingAccount> getBillingAccount() {
        if (billingAccount == null) {
            billingAccount = new ArrayList<BillingAccount>();
        }
        return this.billingAccount;
    }

    /**
     * 
     * 
     */
    public void setBillingAccount(List<BillingAccount> billingAccount) {
        this.billingAccount = billingAccount;
    }

    /**
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParty }
     * 
     * 
     */
    @OneToMany(targetEntity = RelatedParty.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_RELATED_PARTY_PRODUCT_ID")
    public List<RelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedParty>();
        }
        return this.relatedParty;
    }

    /**
     * 
     * 
     */
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * Gets the value of the realizingResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realizingResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealizingResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealizingResource }
     * 
     * 
     */
    @OneToMany(targetEntity = RealizingResource.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_REALIZING_RESOURCE_PRODUCT_ID")
    public List<RealizingResource> getRealizingResource() {
        if (realizingResource == null) {
            realizingResource = new ArrayList<RealizingResource>();
        }
        return this.realizingResource;
    }

    /**
     * 
     * 
     */
    public void setRealizingResource(List<RealizingResource> realizingResource) {
        this.realizingResource = realizingResource;
    }

    /**
     * Gets the value of the realizingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realizingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealizingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealizingService }
     * 
     * 
     */
    @OneToMany(targetEntity = RealizingService.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_REALIZING_SERVICE_PRODUCT_ID")
    public List<RealizingService> getRealizingService() {
        if (realizingService == null) {
            realizingService = new ArrayList<RealizingService>();
        }
        return this.realizingService;
    }

    /**
     * 
     * 
     */
    public void setRealizingService(List<RealizingService> realizingService) {
        this.realizingService = realizingService;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPrice }
     * 
     * 
     */
    @OneToMany(targetEntity = ProductPrice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_PRODUCT_PRICE_PRODUCT_ID")
    public List<ProductPrice> getProductPrice() {
        if (productPrice == null) {
            productPrice = new ArrayList<ProductPrice>();
        }
        return this.productPrice;
    }

    /**
     * 
     * 
     */
    public void setProductPrice(List<ProductPrice> productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agreement }
     * 
     * 
     */
    @OneToMany(targetEntity = Agreement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROD_AGREEMENT_PRODUCT_ID")
    public List<Agreement> getAgreement() {
        if (agreement == null) {
            agreement = new ArrayList<Agreement>();
        }
        return this.agreement;
    }

    /**
     * 
     * 
     */
    public void setAgreement(List<Agreement> agreement) {
        this.agreement = agreement;
    }

    @Id
    @Column(name = "PPPHJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @org.codehaus.jackson.annotate.JsonIgnore
    public Long getHjid() {
        return hjid;
    }

    /**
     * Définit la valeur de la propriété hjid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }
}
