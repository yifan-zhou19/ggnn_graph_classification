package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int s;
		int m;
		int[] a = new int[300];
		int sum = 0;
		int[] j = new int[100];
		int p = 0;
		int temp;
		double c;
		double[] b = new double[300];
		double max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = sum + m;
			a[i] = m;
		}
		c = (float)sum / n;
		for (i = 1;i <= n;i++)
		{
			b[i] = Math.abs(a[i] - c);
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] >= max)
			{
				if (b[i] == max)
				{
					p = p + 1;
					j[p] = i;
				}
				else
				{
					max = b[i];
					j[p] = i;
				}
			}
		}
		for (i = 1;i < p;i++)
		{
			for (s = 0;s < (p - 1 - i);s++)
			{
				if (a[j[s]] > a[j[s + 1]])
				{
					temp = a[j[s]];
					a[j[s]] = a[j[s + 1]];
					a[j[s + 1]] = temp;
				}
			}
		}
		System.out.printf("%d",a[j[0]]);
		for (i = 1;i <= p;i++)
		{
			System.out.printf(",%d",a[j[i]]);
		}


	}
}

