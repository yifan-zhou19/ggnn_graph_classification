package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int e = 0;
		int p;
		int q;
		int s;
		int t;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
		if (a == 0)
		{
		break;
		}
			}
		if (j < n)
		{
		break;
		}
		}
		for (p = j + 1;p <= n;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
		if (b == 255)
		{
			break;
		}
		}
		q = p + 1;
		while (q <= n)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
		q++;
		}
		for (s = i + 1;s <= n;s++)
		{
			for (t = 1;t <= n;t++)
			{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d = Integer.parseInt(tempVar5);
			}
		if (d == 0)
		{
			e = e+1;
		}
			}
		}
		sum = (e - (p - j)) / 2 * (p - j - 2);
		System.out.printf("%d\n",sum);
		return 0;
	}

}

