package pckj1;

import java.util.ArrayList;

public abstract class CustomersDAO {

	public abstract ArrayList<Customers> getAllCustomers();

	public abstract void insertCustomers(Customers c);

	public abstract void ricercaID(Customers c);

	public abstract void modificaElemento(Customers c);

	public abstract void cancellazioneElemento(Customers c);

	public abstract void visualizzaDati();

	public abstract void svuotaArray();
}
