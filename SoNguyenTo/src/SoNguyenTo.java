import java.util.Scanner;

public class SoNguyenTo
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sNhap=new Scanner(System.in);
		System.out.println("Nhap vao 1 so de kiem tra xem no co phai so nguyen to hay khong");
		int iN=sNhap.nextInt();
		if(iN<2)
		{
			System.out.println("So do khong phai la so nguyen to");
		}
		else
		{
			int i=2;
			while(i<iN)
			{
				if(iN%i==0)
				{	
					System.out.println("So do khong phai la so nguyen to");
				}
				i++;
			}
			System.out.println("So do la so nguyen to");
		}
		
	}
}

