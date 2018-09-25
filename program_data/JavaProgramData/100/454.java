package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char zm;
		int[] b = new int[27];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i = 0;
		for (zm = 'a';zm <= 'z';zm++)
		{
			i++;
			for (p = a; * p != '\0';p++)
			{
				if (*p == zm)
				{
					b[i]++;
				}
			}
		}
		for (i = 1;i < 27;i++)
		{
			if (b[i] != 0)
			{
				break;
			}
		}
		if (i == 27)
		{
			System.out.print("No");
		}
		else
		{
			i = 0;
			for (zm = 'a';zm <= 'z';zm++)
			{
				i++;
				if (b[i] != 0)
				{
					System.out.printf("%c=%d\n", zm, b[i]);
				}
			}
		}
		return 0;
	}
}

