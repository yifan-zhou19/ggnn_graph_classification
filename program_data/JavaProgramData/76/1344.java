package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int min;
		int max;
		int n;
		int i;
		int j;
		int x = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
			c[j] = 1;
			}
		}
		min = a[0];
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (min > a[i])
			{
				min = a[i];
			}
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = min;i < max;i++)
		{
			if (c[i] == 0)
			{
				x = 1;
			}
		}
		if (x == 1)
		{
			System.out.print("no");
		}
		else
		{
		System.out.printf("%d %d", min, max);
		}
		return 0;
	}

}

