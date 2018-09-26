package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100005]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int n;
		int i;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			t = s.length();
			k = 0;
			for (p = s;p < s.Substring(t) && k == 0;p++)
			{
				k = 1;
				if (*p != '0' && *p != '\0')
				{
					q = p + 1;
					while (q < s.Substring(t))
					{
						if (*q != *p)
						{
							q++;
						}
						else
						{
							*q = '0';
							k = 0;
							q++;
						}
					}
					if (k != 0)
					{
						System.out.printf("%c\n",*p);
					}
				}
				else
				{
					k = 0;
				}
			}
		}
			if (k == 0)
			{
				System.out.print("no");
			}
	}
}

