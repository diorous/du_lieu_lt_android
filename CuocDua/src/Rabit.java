
public class Rabit extends Animal {
	public void output()
	{
		if(mEquiment==1)
		{
			System.out.println("Co trang bi tai thong minh");
		}
		System.out.println("Khong trang bi tai thong minh");
		super.output();
	}
	
	public Rabit()
	{
		mStart=8;
	}
}
