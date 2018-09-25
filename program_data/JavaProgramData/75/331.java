package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1020];
		int[] y = new int[1020];
		int n = 0;
		int i;
		int j;
		int k = 0;
		int t = 0;
		int p = 0;
		int max = 0;
		String c = new String(new char[3000]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != 0;i++)
		{
			if (c.charAt(i) != ',')
			{
				x[n] = x[n] * 10 + c.charAt(i) - '0';
			}
			else
			{
				n++;
			}
		}
		n++;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				y[i] = Integer.parseInt(tempVar);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[n - 1] = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (x[j] > x[j + 1])
				{
					x[j] = x[j] + x[j + 1];
					x[j + 1] = x[j] - x[j + 1];
					x[j] = x[j] - x[j + 1];
				}
				if (y[j] > y[j + 1])
				{
					y[j] = y[j] + y[j + 1];
					y[j + 1] = y[j] - y[j + 1];
					y[j] = y[j] - y[j + 1];
				}
			}
		}
		j = 0;
		for (t = 0;t <= y[n - 1];t++)
		{
			for (i = j;;i++)
			{
				if (t == x[i])
				{
					p++;
					j++;
				}
				if (t < x[i])
				{
					break;
				}
			}
			for (i = k;;i++)
			{
				if (t == y[i])
				{
					p--;
					k++;
				}
				if (t < y[i])
				{
					break;
				}
			}
			if (p > max)
			{
				max = p;
			}
		}
		System.out.printf("%d %d\n",n,max);
		return 0;
	}
}

