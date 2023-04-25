package hw4;

/**
 * Evaluator for a hand containing (at least) four cards of the same rank.
 * The number of cards required is four.
 * 
 * The name of this evaluator is "Four of a Kind".
 */
//Note: You must edit this declaration to extend AbstractEvaluator
//or to extend some other class that extends AbstractEvaluator
public class FourOfAKindEvaluator extends ThreeOfAKindEvaluator
{
  /**
   * Constructs the evaluator.
   * @param ranking
   *   ranking of this hand
   * @param handSize
   *   number of cards in a hand
   */
  public FourOfAKindEvaluator(int ranking, int handSize)
  {
    super(ranking,handSize);
    this.name = "Four of a Kind";
    this.cardsRequired = 4;
  }
  

}
