package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int a2;
		int a3;
		int k;
		int i;
		int n;
		int m;
		a1 = 2;
		a3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 2;n <= m;n++)
		{
			k = Math.sqrt(n);
			for (i = 2;i <= k;i++)
			{
			if (n % i == 0)
			{
				break;
			}
			}
			if (i > k)
			{
				a2 = a1,a1 = n;
			if ((a1 - a2) == 2)
			{
				a3 = a3 + 1;
				System.out.printf("%d %d\n",a2,a1);
			}
			}
		}
		if (a3 == 0)
		{
			System.out.print("empty");
		}
	}
}

