
package edu.utcluj.sd.tema5.packagewebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.utcluj.sd.tema5.packagewebservice package. 
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

    private final static QName _StatusCheck_QNAME = new QName("http://webservice.sd.utcluj.edu/", "statusCheck");
    private final static QName _StatusUpdate_QNAME = new QName("http://webservice.sd.utcluj.edu/", "statusUpdate");
    private final static QName _Trackedpackages_QNAME = new QName("http://webservice.sd.utcluj.edu/", "trackedpackages");
    private final static QName _StatusUpdateResponse_QNAME = new QName("http://webservice.sd.utcluj.edu/", "statusUpdateResponse");
    private final static QName _RetrieveUserPackagesResponse_QNAME = new QName("http://webservice.sd.utcluj.edu/", "retrieveUserPackagesResponse");
    private final static QName _Packages_QNAME = new QName("http://webservice.sd.utcluj.edu/", "packages");
    private final static QName _Appusers_QNAME = new QName("http://webservice.sd.utcluj.edu/", "appusers");
    private final static QName _ListAllPackagesResponse_QNAME = new QName("http://webservice.sd.utcluj.edu/", "listAllPackagesResponse");
    private final static QName _RetrieveUserPackages_QNAME = new QName("http://webservice.sd.utcluj.edu/", "retrieveUserPackages");
    private final static QName _Userpackage_QNAME = new QName("http://webservice.sd.utcluj.edu/", "userpackage");
    private final static QName _PersistResponse_QNAME = new QName("http://webservice.sd.utcluj.edu/", "persistResponse");
    private final static QName _StatusCheckResponse_QNAME = new QName("http://webservice.sd.utcluj.edu/", "statusCheckResponse");
    private final static QName _ListAllPackages_QNAME = new QName("http://webservice.sd.utcluj.edu/", "listAllPackages");
    private final static QName _Persist_QNAME = new QName("http://webservice.sd.utcluj.edu/", "persist");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.utcluj.sd.tema5.packagewebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveUserPackagesResponse }
     * 
     */
    public RetrieveUserPackagesResponse createRetrieveUserPackagesResponse() {
        return new RetrieveUserPackagesResponse();
    }

    /**
     * Create an instance of {@link StatusUpdateResponse }
     * 
     */
    public StatusUpdateResponse createStatusUpdateResponse() {
        return new StatusUpdateResponse();
    }

    /**
     * Create an instance of {@link Trackedpackages }
     * 
     */
    public Trackedpackages createTrackedpackages() {
        return new Trackedpackages();
    }

    /**
     * Create an instance of {@link StatusUpdate }
     * 
     */
    public StatusUpdate createStatusUpdate() {
        return new StatusUpdate();
    }

    /**
     * Create an instance of {@link StatusCheck }
     * 
     */
    public StatusCheck createStatusCheck() {
        return new StatusCheck();
    }

    /**
     * Create an instance of {@link Packages }
     * 
     */
    public Packages createPackages() {
        return new Packages();
    }

    /**
     * Create an instance of {@link PersistResponse }
     * 
     */
    public PersistResponse createPersistResponse() {
        return new PersistResponse();
    }

    /**
     * Create an instance of {@link StatusCheckResponse }
     * 
     */
    public StatusCheckResponse createStatusCheckResponse() {
        return new StatusCheckResponse();
    }

    /**
     * Create an instance of {@link RetrieveUserPackages }
     * 
     */
    public RetrieveUserPackages createRetrieveUserPackages() {
        return new RetrieveUserPackages();
    }

    /**
     * Create an instance of {@link Userpackage }
     * 
     */
    public Userpackage createUserpackage() {
        return new Userpackage();
    }

    /**
     * Create an instance of {@link Appusers }
     * 
     */
    public Appusers createAppusers() {
        return new Appusers();
    }

    /**
     * Create an instance of {@link ListAllPackagesResponse }
     * 
     */
    public ListAllPackagesResponse createListAllPackagesResponse() {
        return new ListAllPackagesResponse();
    }

    /**
     * Create an instance of {@link ListAllPackages }
     * 
     */
    public ListAllPackages createListAllPackages() {
        return new ListAllPackages();
    }

    /**
     * Create an instance of {@link Persist }
     * 
     */
    public Persist createPersist() {
        return new Persist();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "statusCheck")
    public JAXBElement<StatusCheck> createStatusCheck(StatusCheck value) {
        return new JAXBElement<StatusCheck>(_StatusCheck_QNAME, StatusCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "statusUpdate")
    public JAXBElement<StatusUpdate> createStatusUpdate(StatusUpdate value) {
        return new JAXBElement<StatusUpdate>(_StatusUpdate_QNAME, StatusUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trackedpackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "trackedpackages")
    public JAXBElement<Trackedpackages> createTrackedpackages(Trackedpackages value) {
        return new JAXBElement<Trackedpackages>(_Trackedpackages_QNAME, Trackedpackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "statusUpdateResponse")
    public JAXBElement<StatusUpdateResponse> createStatusUpdateResponse(StatusUpdateResponse value) {
        return new JAXBElement<StatusUpdateResponse>(_StatusUpdateResponse_QNAME, StatusUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveUserPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "retrieveUserPackagesResponse")
    public JAXBElement<RetrieveUserPackagesResponse> createRetrieveUserPackagesResponse(RetrieveUserPackagesResponse value) {
        return new JAXBElement<RetrieveUserPackagesResponse>(_RetrieveUserPackagesResponse_QNAME, RetrieveUserPackagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Packages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "packages")
    public JAXBElement<Packages> createPackages(Packages value) {
        return new JAXBElement<Packages>(_Packages_QNAME, Packages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appusers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "appusers")
    public JAXBElement<Appusers> createAppusers(Appusers value) {
        return new JAXBElement<Appusers>(_Appusers_QNAME, Appusers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "listAllPackagesResponse")
    public JAXBElement<ListAllPackagesResponse> createListAllPackagesResponse(ListAllPackagesResponse value) {
        return new JAXBElement<ListAllPackagesResponse>(_ListAllPackagesResponse_QNAME, ListAllPackagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveUserPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "retrieveUserPackages")
    public JAXBElement<RetrieveUserPackages> createRetrieveUserPackages(RetrieveUserPackages value) {
        return new JAXBElement<RetrieveUserPackages>(_RetrieveUserPackages_QNAME, RetrieveUserPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userpackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "userpackage")
    public JAXBElement<Userpackage> createUserpackage(Userpackage value) {
        return new JAXBElement<Userpackage>(_Userpackage_QNAME, Userpackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "persistResponse")
    public JAXBElement<PersistResponse> createPersistResponse(PersistResponse value) {
        return new JAXBElement<PersistResponse>(_PersistResponse_QNAME, PersistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "statusCheckResponse")
    public JAXBElement<StatusCheckResponse> createStatusCheckResponse(StatusCheckResponse value) {
        return new JAXBElement<StatusCheckResponse>(_StatusCheckResponse_QNAME, StatusCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "listAllPackages")
    public JAXBElement<ListAllPackages> createListAllPackages(ListAllPackages value) {
        return new JAXBElement<ListAllPackages>(_ListAllPackages_QNAME, ListAllPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sd.utcluj.edu/", name = "persist")
    public JAXBElement<Persist> createPersist(Persist value) {
        return new JAXBElement<Persist>(_Persist_QNAME, Persist.class, null, value);
    }

}
