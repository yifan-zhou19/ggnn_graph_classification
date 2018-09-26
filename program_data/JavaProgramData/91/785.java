package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[200]);
		String str1 = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String r;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int m;
		int i;
		str = new Scanner(System.in).nextLine();
		p = str;
		m = str.length();
		q = str1;
		for (i = 0;i < m - 1;i++)
		{
		   r = p + 1;
		   *q = p + r;
		   p++;
		   q++;
		}
	*q = p + *str;
	q = str1;
	for (i = 0;i < m;i++,q++)
	{
	System.out.printf("%c",*q);
	}
	}




}
