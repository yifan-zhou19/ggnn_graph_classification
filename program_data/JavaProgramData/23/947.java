package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		String ans = new String(new char[200]);
		int len;
		int i;
		//freopen("input.txt","r",stdin);
		//freopen("output.txt","w",stdout);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (p = str.Substring(len);p > str;p--)
		{
			*p = (p - 1);
		}
		*p = ' ';
		*(p + len + 1) = ' ';
		for (p = str.Substring(len) + 1,r = ans;p >= str;)
		{
			q = p - 1;
			while (*q != ' ')
			{
				q--;
			}
			for (i = 1;q + i <= p;i++)
			{
				*r++=*(q + i);
			}
			p = q;
		}
		for (i = 0;i < len;i++)
		{
			System.out.printf("%c",*(ans.Substring(i)));
		}
		return 0;
	}

}
