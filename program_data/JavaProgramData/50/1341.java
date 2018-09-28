package <missing>;

public class GlobalMembers
{
	public static int month(int i)
	{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
			return 31;
		}
		else if (i == 2)
		{
			return 28;
		}
			else
			{
				return 30;
			}
	}

	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		k = k + 12;
		k = k % 7;
		if (k == 5)
		{
			System.out.print("1\n");
		}
		for (i = 1;i < 12;i++)
		{
			k += month(i);
			k = k % 7;
			if (k == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	return 0;
	}

}

