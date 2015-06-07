package book;

/**
 * Created by IntelliJ IDEA.
 * User: ryanp
 * Date: 10/16/12
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Poem {

    private static String[] LINES= {
            "When, indisgracewithfortuneandmen'seyes,",
            "Iallalonebeweepmyoutcaststate",
            "Andtroubledeafheavenwithmybootlesscries",
            "Andlookuponmyselfandcursemyfate,",
            "Wishingmeliketoonemorerichinhope,",
            "Featuredlikehim, likehimwithfriendspossess'd,",
            "Desiringthisman'sartandthatman'sscope,",
            "WithwhatImostenjoycontentedleast;",
            "Yetinthesethoughtsmyselfalmostdespising,",
            "HaplyIthinkonthee, andthenmystate,",
            "Liketothelarkatbreakofdayarising",
            "Fromsullenearth, singshymnsatheaven'sgate;",
            "Forthysweetloveremember'dsuchwealthbrings",
            "ThatthenIscorntochangemystatewithkings." };

    public void recite()
    {
        for (int i =0;i<LINES.length; i++)
        {
            System.out.println(LINES[i]);
        }

    }
}
