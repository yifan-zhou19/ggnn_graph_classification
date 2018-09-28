package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int k;
		int n;
		int k1;
		int i;
		int b;
		int x;
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
		for (m = 1;1;m++)
		{
			b = 0;
			x = m;
			for (i = 1;i <= n;i++)
			{
				k1 = x % n;
				x = (x / n) * (n - 1);
				if (k1 != k || x == 0)
				{
					b = 1;
					break;
				}
			}
			if (b == 0)
			{
				System.out.printf("%d\n",m);
				break;
			}
		}
	}
}

