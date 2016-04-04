import java.util.Scanner;
public class Mang {
 public static void main(String[] avgs)
 {
	 int iN;
	 Scanner sNhap=new Scanner(System.in);
	System.out.println("Nhap vao so luong cua mang:");
	iN=sNhap.nextInt();
	int[] Mang=new int[iN];
	for(int i=0;i<iN;i++)
	{
		System.out.println("Nhap gia tri phan tu thu: "+(i+1));
		Mang[i]=sNhap.nextInt();
	}
	for(int i=0;i<iN;i++)
	{
		System.out.println("Gia tri thu " +i);
		System.out.println(+Mang[i]);
	}
 }
}
