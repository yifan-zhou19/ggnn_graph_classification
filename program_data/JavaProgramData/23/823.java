package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[150]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int len;
		int l;
		s = new Scanner(System.in).nextLine();
		len = s.length();

		for (l = 0,p = s.Substring(len) - 1;p >= s;p--)
		{
			if (*p == ' ')
			{
				if (l != 0)
				{
					l = 0;
					*p = 0;
					System.out.printf("%s ",p + 1);
				}
			}
			else
			{
				l++;
			}
		}
		if (l != 0)
		{
			System.out.printf("%s\n",s);
		}
		return 0;
	}
}
