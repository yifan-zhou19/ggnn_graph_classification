package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 4;i <= n;i++)
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j == i)
				{
					for (k = 2;k < i - 2;k++)
					{
						if ((i - 2) % k == 0)
						{
							break;
						}
					}
					if (k == i - 2)
					{
						System.out.printf("%d %d\n",i - 2,i);
					}
				}
			}
		}
		return 0;
	}

}

