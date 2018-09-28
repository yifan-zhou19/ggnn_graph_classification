package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int m;
		int k;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= a;i += 2)
		{
			for (n = 3;n < i;n += 2)
			{
				for (j = 3,k = 1;j <= (int)Math.sqrt(n);j += 2)
				{
					if (n % j == 0)
					{
						k = 0;
					}
				}
				for (j = 3,m = 1;j <= (int)Math.sqrt(i - n);j += 2)
				{
					if ((i - n) % j == 0)
					{
						m = 0;
					}
				}
				if (m == 1 && k == 1)
				{
					System.out.printf("%d=%d+%d\n",i,n,i - n);
					 break;
				}
			}
		}
	}
}

