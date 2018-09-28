package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String p1;
		String p2;
		String p3;
		int len;
		int max = 0;
		int min = 100;
		str = new Scanner(System.in).nextLine();
		for (p1 = p = str; * p != '\0';p++)
		{
			if (*p == ' ')
			{
				*p = '\0';
				len = p1.length();
				if (len < min)
				{
					min = len;
					p2 = p1;
				}
				if (len > max)
				{
					max = len;
					p3 = p1;
				}
				p1 = p + 1;
			}
		}
			len = p1.length();
				if (len < min)
				{
					min = len;
					p2 = p1;
				}
				if (len > max)
				{
					max = len;
					p3 = p1;
				}

		System.out.println(p3);
		System.out.println(p2);
	}

}
