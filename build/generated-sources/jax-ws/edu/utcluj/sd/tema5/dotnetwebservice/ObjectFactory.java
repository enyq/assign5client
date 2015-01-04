
package edu.utcluj.sd.tema5.dotnetwebservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.utcluj.sd.tema5.dotnetwebservice package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.utcluj.sd.tema5.dotnetwebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPackage }
     * 
     */
    public AddPackage createAddPackage() {
        return new AddPackage();
    }

    /**
     * Create an instance of {@link RemovePackage }
     * 
     */
    public RemovePackage createRemovePackage() {
        return new RemovePackage();
    }

    /**
     * Create an instance of {@link RegisterPackage }
     * 
     */
    public RegisterPackage createRegisterPackage() {
        return new RegisterPackage();
    }

    /**
     * Create an instance of {@link RemovePackageResponse }
     * 
     */
    public RemovePackageResponse createRemovePackageResponse() {
        return new RemovePackageResponse();
    }

    /**
     * Create an instance of {@link AddPackageResponse }
     * 
     */
    public AddPackageResponse createAddPackageResponse() {
        return new AddPackageResponse();
    }

    /**
     * Create an instance of {@link RegisterPackageResponse }
     * 
     */
    public RegisterPackageResponse createRegisterPackageResponse() {
        return new RegisterPackageResponse();
    }

}
