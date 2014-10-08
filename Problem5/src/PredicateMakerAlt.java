import java.util.function.Predicate;

/**
 * Things that make new predicates without using confusing things
 * like lambdas and anonymous inner classes.
 *
 * @author Mike
 * @author Rosa
 * @author Phit
 */
public class PredicateMakerAlt<T>
  implements PredicateMaker<T>
{
  /**
   * The one version of this class you are allowed to use.
   */
  public PredicateMaker<T> FACTORY = new PredicateMakerAlt<T>();

  /**
   * Construct.
   */
  private PredicateMakerAlt() 
  { 
  } // PredicateMakerAlt()

  /**
   * Create a new predicate that holds only when all of the values
   * in preds hold.
   */
  public Predicate<T> and(Predicate<T>[] preds)
  {
    // STUB
    return null;
  } // and(Predicate<T>[])
} // class PredicateMakerAlt<T>
