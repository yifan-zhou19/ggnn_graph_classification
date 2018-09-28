package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String inversed = new String(new char[101]);
		String q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		int i;
		int l;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		r = inversed;
		for (p = str.Substring(l) - 1,q = p + 1;p >= str;p--)
		{
			if (*p == ' ' && p != str)
			{
				for (i = 1;p + i < q;i++,r++)
				{
					*r = (p + i);
				}
				*r = ' ',r = r + 1;
				q = p;
			}
			if (p == str)
			{
				for (i = 0;p + i < q;i++,r++)
				{
					*r = (p + i);
				}
				*r = '\0';
			}
		}
		r = inversed;
		System.out.printf("%s",r);
	}

}
