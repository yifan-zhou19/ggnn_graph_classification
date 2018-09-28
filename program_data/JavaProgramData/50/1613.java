package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		int k;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		c = 7 + w;
		if (c % 7 == 0)
		{
			System.out.print("1\n");
		}
		for (i = 1;i < 12;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				c = c + 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				c = c + 30;
			}
			if (i == 28)
			{
				c = c + 28;
			}
			if (c % 7 == 0)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}


}

