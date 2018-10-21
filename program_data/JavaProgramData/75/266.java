package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n = 1;
		int[] a = new int[1010];
		int[] b = new int[1010];
		int min = 1000;
		int max = 0;
		int[] put = new int[1010];
		int last = 1;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		while ((c = System.in.read()) != '\n')
		{
			n++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[1] = Integer.parseInt(tempVar3);
		}
		n = 1;
		while ((c = System.in.read()) != '\n')
		{
			n++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[n] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = min;i < max;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
					put[i]++;
				}
			}
		}
		for (i = min;i < max;i++)
		{
			if (last < put[i])
			{
				last = put[i];
			}
		}
		System.out.printf("%d %d",n,last);
	}
}

