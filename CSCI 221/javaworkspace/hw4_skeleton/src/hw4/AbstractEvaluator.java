package hw4;
import api.Card;
import api.Hand;
import api.IEvaluator;
import util.SubsetFinder;

/**
 * The class AbstractEvaluator includes common code for all evaluator types.
 * 
 * TODO: Expand this comment with an explanation of how your class hierarchy
 * is organized. Aight so 
 */
public abstract class AbstractEvaluator implements IEvaluator
{
	int ranking = 0;
	int handSize = 0;
	String name = "";
	int cardsRequired = 0;
   
	public AbstractEvaluator(int ranking, int handSize) {
		this.ranking = ranking;
		this.handSize = handSize;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRanking() {
		return ranking;
	}
	
	public int handSize() {
		return handSize;
	}
	
	public int cardsRequired() {
		return cardsRequired;
	}
	
	public boolean canSatisfy(Card[] mainCards) {
		return true;
	}
	
	public boolean canSubsetSatisfy(Card[] allCards) {
		return true;
	}
	
	public Hand createHand(Card[] allCards, int[] subset) { 
		
		Card[] mainCards = null;
		Card[] sideCards = null;
		IEvaluator evaluator = null;
		
		for(int i = 0; i < subset.length; ++i) {
			mainCards[i] = allCards[subset[i]];
		}
		
		for(int i = 0; i < allCards.length; ++i) {
			for(int j = 0; j < mainCards.length; ++j) {
				if(allCards[i] != mainCards[j]) {
					sideCards[i] = allCards[i]; 
				}
			}
		}
		
		return new Hand(mainCards,sideCards,evaluator);
	}
	
	public Hand getBestHand(Card[] allCards) {
		
		return null;
	}
}
