/*
 * File: AccountServerFactory.java
 * Author: kevinagary
 * Date: 04/10/2017
 * 
 * Description: Implements a singleton pattern for AccountServer.
 */

package banking.primitive.core;


public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
