package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int x;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		} while (n < 6 && n >= 50000);
		for (m = 6;m <= n;m = m + 2)
		{
			for (i = 3;i <= m / 2;i = i + 2)
			{

				for (j = 2;j <= Math.sqrt(i);j++) //??i?????
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (i % j == 0)
				{
					continue;
				}
				x = m - i;
				for (j = 2;j <= Math.sqrt(x);j++) //??X?????
				{
					if (x % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(x))
				{
					System.out.printf("%d=%d+%d\n",m,i,x);
					break;
				}
			}
		}
		return 0;
	}
}

