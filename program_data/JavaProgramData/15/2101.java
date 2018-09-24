package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int m;
		int a = 0;
		int b;
		int p = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (k = 1;k <= n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				if (m == 0)
				{
					a = a + 1;
					p = p + 1;
				}
			}
			if (p != 0)
			{
				q = q + 1;
			}
			p = 0;
		}
		b = (q - 2) * (a - 2 * q) / 2;
		System.out.printf("%d\n",b);
	}

}

