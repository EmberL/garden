public class PlaceWithCorn implements CanGrowing {
    private int count;
    PlaceWithCorn()
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
