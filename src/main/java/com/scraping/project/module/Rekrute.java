package com.scraping.project.module;


import java.util.HashSet;
import java.util.Set;

public class Rekrute {
    private String urlPost;
    private String datePublication;
    private String datePostuler;
    private String title;
    private String secteurActivite;
    private String nomEntreprise;
    private String Teletravail;
    private String contrat;
    private String niveau;
    private String region;
    private String expRequise;
    private Set traitsPersonnalite;
    private String  descriptionEntreprise;
    private String postDesc;
    private String  profilRecherche;
    private String address;


    public String getUrlPost() {
        return urlPost;
    }

    public void setUrlPost(String urlPost) {
        this.urlPost = urlPost;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getDatePostuler() {
        return datePostuler;
    }

    public void setDatePostuler(String datePostuler) {
        this.datePostuler = datePostuler;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getTeletravail() {
        return Teletravail;
    }

    public void setTeletravail(String teletravail) {
        Teletravail = teletravail;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getExpRequise() {
        return expRequise;
    }

    public void setExpRequise(String expRequise) {
        this.expRequise = expRequise;
    }

    public Set<String> getTraitsPersonnalite() {
        return traitsPersonnalite;
    }

    public void setTraitsPersonnalite(Set<String> traitsPersonnalite) {
        this.traitsPersonnalite = traitsPersonnalite;
    }

    public String getDescriptionEntreprise() {
        return descriptionEntreprise;
    }

    public void setDescriptionEntreprise(String descriptionEntreprise) {
        this.descriptionEntreprise = descriptionEntreprise;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public String getProfilRecherche() {
        return profilRecherche;
    }

    public void setProfilRecherche(String profilRecherche) {
        this.profilRecherche = profilRecherche;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Rekrute{" +
                "urlPost='" + urlPost + '\'' +
                ", datePublication='" + datePublication + '\'' +
                ", datePostuler='" + datePostuler + '\'' +
                ", title='" + title + '\'' +
                ", secteurActivite='" + secteurActivite + '\'' +
                ", nomEntreprise='" + nomEntreprise + '\'' +
                ", Teletravail='" + Teletravail + '\'' +
                ", contrat='" + contrat + '\'' +
                ", niveau='" + niveau + '\'' +
                ", region='" + region + '\'' +
                ", expRequise='" + expRequise + '\'' +
                ", traitsPersonnalite=" + traitsPersonnalite +
                ", descriptionEntreprise='" + descriptionEntreprise + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", profilRecherche='" + profilRecherche + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
