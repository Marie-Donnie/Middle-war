package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.Acheteur;
import exceptions.LoginPrisException;
/**
 * Classe Vente. Sert de serveur pour l'application.
 * 
 * Extends : Remote
 * 
 * @author Léo CASSIAU, Geoffrey DESBROSSES, Jean-Christophe GUERIN, Ugo MAHEY
 *
 */
public interface Vente extends Remote {

	/**
	 * Methode servant a inscrire un acheteur a une vente. Ajoute l'acheteur dans la liste des acheteurs
	 * @param login 
	 * @param acheteur
	 * @throws RemoteException
	 */
	public boolean inscriptionAcheteur(String login, Acheteur acheteur) throws RemoteException, LoginPrisException;
	
	/**
	 * Augmente le prix de l'objet a vendre.
	 * @param nouveauPrix le nouveau prix que le client a donne
	 * @param acheteur l'acheteur ayant encherit 
	 * @return le nouveau prix de l'objet a vendre
	 * @throws RemoteException
	 */
	public int rencherir(int nouveauPrix, Acheteur acheteur) throws RemoteException, Exception;
	

	/**
	 * Methode permettant d ajouter un objet aux encheres.
	 * @param objet l'objet a vendre.
	 * @throws RemoteException
	 */
	public void ajouterObjet(Objet objet) throws RemoteException;
	
	
	public Objet getObjet() throws RemoteException;
	
	/**
	 * Méthode pour renvoyer la liste des objets à venir au client (juste leur nom)
	 * @return
	 * @throws RemoteException
	 */
	public String[] getCatalogue() throws RemoteException;


}
