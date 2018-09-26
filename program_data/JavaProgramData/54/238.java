package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int a;
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (a = 1;;a++)
		{
			m = a * n + k;
			for (i = 1;i < n;i++)
			{
				if (m % (n - 1) == 0)
				{
					m = m * n / (n - 1) + k;
				}
				else
				{
					break;
				}
			}
			if (i == n)
			{
				break;
			}
		}
		for (i = 1,m = a * n + k;i < n;i++)
		{
			m = m * n / (n - 1) + k;
		}
		System.out.printf("%d\n",m);
	}



}

