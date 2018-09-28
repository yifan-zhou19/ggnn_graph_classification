package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] u = new int[1000];
		int[] v = new int[1000];
		int n;
		int i;
		int j;
		int a = 0;
		int max;
		int e;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i] = Integer.parseInt(tempVar2);
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (u[i] % 2 != 0)
			{
				 v[j] = u[i];
				 j++;
				 a++;
			}
		}
		max = 0;
		b = 0;
			 d = a;
		while (b < d)
		{
		for (j = 0;j < a;j++)
		{
			if (v[j] > v[max])
			{
				max = j;
			}
		}
		if (max != a - 1)
		{
			e = v[max];
			v[max] = v[a - 1];
			v[a - 1] = e;
		}
		a--;
		b++;
		max = 0;
		}
		for (c = 0;c < d;c++)
		{
			if (c < d - 1)
			{
			System.out.printf("%d,",v[c]);
			}
			else if (c == d - 1)
			{
				System.out.printf("%d",v[c]);
			}
		}
		return 0;
	}
}

