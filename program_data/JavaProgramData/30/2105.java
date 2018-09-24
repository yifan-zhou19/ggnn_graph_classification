package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i % 7 != 0)
			{
				if (i % 10 != 7)
				{
					if (i / 10 != 7)
					{
					  sum = sum + i * i;
					}

				}

			}
			i++;
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

