package football.worldcup.service;

import java.util.List;

import football.worldcup.model.FootballMatch;


/**
 * This is the interface for football scoreboard service
 * @author kajeswara
 */
public interface FootballScoreboardInterface<T> {

	/**
     * @param match a match to be added into in-memory collection.
    */
    void startNewGame(final T match);
    

    /**
     * @param match currently in progress match to be finish.
    */
    void finishInProgressGame(final FootballMatch match);

    /**
     * @param match currently in progress match to update the score.
    */
    void updateScore(final T match);
    
    /**
	 * @return summary of matches in desired order.
	 */
    List<T> getSummary();
}
