/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utcluj.sd.tema5.managedBeans;

import edu.utcluj.sd.tema5.dotnetwebservice.PackageWebService;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Eniko
 */
@ManagedBean
@RequestScoped
public class PackageDotNetManagedBean implements Serializable{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_2302/PackageWebService.asmx.wsdl")
    private PackageWebService service;

    /**
     * Creates a new instance of PackageDotNetManagedBean
     */
    public PackageDotNetManagedBean() {
    }

    private String addPackage(java.lang.String id, java.lang.String destination, java.lang.String weight, java.lang.String userId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.dotnetwebservice.PackageWebServiceSoap port = service.getPackageWebServiceSoap();
        return port.addPackage(id, destination, weight, userId);
    }
    
    
}
