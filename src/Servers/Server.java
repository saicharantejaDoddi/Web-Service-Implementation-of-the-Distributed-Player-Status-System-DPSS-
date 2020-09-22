package Servers;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Server {
	@WebMethod
	boolean createPlayerAccount(String firstName, String lastName, String age, String userName, String password,
			String ipAddress);

	@WebMethod
	String playerSignIn(String userName, String password, String ipAddress);

	@WebMethod
	String playerSignOut(String userName, String ipAddress);

	@WebMethod
	String getPlayerStatus(String userName, String password, String ipAddress);

	@WebMethod
	boolean transferAccount(String Username, String Password, String OldIPAddress, String NewIPAddress);

	@WebMethod
	boolean suspendAccount(String userName, String password, String ipAddress, String userNameSuspend);

	
}