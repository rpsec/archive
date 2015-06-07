package book;

/**
 * Created by IntelliJ IDEA.
 * User: ryanp
 * Date: 10/16/12
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem)
    {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem)
    {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws PerformanceException
    {
        super.perform();
//        System.out.println("While reciting....");
//        poem.recite();
    }


}
