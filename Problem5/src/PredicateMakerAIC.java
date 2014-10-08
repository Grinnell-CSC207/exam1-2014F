import java.util.function.Predicate;

/**
 * Things that make new predicates using anonymous inner classes.
 *
 * @author Ann
 * @author Nina
 * @author Mus
 */
public class PredicateMakerAIC<T>
  implements PredicateMaker<T>
{
  /**
   * The one version of this class you are allowed to use.
   */
  public PredicateMaker<T> FACTORY = new PredicateMakerAIC<T>();

  /**
   * Construct.
   */
  private PredicateMakerAIC() 
  { 
  } // PredicateMakerAIC()

  /**
   * Create a new predicate that holds only when all of the values
   * in preds hold.
   */
  public Predicate<T> and(Predicate<T>[] preds)
  {
    return new Predicate<T>() {
      public boolean test(T val)
      {
        // STUB
        return true;
      } // test(T)
    }; // new Predicate<T>
  } // and(Predicate<T>[])
} // class PredicateMakerAIC<T>
