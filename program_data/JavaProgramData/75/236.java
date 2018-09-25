package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int n = 0;
		int k;
		int min = 1000;
		int max = 0;
		int m = 0;
		int l;
		char a;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			i++;
			a = System.in.read();
			if (a == '\n')
			{
				break;
			}
		}

		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[j] = Integer.parseInt(tempVar2);
			}
			j++;
			a = System.in.read();
			if (a == '\n')
			{
				break;
			}
		}
		for (k = 0;k < i;k++)
		{
			if (x[k] < min)
			{
				min = x[k];
			}
		}
		for (k = 0;k < j;k++)
		{
			if (y[k] > max)
			{
				max = y[k];
			}
		}
		for (k = min;k < max;k++)
		{
			n = 0;
			for (l = 0;l < i;l++)
			{
				if (x[l] <= k != 0 && y[l]> k)
				{
					n++;
				}
			}
			if (n > m)
			{
				m = n;
			}
		}
		System.out.printf("%d %d",i,m);


	}

}

