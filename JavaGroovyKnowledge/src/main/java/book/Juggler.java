package book;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by IntelliJ IDEA.
 * User: ryanp
 * Date: 10/16/12
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Juggler implements Performer {
//    private double beanBags = 3.0;

    @Value("4")
    private int beanBags;
    private String env;

    public Juggler()
    {

    }

    public Juggler(int beanBags)
    {
        this.beanBags = beanBags;
    }

    public void setBeanBags(int numberOf)
    {
        beanBags = numberOf;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public void perform() throws PerformanceException
    {
        System.out.println("JUGGLING: " + beanBags + " BEANBAGS!!");
        System.out.println(env);
    }
}
