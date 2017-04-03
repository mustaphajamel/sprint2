/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.File;
import java.util.Date;


/**
 *
 * @author jamel_pc
 */
public class Produit  {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;
    private String description;
    private String marque;
    private String etat;
    private Double prixProduit;
    private Integer quantiteStock;
    private Integer pourcentagePromotion;
    private Date createdDate;
    private Integer duree;
    private String approuver;
    private Integer seller;
    private String imageName;
    private Date updatedAt;
    private Integer produitCategorie;
    private File imageFile;

    public Produit() {
    }



    public Produit(Integer id) {
        this.id = id;
    }

    public Produit(Integer id, String libelle, String description,
            String marque, String etat, Double prixProduit, Integer quantiteStock,
            Integer pourcentagePromotion, Date createdDate, Integer duree, String approuver,
            Integer seller, String imageName, Date updatedAt, Integer produitCategorie) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.marque = marque;
        this.etat = etat;
        this.prixProduit = prixProduit;
        this.quantiteStock = quantiteStock;
        this.pourcentagePromotion = pourcentagePromotion;
        this.createdDate = createdDate;
        this.duree = duree;
        this.approuver = approuver;
        this.seller = seller;
        this.imageName = imageName;
        this.updatedAt = updatedAt;
        this.produitCategorie = produitCategorie;
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Integer getPourcentagePromotion() {
        return pourcentagePromotion;
    }

    public void setPourcentagePromotion(Integer pourcentagePromotion) {
        this.pourcentagePromotion = pourcentagePromotion;
    }

    public Double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(Integer quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

   

    

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getApprouver() {
        return approuver;
    }

    public void setApprouver(String approuver) {
        this.approuver = approuver;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getProduitCategorie() {
        return produitCategorie;
    }

    public void setProduitCategorie(Integer produitCategorie) {
        this.produitCategorie = produitCategorie;
    }
    
    public File getImageFile() {
        return imageFile;
    }
    
    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Produit[ id=" + id + " ]";
    }

    
    
}
