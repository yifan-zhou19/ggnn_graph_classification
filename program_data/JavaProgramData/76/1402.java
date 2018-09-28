package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		int max = 0;
		int min;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		min = max;
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] -= min;
			b[i] -= min;
		}
		for (i = 0;i < max - min;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j] = 1;
			}
		}
		for (i = 0;i < max - min;i++)
		{
			if (c[i] == 0)
			{
				System.out.print("no");
				break;
			}
			if (i == (max - min - 1) && c[i] != 0)
			{
				System.out.printf("%d %d",min,max);
			}
		}
		return 0;
	}


}

