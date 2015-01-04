/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utcluj.sd.tema5.managedBeans;
import edu.utcluj.sd.tema5.userwebservice.Appusers;
import edu.utcluj.sd.tema5.userwebservice.NewWebService;
import java.io.Serializable;
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
public class UserManagedBean implements Serializable{
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/NewWebService/UserWebService.wsdl")
    private NewWebService service;
    
     private Appusers user;
    private int id;
    private String name;
    private String username;
    private String password;
    private String type;
    private String address;

    /**
     * Creates a new instance of UserManagedBean
     */
    public UserManagedBean() {
    }
    
   @PostConstruct
    public void init() {
        user = new Appusers();
    }
    public String login() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        edu.utcluj.sd.tema5.userwebservice.UserWebService port = service.getUserWebServicePort();
        user = port.login(username, password);
         if(user!=null)
        {
 
        
                if (user.getType().equals("admin")) {
                    setType("admin");
                    System.out.println("Login as admin");
                return "listPackages";
                } else { 
                    setType("simple");
                     System.out.println("Login as simple");
                return "listUsersPackages"; 
                }
                
        } else {
                return "listPackages";
            }
        
    }

    public String register() {
       return "registerUser";
   }
   
   public String registerUser() {
       user.setType("simple");
      edu.utcluj.sd.tema5.userwebservice.UserWebService port = service.getUserWebServicePort();
      if(port.register(user.getId(), user.getName(), user.getUsername(),user.getPassword(), user.getAddress())) {
          return "listPackages";
      }
       return "listPackages";
   }
   
    public Appusers getUser() {
        return user;
    }

    public void setUser(Appusers user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

 

 
    
    
}
