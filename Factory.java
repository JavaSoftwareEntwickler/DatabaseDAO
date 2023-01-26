package pckj1;

import java.util.ArrayList;

public class Factory{

	public CustomersDAO getDataType(String object) {
		if (object.equalsIgnoreCase("1")) {
			return new CustomersDAOImplFile();
		} else if (object.equalsIgnoreCase("2")) {
			return new CustomersDAOImplAccess();

		} else {
			System.out.println("Supporto dati non consentito");
		}

		return null;
	}


}
