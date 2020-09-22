
package System;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Server", targetNamespace = "http://Servers/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Server {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createPlayerAccount", targetNamespace = "http://Servers/", className = "System.CreatePlayerAccount")
    @ResponseWrapper(localName = "createPlayerAccountResponse", targetNamespace = "http://Servers/", className = "System.CreatePlayerAccountResponse")
    @Action(input = "http://Servers/Server/createPlayerAccountRequest", output = "http://Servers/Server/createPlayerAccountResponse")
    public boolean createPlayerAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "playerSignIn", targetNamespace = "http://Servers/", className = "System.PlayerSignIn")
    @ResponseWrapper(localName = "playerSignInResponse", targetNamespace = "http://Servers/", className = "System.PlayerSignInResponse")
    @Action(input = "http://Servers/Server/playerSignInRequest", output = "http://Servers/Server/playerSignInResponse")
    public String playerSignIn(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPlayerStatus", targetNamespace = "http://Servers/", className = "System.GetPlayerStatus")
    @ResponseWrapper(localName = "getPlayerStatusResponse", targetNamespace = "http://Servers/", className = "System.GetPlayerStatusResponse")
    @Action(input = "http://Servers/Server/getPlayerStatusRequest", output = "http://Servers/Server/getPlayerStatusResponse")
    public String getPlayerStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "playerSignOut", targetNamespace = "http://Servers/", className = "System.PlayerSignOut")
    @ResponseWrapper(localName = "playerSignOutResponse", targetNamespace = "http://Servers/", className = "System.PlayerSignOutResponse")
    @Action(input = "http://Servers/Server/playerSignOutRequest", output = "http://Servers/Server/playerSignOutResponse")
    public String playerSignOut(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suspendAccount", targetNamespace = "http://Servers/", className = "System.SuspendAccount")
    @ResponseWrapper(localName = "suspendAccountResponse", targetNamespace = "http://Servers/", className = "System.SuspendAccountResponse")
    @Action(input = "http://Servers/Server/suspendAccountRequest", output = "http://Servers/Server/suspendAccountResponse")
    public boolean suspendAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "transferAccount", targetNamespace = "http://Servers/", className = "System.TransferAccount")
    @ResponseWrapper(localName = "transferAccountResponse", targetNamespace = "http://Servers/", className = "System.TransferAccountResponse")
    @Action(input = "http://Servers/Server/transferAccountRequest", output = "http://Servers/Server/transferAccountResponse")
    public boolean transferAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

}
