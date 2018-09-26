package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int mm;
		int n;
		int k;
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
		mm = 0;
		while (true)
		{
			mm += n - 1;
			m = mm;
			for (i = 0;i < n && m % (n - 1) == 0;i++)
			{
					m = m / (n - 1) * n + k;
			}
			if (i >= n)
			{
				System.out.printf("%d\n",m);
				break;
			}
		}
	}
}

