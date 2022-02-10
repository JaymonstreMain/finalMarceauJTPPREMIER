package formes;

import exceptions.FormeException;

/**
 * Cette classe permet de gerer le cercle
 */
public class Cercle {

    /**
     * Valeur de rayon de cercle minimale
     */
    private static final int MIN_VAL = 1;
    /**
     * Valeur de rayon de cercle maximale
     */
    private static final int MAX_VAL = 30;
    /**
     * Rayon de cercle par defaut
     */
    private static final int RAYON_DEFAUT = 10;
    /**
     * Tableau de couleurs de cercle valides
     */
    private static final String[] LES_COULEURS = {"rouge", "vert", "bleu", "jaune", "noir", "orange"};
    /**
     * Couleur de cercle par defaut
     */
    public static final String COULEUR_DEFAUT = "vert";

    /**
     * Rayon du cercle
     */
    private int rayon;
    /**
     * Nom de tout cercle
     */
    private static String nom = "Cercle";
    /**
     * Couleur du cercle
     */
    private String couleur;

    /**
     * Constructeur de la classe Cercle
     *
     * @throws FormeException
     */
    public Cercle() throws FormeException {
        this(RAYON_DEFAUT);
    }

    /**
     * Constructeur de la classe Cercle
     *
     * @param rayon : le rayon d'un cercle
     * @throws FormeException
     */
    public Cercle(int rayon) throws FormeException {
        if (validerRayon(rayon)) {
            setRayon(rayon);
        } else {
            throw new FormeException("Parametre invalide passe au constructeur de la classe Cercle");
        }

        setCouleur(COULEUR_DEFAUT);
    }

    /**
     * Cette methode permet de calculer le perimetre du cercle
     *
     * @return le perimetre du cercle
     */
    public int calculerPerimetre() {
        return (int) (2 * Math.PI * this.rayon);
    }

    /**
     * Cette methode permet de calculer la surface du cercle
     *
     * @return la surface du cercle
     */
    public int calculerSurface() {
        return (int) (Math.PI * Math.pow(this.rayon, 2));
    }

    /**
     * Cette methode permet de personnaliser la comparaison d'un objet Cercle avec le cercle courant
     *
     * @param objet : un objet implicitement de type Cercle
     * @return le resultat d'une comparaison d'un objet Cercle avec le cercle courant
     */
    @Override
    public boolean equals(Object objet) {
        Cercle cercle = (Cercle) objet;

        return cercle.calculerSurface() == calculerSurface() && cercle.getCouleur().equals(this.couleur);
    }

    /**
     * Cette classe permet de personnaliser les informations d'un objet de classe Cercle
     *
     * @return une chaine de caracteres
     */
    @Override
    public String toString() {
        return Cercle.nom + " " + this.couleur + " " + this.rayon;
    }

    /**
     * Classe Main de la classe Cercle
     *
     * @param args : les parametres par defaut de la classe Main
     */
    public static void main(String[] args) {

    }

    /**
     * Cette methode permet d'obtenir la couleur du cercle
     *
     * @return la couleur du cercle
     */
    public String getCouleur() {
        return this.couleur;
    }


    /**
     * Cette methode permet d'obtenir le rayon du cercle
     *
     * @return le rayon du cercle
     */
    public int getRayon() {
        return this.rayon;
    }

    /**
     * Cette methode permet d'obtenir le nom du cercle
     *
     * @return le nom d'un cercle
     */
    public static String getNom() {
        return Cercle.nom;
    }

    /**
     * Cette methode permet d'assigner une couleur au cercle
     *
     * @param couleur : couleur d'un cercle
     */
    public void setCouleur(String couleur) {
        this.couleur = validerCouleur(couleur) ? couleur : COULEUR_DEFAUT;
    }

    /**
     * Cette methode permet d'assigner un rayon au cercle
     *
     * @param rayon : rayon d'un cercle
     */
    public void setRayon(int rayon) {
        if (validerRayon(rayon)) {
            this.rayon = rayon;
        }
    }

    /**
     * Cette methode permet de valider une couleur de cercle
     *
     * @param couleur : couleur d'un cercle
     * @return le resultat de la validation de couleur de cercle
     */
    private static boolean validerCouleur(String couleur) {
        boolean estCouleurValide = false;

        if (couleur != null) {
            estCouleurValide = validerPresenceChaineDansTableauChaine(couleur, LES_COULEURS);
        }

        return estCouleurValide;
    }

    /**
     * Cette methode permet de valider un rayon de cercle
     *
     * @param rayon : rayon d'un cercle
     * @return le resultat de la validation de rayon de cercle
     */
    private static boolean validerRayon(int rayon) {
        return (rayon >= MIN_VAL && rayon <= MAX_VAL);
    }

    /**
     * Cette methode permet de valider la presence d'une chaine de caracteres dans un tableau de chaines de caracteres
     * @param chaine : chaiune de caractere a chercher
     * @param tableau : tableau de chaines de caracteres
     * @return
     */
    private static boolean validerPresenceChaineDansTableauChaine(String chaine, String[] tableau) {
        boolean chaineExiste = false;

        for (int i = 0; i < tableau.length && !chaineExiste; i++) {
            if (tableau[i].equalsIgnoreCase(chaine.trim())) {
                chaineExiste = true;
            }
        }

        return chaineExiste;
    }
}