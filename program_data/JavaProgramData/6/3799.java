package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 1;
		for (i;i <= n;i++)
		{
			int p;
			int q;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			int[] a = new int[10000];
	for (int j = 0;j < p * q;j++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[j] = Integer.parseInt(tempVar4);
	}
	}
			int sum = 0;
			int m = 0;
			while (m < q)
			{
				sum = sum + a[m];
				m++;
			}
			m = (p - 1) * q;
			while (m < p * q)
			{
				sum = sum + a[m];
				m++;
			}
			m = 1;
			while (m < p - 1)
			{
				sum = sum + a[q * m];
				m++;
			}
			m = 2;
			while (m < p)
			{
				sum = sum + a[q * m - 1];
				m++;
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

