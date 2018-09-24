package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[310]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		char j;
		int i;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (j = 65;j <= 90;j++)
		{
			i = 0;
			for (ps = str; * ps != '\0';ps++)
			{
				if (*ps == j)
				{
					i++;
				}
			}
			if (i != 0)
			{
				System.out.printf("%c=%d\n",j,i);
				a++;
			}
		}
		for (j = 97;j <= 122;j++)
		{
			i = 0;
			for (ps = str; * ps != '\0';ps++)
			{
				if (*ps == j)
				{
					i++;
				}
			}
			if (i != 0)
			{
				System.out.printf("%c=%d\n",j,i);
				a++;
			}
		}
		if (a == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

