import java.util.*;
public class Animal 
{
	
	protected String mCode;
	protected int mSpeed;
	protected int mEquiment;
	protected int mStart;
	private Scanner sNhap;
	public Animal() {
		mCode=null;
		mSpeed=0;
		mEquiment=0;
	}
	public Animal(String mCode,int mSpeed,int mEquiment){
		this.mCode=mCode;
		this.mEquiment=mEquiment;
		this.mSpeed=mSpeed;
	}
	public void input()
	{
		sNhap=new Scanner(System.in);
		System.out.println("Nhap vao toc do");
		mSpeed=sNhap.nextInt();
		System.out.println("Nhap vao trang bi");
		mEquiment=sNhap.nextInt();
	}
	public void output()
	{
		System.out.println("Ma con vat: "+mCode);
		System.out.println("Toc do: "+mSpeed);
	}
	public void settermCode(String chon)
	{
		this.mCode=chon;
	}
}
