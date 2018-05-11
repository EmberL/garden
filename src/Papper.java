public class Papper implements CanGrowing {
    private int count;
    Papper()
    {
        count=0;
    }
    @Override
    public void grow()
    {
        count++;
    }
    public int getCount()
    {
        return count;
    }



}
