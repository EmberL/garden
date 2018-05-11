public class Tomato implements CanGrowing {
    private int count;
    Tomato()
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
