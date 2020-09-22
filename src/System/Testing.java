
package System;

import java.util.Scanner;

public class Testing {

	static Server server = null;

	private static int displayOptions(Scanner sc) { // Display Options
		System.out.println("Please Select the one of the below options");
		System.out.println("1.Test Create new player,Sign In and Sign Out in Asian Server");
		System.out.println("2.Test Create new player,Sign In and Sign Out in European Server");
		System.out.println("3.Test Create new player,Sign In and Sign Out in North American Server");
		System.out.println("4.Test Sign In and Sign Out Predefined player in Asian Server");
		System.out.println("5.Test Sign In and Sign Out Predefined player in European Server");
		System.out.println("6.Test Sign In and Sign Out Predefined player in North American Server");
		System.out.println("7.Test Create Duplicate player in Asian Server");
		System.out.println("8.Test Create Duplicate player in European Server");
		System.out.println("9.Test Create Duplicate player in North American Server");
		System.out.println("10.Test Admin Get Status");
		System.out.println("11.Test Admin Suspend Account");
		System.out.println("12.Test Player Transfer Account");
		System.out.println("13.Test suspended and transferred operations were initiated at the same time");
		System.out.println("14.Test Two Asian Player trying to create asian server");
		System.out.println("15.Test Two European Player trying to create European server");
		System.out.println("16.Test Two North American Player trying to create North American server");
		System.out.println("17.Test Two Asian Player trying to Sign In asian server");
		System.out.println("18.Test Two European Player trying to Sign In European server");
		System.out.println("19.Test Two North American Player trying to Sign In North American server");
		System.out.println("20.Test Two Asian Player trying to Sign Out asian server");
		System.out.println("21.Test Two European Player trying to Sign Out European server");
		System.out.println("22.Test Two North American Player trying to Sign Out North American server");

		System.out.println("23.Exit Application");

		// Taking Option
		int option = 0;
		try {
			option = sc.nextInt();
		} catch (Exception ex) {

			sc.nextLine();
		}
		return option;
	}

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		boolean optionStatus = true;
		while (optionStatus) {
			int option = displayOptions(sc);

			switch (option) {

			case 1:
				AsianNewPlayerTester asianNewPlayerTester = new AsianNewPlayerTester();
				asianNewPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 2:
				EuropeanNewPlayerTester europeanNewPlayerTester = new EuropeanNewPlayerTester();
				europeanNewPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 3:
				NorthAmericanNewPlayerTester northAmericanNewPlayerTester = new NorthAmericanNewPlayerTester();
				northAmericanNewPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 4:
				AsianPredefinedPlayerTester asianPredefinedPlayerTester = new AsianPredefinedPlayerTester();
				asianPredefinedPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 5:
				EuropeanPredefinedPlayerTester europeanPredefinedPlayerTester = new EuropeanPredefinedPlayerTester();
				europeanPredefinedPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 6:
				NorthAmericanPredefinedPlayerTester northAmericanPredefinedPlayerTester = new NorthAmericanPredefinedPlayerTester();
				northAmericanPredefinedPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 7:
				AsianDuplicatePlayerTester asianDuplicatePlayerTester = new AsianDuplicatePlayerTester();
				asianDuplicatePlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 8:
				EuropeanDuplicatePlayerTester europeanDuplicatePlayerTester = new EuropeanDuplicatePlayerTester();
				europeanDuplicatePlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 9:
				NorthAmericanDuplicatePlayerTester northAmericanDuplicatePlayerTester = new NorthAmericanDuplicatePlayerTester();
				northAmericanDuplicatePlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 10:
				AdminGetStatusTester adminGetStatusTester = new AdminGetStatusTester();

				adminGetStatusTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 11:
				AdminSuspendTester adminSuspendTester = new AdminSuspendTester();

				adminSuspendTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 12:
				PlayerTransferTester playerTransferTester = new PlayerTransferTester();

				playerTransferTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 13:
				AdminSynchronizedSuspendTester adminSynchronizedSuspendTester = new AdminSynchronizedSuspendTester();

				PlayerSynchronizedTransferTester playerSynchronizedTransferTester = new PlayerSynchronizedTransferTester();
				adminSynchronizedSuspendTester.start();
				playerSynchronizedTransferTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 14:
				AsianFirstPlayerTester asianFirstPlayerTester = new AsianFirstPlayerTester();
				AsianSecondPlayerTester asianSecondPlayerTester = new AsianSecondPlayerTester();
				asianFirstPlayerTester.start();
				asianSecondPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 15:
				EuropeanFirstPlayerTester europeanFirstPlayerTester = new EuropeanFirstPlayerTester();
				EuropeanSecondPlayerTester europeanSecondPlayerTester = new EuropeanSecondPlayerTester();
				europeanFirstPlayerTester.start();
				europeanSecondPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 16:
				NorthAmericanFirstPlayerTester northAmericanFirstPlayerTester = new NorthAmericanFirstPlayerTester();
				NorthAmericanSecondPlayerTester northAmericanSecondPlayerTester = new NorthAmericanSecondPlayerTester();
				northAmericanFirstPlayerTester.start();
				northAmericanSecondPlayerTester.start();
				Thread.currentThread().sleep(800);
				break;

			case 17:
				ASIANFirstPlayerSignInTester asianFirstPlayerSignInTester = new ASIANFirstPlayerSignInTester();
				ASIANSecondPlayerSignInTester asianSecondPlayerSignInTester = new ASIANSecondPlayerSignInTester();
				asianFirstPlayerSignInTester.start();
				asianSecondPlayerSignInTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 18:
				EUROPEANFirstPlayerSignInTester europeanFirstPlayerSignInTester = new EUROPEANFirstPlayerSignInTester();
				EUROPEANSecondPlayerSignInTester europeanSecondPlayerSignInTester = new EUROPEANSecondPlayerSignInTester();
				europeanFirstPlayerSignInTester.start();
				europeanSecondPlayerSignInTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 19:
				NORTHFirstPlayerSignInTester northFirstPlayerSignInTester = new NORTHFirstPlayerSignInTester();
				NORTHSecondPlayerSignInTester northSecondPlayerSignInTester = new NORTHSecondPlayerSignInTester();
				northFirstPlayerSignInTester.start();
				northSecondPlayerSignInTester.start();
				Thread.currentThread().sleep(800);
				break;

			case 20:
				ASIANFirstPlayerSignOutTester asianFirstPlayerSignOutTester = new ASIANFirstPlayerSignOutTester();
				ASIANSecondPlayerSignOutTester asianSecondPlayerSignOutTester = new ASIANSecondPlayerSignOutTester();
				asianFirstPlayerSignOutTester.start();
				asianSecondPlayerSignOutTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 21:
				EUROPEANFirstPlayerSignOutTester europeanFirstPlayerSignOutTester = new EUROPEANFirstPlayerSignOutTester();
				EUROPEANSecondPlayerSignOutTester europeanSecondPlayerSignOutTester = new EUROPEANSecondPlayerSignOutTester();
				europeanFirstPlayerSignOutTester.start();
				europeanSecondPlayerSignOutTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 22:
				NORTHFirstPlayerSignOutTester northFirstPlayerSignOutTester = new NORTHFirstPlayerSignOutTester();
				NORTHSecondPlayerSignOutTester northSecondPlayerSignOutTester = new NORTHSecondPlayerSignOutTester();
				northFirstPlayerSignOutTester.start();
				northSecondPlayerSignOutTester.start();
				Thread.currentThread().sleep(800);
				break;
			case 23:
				System.exit(0);
				break;
			default:
				System.out.println("Please enter only integer value from 1 to 23");

			}
		}

	}
}

class AsianNewPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public AsianNewPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "Amitabh";
		String lastName = "Bachchan";
		String age = "77";
		String userName = "AmitabhB";
		String password = "JayaBhaduri";
		String currentIpAddress = "182.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);
		playerClient.playerSignIn(userName, password, currentIpAddress);
		playerClient.playerSignOut(userName, currentIpAddress);

	}

}

class AsianPredefinedPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public AsianPredefinedPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "JEFFAMAZON";
		String password = "AsiaShoppingsite";
		String currentIpAddress = "182.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
		playerClient.playerSignOut(userName, currentIpAddress);

	}

}

class AsianDuplicatePlayerTester extends Thread {

	PlayerClient playerClient = null;

	public AsianDuplicatePlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String firstName = "Jeff";
		String lastName = "Benzos";
		String age = "56";
		String userName = "JEFFAMAZON";
		String password = "AsiaShoppingsite";
		String currentIpAddress = "182.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class EuropeanNewPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public EuropeanNewPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "Robert";
		String lastName = "Downey";
		String age = "55";
		String userName = "RobertDowney";
		String password = "SusanLevin";
		String currentIpAddress = "93.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);
		playerClient.playerSignIn(userName, password, currentIpAddress);
		playerClient.playerSignOut(userName, currentIpAddress);

	}

}

class EuropeanPredefinedPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public EuropeanPredefinedPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "NEWTONI";
		String password = "NEWTONGRAVITY";
		String currentIpAddress = "93.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
		playerClient.playerSignOut(userName, currentIpAddress);

	}

}

class EuropeanDuplicatePlayerTester extends Thread {

	PlayerClient playerClient = null;

	public EuropeanDuplicatePlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String firstName = "Isaac";
		String lastName = "Newton";
		String age = "84";
		String userName = "NEWTONI";
		String password = "NEWTONGRAVITY";
		String currentIpAddress = "93.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class NorthAmericanNewPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public NorthAmericanNewPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "Sheldon";
		String lastName = "Cooper";
		String age = "30";
		String userName = "SheldonCooper";
		String password = "ChuckLorre";
		String currentIpAddress = "132.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);
		playerClient.playerSignIn(userName, password, currentIpAddress);
		playerClient.playerSignOut(userName, currentIpAddress);

	}

}

class NorthAmericanPredefinedPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public NorthAmericanPredefinedPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "HENRYF";
		String password = "FordCar";
		String currentIpAddress = "132.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
		playerClient.playerSignOut(userName, currentIpAddress);

	}

}

class NorthAmericanDuplicatePlayerTester extends Thread {

	PlayerClient playerClient = null;

	public NorthAmericanDuplicatePlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String firstName = "Henry";
		String lastName = "Ford";
		String age = "66";
		String userName = "HENRYF";
		String password = "FordCar";
		String currentIpAddress = "132.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class AdminGetStatusTester extends Thread {

	AdministratorClient adminClient = null;

	public AdminGetStatusTester() {
		adminClient = new AdministratorClient();

	}

	public void run() {
		adminClient.getPlayerStatus("Admin", "Admin", "182.1.2.3");

	}

}

class AdminSuspendTester extends Thread {

	AdministratorClient adminClient = null;

	public AdminSuspendTester() {
		adminClient = new AdministratorClient();

	}

	public void run() {

		String userName = "JEFFAMAZON";

		String currentIpAddress = "182.1.4.3";

		adminClient.suspendAccount("Admin", "Admin", currentIpAddress, userName);

	}

}

class AdminSynchronizedSuspendTester extends Thread {

	AdministratorClient adminClient = null;

	public AdminSynchronizedSuspendTester() {
		adminClient = new AdministratorClient();

	}

	public void run() {

		String userName = "NEWTONI";

		String currentIpAddress = "93.1.4.3";

		adminClient.suspendAccount("Admin", "Admin", currentIpAddress, userName);

	}

}

class PlayerTransferTester extends Thread {

	PlayerClient playerClient = null;

	public PlayerTransferTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "SUNDARGOOGLE";
		String password = "CEOGoggle";
		String currentIpAddress = "182.1.4.3";
		String currentIpAddress2 = "132.1.2.3";
		playerClient.transferAccount(userName, password, currentIpAddress, currentIpAddress2);

	}

}

class PlayerSynchronizedTransferTester extends Thread {

	PlayerClient playerClient = null;

	public PlayerSynchronizedTransferTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "NEWTONI";
		String password = "NEWTONGRAVITY";
		String currentIpAddress = "93.1.4.3";
		String currentIpAddress2 = "132.1.2.3";
		playerClient.transferAccount(userName, password, currentIpAddress, currentIpAddress2);

	}

}

class VerifyTransferedAccountTester extends Thread {

	PlayerClient playerClient = null;

	public VerifyTransferedAccountTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "NEWTONI";
		String password = "NEWTONGRAVITY";
		String currentIpAddress = "132.1.4.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
		playerClient.playerSignOut(userName, currentIpAddress);
	}

}

class AsianFirstPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public AsianFirstPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "Asian";
		String lastName = "First";
		String age = "10";
		String userName = "AsaianFirst";
		String password = "FirstPassword";
		String currentIpAddress = "182.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class AsianSecondPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public AsianSecondPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "Asian";
		String lastName = "Second";
		String age = "10";
		String userName = "AsaianSecond";
		String password = "SecondPassword";
		String currentIpAddress = "182.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class EuropeanFirstPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public EuropeanFirstPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "European";
		String lastName = "First";
		String age = "10";
		String userName = "EuFirst";
		String password = "FirstPassword";
		String currentIpAddress = "93.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class EuropeanSecondPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public EuropeanSecondPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "European";
		String lastName = "Second";
		String age = "10";
		String userName = "EuSecond";
		String password = "SecondPassword";
		String currentIpAddress = "93.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class NorthAmericanFirstPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public NorthAmericanFirstPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "NorthAmerican";
		String lastName = "First";
		String age = "10";
		String userName = "NAFirst";
		String password = "FirstPassword";
		String currentIpAddress = "132.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class NorthAmericanSecondPlayerTester extends Thread {

	PlayerClient playerClient = null;

	public NorthAmericanSecondPlayerTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String firstName = "NorthAmerican";
		String lastName = "Second";
		String age = "10";
		String userName = "NASecond";
		String password = "SecondPassword";
		String currentIpAddress = "132.1.2.3";
		playerClient.createPlayerAccount(firstName, lastName, age, userName, password, currentIpAddress);

	}

}

class ASIANFirstPlayerSignInTester extends Thread {

	PlayerClient playerClient = null;

	public ASIANFirstPlayerSignInTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "RAASIAN";
		String password = "DravidCricket";
		String currentIpAddress = "182.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
	}

}

class ASIANSecondPlayerSignInTester extends Thread {

	PlayerClient playerClient = null;

	public ASIANSecondPlayerSignInTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String userName = "LAASIAN";
		String password = "LaxmanV";
		String currentIpAddress = "182.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
	}

}

class EUROPEANFirstPlayerSignInTester extends Thread {

	PlayerClient playerClient = null;

	public EUROPEANFirstPlayerSignInTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "RAEUROPEAN";
		String password = "DravidCricket";
		String currentIpAddress = "93.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
	}

}

class EUROPEANSecondPlayerSignInTester extends Thread {

	PlayerClient playerClient = null;

	public EUROPEANSecondPlayerSignInTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String userName = "LAEUROPEAN";
		String password = "LaxmanV";
		String currentIpAddress = "93.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
	}

}

class NORTHFirstPlayerSignInTester extends Thread {

	PlayerClient playerClient = null;

	public NORTHFirstPlayerSignInTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "RANORTH";
		String password = "DravidCricket";
		String currentIpAddress = "132.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
	}

}

class NORTHSecondPlayerSignInTester extends Thread {

	PlayerClient playerClient = null;

	public NORTHSecondPlayerSignInTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String userName = "LANORTH";
		String password = "LaxmanV";
		String currentIpAddress = "132.1.2.3";
		playerClient.playerSignIn(userName, password, currentIpAddress);
	}

}

class ASIANFirstPlayerSignOutTester extends Thread {

	PlayerClient playerClient = null;

	public ASIANFirstPlayerSignOutTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "RAASIAN";
		String currentIpAddress = "182.1.2.3";
		playerClient.playerSignOut(userName, currentIpAddress);
	}

}

class ASIANSecondPlayerSignOutTester extends Thread {

	PlayerClient playerClient = null;

	public ASIANSecondPlayerSignOutTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String userName = "LAASIAN";
		String currentIpAddress = "182.1.2.3";
		playerClient.playerSignOut(userName, currentIpAddress);
	}

}

class EUROPEANFirstPlayerSignOutTester extends Thread {

	PlayerClient playerClient = null;

	public EUROPEANFirstPlayerSignOutTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "RAEUROPEAN";
		String currentIpAddress = "93.1.2.3";
		playerClient.playerSignOut(userName, currentIpAddress);
	}

}

class EUROPEANSecondPlayerSignOutTester extends Thread {

	PlayerClient playerClient = null;

	public EUROPEANSecondPlayerSignOutTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String userName = "LAEUROPEAN";
		String currentIpAddress = "93.1.2.3";
		playerClient.playerSignOut(userName, currentIpAddress);
	}

}

class NORTHFirstPlayerSignOutTester extends Thread {

	PlayerClient playerClient = null;

	public NORTHFirstPlayerSignOutTester() {
		playerClient = new PlayerClient();

	}

	public void run() {

		String userName = "RANORTH";
		String currentIpAddress = "132.1.2.3";
		playerClient.playerSignOut(userName, currentIpAddress);
	}

}

class NORTHSecondPlayerSignOutTester extends Thread {

	PlayerClient playerClient = null;

	public NORTHSecondPlayerSignOutTester() {
		playerClient = new PlayerClient();

	}

	public void run() {
		String userName = "LANORTH";
		String currentIpAddress = "132.1.2.3";
		playerClient.playerSignOut(userName, currentIpAddress);
	}

}
