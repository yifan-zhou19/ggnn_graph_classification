package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		int k;
		int bool1;
		int bool2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
		for (a = 2;a <= (k / 2);a++)
		{
			b = k - a;
			bool1 = 1;
			bool2 = 1;
			for (i = 2;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
				bool1 = 0;
				break;
				}
			}
			for (j = 2;j <= Math.sqrt(b);j++)
			{
				if (b % j == 0)
				{
				bool2 = 0;
				break;
				}
			}
			if ((bool1 == 1) && (bool2 == 1))
			{
				System.out.printf("%d=%d+%d\n",k,a,b);
				break;
			}
		}
		}
		return 0;
	}
}

