import java.lang.*;//khai bao thu vien string
import java.util.Scanner;//Khai bao thu vien nhap
public class CString {
	public static void main(String[] args) {
		Scanner sNhap;
		sNhap=new Scanner(System.in);
		String a;
		String b;
		int c;
		System.out.println("Moi ban nhap chuoi a:");
		a=sNhap.next();
		System.out.println("Moi ban nhap chuoi b:");
		b=sNhap.next();
		/*c=a.compareTo(b);// so sanh 2 chuỗi string
		if(c==0)
		{
			System.out.println("Hai chuoi bang nhau");
		}else if(c==1)
		{
			System.out.println("Chuoi a lon hon chuoi b");
		}else
		{
			System.out.println("Chuoi b lon hon chuoi a");
		}
		c=a.indexOf(b);// kiem tra su ton tai cua chuoi b trong a hay khong 
		if(c==-1)
		{
			System.out.println("Khong ton tai chuoi b trong a");
		}else
		{
			System.out.println(+c);
		}
		System.out.println("Nhap vi tri can xoa");
		c=sNhap.nextInt();
		String str=removeCharAt(a,c);//xóa 1 kí tự
		System.out.println(str);
		String str=a.replaceAll(b,"Da thay");// thây thế tất cả chu ma giong voi chuoi b thanh chuoi da thay
		System.out.println(str);
		StringBuffer str1=new StringBuffer(a);// string buffer co the thay doi do dai noi dung  co the dao chuoi
		str1.reverse();
		System.out.println(str1);
		*/
		String str1 = "jan-feb-march";
		String[] str2;
		String del="-";
		str2=str1.split(del);
		for(int i=0;i<str2.length;i++)
		{
			System.out.println(str2[i]);
		}
}

	private static String removeCharAt(String str, int pos)//xóa 1 kí tự khỏi chuỗi 
	{
		
		return str.substring(0, pos)+str.substring(pos+1);// xuất vị trí từ 0 đến vị trí xóa + với chuỗi từ vị trí xóa về sau
	}

}
