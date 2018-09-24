package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int cp = 2;
		int count = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 3;m <= n;m = m + 2)
		{

			k = Math.sqrt(m);
			for (i = 2;i <= k;i++)
			{
				if (m % i == 0)
				{
					break;
				}
			}
				if (i >= k + 1)
				{
					if (m - 2 == cp && m != 3)
					{
						System.out.printf("%d %d\n",cp,m);
						count++;
					}
					cp = m;

				}

		}
		if (count == 0)
		{
			System.out.print("empty");
		}
	}
}

