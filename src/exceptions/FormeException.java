package exceptions;

/**
 * Cette classe permet de personnaliser les exceptions associees aux formes
 */
public class FormeException extends Exception {
    /**
     * Cette methode gere l'exception avec un message d'erreur par defaut
     */
    public FormeException() {
        super("Erreur d'une classe forme");
    }

    /**
     * Cette methode gere l'exception avec un message d'erreur personnalise
     *
     * @param message : message d'erreur personnalise
     */
    public FormeException(String message) {
        super(message);
    }
}