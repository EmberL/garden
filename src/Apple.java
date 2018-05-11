public class Apple implements CanGrowing {
    private int count;
    Apple()
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
