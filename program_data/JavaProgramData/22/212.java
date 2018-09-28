package <missing>;

public class GlobalMembers
{
	public static int max_value(int[] a, int n)
	{
		int i;
		int k = 0;
		for (i = 0;i < n;i++)
		{
		if (a[i] > a[k])
		{
			k = i;
		}
		}
		return a[k];
	}
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int k = 0;
		int max;
		int n = 0;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			n++;
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		max = max_value(a, n);
		for (i = 0;i < n;i++)
		{
			if (a[i] != max)
			{
				break;
			}
		}
		k = i;
		if (k == n)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] == max)
				{
					continue;
				}
				if (a[i] > a[k])
				{
					k = i;
				}
			}
			System.out.printf("%d\n",a[k]);
		}
	}
}

