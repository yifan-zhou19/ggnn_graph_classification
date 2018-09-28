package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int k;
		int m;
		int n;
		int p;
		int q;
		int b;
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
		m = 0;
		while (true)
		{
			m++;
			j = n;
			b = m;
			q = 1;
			while (j > 0)
			{
				j--;
				if (b % (n - 1) == 0)
				{
					b = b / (n - 1) * n + k;
				}
				else
				{
					q = 0;
					break;
				}
			}
			if (q == 1)
			{
				break;
			}
		}
		System.out.printf("%d",b);
	}
}

