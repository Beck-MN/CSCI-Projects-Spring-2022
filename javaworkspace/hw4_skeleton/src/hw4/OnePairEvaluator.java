package hw4;

import java.util.ArrayList;
import util.SubsetFinder;
import api.Card;

/**
 * Evaluator for a hand containing (at least) two cards of the same rank.
 * The number of cards required is two.
 * 
 * The name of this evaluator is "One Pair".
 */
//Note: You must edit this declaration to extend AbstractEvaluator
//or to extend some other class that extends AbstractEvaluator
public class OnePairEvaluator extends AbstractEvaluator
{
  /**
   * Constructs the evaluator.
   * @param ranking
   *   ranking of this hand
   * @param handSize
   *   number of cards in a hand
   */
  public OnePairEvaluator(int ranking, int handSize)
  {
    super(ranking,handSize);
    this.name = "One Pair";
    this.cardsRequired = 2;
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
		  
		  for(int i = 0; i < cards.length; ++i) {
			  if (i != cards.length - 1) {
				  if(cards[i].getRank() == cards[i + 1].getRank()) {
					  return true;
				  }
			  }
		  }
	  }
	  
	  return false;
  }
  
  @Override
  public boolean canSubsetSatisfy(Card[] allCards) {
	  
	  Card[] cards = allCards;
	  Card[] subset = null;
	  Card tempCard = null;
	  
	  for(int j = 0; j < cards.length; ++j) {
		  for(int i = 0; i < cards.length; ++i) {
			if(cards[j].compareTo(cards[i]) > 0 ) {
				tempCard = cards[j];
				cards[j] = cards[i];
				cards[i] = tempCard;
			}
		  }
	  }
	  
	  ArrayList<int[]> subsets = SubsetFinder.findSubsets(cards.length, this.cardsRequired);
	  
	  
	  
  }	  
}
