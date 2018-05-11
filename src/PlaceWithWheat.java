public class PlaceWithWheat implements CanGrowing {
    private int count;
    PlaceWithWheat()
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
