package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 4 || n != 3 || n != 2 || n != 1)
		{
			for (i = 5;i <= n;i++)
			{
			k = (int)Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0 || (i - 2) % j == 0)
				{
					break;
				}
			}
			if (j > k)
			{
				System.out.printf("%d %d\n",i - 2,i);
			}
			}
		}
		if (n == 4 || n == 3 || n == 2 || n == 1)
		{
			System.out.print("empty\n");
		}
		return 0;

	}

}

