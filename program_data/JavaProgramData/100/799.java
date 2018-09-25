package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		int a = 0;
		char i;
		for (p = zfc; * p != '\0';p++)
		{
			if (*p >= 'a' && *p <= 'z')
			{
				a = a + 1;
			}
		}
		if (a == 0)
		{
		System.out.print("No");
		}
		a = 0;
		for (i = 97;i <= 123;i++)
		{
			for (p = zfc; * p != '\0';p++)
			{
				if (*p == i)
				{
					a += 1;
				}
			}
		if (a == 0)
		{
			continue;
		}
		System.out.printf("%c=%d\n",i,a);
		a = 0;
		}

	return 0;


	}
}

