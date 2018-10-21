package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		c = new Scanner(System.in).nextLine();
		int i;
		int k = c.length();
		for (p = c;p <= c.Substring(k) - 1;p++)
		{
			if (*p < '0' || *p>'9')
			{
				continue;
			}
			else
			{
				System.out.printf("%c",*p);
				if (p <= c.Substring(k) - 2)
				{
					if (*(p + 1) < '0' || *(p + 1)>'9')
					{
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
