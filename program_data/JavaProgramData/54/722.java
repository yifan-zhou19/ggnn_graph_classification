package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int i = 0;
		int m = 0;
		int p = 0;
		while (true)
		{
			m++;
			p = m;
			for (i = 0;i < n;i++)
			{
				if (p % n == k)
				{
					p = p / n * (n - 1);
				}
				else
				{
					break;
				}
				if (p <= 0)
				{
					break;
				}
			}
			if (i == n)
			{

				System.out.printf("%d",m);
				break;
			}
		}
		return 0;
	}
}

