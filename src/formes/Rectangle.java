package formes;

import exceptions.FormeException;

/**
 * Cette classe permet de gerer le rectangle
 */
public class Rectangle {

    /**
     * Valeur de largeur et hauteur de rectangle minimale
     */
    public static final int MIN_VAL = 1;
    /**
     * Valeur de largeur et hauteur de rectangle maximale
     */
    public static final int MAX_VAL = 30;
    /**
     * Tableau de couleurs de rectangle valides
     */
    public static final String[] LES_COULEURS = {"rouge", "vert", "bleu", "jaune", "noir", "orange"};
    /**
     * Couleur de rectangle par defaut
     */
    public static final String COULEUR_DEFAUT = "rouge";

    /**
     * hauteur du rectangle
     */
    private int hauteur;
    /**
     * largeur du rectangle
     */
    private int largeur;
    /**
     * Nom de tout rectangle
     */
    private static String nom = "Rectangle";
    /**
     * couleur du rectangle
     */
    private String couleur;

    /**
     * Constructeur de la classe Rectangle
     *
     * @param hauteur : la hauteur d'un rectangle
     * @param largeur : la largeur d'un rectangle
     * @throws FormeException
     */
    public Rectangle(int hauteur, int largeur) throws FormeException {
        if (validerHauteur(hauteur) && validerLargeur(largeur)) {
            setHauteur(hauteur);
            setLargeur(largeur);
        } else {
            throw new FormeException("Parametre invalide passe au constructeur de la classe Rectangle");
        }

        setCouleur(COULEUR_DEFAUT);
    }

    /**
     * Cette methode permet de calculer le perimetre du rectangle
     *
     * @return le perimetre du rectangle
     */
    public int calculerPerimetre() {
        return ((2 * this.hauteur) + (2 * this.largeur));
    }

    /**
     * Cette methode permet de calculer la surface du rectangle
     *
     * @return la surface du rectangle
     */
    public int calculerSurface() {
        return (this.hauteur * this.largeur);
    }

    /**
     * Cette methode permet de personnaliser la comparaison d'un objet Rectangle avec le rectangle courant
     *
     * @param objet : un objet implicitement de type Rectangle
     * @return le resultat d'une comparaison d'un objet Rectangle avec le rectangle courant
     */
    @Override
    public boolean equals(Object objet) {
        Rectangle rectObjet = (Rectangle) objet;

        return rectObjet.calculerSurface() == calculerSurface() && rectObjet.getCouleur().equals(this.couleur);
    }

    /**
     * Cette classe permet de personnaliser les informations d'une classe Rectangle
     *
     * @return une chaine de caracteres
     */
    @Override
    public String toString() {
        return (Rectangle.nom + " " + this.couleur + " " + this.hauteur + ", " + this.largeur);
    }

    /**
     * Cette methode permet d'obtenir la couleur du rectangle
     *
     * @return la couleur du rectangle
     */
    public String getCouleur() {
        return this.couleur;
    }

    /**
     * Cette methode permet d'obtenir la hauteur du rectangle
     *
     * @return le hauteur du rectangle
     */
    public int getHauteur() {
        return this.hauteur;
    }

    /**
     * Cette methode permet d'obtenir la largeur du rectangle
     *
     * @return le largeur du rectangle
     */
    public int getLargeur() {
        return this.largeur;
    }

    /**
     * Cette methode permet d'obtenir le nom du rectangle
     *
     * @return le nom d'un rectangle
     */
    public static String getNom() {
        return Rectangle.nom;
    }

    /**
     * /**
     * Cette methode permet d'assigner une couleur au rectangle
     *
     * @param couleur : couleur d'un rectangle
     */

    public void setCouleur(String couleur) {
        this.couleur = validerCouleur(couleur) ? couleur : COULEUR_DEFAUT;
    }

    /**
     * Cette methode permet d'assigner une hauteur au rectangle
     *
     * @param hauteur : hauteur d'un rectangle
     */
    public void setHauteur(int hauteur) {
        if (validerHauteur(hauteur)) {
            this.hauteur = hauteur;
        }
    }

    /**
     * Cette methode permet d'assigner une largeur au rectangle
     *
     * @param largeur : largeur d'un rectangle
     */
    public void setLargeur(int largeur) {
        if (validerLargeur(largeur)) {
            this.largeur = largeur;
        }
    }

    /**
     * Cette methode permet de valider une couleur de rectangle
     *
     * @param couleur : couleur d'un rectangle
     * @return le resultat de la validation de couleur de rectangle
     */
    private static boolean validerCouleur(String couleur) {
        boolean estCouleurValide = false;

        if (couleur != null) {
            estCouleurValide = validerPresenceChaineDansTableauChaine(couleur, LES_COULEURS);
        }

        return estCouleurValide;
    }

    /**
     * Cette methode permet de valider une hauteur de rectangle
     *
     * @param hauteur : hauteur d'un rectangle
     * @return le resultat de la validation de hauteur de rectangle
     */
    private static boolean validerHauteur(int hauteur) {
        return hauteur >= MIN_VAL && hauteur <= MAX_VAL;
    }

    /**
     * Cette methode permet de valider une largeur de rectangle
     *
     * @param largeur : largeur d'un rectangle
     * @return le resultat de la validation de largeur de rectangle
     */
    private static boolean validerLargeur(int largeur) {
        return largeur >= MIN_VAL && largeur <= MAX_VAL;
    }

    /**
     * Cette methode permet de valider la presence d'une chaine de caracteres dans un tableau de chaines de caracteres
     * @param chaine : chaine de caractere a chercher
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