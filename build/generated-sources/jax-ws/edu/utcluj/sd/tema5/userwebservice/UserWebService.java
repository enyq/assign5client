
package edu.utcluj.sd.tema5.userwebservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserWebService", targetNamespace = "http://userLoginAndRegister.tema5.sd.utcluj.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserWebService {


    /**
     * 
     * @param password
     * @param address
     * @param name
     * @param id
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://userLoginAndRegister.tema5.sd.utcluj.edu/", className = "edu.utcluj.sd.tema5.userwebservice.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://userLoginAndRegister.tema5.sd.utcluj.edu/", className = "edu.utcluj.sd.tema5.userwebservice.RegisterResponse")
    @Action(input = "http://userLoginAndRegister.tema5.sd.utcluj.edu/UserWebService/registerRequest", output = "http://userLoginAndRegister.tema5.sd.utcluj.edu/UserWebService/registerResponse")
    public Boolean register(
        @WebParam(name = "id", targetNamespace = "")
        Integer id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "address", targetNamespace = "")
        String address);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns edu.utcluj.sd.tema5.userwebservice.Appusers
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://userLoginAndRegister.tema5.sd.utcluj.edu/", className = "edu.utcluj.sd.tema5.userwebservice.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://userLoginAndRegister.tema5.sd.utcluj.edu/", className = "edu.utcluj.sd.tema5.userwebservice.LoginResponse")
    @Action(input = "http://userLoginAndRegister.tema5.sd.utcluj.edu/UserWebService/loginRequest", output = "http://userLoginAndRegister.tema5.sd.utcluj.edu/UserWebService/loginResponse")
    public Appusers login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
