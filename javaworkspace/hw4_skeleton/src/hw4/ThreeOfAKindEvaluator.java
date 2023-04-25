package hw4;

import api.Card;

/**
 * Evaluator for a hand containing (at least) three cards of the same rank.
 * The number of cards required is three.
 * 
 * The name of this evaluator is "Three of a Kind".
 */
//Note: You must edit this declaration to extend AbstractEvaluator
//or to extend some other class that extends AbstractEvaluator
public class ThreeOfAKindEvaluator extends OnePairEvaluator
{
  /**
   * Constructs the evaluator.
   * @param ranking
   *   ranking of this hand
   * @param handSize
   *   number of cards in a hand
   */
  public ThreeOfAKindEvaluator(int ranking, int handSize)
  {
	  super(ranking,handSize);
	  this.name = "Three of a kind";
	  this.cardsRequired = 3;
  }
  
  @Override
  public boolean canSatisfy(Card[] mainCards) {
	  super.canSatisfy(mainCards);
	  return true; 
  }

}
