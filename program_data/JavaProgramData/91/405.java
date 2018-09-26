package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		char c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int i;
		int l;
		int j;
		a = new Scanner(System.in).nextLine();
		c = a.charAt(0);
		p = a,q = p + 1;

		l = a.length();
		for (i = 0;i < l - 1;i++)
		{
			*p = p + *(p + 1);
			p++;
		}
		*p += c;
		p = a;
		for (i = 0;i < l;i++)
		{
		   System.out.printf("%c",*(p++));
		}
	}
}
