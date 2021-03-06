package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface décrivant le comportement d'un acheteur.
 * @author Léo CASSIAU, Geoffrey DESBROSSES, Jean-Christophe GUERIN, Ugo MAHEY
 * 
 */
public interface Acheteur extends Remote {

	/**
	 * Vend l'objet au gagnant de l'enchère.
	 * 
	 * @param gagnant
	 *            Client qui a gagne l'enchere
	 * @throws RemoteException
	 */
	public void objetVendu(String gagnant) throws RemoteException;

	/**
	 * Attribut un nouveau prix à un objet pendant une enchère. Met aussi à jour la personne ayant 
	 * la plus grosse enchère sur l'objet.
	 * 
	 * @param prix = Nouveau prix de l'objet
	 * @param gagnant = Acheteur ayant mis le nouveau prix. Donc le gagnant si personne renchérit.
	 * @throws RemoteException
	 */
	public void nouveauPrix(int prix, Acheteur gagnant) throws RemoteException;
	
	/**
	 * Met fin à une enchère
	 * @throws RemoteException
	 */
	public void finEnchere() throws RemoteException;
	
	/**
	 * Récupère le pseudo de l'acheteur.
	 * 
	 * @return String : le pseudo de l'acheteur
	 * @throws RemoteException
	 */
	public String getPseudo() throws RemoteException;

	/**
	 * Récupère le chronomètre de l'enchère à laquelle participe l'acheteur
	 * @return long : la durée du chrono
	 * @throws RemoteException
	 */
	public long getChrono() throws RemoteException;


}
