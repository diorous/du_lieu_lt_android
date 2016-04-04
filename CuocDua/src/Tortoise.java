
public class Tortoise extends Animal{
	public void output()
	{
		if(mEquiment==1)
		{
			System.out.println("Co trang bi mai vang");
		}
		System.out.println("Khong trang bi mai vang");
		super.output();
	}
	public Tortoise()
	{
		mStart=7;
	}
}
