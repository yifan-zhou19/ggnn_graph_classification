package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			k = Math.sqrt(i + 2);
			for (j = 2;j <= k;j++)
			{
				if ((i % j == 0) || ((i + 2) % j == 0))
				{
					break;
				}
				if (j >= k)
				{
					System.out.printf("%d %d\n",i,i + 2);
					m++;
				}
			}
		}
		if (m == 0)
		{
			System.out.print("empty");
		}
	}
}

