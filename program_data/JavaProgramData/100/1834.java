package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int m = 0;
		for (p = str; * p != '\0';p++)
		{
			if ((*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122))
			{
				m++;
			}
			else
			{
				continue;
			}
		}
		if (m == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (int i = 65;i <= 90;i++)
			{
				int s = 0;
				for (p = str; * p != '\0';p++)
				{
					if (*p == i)
					{
						s++;
					}
				}
				if (s > 0)
				{
					System.out.printf("%c=%d\n",i,s);
				}
			}
			for (int j = 97;j <= 122;j++)
			{
				int t = 0;
				for (p = str; * p != '\0';p++)
				{
					if (*p == j)
					{
						t++;
					}
				}
				if (t > 0)
				{
					System.out.printf("%c=%d\n",j,t);
				}
			}
		}
		return 0;
	}

}

