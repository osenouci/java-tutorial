public class WildCat extends Cat {

    @Override
    public void SayMeo() {
        System.out.println("The nasty cat says meo");
        super.SayMeo();
    }
}
