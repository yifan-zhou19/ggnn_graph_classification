package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 10)
		{
			for (i = 1;i <= n;i++)
			{
				if ((i % 7 == 0) || ((i / 10) == 7) || ((i % 10) == 7))
				{
					continue;
				}
				if ((i % 7 != 0) && ((i / 10) != 7) && ((i % 10) != 7))
				{
					s = s + i * i;
				}
			}
		}
		if (n >= 1 && n < 10)
		{
			for (i = 1;i <= n;i++)
			{
				if (i % 7 != 0)
				{
					s = s + i * i;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.printf("%d\n",s);
	}


}

