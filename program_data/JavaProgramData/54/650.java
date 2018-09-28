package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int n;
		int k;
		int i;
		int j;
		int m;
		int p;
		int c;
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
		for (c = 0;c < 100000000000000;c++)
		{
			m = c;
			p = 0;
			for (i = 0;i < n;i++)
			{
				if ((m - k) % n == 0 && (m - k != 0))
				{
					m = (m - k) / n * (n - 1);
					p = p + 1;
				}
			}
			if (p == n)
			{
				System.out.printf("%ld\n",c);
				break;
			}
		}
	}
}

