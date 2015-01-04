/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utcluj.sd.tema5.managedBeans;

import edu.utcluj.sd.tema5.dotnetwebservice.PackageWebService;
import edu.utcluj.sd.tema5.packagewebservice.PackageManageWebService_Service;
import edu.utcluj.sd.tema5.packagewebservice.Packages;
import edu.utcluj.sd.tema5.packagewebservice.Userpackage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Eniko
 */
@ManagedBean
@RequestScoped
public class UserPackageManagedBean {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_2302/PackageWebService.asmx.wsdl")
    private PackageWebService service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PackageManageWebService/PackageManageWebService.wsdl")
    private PackageManageWebService_Service service;

    Userpackage up;
    
    /**
     * Creates a new instance of UserPackageManagedBean
     */
    public UserPackageManagedBean() {
    }

    public java.util.List<edu.utcluj.sd.tema5.packagewebservice.Userpackage> getUserPackages() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.packagewebservice.PackageManageWebService port = service.getPackageManageWebServicePort();
        return port.retrieveUserPackages();
    }
    
    public String register(Packages pack) {
        registerPackage(pack.getId().toString(), "Local Post Office");
        return "listUserPackages";
    }

    private String registerPackage(java.lang.String packageId, java.lang.String location) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.dotnetwebservice.PackageWebServiceSoap port = service_1.getPackageWebServiceSoap();
        return port.registerPackage(packageId, location);
    }
    
      public String checkStatus(Userpackage up) {
    
        this.up = up;
        return "packageStatus";
    } 

    public Userpackage getUp() {
        return up;
    }

    public void setUp(Userpackage up) {
        this.up = up;
    }
    
    
    
}
