package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int max;
		int smax;
		int i;
		int r;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a < b)
		{
			t = b;
			b = a;
			a = t;
		}
		max = a;
		smax = b;
		for (i = 1;i <= n - 2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (c > max)
			{
				r = max;
				max = c;
				smax = r;
			}
			else if (c > smax)
			{
				smax = c;
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",smax);
	}


}

