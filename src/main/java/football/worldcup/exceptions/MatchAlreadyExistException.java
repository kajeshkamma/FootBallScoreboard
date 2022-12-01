package football.worldcup.exceptions;

/**
 * This is the model class for MatchAlreadyExistException
 * @author kajeswara
 */
public class MatchAlreadyExistException extends RuntimeException {
	
	/**
	 * This is the constructor for MatchAlreadyExistException
	 * @param errorMessage
	 */
	public MatchAlreadyExistException(String errorMessage) {
        super(errorMessage);
    }
}
