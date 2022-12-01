package football.worldcup.exceptions;

/**
 * This is the model class for MatchNotExistException
 * @author kajeswara
 */
public class MatchNotExistException extends RuntimeException {
	
	/**
	 * This is the constructor for MatchNotExistException
	 * @param errorMessage
	 */
    public MatchNotExistException(String errorMessage) {
        super(errorMessage);
    }
}