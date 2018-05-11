public class Cabage implements CanGrowing {
    private int count;
    Cabage()
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
