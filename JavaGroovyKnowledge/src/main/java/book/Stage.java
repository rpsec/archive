package book;

/**
 * Created by IntelliJ IDEA.
 * User: ryanp
 * Date: 10/16/12
 * Time: 1:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stage {
    private Stage()
    {

    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance()
    {
        return StageSingletonHolder.instance;
    }

}
