
public class Lion extends Animal {
	public void output()
	{
		if(mEquiment==1)
		{
			System.out.println("Co trang bi mong sat");
		}
		System.out.println("Khong trang bi mong sat");
		super.output();
	}
	public Lion()
	{
		mStart=9;
	}
}
