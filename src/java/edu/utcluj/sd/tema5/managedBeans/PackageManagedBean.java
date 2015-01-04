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
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Eniko
 */
@ManagedBean
@RequestScoped
public class PackageManagedBean implements Serializable{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PackageManageWebService/PackageManageWebService.wsdl")
    private PackageManageWebService_Service service;
      @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_2302/PackageWebService.asmx.wsdl")
    private PackageWebService service2;

    private Packages pack;
    private Integer id;
    private String destination;
    private String weight;
    private List<Userpackage> userpackageList;
    private Integer userId;

    

    /**
     * Creates a new instance of PackageManagedBean
     */
    public PackageManagedBean() {
    }

     @PostConstruct
    public void init() {
        pack = new Packages();
    }
    public java.util.List<edu.utcluj.sd.tema5.packagewebservice.Packages> getPacks() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.packagewebservice.PackageManageWebService port = service.getPackageManageWebServicePort();
        return port.listAllPackages();
    }
    
     public String insert(){
         return "insertPackage";
     }
     
     public String insertPackage() {
        
         addPackage(pack.getId().toString(),pack.getDestination(),pack.getWeight(),userId.toString());
         return "listPackages";
     }
     
      public String delete(Packages p) {
        
        removePackage(p.getId().toString());
        return "listPackages";
    }

    public Packages getPack() {
        return pack;
    }

    public void setPack(Packages pack) {
        this.pack = pack;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<Userpackage> getUserpackageList() {
        return userpackageList;
    }

    public void setUserpackageList(List<Userpackage> userpackageList) {
        this.userpackageList = userpackageList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

  
    private String addPackage(java.lang.String id, java.lang.String destination, java.lang.String weight, java.lang.String userId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.dotnetwebservice.PackageWebServiceSoap port = service2.getPackageWebServiceSoap();
        return port.addPackage(id, destination, weight, userId);
    }

    private String registerPackage(java.lang.String packageId, java.lang.String location) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.dotnetwebservice.PackageWebServiceSoap port = service2.getPackageWebServiceSoap();
        return port.registerPackage(packageId, location);
    }

    private String removePackage(java.lang.String id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.dotnetwebservice.PackageWebServiceSoap port = service2.getPackageWebServiceSoap();
        return port.removePackage(id);
    }
    
    
}
