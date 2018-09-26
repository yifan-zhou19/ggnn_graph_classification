package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (n / 2);i = i + 2)
		{
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(i))
			{
				m = n - i;
				for (k = 2;k <= Math.sqrt(m);k++)
				{
					if (m % k == 0)
					{
						break;
					}
				}
				if (k > Math.sqrt(m))
				{
					System.out.printf("%d %d",i,n - i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

