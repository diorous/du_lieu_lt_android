import java.util.Scanner;
public class SoLonNhat {
	private static Scanner sNhap;

	public static void main(String[] args) {
		int iN = 0;
		sNhap = new Scanner(System.in);
		System.out.println("Nhap vao so luong phan tu cua mang:");
		iN=sNhap.nextInt();
		int[] Mang=new int[iN];
		// nhập mảng
		for(int i=0;i<iN;i++)
		{
			System.out.println("Nhap gia tri phan tu thu: "+(i+1));
			Mang[i]=sNhap.nextInt();
		}
		// tìm phần tử lớn nhất của mảng
		int temp=Mang[0];
		for(int i=1;i<iN;i++)
		{
			if(temp<Mang[i])
			{
				temp=Mang[i];
			}
		}
		System.out.println("Gia tri lon nhat trong mang la: "+temp);
		// Sắp xếp
		for(int i=0;i<iN-1;i++)
		{
			for(int j=i+1;j<iN;j++)
			{
				if(Mang[j]>Mang[i])
				{
					int dem=Mang[j];
					Mang[j]=Mang[i];
					Mang[i]=dem;
				}
			}
		}
		//xuất mảng
		for(int i=0;i<iN;i++)
		{
			System.out.println(+Mang[i]);
		}
	}
}
