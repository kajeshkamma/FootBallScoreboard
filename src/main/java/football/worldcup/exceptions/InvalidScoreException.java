package football.worldcup.exceptions;

/**
 * This is the model class for InvalidScoreException
 * @author kajeswara
 */
public class InvalidScoreException extends RuntimeException {
	
	/**
	 * This is the constructor for InvalidScoreException
	 * @param errorMessage
	 */
    public InvalidScoreException(String errorMessage) {
        super(errorMessage);
    }
}