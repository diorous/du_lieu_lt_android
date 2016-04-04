import java.util.Scanner;
public class XinChaoJava
{
	public static void main(String[] args)
	{
		System.out.println("Xin chao ban den voi chuong trinh tinh tuoi trong java");
		int iTuoi;
		int iNam=2015;
		@SuppressWarnings("resource")
		Scanner sNhap=new Scanner(System.in);
		System.out.println("Nhap vao nam sinh cua ban:");
		int iNamsinh=sNhap.nextInt();
		iTuoi=iNam-iNamsinh;		
		System.out.println("Tuoi cua ban la: "+iTuoi);
	}
}
