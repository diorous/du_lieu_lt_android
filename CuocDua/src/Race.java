import java.util.*;

public class Race {
	static Vector<Animal>mList;
	int mStartRc;
	int mFinishRc;
	int mQuangDuong;
	int n;
	Scanner sNhap;
	public Race()
	{
		mStartRc=7;
		mFinishRc=12;
		mQuangDuong=210;
	}
	public void input()
	{
		mList = new Vector<>();
		sNhap=new Scanner(System.in);
		System.out.println("Nhap vao so luong con vat tham gia thi dau");
		n=sNhap.nextInt();
		for(int i=0;i<n;i++)
		{
			String chon;
			Animal temp;
			System.out.println("Nhap vao ma con vat ban muon tham gia thi dau");
			chon=sNhap.next();
			if(chon.charAt(0)=='L')
			{
				temp=new Lion();
			}
			else if(chon.charAt(0)=='R')
			{
				temp=new Rabit();
			}
			else
			{
				temp=new Tortoise();
			}
			temp.settermCode(chon);
			temp.input();
			mList.add(temp);
		
		}
	}
	public void ChayDua()
	{
		int vantoc = 0;
		float[] Thoigian=new float[100];
		int k=0;
		for(int i=0;i<mList.size();i++)
		{
			if(mList.elementAt(i).mCode.charAt(0)=='L')
			{
				if(mList.elementAt(i).mEquiment==1)
				{
					vantoc=mList.elementAt(i).mSpeed*2;
				}
				Thoigian[k]=mQuangDuong/vantoc;
				if(Thoigian[k]>3)
					Thoigian[k]=-1;
				k++;
			}
			if(mList.elementAt(i).mCode.charAt(0)=='R')
			{
				if(mList.elementAt(i).mEquiment==1)
				{
					vantoc=mList.elementAt(i).mSpeed+30;
				}
				Thoigian[k]=mQuangDuong/vantoc;
				if(Thoigian[k]>4)
					Thoigian[k]=-1;
				k++;
			}
			if(mList.elementAt(i).mCode.charAt(0)=='T')
			{
				if(mList.elementAt(i).mEquiment==1)
				{
					vantoc=mList.elementAt(i).mSpeed*2;
				}
				mQuangDuong=mQuangDuong-75;
				Thoigian[k]=mQuangDuong/vantoc;
				if(Thoigian[k]>5)
					Thoigian[k]=-1;
				k++;
			}
		}
		for(int i=0;i<mList.size()-1;i++)
		{
			for(int j=i+1;j<mList.size();j++)
			{
				if(Thoigian[j]>Thoigian[i])
				{
					float temp=Thoigian[j];
					Thoigian[j]=Thoigian[i];
					Thoigian[i]=temp;
				}
			}
		}
		for(int i=0;i<mList.size();i++)
		{
			if(Thoigian[i]!=-1)
			{
				mList.elementAt(i).output();
			}
		}
	}
	public void outputRace()
	{
		for(int i=0;i<mList.size();i++)
		{
			/*Animal animal= (Animal) mList.elementAt(i);
			animal.output();*/
			mList.elementAt(i).output();
		}
	} 
}
