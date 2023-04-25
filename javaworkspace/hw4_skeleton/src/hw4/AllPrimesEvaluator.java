package hw4;
import api.Card;
import api.IEvaluator;
/**
 * Evaluator for a hand in which the rank of each card is a prime number.
 * The number of cards required is equal to the hand size. 
 * 
 * The name of this evaluator is "All Primes".
 */
//Note: You must edit this declaration to extend AbstractEvaluator
//or to extend some other class that extends AbstractEvaluator
public class AllPrimesEvaluator extends AbstractEvaluator
{
  /**
   * Constructs the evaluator.
   * @param ranking
   *   ranking of this hand
   * @param handSize
   *   number of cards in a hand
   */
  public AllPrimesEvaluator(int ranking, int handSize)
  {
	  super(ranking,handSize);
	  this.name = "All Primes";
	  this.cardsRequired = handSize;
  }
  
  @Override
  public boolean canSatisfy(Card[] mainCards) {
	  
	  Card[] cards = mainCards;
	  Card tempCard = null;
	  
	  if(cards.length >= this.cardsRequired) { 
		  for(int j = 0; j < cards.length; ++j) {
			  for(int i = 0; i < cards.length; ++i) {
				if(cards[j].compareTo(cards[i]) > 0 ) {
					tempCard = cards[j];
					cards[j] = cards[i];
					cards[i] = tempCard;
				}
			  }
		  }
	  }
	  
	  for(int i = 0; i < cards.length; ++i) {
		  if(cards[i].getRank() != 2 ||cards[i].getRank() != 3 ||cards[i].getRank() != 5 ||cards[i].getRank() != 7 ||cards[i].getRank() != 11 ||cards[i].getRank() != 13) {
			  return false;
		  }
	  }
	  
	  return true;
  }
  
}
