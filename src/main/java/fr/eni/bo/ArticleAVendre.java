package fr.eni.bo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ArticleAVendre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nom;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private int statut;
	private int prixInitial;
	private int prixVente; 
	
	//les associations
	private Adresse retrait; 
	private Categorie categorie; 
	private Utilisateur vendeur;
	
	
	public ArticleAVendre() {
	}


	public ArticleAVendre(long id, String nom, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int statut, int prixInitial, int prixVente, Adresse retrait, Categorie categorie,
			Utilisateur vendeur) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.statut = statut;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.retrait = retrait;
		this.categorie = categorie;
		this.vendeur = vendeur;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}


	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}


	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}


	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}


	public int getStatut() {
		return statut;
	}


	public void setStatut(int statut) {
		this.statut = statut;
	}


	public int getPrixInitial() {
		return prixInitial;
	}


	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}


	public int getPrixVente() {
		return prixVente;
	}


	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}


	public Adresse getRetrait() {
		return retrait;
	}


	public void setRetrait(Adresse retrait) {
		this.retrait = retrait;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Utilisateur getVendeur() {
		return vendeur;
	}


	public void setVendeur(Utilisateur vendeur) {
		this.vendeur = vendeur;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleAVendre [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", description=");
		builder.append(description);
		builder.append(", dateDebutEncheres=");
		builder.append(dateDebutEncheres);
		builder.append(", dateFinEncheres=");
		builder.append(dateFinEncheres);
		builder.append(", statut=");
		builder.append(statut);
		builder.append(", prixInitial=");
		builder.append(prixInitial);
		builder.append(", prixVente=");
		builder.append(prixVente);
		builder.append(", retrait=");
		builder.append(retrait);
		builder.append(", categorie=");
		builder.append(categorie);
		builder.append(", vendeur=");
		builder.append(vendeur);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(categorie, id, nom);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArticleAVendre other = (ArticleAVendre) obj;
		return Objects.equals(categorie, other.categorie) && id == other.id && Objects.equals(nom, other.nom);
	}


	
	

}
